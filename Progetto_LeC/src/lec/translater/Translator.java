package lec.translater;

import java.util.ArrayList;

import lec.graphelement.Translatable;
import lec.grouping.Group;
import lec.storage.IStorage;

public class Translator implements ITranslater {
	
	private IObjectAnalizer objectAnalizer;

	private int indexVertex = 1;
	private int indexTexture = 1;
	private int indexNormal = 1;
	
	private static String verticesStartComment = "#Vertices";
	private static String vTexturesStartComment = "#Textures";
	private static String vNormalsStartComment = "#Normals";
	private static String pointStartComment = "#\n#Point\n#";
	private static String lineStartComment = "#\n#Line\n#";
	private static String faceStartComment = "#\n#Face\n#";	
	private static String groupStartComment = "#\n#Group\n#";
	private static String groupNameStartComment = "#	Name: ";
	private static String emptyLine = "\n";
	private static String doubleEmptyLine = "\n\n";
	
	
	public Translator(IObjectAnalizer objectAnalizer) {
		super();
		this.objectAnalizer = objectAnalizer;
	}

	@Override
	public ArrayList<String> getTranslation(IStorage storage) {
		indexVertex = 1;
		indexTexture = 1;
		indexNormal = 1;
		
		ArrayList<String> translation = new ArrayList<>();
		
		for (Translatable object : storage.getPointList()) {
			translation.add(pointStartComment);
			translation.addAll(translateObject(object));
			translation.add(doubleEmptyLine);
		}
		
		for (Translatable object : storage.getUnusedPointList()) {
			translation.add(pointStartComment);
			translation.addAll(translateObject(object));
			translation.add(doubleEmptyLine);
		}
		
		for (Translatable object : storage.getLineList()) {
			translation.add(lineStartComment);
			translation.addAll(translateObject(object));
			translation.add(doubleEmptyLine);
		}
		
		for (Translatable object : storage.getUnusedLineList()) {
			translation.add(lineStartComment);
			translation.addAll(translateObject(object));
			translation.add(doubleEmptyLine);
		}
		
		for (Translatable object : storage.getFaceList()) {
			translation.add(faceStartComment);
			translation.addAll(translateObject(object));
			translation.add(doubleEmptyLine);
		}
		
		for (Translatable object : storage.getUnusedFaceList()) {
			translation.add(faceStartComment);
			translation.addAll(translateObject(object));
			translation.add(doubleEmptyLine);
		}
		
		for (Group group : storage.getGroupMap().values()) {
			translation.add(groupStartComment);
			translation.addAll(translateGroup(group));
			translation.add(doubleEmptyLine);
		}
		
		
		
		
		return translation;
	}
	
	private ArrayList<String> translateObject(Translatable object) {
		
		ArrayList<String> translation = new ArrayList<>();
		
		objectAnalizer.analizeTranslable(object, indexVertex, indexVertex, indexVertex);
		
		translation.add(verticesStartComment);
		translation.addAll(objectAnalizer.getUsedVertices());
		translation.add(emptyLine);
		
		translation.add(vTexturesStartComment);
		translation.addAll(objectAnalizer.getUsedVertexTextures());
		translation.add(emptyLine);
		
		translation.add(vNormalsStartComment);
		translation.addAll(objectAnalizer.getUsedVertexNormals());
		translation.add(emptyLine);
		
		translation.addAll(objectAnalizer.getObjects());
		
		incrementeGlobalIndices();
		
		return translation;		
	}
	
	private ArrayList<String> translateGroup(Group group) {
		ArrayList<String> translation = new ArrayList<>();
		
		translation.add(groupStartComment);
		translation.add(groupNameStartComment + group.getGroupName());
		
		objectAnalizer.analizeGroupOfTranslable(group, indexVertex, indexTexture, indexNormal);
		
		translation.add(verticesStartComment);
		translation.addAll(objectAnalizer.getUsedVertices());
		translation.add(emptyLine);
		
		translation.add(vTexturesStartComment);
		translation.addAll(objectAnalizer.getUsedVertexTextures());
		translation.add(emptyLine);
		
		translation.add(vNormalsStartComment);
		translation.addAll(objectAnalizer.getUsedVertexNormals());
		translation.add(emptyLine);
		
		translation.add("g " + group.getGroupName());
		
		translation.addAll(objectAnalizer.getObjects());
		
		incrementeGlobalIndices();
		
		return translation;
	}
	
	private void incrementeGlobalIndices() {
		indexVertex += objectAnalizer.getNumberOfUsedVertices();
		indexTexture += objectAnalizer.getNumberOfUsedVertexTextures();
		indexNormal += objectAnalizer.getNumberOfVertexNormals();
	}
}

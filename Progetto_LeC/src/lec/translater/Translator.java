package lec.translater;

import java.util.ArrayList;

import lec.graphelement.Translatable;
import lec.grouping.Group;
import lec.storage.IStorage;

public class Translator implements ITranslater {
	
	private IObjectAnalizer objectAnalizer;

	private int indexVertex = 0;
	private int indexTexture = 0;
	private int indexNormal = 0;
	
	private static String verticesStartComment = "#Vertices";
	private static String vTexturesStartComment = "#Textures";
	private static String vNormalsStartComment = "#Normals";
	private static String pointStartComment = "#/n#Point/n#";
	private static String lineStartComment = "#/n#Line/n#";
	private static String faceStartComment = "#/n#Face/n#";	
	private static String groupStartComment = "#/n#Group/n#";
	private static String groupNameStartComment = "#	Name: ";
	private static String emptyLine = "/n";
	private static String doubleEmptyLine = "/n/n";
	
	
	public Translator(IObjectAnalizer objectAnalizer) {
		super();
		this.objectAnalizer = objectAnalizer;
	}

	@Override
	public ArrayList<String> getTranslation(IStorage storage) {
		indexVertex = 0;
		indexTexture = 0;
		indexNormal = 0;
		
		ArrayList<String> translation = new ArrayList<>();
		
		for (Translatable object : storage.getPointList()) {
			translation.add(pointStartComment);
			translation.addAll(translateNoTagObject(object));
			translation.add(doubleEmptyLine);
		}
		
		for (Translatable object : storage.getLineList()) {
			translation.add(lineStartComment);
			translation.addAll(translateNoTagObject(object));
			translation.add(doubleEmptyLine);
		}
		
		for (Translatable object : storage.getFaceList()) {
			translation.add(faceStartComment);
			translation.addAll(translateNoTagObject(object));
			translation.add(doubleEmptyLine);
		}
		
		for (Group group : storage.getGroupMap().values()) {
			translation.add(groupStartComment);
			translation.addAll(translateGroup(group));
			translation.add(doubleEmptyLine);
		}
		
		//Prendere elementi della mappa che non sono stati utilizzati
		//nei gruppi e aggiungerli alla lista
		
		
		return null;
	}
	
	private ArrayList<String> translateNoTagObject(Translatable object) {
		
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

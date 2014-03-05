package lec.translater;

import java.util.ArrayList;
import java.util.Set;

import lec.graphelement.GraphElement;
import lec.graphelement.Translatable;
import lec.grouping.Group;

public class GraphElementMap implements IObjectAnalizer{
	
	private InfoMap vertexMap;
	private InfoMap vTextureMap;
	private InfoMap vNormalMap;
	
	public GraphElementMap() {
	}
	
	@Override
	public void analizeTranslable(Translatable translableObject,
			int initialIndexVertices, int initialIndexTextures,
			int initialIndexNormals) {
		
		vertexMap = new InfoMap();
		vTextureMap = new InfoMap();
		vNormalMap = new InfoMap();
		
		vertexMap.addVertex3d(translableObject, translableObject.getOBJVertices(),
				initialIndexVertices);
		vTextureMap.addVertex3d(translableObject, translableObject.getOBJVTexture(),
				initialIndexTextures);
		vNormalMap.addVertex3d(translableObject, translableObject.getOBJVNormal(),
				initialIndexNormals);
		
	}

	@Override
	public void analizeGroupOfTranslable(Group group, int initialIndex,
			int initialIndexTextures, int initialIndexNormals) {
		ArrayList<GraphElement> elements = group.getElement();
		
		vertexMap = new InfoMap();
		vTextureMap = new InfoMap();
		vNormalMap = new InfoMap();
		
		for (GraphElement gre : elements) {			
			vertexMap.addVertex3d(gre, gre.getOBJVertices(),
					initialIndex);
			vTextureMap.addVertex3d(gre,gre.getOBJVTexture(),
					initialIndexTextures);
			vNormalMap.addVertex3d(gre, gre.getOBJVNormal(),
					initialIndexNormals);
		}
		
	}

	@Override
	public ArrayList<String> getUsedVertices() {
		return vertexMap.getInfoList();
	}

	@Override
	public ArrayList<String> getUsedVertexTextures() {
		return vTextureMap.getInfoList();
	}

	@Override
	public ArrayList<String> getUsedVertexNormals() {
		return vNormalMap.getInfoList();
	}

	@Override
	public int getNumberOfUsedVertices() {
		return vertexMap.getNumOfV3d();
	}

	@Override
	public int getNumberOfUsedVertexTextures() {
		return vTextureMap.getNumOfV3d();
	}

	@Override
	public int getNumberOfVertexNormals() {
		return vNormalMap.getNumOfV3d();
	}

	@Override
	public ArrayList<String> getObjects() {
		Set<Translatable> geSet = vertexMap.getGraphElements();
		ArrayList<String> graphInfo = new ArrayList<>();
		for (Translatable ge : geSet) {
			String tempInstr = ge.getOBJTag()+ " ";
			ArrayList<Integer> vertexIndex = vertexMap.getIndices(ge);
			ArrayList<Integer> vTextureIndex = vTextureMap.getIndices(ge);
			ArrayList<Integer> vNormalIndex = vNormalMap.getIndices(ge);
			
			
			int vertexSize = vertexIndex.size();
			int vTextureSize = vTextureIndex.size();
			int vNormalSize = vNormalIndex.size();
			for (int i = 0; i < vertexSize; i++) {
				if (vertexSize!=0)
					tempInstr += vertexIndex.get(i);
				if (vTextureSize!=0)
					tempInstr +=  "/" + vTextureIndex.get(i);
				if (vNormalSize!=0 && vTextureSize!=0)
					tempInstr += "/" + vNormalIndex.get(i);
				if (vNormalSize!=0 && !(vTextureSize!=0))
					tempInstr += "//" + vNormalIndex.get(i);
				tempInstr += " ";
			}
			graphInfo.add(tempInstr);
		}
		return graphInfo;
	}
	}

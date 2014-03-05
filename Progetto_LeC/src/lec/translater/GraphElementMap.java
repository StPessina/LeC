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
	
	/**
	 * Popola una lista di stringhe con le istruzioni relative alle informazioni sui vertici
	 * formattate in accordo con la specifica del formato file .obj.
	 * La lista viene riempita secondo questo ordine: 
	 * 	1) istruzioni di scrittura di vertex
	 * 	2) istruzioni di scrittura di vtexture
	 * 	3) istruzioni di scrittura di vnormal 
	 * 
	 * @return la lista delle istruzioni riguardanti le info sui vertici
	 */
	public ArrayList<String> printVertexInfo() {
		ArrayList<String> vinfos = new ArrayList<String>();
			vinfos.addAll(vertexMap.getInfoList());
			vinfos.addAll(vTextureMap.getInfoList());
			vinfos.addAll(vNormalMap.getInfoList());
			return vinfos;
		}
	/**
	 * Popola una lista con le istruzioni relative agli elementi grafici gia formattate
	 * secondo la specifica del formato .obj.
	 *  
	 * @param geList - lista di GraphElement
	 * @return
	 */
//	public ArrayList<String> printGraphElement() {
//		ArrayList<String> graphInfo = new ArrayList<>(geList.size());
//		for (GraphElement ge : geList) {
//			String tempInstr = ge.getOBJTag()+ " ";
//			for (int i = 0; i < vertexMap.getIndices(ge).size(); i++) {
//				if (vertexMap.getIndices(ge)!=null)
//					tempInstr.concat(vertexMap.getIndices(ge).get(i).toString());
//				if (vTextureMap.getIndices(ge)!=null)
//					tempInstr.concat("/" + vTextureMap.getIndices(ge).get(i).toString());
//				if (vNormalMap.getIndices(ge)!=null)
//					tempInstr.concat("/" + vNormalMap.getIndices(ge).get(i).toString());
//			}
//			graphInfo.add(tempInstr);
//		}		
//		return graphInfo;
//	}

	@Override
	public void analizeTranslable(Translatable translableObject,
			int initialIndexVertices, int initialIndexTextures,
			int initialIndexNormals) {
		
		InfoMap vertexMap = new InfoMap();
		InfoMap vTextureMap = new InfoMap();
		InfoMap vNormalMap = new InfoMap();
		
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
		
		InfoMap vertexMap = new InfoMap();
		InfoMap vTextureMap = new InfoMap();
		InfoMap vNormalMap = new InfoMap();
		
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
			for (int i = 0; i < vertexMap.getIndices(ge).size(); i++) {
				if (vertexMap.getIndices(ge)!=null)
					tempInstr.concat(vertexMap.getIndices(ge).get(i).toString());
				if (vTextureMap.getIndices(ge)!=null)
					tempInstr.concat("/" + vTextureMap.getIndices(ge).get(i).toString());
				if (vNormalMap.getIndices(ge)!=null)
					tempInstr.concat("/" + vNormalMap.getIndices(ge).get(i).toString());
			}
			graphInfo .add(tempInstr);
		}		
		return graphInfo;
	}
	}

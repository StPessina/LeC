package Iec.translater;

import java.util.ArrayList;

import lec.graphelement.GraphElement;

public class GraphElementMap {
	
	private InfoMap vertexMap;
	private InfoMap vTextureMap;
	private InfoMap vNormalMap;
	
	public GraphElementMap(InfoMap vertexMap, InfoMap vTextureMap, InfoMap vNormalMap) {
		super();
		this.vertexMap = vertexMap;
		this.vTextureMap = vTextureMap;
		this.vNormalMap = vNormalMap;
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
	public ArrayList<String> printGraphElement(ArrayList<GraphElement> geList) {
		ArrayList<String> graphInfo = new ArrayList<>(geList.size());
		for (GraphElement ge : geList) {
			String tempInstr = ge.getOBJTag()+ " ";
			for (int i = 0; i < vertexMap.getIndices(ge).size(); i++) {
				if (vertexMap.getIndices(ge)!=null)
					tempInstr.concat(vertexMap.getIndices(ge).get(i).toString());
				if (vTextureMap.getIndices(ge)!=null)
					tempInstr.concat("/" + vTextureMap.getIndices(ge).get(i).toString());
				if (vNormalMap.getIndices(ge)!=null)
					tempInstr.concat("/" + vNormalMap.getIndices(ge).get(i).toString());
			}
			graphInfo.add(tempInstr);
		}		
		return graphInfo;
	}
	}

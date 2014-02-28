package lec.translater;

import java.util.ArrayList;
import java.util.HashMap;

import lec.graphelement.GraphElement;
import lec.vertexInfo.Vertex3d;

public class InfoMap {
	
	private HashMap<String, Integer> cache;
	private ArrayList<Vertex3d<?>> infoList;
	private HashMap<GraphElement, ArrayList<String>> keyMap;
		
	public InfoMap(HashMap<String, Integer> cache,
			ArrayList<Vertex3d<?>> infoList,
			HashMap<GraphElement, ArrayList<String>> keyMap) {
		super();
		this.cache = cache;
		this.infoList = infoList;
		this.keyMap = keyMap;
	}
	
	public HashMap<String, Integer> getCache() {
		return cache;
	}
	
	public HashMap<GraphElement, ArrayList<String>> getKeyMap() {
		return keyMap;
	}
	
	public ArrayList<String> getInfoList() {
		
		ArrayList<String> instr = new ArrayList<String>(infoList.size());
		for (Vertex3d<?> v3d : infoList) {
			instr.add(v3d.getDef());
		}
		return instr;
	}
	
	/**
	 * 
	 * @param ge
	 * @param vlist
	 */
	public void addVertex3d(GraphElement ge, ArrayList<Vertex3d<?>> vlist) {
		
		ArrayList<String> listT = new ArrayList<String>();
		
		for (Vertex3d<?> v3d : vlist) {
			if(!cache.containsKey(v3d.getKey())){
				cache.put(v3d.getKey(),infoList.size());
				infoList.add(v3d);
			}
			listT.add(v3d.getKey());
		}
		keyMap.put(ge, listT);
	}	
	
	public ArrayList<Integer> getIndices(GraphElement ge){
		ArrayList<Integer> listofIndices = new ArrayList<Integer>();
		ArrayList<String> listofKey = keyMap.get(ge);
		for (String key : listofKey) {
			if (cache.containsKey(key))
				listofIndices.add(cache.get(key));
		}
	return listofIndices;
	}
	
	
}

package lec.translater;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import lec.graphelement.Translatable;
import lec.vertexInfo.Vertex3d;

public class InfoMap {
	
	private HashMap<String, Integer> cache;
	private ArrayList<Vertex3d> infoList;
	private HashMap<Translatable, ArrayList<String>> keyMap;
		
	public InfoMap(){
	}
	
	public HashMap<String, Integer> getCache() {
		return cache;
	}
	
	public HashMap<Translatable, ArrayList<String>> getKeyMap() {
		return keyMap;
	}
	
	public ArrayList<String> getInfoList() {
		
		ArrayList<String> instr = new ArrayList<String>(infoList.size());
		for (Vertex3d v3d : infoList) {
			instr.add(v3d.getDef());
		}
		return instr;
	}
	
	/**
	 * 
	 * @param ge
	 * @param vlist
	 */
	public void addVertex3d(Translatable translableObject, ArrayList<? extends Vertex3d> vlist, int initialIndex) {
		
		HashMap<String, Integer> cache = new HashMap<>();
		ArrayList<Vertex3d> infoList = new ArrayList<>();
		HashMap<Translatable, ArrayList<String>> keyMap = new HashMap<>();
		
		ArrayList<String> listT = new ArrayList<String>();
		
		for (Vertex3d v3d : vlist) {
			if(!cache.containsKey(v3d.getKey())){
				cache.put(v3d.getKey(),infoList.size()+initialIndex);
				infoList.add(v3d);
			}
			listT.add(v3d.getKey());
		}
		keyMap.put(translableObject, listT);
	}
	
	public int getNumOfV3d(){
		return infoList.size();
	}
	
	public Set<Translatable> getGraphElements() {
		return keyMap.keySet();
	}
	
	public ArrayList<Integer> getIndices(Translatable translableObject){
		ArrayList<Integer> listofIndices = new ArrayList<Integer>();
		ArrayList<String> listofKey = keyMap.get(translableObject);
		for (String key : listofKey) {
			if (cache.containsKey(key))
				listofIndices.add(cache.get(key));
		}
	return listofIndices;
	}
}

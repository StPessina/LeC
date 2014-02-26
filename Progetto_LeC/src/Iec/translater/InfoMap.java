package Iec.translater;

import java.util.ArrayList;
import java.util.HashMap;

import lec.graphelement.GraphElement;
import lec.vertexInfo.Vertex3d;

public class InfoMap {
	
	private HashMap<String, Integer> cache;
	private ArrayList<Vertex3d> infoList;
	private HashMap<GraphElement, ArrayList<String>> keyMap;
	
	public InfoMap() {
		// TODO Auto-generated constructor stub
	}
	
	public HashMap<String, Integer> getCache() {
		return cache;
	}
	public void setCache(HashMap<String, Integer> cache) {
		this.cache = cache;
	}
	public ArrayList<Vertex3d> getInfoList() {
		return infoList;
	}
	public ArrayList<String> printInfoList() {
		ArrayList<String> instr = new ArrayList<String>(infoList.size());
		if (infoList!=null){
		for (int i = 0; i < infoList.size(); i++) {
			instr.set(i, infoList.get(i).getDef());
		}
		}
		return null;
	}

	public void setInfoList(ArrayList<Vertex3d> infoList) {
		this.infoList = infoList;
	}

	public HashMap<GraphElement, ArrayList<String>> getKeyMap() {
		return keyMap;
	}
	public void setKeyMap(HashMap<GraphElement, ArrayList<String>> keyMap) {
		this.keyMap = keyMap;
	}
	
	public void addVertex3d(GraphElement ge, ArrayList<Vertex3d> vlist) {
		ArrayList<String> listT = new ArrayList<String>();
		for (int i = 0; i < vlist.size(); i++) {
			if(!cache.containsKey(vlist.get(i).getKey()))
				cache.put(vlist.get(i).getKey(),infoList.size());
			infoList.add(vlist.get(i));
			listT.add(vlist.get(i).getKey());
		}
		keyMap.put(ge, listT);
	}
	
	
}

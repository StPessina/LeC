package test.lec.storage;

import java.util.Map;
import java.util.Set;

import lec.graphelement.Face;
import lec.graphelement.GraphElement;
import lec.graphelement.Line;
import lec.graphelement.Point;
import lec.grouping.Group;
import lec.storage.IStorage;

public class storagePrinter {
	IStorage storage;

	public storagePrinter(IStorage storage) {
		super();
		this.storage = storage;
	}
	
	public void printAll() {
		System.out.println("Point list");
		
		for (Point p : storage.getPointList())
			System.out.println(p.toString());
		
		
		System.out.println("Point map");

		printOrderdMap(storage.getPointMap());
		
		System.out.println("Line list");
		
		for (Line l : storage.getLineList())
			System.out.println(l.toString());
		
		
		System.out.println("Line map");
		
		printOrderdMap(storage.getLineMap());
		
		
		System.out.println("Face list");
		
		for (Face f : storage.getFaceList())
			System.out.println(f.toString());
		
		
		System.out.println("Face map");
		
		printOrderdMap(storage.getFaceMap());
		
		System.out.println("Group map");
		
		for (Group g : storage.getGroupMap().values())
			System.out.println(g.toString());
	}
	
	private void printOrderdMap(Map<String, ? extends GraphElement> map) {
		Set<String> key = map.keySet();
		for (String tag : key)
			System.out.println("	" + tag + ": " + map.get(tag).toString());
	}
	
	
}

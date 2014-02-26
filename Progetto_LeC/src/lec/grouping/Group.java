package lec.grouping;

import java.util.ArrayList;

import lec.graphelement.GraphElement;

public class Group {
	
	private ArrayList<GraphElement> elements;

	private final String groupName;

	public Group(String groupName) {
		super();
		this.groupName = groupName;
		elements = new ArrayList<>(50);
	}

	public ArrayList<GraphElement> getElement() {
		return elements;
	}

	public String getGroupName() {
		return groupName;
	}
	
	public void addElement(GraphElement element) {
		elements.add(element);
	}

	@Override
	public String toString() {
		String tostring = "Group " + groupName + ": \n";
		
		for (GraphElement ge : elements) {
			tostring += "    ";
			tostring += ge.toString();
			tostring += "\n";
		}
		
		return tostring;
	}
	
	
}

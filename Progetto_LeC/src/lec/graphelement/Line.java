package lec.graphelement;


public class Line extends GraphElement {

	public final static String marker = "l";
	
	public Line(Line line) {
		super(line, marker);
	}

	public Line(vertexConfig configuration) {
		super(configuration, marker);
	}
}

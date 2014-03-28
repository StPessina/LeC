package lec.graphelement;

import lec.exception.NotHomogeneityException;
import lec.vertexInfo.Vertex;

public class Point extends GraphElement {

	public final static String marker = "p";
	
	public Point(Point point) {
		super(point, marker);
	}

	public Point(Vertex vertex) throws NotHomogeneityException {
		super(vertexConfig.ONLY_VERTEX, marker);
		add(vertex);
	}
	
	/* (non-Javadoc)
	 * @see lec.graphelement.Translatable#getOBJTag()
	 */
	@Override
	public String getOBJTag() {
		return marker;
	}
}

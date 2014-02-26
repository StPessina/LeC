package lec.graphelement;


/**
 * Elemento grafico faccia
 * è definito da un insieme di vertex/vertici texture/vertici normale
 * 
 * 
 * @author stefano
 *
 */
public class Face extends GraphElement {
	
	public final static String marker = "f";
	
	public Face(Face f) {
		super(f, marker);
	}

	public Face(vertexConfig configuration) {
		super(configuration, marker);
	}

	/* (non-Javadoc)
	 * @see lec.graphelement.Translatable#getOBJTag()
	 */
	@Override
	public String getOBJTag() {
		return marker;
	}	
}

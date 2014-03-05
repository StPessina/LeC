package lec.graphelement;

import java.util.ArrayList;

import lec.exception.NotHomogeneityException;
import lec.vertexInfo.VNormal;
import lec.vertexInfo.VTexture;
import lec.vertexInfo.Vertex;


/**
 * @author stefano
 *
 */
public abstract class GraphElement implements Translatable {
	
	/**
	 * Indica se la faccia
	 * contiene anche la definizione delle
	 * texture
	 */	
	public static enum vertexConfig {
		ONLY_VERTEX,
		VERTEX_TEXTURE,
		VERTEX_NORMAL,
		ALL	
	};
	
	private final vertexConfig configuration;
	
	private final String marker;
	
	private ArrayList<Vertex> vertices;
	private ArrayList<VTexture> vTextures;
	private ArrayList<VNormal> vNormals;
	

	public GraphElement(vertexConfig configuration, String marker) {
		super();
		this.configuration = configuration;
		this.marker = marker;
		
		vertices = new ArrayList<>();
		vTextures = new ArrayList<>();
		vNormals = new ArrayList<>();
	}

	public GraphElement(GraphElement ge, String marker) {
		vertices = new ArrayList<>();
		vTextures = new ArrayList<>();
		vNormals = new ArrayList<>();
		
		configuration = ge.configuration;
		this.marker = marker;
		
		for (Vertex v : ge.vertices)
			vertices.add(new Vertex(v));
		
		if(ge.configuration == vertexConfig.ALL ||
			ge.configuration == vertexConfig.VERTEX_TEXTURE) {
			for (VTexture vt : ge.vTextures)
				vTextures.add(new VTexture(vt));
		}
		
		if(ge.configuration == vertexConfig.ALL ||
			ge.configuration == vertexConfig.VERTEX_NORMAL) {
			for (VNormal vt : ge.vNormals)
				vNormals.add(new VNormal(vt));
		}
	}
	
	/**
	 * Aggiunta di un vertice ad all'elemento grafico
	 * 
	 * @param vertex
	 * @throws NotHomogeneityException
	 */
	public void add(Vertex vertex) throws NotHomogeneityException {
		if(!(configuration == vertexConfig.ONLY_VERTEX))
			throw new NotHomogeneityException();
		vertices.add(new Vertex(vertex));
	}
	
	/**
	 * Aggiunta di un vertice con texture alla faccia
	 * 
	 * @param vertex
	 * @param vTexture
	 * @throws NotHomogeneityException
	 */
	public void add(Vertex vertex, VTexture vTexture)  throws NotHomogeneityException {
		if(!(configuration == vertexConfig.VERTEX_TEXTURE))
			throw new NotHomogeneityException();
		vertices.add(new Vertex(vertex));
		vTextures.add(new VTexture(vTexture));
	}
	
	/**
	 * Aggiunta di un vertice con normale alla faccia
	 * 
	 * @param vertex
	 * @param vNormal
	 * @throws NotHomogeneityException
	 */
	public void add(Vertex vertex, VNormal vNormal)  throws NotHomogeneityException {
		if(!(configuration == vertexConfig.VERTEX_NORMAL))
			throw new NotHomogeneityException();
		vertices.add(new Vertex(vertex));
		vNormals.add(new VNormal(vNormal));
	}
	
	/**
	 * Aggiunta di un vertice con texture e normale alla faccia
	 * 
	 * @param vertex
	 * @param vTexture
	 * @param vNormal
	 * @throws NotHomogeneityException
	 */
	public void add(Vertex vertex, VTexture vTexture, VNormal vNormal)  throws NotHomogeneityException {
		if(!(configuration == vertexConfig.ALL))
			throw new NotHomogeneityException();
		vertices.add(new Vertex(vertex));
		vTextures.add(new VTexture(vTexture));
		vNormals.add(new VNormal(vNormal));
	}
	
	/* (non-Javadoc)
	 * @see lec.graphelement.Translatable#getOBJVertices()
	 */
	@Override
	public ArrayList<Vertex> getOBJVertices() {
		return vertices;
	}

	/* (non-Javadoc)
	 * @see lec.graphelement.Translatable#getOBJVTexture()
	 */
	@Override
	public ArrayList<VTexture> getOBJVTexture() {
		return vTextures;
	}

	/* (non-Javadoc)
	 * @see lec.graphelement.Translatable#getOBJVNormal()
	 */
	@Override
	public ArrayList<VNormal> getOBJVNormal() {
		return vNormals;
	}

	/* (non-Javadoc)
	 * @see lec.graphelement.Translatable#getNumberOfVertices()
	 */
	@Override
	public int getNumberOfVertices() {
		return vertices.size();
	}

	/* (non-Javadoc)
	 * @see lec.graphelement.Translatable#getNumberOfVTexture()
	 */
	@Override
	public int getNumberOfVTexture() {
		return vTextures.size();
	}

	/* (non-Javadoc)
	 * @see lec.graphelement.Translatable#getNumberOfVNormal()
	 */
	@Override
	public int getNumberOfVNormal() {
		return vNormals.size();
	}
	
	/* (non-Javadoc)
	 * @see lec.graphelement.Translatable#getOBJTag()
	 */
	@Override
	public String getOBJTag() {
		return marker;
	}
	
	@Override
	public String toString() {
		String tostring = "";
		
		tostring = marker + ": \n";
		
		for (Vertex v : vertices) {
			tostring += "    ";
			tostring += v.toString();
			tostring += "\n";
		}
		
		if(configuration == vertexConfig.ALL ||
				configuration == vertexConfig.VERTEX_TEXTURE) {
			for (VTexture v : vTextures) {
				tostring += "    ";
				tostring += v.toString();
				tostring += "\n";
			}
		}
		
		if(configuration == vertexConfig.ALL ||
				configuration == vertexConfig.VERTEX_NORMAL) {
			for (VNormal v : vNormals) {
				tostring += "    ";
				tostring += v.toString();
				tostring += "\n";
			}			
		}
			
		return tostring;
	}
}

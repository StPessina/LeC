package lec.graphelement;

import java.util.ArrayList;

import lec.vertexInfo.VNormal;
import lec.vertexInfo.VTexture;
import lec.vertexInfo.Vertex;

/**
 * 
 * 
 * @author stefano
 *
 */
public interface Translatable {
	
	/**
	 * Ritorna la lista dei vertici 
	 * già codificata per essere scritta obj
	 * 
	 * es. v 0 1 2
	 * 
	 * @return Lista dei vertici codificata
	 */
	public ArrayList<Vertex> getOBJVertices();
	
	/**
	 * Ritorna la lista dei vertici texture
	 * 
	 * @return Lista dei vertici texture
	 */
	public ArrayList<VTexture> getOBJVTexture();
	
	/**
	 * Ritorna la lista dei vertici texture
	 * 
	 * @return Lista dei vertici texture
	 */
	public ArrayList<VNormal> getOBJVNormal();
	
	/**
	 * Ritorna il numero di vertici dell'elemento grafico
	 * 
	 * @return numero di vertici dell'elemento grafico
	 */
	public int getNumberOfVertices();
	
	/**
	 * Ritorna il numero di vertici texture dell'elemento grafico
	 * 
	 * @return numero di vertici texture dell'elemento grafico
	 */
	public int getNumberOfVTexture();
	
	/**
	 * Ritorna il numero di vertici normali dell'elemento grafico
	 * 
	 * @return numero di vertici normali dell'elemento grafico
	 */
	public int getNumberOfVNormal();
}

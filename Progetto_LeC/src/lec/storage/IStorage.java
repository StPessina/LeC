package lec.storage;


import java.util.ArrayList;
import java.util.Map;

import lec.exception.DuplicateTagException;
import lec.exception.TagNotFoundException;
import lec.graphelement.Face;
import lec.graphelement.Line;
import lec.graphelement.Point;
import lec.grouping.Group;
import lec.vertexInfo.VNormal;
import lec.vertexInfo.VTexture;
import lec.vertexInfo.Vertex;

public interface IStorage {
	
	/**
	 * Aggiunta di un vertice con tagname
	 * 
	 * @param tag
	 * @param v
	 * @throws DuplicateTagException
	 */
	public void addVertexCopy(String tag, Vertex v) throws DuplicateTagException;
	
	/**
	 * Ritorna il vertice cercato per tagname, se esiste
	 * 
	 * @param tag
	 * @return vertice
	 * @throws TagNotFoundException
	 */
	public Vertex getVertexCopy(String tag) throws TagNotFoundException;
	
	/**
	 * Aggiunta di un vertice texture con tagname
	 * 
	 * @param tag
	 * @param vt
	 * @throws DuplicateTagException
	 */
	public void addVTextureCopy(String tag, VTexture vt) throws DuplicateTagException;
	
	/**
	 * Ritorna il vertice texture cercato per tagname, se esiste
	 * 
	 * @param tag
	 * @return vTexture
	 * @throws TagNotFoundException
	 */
	public VTexture getVTextureCopy(String tag) throws TagNotFoundException;
	
	/**
	 * Aggiunta di una normale con tagname
	 * 
	 * @param tag
	 * @param vn
	 * @throws DuplicateTagException
	 */
	public void addVNormalCopy(String tag, VNormal vn) throws DuplicateTagException;
	
	/**
	 * Ritorna il vertice normale cercato per tagname, se esiste
	 * 
	 * @param tag
	 * @return vNormal
	 * @throws TagNotFoundException
	 */
	public VNormal getVNormalCopy(String tag) throws TagNotFoundException;
	
	/**
	 * Aggiunta di un punto senza tagname
	 * 
	 * @param point
	 */
	public void addPointNoTagCopy(Point point);
	
	/**
	 * Aggiunta di un punto con tagname
	 * 
	 * @param tag
	 * @param point
	 * @throws DuplicateTagException
	 */
	public void addPointCopy(String tag, Point point) throws DuplicateTagException;
	
	/**
	 * Lettura di un punto per tagname, se esiste
	 * 
	 * @param tag
	 * @return
	 * @throws TagNotFoundException
	 */
	public Point getPointCopy(String tag) throws TagNotFoundException;
	
	/**
	 * Aggiunta di una linea senza tagname
	 * 
	 * @param line
	 */
	public void addLineNoTagCopy(Line line);
	
	/**
	 * Aggiunta di una linea con tagname
	 * 
	 * @param tag
	 * @param line
	 * @throws DuplicateTagException
	 */
	public void addLineCopy(String tag, Line line) throws DuplicateTagException;
	
	/**
	 * Lettura linea per tagname, se esiste
	 * 
	 * @param tag
	 * @return
	 * @throws TagNotFoundException
	 */
	public Line getLineCopy(String tag) throws TagNotFoundException;
	
	/**
	 * Aggiunta di una faccia senza tagname
	 * 
	 * @param face
	 */
	public void addFaceNoTagCopy(Face face);
	
	/**
	 * Aggiunta di una faccia con tagname
	 * 
	 * @param tag
	 * @param face
	 * @throws DuplicateTagException
	 */
	public void addFaceCopy(String tag, Face face) throws DuplicateTagException;
	
	/**
	 * Lettura faccia per tagname, se esiste
	 * 
	 * @param tag
	 * @return
	 * @throws TagNotFoundException
	 */
	public Face getFaceCopy(String tag) throws TagNotFoundException;
	
	/**
	 * @return Lista dei punti senza tag
	 */
	public ArrayList<Point> getPointList();
	
	/**
	 * @return Mappa dei punti con tag
	 */
	public Map<String, Point> getPointMap();
	
	/**
	 * @return Lista delle linee senza tag
	 */
	public ArrayList<Line> getLineList();
	
	/**
	 * @return Mappa delle liste con tag
	 */
	public Map<String, Line> getLineMap();
	
	/**
	 * @return Lista delle facce senza tag
	 */
	public ArrayList<Face> getFaceList();
	
	/**
	 * @return Mappa delle facce con tag
	 */
	public Map<String, Face> getFaceMap();
	
	/**
	 * @return Lista dei gruppi
	 */
	public ArrayList<Group> getGroupList();
}
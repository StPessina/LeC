/**
 * 
 */
package lec.storage;

import java.util.ArrayList;
import java.util.HashMap;
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

/**
 * @author stefano
 *
 */
public class Storage implements IStorage {
	
	private HashMap<String, Vertex> vertexTagMap;
	private HashMap<String, VTexture> vTextureTagMap;
	private HashMap<String, VNormal> vNormalTagMap;
	
	private HashMap<String, Point> pointTagMap;
	private HashMap<String, Line> lineTagMap;
	private HashMap<String, Face> faceTagMap;
	
	private ArrayList<Point> pointList;
	private ArrayList<Line> lineList;
	private ArrayList<Face> faceList;
	
	public Storage() {
		vertexTagMap = new HashMap<>();
		vTextureTagMap = new HashMap<>();
		vNormalTagMap = new HashMap<>();
		
		pointTagMap = new HashMap<>();
		pointList = new ArrayList<>();
		
		lineTagMap = new HashMap<>();
		lineList = new ArrayList<>();
		
		faceTagMap = new HashMap<>();
		faceList = new ArrayList<>();
	}
	
	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addVertex(java.lang.String, lec.vertexInfo.Vertex)
	 */
	@Override
	public void addVertexCopy(String tag, Vertex v) throws DuplicateTagException {
		if(vertexTagMap.containsKey(tag))
			throw new DuplicateTagException();
		vertexTagMap.put(tag, new Vertex(v));
	}
	
	@Override
	public Vertex getVertexCopy(String tag) throws TagNotFoundException {
		if(!vertexTagMap.containsKey(tag))
			throw new TagNotFoundException();
		return new Vertex(vertexTagMap.get(tag));
	}

	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addVTexture(java.lang.String, lec.vertexInfo.VTexture)
	 */
	@Override
	public void addVTextureCopy(String tag, VTexture vt)
			throws DuplicateTagException {
		if(vTextureTagMap.containsKey(tag))
			throw new DuplicateTagException();
		vTextureTagMap.put(tag, new VTexture(vt));

	}
	
	@Override
	public VTexture getVTextureCopy(String tag) throws TagNotFoundException {
		if(!vTextureTagMap.containsKey(tag))
			throw new TagNotFoundException();
		return new VTexture(vTextureTagMap.get(tag));
	}

	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addVNormal(java.lang.String, lec.vertexInfo.VNormal)
	 */
	@Override
	public void addVNormalCopy(String tag, VNormal vn) throws DuplicateTagException {
		if(vNormalTagMap.containsKey(tag))
			throw new DuplicateTagException();
		vNormalTagMap.put(tag, new VNormal(vn));

	}
	
	@Override
	public VNormal getVNormalCopy(String tag) throws TagNotFoundException {
		if(!vNormalTagMap.containsKey(tag))
			throw new TagNotFoundException();
		return new VNormal(vNormalTagMap.get(tag));
	}

	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addPointNoTag(lec.graphelement.Point)
	 */
	@Override
	public void addPointNoTagCopy(Point point) {
		pointList.add(new Point(point));
	}

	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addPoint(java.lang.String, lec.graphelement.Point)
	 */
	@Override
	public void addPointCopy(String tag, Point point) throws DuplicateTagException {
		if(pointTagMap.containsKey(tag))
			throw new DuplicateTagException();
		pointTagMap.put(tag, new Point(point));
	}
	
	@Override
	public Point getPointCopy(String tag) throws TagNotFoundException {
		if (!pointTagMap.containsKey(tag))
			throw new TagNotFoundException();
		return new Point(pointTagMap.get(tag));
	}

	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addLineNoTag(lec.graphelement.Line)
	 */
	@Override
	public void addLineNoTagCopy(Line line) {
		lineList.add(new Line(line));
	}

	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addLine(java.lang.String, lec.graphelement.Line)
	 */
	@Override
	public void addLineCopy(String tag, Line line) throws DuplicateTagException {
		if(lineTagMap.containsKey(tag))
			throw new DuplicateTagException();
		lineTagMap.put(tag, new Line(line));
	}
	
	@Override
	public Line getLineCopy(String tag) throws TagNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addFaceNoTag(lec.graphelement.Face)
	 */
	@Override
	public void addFaceNoTagCopy(Face face) {
		faceList.add(new Face(face));
	}

	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addFace(java.lang.String, lec.graphelement.Face)
	 */
	@Override
	public void addFaceCopy(String tag, Face face) throws DuplicateTagException {
		if(faceTagMap.containsKey(tag))
			throw new DuplicateTagException();
		faceTagMap.put(tag, new Face(face));
	}
	
	@Override
	public Face getFaceCopy(String tag) throws TagNotFoundException {
		// TODO Auto-generated method stub		
		return null;
	}
	
	public void testPrint(){
		System.out.println("Vertex map");
		
		for (Vertex v : vertexTagMap.values()) {
			System.out.println(v.toString());
		}
		
		System.out.println("VTexture map");
		
		for (VTexture vt : vTextureTagMap.values()) {
			System.out.println(vt.toString());
		}
		
		System.out.println("List line");
		for (Line l : lineList)
			System.out.println(l.toString());
		System.out.println("Map line");
		
		for (Line l : lineTagMap.values()) {
			System.out.println(l.toString());
		}
	}

	@Override
	public ArrayList<Point> getPointList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Point> getPointMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Line> getLineList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Line> getLineMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Face> getFaceList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Face> getFaceMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Group> getGroupList() {
		// TODO Auto-generated method stub
		return null;
	}
}

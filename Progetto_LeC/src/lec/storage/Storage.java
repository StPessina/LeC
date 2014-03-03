/**
 * 
 */
package lec.storage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lec.exception.DuplicateTagException;
import lec.exception.TagNotFoundException;
import lec.graphelement.Face;
import lec.graphelement.GraphElement;
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
	
	private IGraphElementsMapper<Point> points;
	private IGraphElementsMapper<Line> lines;
	private IGraphElementsMapper<Face> faces;
	
	private HashMap<String, Group> groupTagMap;
	
	public Storage() {
		vertexTagMap = new HashMap<>();
		vTextureTagMap = new HashMap<>();
		vNormalTagMap = new HashMap<>();
		
		points = new GraphElementsMapper<>();
		lines = new GraphElementsMapper<>();
		faces = new GraphElementsMapper<>();
		
		groupTagMap = new HashMap<>();
	}
	
	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addVertex(java.lang.String, lec.vertexInfo.Vertex)
	 */
	@Override
	public void addVertexCopy(String tag, Vertex v) throws DuplicateTagException {
		if(vertexTagMap.containsKey(tag))
			throw new DuplicateTagException(tag);
		vertexTagMap.put(tag, new Vertex(v));
	}
	
	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addFace(java.lang.String, lec.graphelement.Face)
	 */
	public Vertex getVertexCopy(String tag) throws TagNotFoundException {
		if(!vertexTagMap.containsKey(tag))
			throw new TagNotFoundException(tag);
		return new Vertex(vertexTagMap.get(tag));
	}

	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addVTexture(java.lang.String, lec.vertexInfo.VTexture)
	 */
	@Override
	public void addVTextureCopy(String tag, VTexture vt)
			throws DuplicateTagException {
		if(vTextureTagMap.containsKey(tag))
			throw new DuplicateTagException(tag);
		vTextureTagMap.put(tag, new VTexture(vt));

	}
	
	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addFace(java.lang.String, lec.graphelement.Face)
	 */
	public VTexture getVTextureCopy(String tag) throws TagNotFoundException {
		if(!vTextureTagMap.containsKey(tag))
			throw new TagNotFoundException(tag);
		return new VTexture(vTextureTagMap.get(tag));
	}

	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addVNormal(java.lang.String, lec.vertexInfo.VNormal)
	 */
	@Override
	public void addVNormalCopy(String tag, VNormal vn) throws DuplicateTagException {
		if(vNormalTagMap.containsKey(tag))
			throw new DuplicateTagException(tag);
		vNormalTagMap.put(tag, new VNormal(vn));

	}
	
	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addFace(java.lang.String, lec.graphelement.Face)
	 */
	public VNormal getVNormalCopy(String tag) throws TagNotFoundException {
		if(!vNormalTagMap.containsKey(tag))
			throw new TagNotFoundException(tag);
		return new VNormal(vNormalTagMap.get(tag));
	}

	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addPointNoTag(lec.graphelement.Point)
	 */
	@Override
	public void addPointNoTagCopy(Point point) {
		points.addNoTag(new Point(point));
	}

	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addPoint(java.lang.String, lec.graphelement.Point)
	 */
	@Override
	public void addPointCopy(String tag, Point point) throws DuplicateTagException {
		points.add(tag, point);
	}
	
	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addFace(java.lang.String, lec.graphelement.Face)
	 */
	public Point getPointCopy(String tag) throws TagNotFoundException {
		return new Point(points.getElement(tag));
	}

	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addLineNoTag(lec.graphelement.Line)
	 */
	@Override
	public void addLineNoTagCopy(Line line) {
		lines.addNoTag(new Line(line));
	}

	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addLine(java.lang.String, lec.graphelement.Line)
	 */
	@Override
	public void addLineCopy(String tag, Line line) throws DuplicateTagException {
		lines.add(tag, new Line(line));
	}
	
	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addFace(java.lang.String, lec.graphelement.Face)
	 */
	public Line getLineCopy(String tag) throws TagNotFoundException {
		return new Line(lines.getElement(tag));
	}

	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addFaceNoTag(lec.graphelement.Face)
	 */
	@Override
	public void addFaceNoTagCopy(Face face) {
		faces.addNoTag(new Face(face));
	}

	/* (non-Javadoc)
	 * @see lec.storage.IStorage#addFace(java.lang.String, lec.graphelement.Face)
	 */
	@Override
	public void addFaceCopy(String tag, Face face) throws DuplicateTagException {
		faces.add(tag, new Face(face));
	}
	
	@Override
	public Face getFaceCopy(String tag) throws TagNotFoundException {
		return new Face(faces.getElement(tag));
	}
	
	@Override
	public GraphElement getGraphElementCopy(String tag)
			throws TagNotFoundException {
		if (points.containsElement(tag))
			return (new Point(points.getElement(tag)));
		if (lines.containsElement(tag))
			return (new Line(lines.getElement(tag)));
		if (faces.containsElement(tag))
			return (new Face(faces.getElement(tag)));
		
		throw new TagNotFoundException(tag);
	}
	
	@Override
	public void addGroup(String tag, Group group) throws DuplicateTagException {
		if (groupTagMap.containsKey(tag))
			throw new DuplicateTagException(tag);		
		groupTagMap.put(tag, group);
	}
	
	@Override
	public List<Point> getPointList() {
		return points.getList();
	}

	@Override
	public Map<String, Point> getPointMap() {
		return points.getTagList();
	}

	@Override
	public List<Line> getLineList() {
		return lines.getList();
	}

	@Override
	public Map<String, Line> getLineMap() {
		return lines.getTagList();
	}

	@Override
	public List<Face> getFaceList() {
		return faces.getList();
	}

	@Override
	public Map<String, Face> getFaceMap() {
		return faces.getTagList();
	}

	@Override
	public List<Point> getUnusedPointList() {
		return points.getUnusedTagList();
	}

	@Override
	public List<Line> getUnusedLineList() {
		return lines.getUnusedTagList();
	}

	@Override
	public List<Face> getUnusedFaceList() {
		return faces.getUnusedTagList();
	}

	@Override
	public Map<String, Group> getGroupMap() {
		return Collections.unmodifiableMap(groupTagMap);
	}
}

package lec.semantic;

import lec.graphelement.Face;
import lec.graphelement.Line;
import lec.graphelement.Point;
import lec.storage.IStorage;
import lec.vertexInfo.VNormal;
import lec.vertexInfo.VTexture;
import lec.vertexInfo.Vertex;
import lec.vertexInfo.Vertex3d;

import org.antlr.runtime.Token;

public class ParserEnvironment {
	
	IStorage storage;
	
	Line tempLine;
	
	Face tempFace;
	
	public ParserEnvironment(IStorage storage) {
		super();
		this.storage = storage;
	}

	/**
	 * conversione di un token numerico in un float
	 * 
	 * @param num token
	 * @return valore float
	 */
	public float parseNumber(Token num){
		return (float) Float.parseFloat(num.getText());
	}
	
	/**
	 * Conversione di un token tagname in stringa
	 * 
	 * @param tag token
	 * @return stringa contenente il tagname
	 */
	public String parseTagname(Token tag){
		return tag.getText();
	}
	
	
	/**
	 * Conversione float x,y,z in un vertex3d
	 * 
	 * @param x coordinata x
	 * @param y coordinata y
	 * @param z coordinata z
	 * @return vertex3d
	 */
	public Vertex3d translateInVertex3d(float x, float y, float z){
		return new Vertex3d(x,y,z);
	}
	
	/**
	 * Inserimento nella struttura dati in un informazione sui vertici
	 * Il tipo viene definito dalla stringa type
	 * 
	 * @param type
	 * @param v
	 */
	public void addNewVertexInfo(String type, String tagname, Vertex3d v) {
		switch (type) {
		case "vertex":
			storage.addVertexCopy(tagname, new Vertex(v.getX(), v.getY(), v.getZ()));
			break;
		case "texture":
			storage.addVTextureCopy(tagname, new VTexture(v.getX(), v.getY(), v.getZ()));
			break;
		
		case "normal":
			storage.addVNormalCopy(tagname, new VNormal(v.getX(), v.getY(), v.getZ()));
			break;
			
		default:
			System.out.println("Occhio che non è ne vertex ne texture ne normale!");
			break;
		}
	}
	
	public Vertex addNewVertexInLine(String tagname, Vertex3d v){
        Vertex vertex = new Vertex(v.getX(), v.getY(), v.getZ());
		if(tagname!=null)
            storage.addVertexCopy(tagname, vertex);
        return vertex;
	}
	
	public VTexture addNewVTextureInLine(String tagname, Vertex3d v){
        VTexture vTexture = new VTexture(v.getX(), v.getY(), v.getZ());
		if(tagname!=null)
            storage.addVTextureCopy(tagname, vTexture);
        return vTexture;
	}
	
	public VNormal addNewVNormalInLine(String tagname, Vertex3d v){
        VNormal vNormal = new VNormal(v.getX(), v.getY(), v.getZ());
		if(tagname!=null)
            storage.addVNormalCopy(tagname, vNormal);
        return vNormal;
	}
	
	public Point addNewPoint(String tagnamePointOrVertex, String tagvertex, Vertex v){
		/*
		 * Grammatica:
		 * point v1;
		 * 
		 * tagnamePointOrVertex = tagnameVertex (è un vertice)
		 * */
		if(tagnamePointOrVertex!=null && tagvertex==null && v==null) {
			Point newPoint = new Point(storage.getVertexCopy(tagnamePointOrVertex));
			storage.addPointNoTagCopy(newPoint);
			return newPoint;
		}
		
		/*
		 * Grammatica:
		 * point p1 = v1;
		 * 
		 * tagnamePointOrVertex = tagnamePoint
		 * il vertice è richiamato per tagname
		 * 
		 * */
		if(tagnamePointOrVertex!=null && tagvertex!=null && v==null){
			Point newPoint = new Point(storage.getVertexCopy(tagvertex));
			storage.addPointCopy(tagnamePointOrVertex, newPoint);
			return newPoint;
		}
		
		/*
		 * Grammatica:
		 * point p1 = NEW (VERTEX v1 = 0 1 2);
		 * oppure
		 * point p1 = NEW (VERTEX 0 1 2);
		 * 
		 * tagnamePointOrVertex = tagnamePoint
		 * il vertice viene creato nuovo e gli viene assegnato un valore ma non un nome
		 * 
		 * il vertice viene già creato dalla produzione in line
		 * 
		 * */
		if(tagnamePointOrVertex!=null && v!=null) {
			Point newPoint = new Point(v);
			storage.addPointCopy(tagnamePointOrVertex, newPoint);
			return newPoint; 
		}
		
		/*
		 * Grammatica:
		 * point NEW (VERTEX v1 = 0 1 2);
		 * oppure
		 * point NEW (VERTEX 0 1 2);
		 * 
		 * tagnamePointOrVertex = tagnamePoint
		 * il vertice viene creato nuovo e gli viene assegnato un valore ma non un nome
		 * 
		 * */
		if(tagnamePointOrVertex==null && v!=null) {
			Point newPoint = new Point(v);
			storage.addPointNoTagCopy(newPoint);
			return newPoint; 
		}
		
		return null;
	}
	
	public void initializeTempLine() {
		tempLine = new Line();
	}
	
	public void addToTempLine(String tag_vertex, Vertex v, String tag_vtexture,VTexture vt) {
		Vertex vertex = v;
		VTexture vTexture = vt;
		if(tag_vertex!=null)
			vertex = storage.getVertexCopy(tag_vertex);
		if(tag_vtexture!=null)
			vTexture = storage.getVTextureCopy(tag_vtexture);
		if(vTexture!=null)
			tempLine.add(vertex, vTexture);
		else
			tempLine.add(vertex);
	}
	
	public Line saveLineInLine(String tag_line){
		if(tag_line!=null)
			storage.addLineCopy(tag_line, tempLine);	
		return tempLine;
	}
	
	public void saveLine(String tag_line) {
		if(tag_line!=null)
			storage.addLineCopy(tag_line, tempLine);	
		if(tag_line==null)
			storage.addLineNoTagCopy(tempLine);
	}
	
	public void initializeTempFace(){
		tempFace = new Face();
	}

}

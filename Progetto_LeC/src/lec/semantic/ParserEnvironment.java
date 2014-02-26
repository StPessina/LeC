package lec.semantic;

import lec.graphelement.Face;
import lec.graphelement.GraphElement;
import lec.graphelement.GraphElement.vertexConfig;
import lec.graphelement.Line;
import lec.graphelement.Point;
import lec.grouping.Group;
import lec.storage.IStorage;
import lec.vertexInfo.VNormal;
import lec.vertexInfo.VTexture;
import lec.vertexInfo.Vertex;
import lec.vertexInfo.Vertex3d;

import org.antlr.runtime.Token;

/**
 * Parser per creazione struttura dati.
 * 
 * La struttura dati viene creata in un componente
 * IStorage.
 * 
 * @author stefano
 *
 */
/**
 * @author stefano
 *
 */
public class ParserEnvironment {
	
	/**
	 * Componente di storage dove viene immagazzinata
	 * la struttura dati letta dal parser
	 */
	IStorage storage;
	
	/**
	 * Oggetto grafico temporaneo utilizzato per la costruzione
	 * di un nuovo oggetto grafico
	 */
	Line tempLine;
	
	/**
	 * Oggetto grafico temporaneo utilizzato per la costruzione
	 * di un nuovo oggetto grafico
	 */
	Face tempFace;
	
	/**
	 * Oggetto grafico temporaneo utilizzato per la costruzione
	 * di un nuovo oggetto grafico
	 */
	Group tempGroup;
		
	
	/**
	 * Costruttore
	 * inizializzazione componente di storage
	 * 
	 * @param storage
	 */
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
	 * Il tipo viene definito dalla stringa type.
	 * 
	 * Il tagname è obbligatorio in questa definizione, quindi il
	 * vertice viene per forza aggiunto al componente di storage
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
	
	/**
	 * Aggiunta di un nuovo vertice definito inLine
	 * Nel caso in cui nella definizione inline sia presente
	 * un tagname, il vertice definito in line viene salvato
	 * nel componente di storage
	 * 
	 * @param tagname
	 * @param v
	 * @return nuovo vertice
	 */
	public Vertex addNewVertexInLine(String tagname, Vertex3d v) {
        Vertex vertex = new Vertex(v.getX(), v.getY(), v.getZ());
		if(tagname!=null)
            storage.addVertexCopy(tagname, vertex);
        return vertex;
	}
	
	/**
	 * Aggiunta di un nuovo vertice texture definito inLine
	 * Nel caso in cui nella definizione inline sia presente
	 * un tagname, il vertice texture definito in line viene salvato
	 * nel componente di storage
	 * 
	 * @param tagname
	 * @param v
	 * @return nuovo vertice texture
	 */
	public VTexture addNewVTextureInLine(String tagname, Vertex3d v){
        VTexture vTexture = new VTexture(v.getX(), v.getY(), v.getZ());
		if(tagname!=null)
            storage.addVTextureCopy(tagname, vTexture);
        return vTexture;
	}
	
	/**
	 * Aggiunta di un nuovo vertice normale definito inLine
	 * Nel caso in cui nella definizione inline sia presente
	 * un tagname, il vertice normale definito in line viene salvato
	 * nel componente di storage
	 * 
	 * @param tagname
	 * @param v
	 * @return nuovo vertice normale
	 */
	public VNormal addNewVNormalInLine(String tagname, Vertex3d v){
        VNormal vNormal = new VNormal(v.getX(), v.getY(), v.getZ());
		if(tagname!=null)
            storage.addVNormalCopy(tagname, vNormal);
        return vNormal;
	}
	
	/**
	 * Aggiunta di un nuovo punto. In base alla grammatica viene definito
	 * se il punto ha un nome o meno, se è stato dichiarato un vertice,
	 * se tale vertice ha un nome.
	 * 
	 * @param tagnamePointOrVertex
	 * @param tagvertex
	 * @param v
	 * @return nuovo punto
	 */
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
	
	/**
	 * Inizializza l'oggetto temporaneo linea
	 */
	public void initializeTempLine() {
		tempLine = null;
	}
	
	/**
	 * Aggiunge un vertice e una eventuale texture ad un elemento linea
	 * 
	 * @param tag_vertex
	 * @param v
	 * @param tag_vtexture
	 * @param vt
	 */
	public void addToTempLine(String tag_vertex, Vertex v, String tag_vtexture,VTexture vt) {
		if(tempLine==null)
			if(tag_vtexture!=null || vt!=null)
				tempLine = new Line(vertexConfig.VERTEX_TEXTURE);
			else
				tempLine = new Line(vertexConfig.ONLY_VERTEX);
				
		/*Inizializzo vertex e vtexture a quelli
		 * passati in ingresso alla funzione 
		 * anche se potrebbero essere null
		 * 
		 * Assumo quindi che i vertici siano stati
		 * definiti in line (v e vt arrivano da definizioni
		 * in line
		*/
		Vertex vertex = v;
		VTexture vTexture = vt;
		
		/* E' stato specificato il nome di un vertice
		 * quindi lo vado a cercare da componente di storage
		 */
		if(tag_vertex!=null)
			vertex = storage.getVertexCopy(tag_vertex);
		
		/* E' stato specificato il nome di un vertice texture
		 * quindi lo vado a cercare da componente di storage
		 */
		if(tag_vtexture!=null)
			vTexture = storage.getVTextureCopy(tag_vtexture);
		
		/* Nel caso in cui vTexture sia nullo
		 * (quindi non è stato definito ne inline ne è stato
		 * specificato un tagname)
		 * significa che il vertice della linea non ha texture
		 * 
		 * Altrimenti aggiunto sia vertex che vtexture alla
		 * linea temporanea
		 */
		if(vTexture!=null)
			tempLine.add(vertex, vTexture);
		else
			tempLine.add(vertex);
	}
	
	/**
	 * Se la definizione della linea è inline
	 * ritorna la linea stessa.
	 * 
	 * Nel caso in cui la definizione sia inline con
	 * un nome, allora viene saltava nel componente
	 * di storage
	 * 
	 * @param tag_line
	 * @return nuova linea
	 */
	public Line saveLineInLine(String tag_line){
		if(tag_line!=null)
			storage.addLineCopy(tag_line, tempLine);	
		return tempLine;
	}
	
	/**
	 * Se la definizione della linea non è inline
	 * allora verifico se ha o meno il tag e la inserisco
	 * nel componente di storage
	 * @param tag_line
	 */
	public void saveLine(String tag_line) {
		if(tag_line!=null)
			storage.addLineCopy(tag_line, tempLine);	
		if(tag_line==null)
			storage.addLineNoTagCopy(tempLine);
	}
	
	/**
	 * Inizializzazione della faccia temporanea
	 */
	public void initializeTempFace(){
		tempFace = null;
	}
	
	/**
	 * Aggiunge un vertece con eventuale texture e normale
	 * alla faccia temporanea
	 * 
	 * @param vertexName
	 * @param vertex
	 * @param vTextureName
	 * @param vTexture
	 * @param vNormalName
	 * @param vNormal
	 */
	public void addToTempFace(String vertexName, Vertex vertex, 
						 String vTextureName, VTexture vTexture,
						 String vNormalName, VNormal vNormal) {
		/*
		 * Funzionamento simile a addToTempLine..
		 */
		
		if(tempFace==null)
			if(vTextureName==null && vTexture==null &&
					vNormalName==null && vNormal==null)
				tempFace = new Face(vertexConfig.ONLY_VERTEX);
			else
				if((vTextureName!=null || vTexture!=null) &&
						(vNormalName!=null || vNormal!=null))
					tempFace = new Face(vertexConfig.ALL);
				else
					if(vTextureName!=null || vTexture!=null)
						tempFace = new Face(vertexConfig.VERTEX_TEXTURE);
					else
						tempFace = new Face(vertexConfig.VERTEX_NORMAL);
		
		Vertex vertexTemp = vertex;
		VTexture vTextureTemp = vTexture;
		VNormal vNormalTemp = vNormal;
		
		if(vertexName!=null)
			vertexTemp = storage.getVertexCopy(vertexName);
		
		if(vTextureName!=null)
			vTextureTemp = storage.getVTextureCopy(vTextureName);
		
		if(vNormalName!=null)
			vNormalTemp = storage.getVNormalCopy(vNormalName);
		
		if(vTexture == null && vNormal == null)
			tempFace.add(vertexTemp);
		
		if(vTexture!= null && vNormal == null)
			tempFace.add(vertexTemp, vTextureTemp);
		
		if(vTexture!= null && vNormal != null)
			tempFace.add(vertexTemp, vTextureTemp, vNormalTemp);
	}
	
	/**
	 * Se la definizione della faccia è inface
	 * ritorna la faccia stessa.
	 * 
	 * Nel caso in cui la definizione sia inface con
	 * un nome, allora viene saltava nel componente
	 * di storage
	 * 
	 * @param tag_face
	 * @return nuova faccia
	 */
	public Face saveFaceInline(String tag_face){
		if(tag_face!=null)
			storage.addFaceCopy(tag_face, tempFace);	
		return tempFace;
	}
	
	/**
	 * Se la definizione della faccia non è inface
	 * allora verifico se ha o meno il tag e la inserisco
	 * nel componente di storage
	 * @param tag_face
	 */
	public void saveFace(String tag_face) {
		if(tag_face!=null)
			storage.addFaceCopy(tag_face, tempFace);	
		if(tag_face==null)
			storage.addFaceNoTagCopy(tempFace);
	}
	
	/**
	 * Inizializzazione di un gruppo temporaneo
	 * 
	 * @param tag_name
	 */
	public void initializeGroup(String tag_name) {
		tempGroup = new Group(tag_name);
	}
	
	public void addToTempGroup(String graphElementTag, Point point, Line line, Face face, String smoothTag) {
		if(graphElementTag!=null)
			tempGroup.addElement(storage.getGraphElementCopy(graphElementTag));
		
		if(point!=null)
			tempGroup.addElement(point);
		
		if(line!=null)
			tempGroup.addElement(line);
		
		if(face!=null)
			tempGroup.addElement(face);		
	}
	
	/**
	 * Inserimento nel componente di storage di un nuovo
	 * grouppo
	 * 
	 * @param tag_group
	 */
	public void saveGroup() {
		storage.addGroup(tempGroup.getGroupName(), tempGroup);
	}
	
}

package lec.translater;

import java.util.ArrayList;

import lec.graphelement.Translatable;
import lec.grouping.Group;

/**
 * Questa interfaccia deve essere implementata
 * dal componente software che analizza un oggetto
 * e viene utilizzata dal componente Translator
 * 
 * @author stefano
 * 
 * @see lec.translater.Translator
 * @see lec.graphelement.Translatable
 *
 */
public interface IObjectAnalizer {
	
	public void analizeTranslable(Translatable translableObject, int initialIndexVertices, int initialIndexTextures, int initialIndexNormals);
	
	public void analizeGroupOfTranslable(Group group, int initialIndex, int initialIndexTextures, int initialIndexNormals);
	
	public ArrayList<String> getUsedVertices();
	
	public ArrayList<String> getUsedVertexTextures();
	
	public ArrayList<String> getUsedVertexNormals();
	
	public int getNumberOfUsedVertices();
	
	public int getNumberOfUsedVertexTextures();
	
	public int getNumberOfVertexNormals();
	
	public ArrayList<String> getObjects();
	
}

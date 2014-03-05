package lec.storage;

import java.util.List;
import java.util.Map;

import lec.exception.DuplicateTagException;
import lec.exception.TagNotFoundException;
import lec.graphelement.GraphElement;

/**
 * @author stefano
 *
 */
public interface IGraphElementsMapper<ElementType extends GraphElement> {
	
	/**
	 * @param element
	 */
	public void addNoTag(ElementType element);
	
	/**
	 * @param tag
	 * @param element
	 * @throws DuplicateTagException
	 */
	public void add(String tag, ElementType element) throws DuplicateTagException;
	
	/**
	 * @param tag
	 * @return
	 */
	public boolean containsElement(String tag);
	
	/**
	 * @param tag
	 * @return
	 * @throws TagNotFoundException
	 */
	public ElementType getElement(String tag) throws TagNotFoundException;
	
	/**
	 * @return
	 */
	public List<ElementType> getList();
	
	/**
	 * @return
	 */
	public Map<String, ElementType> getTagList();
	
	/**
	 * @return
	 */
	public List<ElementType> getUnusedTagList();
}

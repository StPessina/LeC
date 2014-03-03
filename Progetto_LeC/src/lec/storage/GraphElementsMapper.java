package lec.storage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lec.exception.DuplicateTagException;
import lec.exception.TagNotFoundException;
import lec.graphelement.GraphElement;

public class GraphElementsMapper<ElementType extends GraphElement> implements IGraphElementsMapper<ElementType> {
	
	private Map<String, ElementType> tagMap;
	private Set<String> unusedTagSet;
	private List<ElementType> noTagList;
	
	public GraphElementsMapper() {
		this.tagMap = new HashMap<>();
		this.unusedTagSet = new HashSet<>();
		this.noTagList = new ArrayList<>();
	}

	
	@Override
	public void addNoTag(ElementType element) {
		noTagList.add(element);
	}
	
	@Override
	public void add(String tag, ElementType element) throws DuplicateTagException {
		if(tagMap.containsKey(tag))
			throw new DuplicateTagException(tag);
		tagMap.put(tag, element);
		unusedTagSet.add(tag);
	}

	@Override
	public boolean containsElement(String tag) {
		return tagMap.containsKey(tag);
	}


	@Override
	public ElementType getElement(String tag) throws TagNotFoundException {
		if (!tagMap.containsKey(tag))
			throw new TagNotFoundException(tag);
		if(unusedTagSet.contains(tag))
			unusedTagSet.remove(tag);
		return tagMap.get(tag);
	}

	@Override
	public List<ElementType> getList() {
		return Collections.unmodifiableList(noTagList);
	}

	@Override
	public Map<String, ElementType> getTagList() {
		return Collections.unmodifiableMap(tagMap);
	}

	@Override
	public List<ElementType> getUnusedTagList() {
		List<ElementType> unusedTagList = new ArrayList<>();
		
		for (String tag : unusedTagSet)
			unusedTagList.add(tagMap.get(tag));
		
		return unusedTagList;
	}

}

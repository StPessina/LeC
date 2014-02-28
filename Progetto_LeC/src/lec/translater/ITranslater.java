package lec.translater;

import java.util.ArrayList;

import lec.storage.IStorage;

public interface ITranslater {
	
	public ArrayList<String> getTranslation(IStorage storage);
	
}

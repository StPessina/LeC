package lec.printer;

import java.io.IOException;
import java.util.ArrayList;

public interface IPrinter {
	
	public void print(ArrayList<String> translation) throws IOException;
	
}

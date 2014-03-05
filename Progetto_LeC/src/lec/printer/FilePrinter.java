package lec.printer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FilePrinter implements IPrinter {
	
	String filePath = "output.obj";
	
	
	
	public FilePrinter(String filePath) {
		this.filePath = filePath;
	}



	@Override
	public void print(ArrayList<String> translation) throws IOException {
		PrintWriter output = new PrintWriter(filePath);
		for (String string : translation) {
			output.write(string);
			output.println();
		}
		output.close();
	}
}

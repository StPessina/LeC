package test.lec.printer;

import java.io.IOException;
import java.util.ArrayList;

import lec.printer.ConsolePrinter;
import lec.printer.FilePrinter;
import lec.printer.IPrinter;

public class PrinterTest {
	
	public static void main(String[] args) {
		
		IPrinter printer = new FilePrinter("./resources/output.obj");
		
		ArrayList<String> aList = new ArrayList<>();
		
		for (int i = 0; i < 10; i++)
			aList.add("line" + i);
		
		try {
			printer.print(aList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	
}

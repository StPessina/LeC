package test;

import java.io.FileReader;

import lec.storage.IStorage;
import lec.storage.Storage;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import test.lec.storage.storagePrinter;
import JavaPackage.grammaticaLexer;
import JavaPackage.grammaticaParser;


public class ParserTester  {
	static grammaticaParser parser;
	
	static Storage storage;

	public static void main(String[] args) {
		CommonTokenStream tokens;
		String fileIn = "./resources/testFaceSemantic.txt";
		storage = new Storage();
		
		try {
			System.out.println ("Parsing con ANTLR");
			System.out.println ("-----------------------");
			grammaticaLexer lexer = new grammaticaLexer(new ANTLRReaderStream(new FileReader(fileIn))); 
			tokens = new CommonTokenStream(lexer);
			parser = new grammaticaParser(tokens, storage);
			//parser.java();
			
			parser.start();
			
			storagePrinter sp = new storagePrinter(storage);
			
			sp.printAll();
			
			System.out.println("---------------------");
			System.out.println("----- FINE PARSING -------");
			System.out.println("---------------------\n\n");
			System.out.println("ERRORI:" + parser.getNumberOfSyntaxErrors());
			for (int i=0;i<parser.getNumberOfSyntaxErrors();i++) {
				//	    	System.out.println((i+1) + ".\t" + parser.);
			}
		} catch (Exception e) {
			System.out.println ("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}
	}
}
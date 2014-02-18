package test;

import java.io.FileReader;


import org.antlr.runtime.*;

import JavaPackage.*;


public class ParserTester  {
	static grammaticaParser parser;
  
	public static void main(String[] args) {
		CommonTokenStream tokens;
  	String fileIn = ".\\resources\\testVertex.txt";
  	
  	try {
			System.out.println ("Parsing con ANTLR");
			System.out.println ("-----------------------");
			grammaticaLexer lexer = new grammaticaLexer(new ANTLRReaderStream(new FileReader(fileIn))); 
			tokens = new CommonTokenStream(lexer);
	    parser = new grammaticaParser(tokens);
	    //parser.java();
	    System.out.println("---------------------");
	    System.out.println("----- FINE PARSING -------");
	    System.out.println("---------------------\n\n");
	    //System.out.println("ERRORI:" + parser.getErrorList().size());
	    /*for (int i=0;i<parser.getErrorList().size();i++) {
	    	System.out.println((i+1) + ".\t" + parser.getErrorList().get(i));
	    }*/
	    parser.start();
		} catch (Exception e) {
			System.out.println ("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}
  }
}
package test;

import java.io.FileReader;


import org.antlr.runtime.*;

import JavaPackage.*;


public class ParserTester  {
	static grammaticaParser parser;

	public static void main(String[] args) {
		CommonTokenStream tokens;
		String fileIn = "./resources/testLineGrammar.txt";

		try {
			System.out.println ("Parsing con ANTLR");
			System.out.println ("-----------------------");
			grammaticaLexer lexer = new grammaticaLexer(new ANTLRReaderStream(new FileReader(fileIn))); 
			tokens = new CommonTokenStream(lexer);
			parser = new grammaticaParser(tokens);
			//parser.java();
			
			parser.start();

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
package test;

import java.io.FileReader;
import java.io.FileWriter;

import org.antlr.runtime.*;

import JavaPackage.*;

public class ScannerTester {
  public static void main(String[] args) {
  	String fileIn = ".\\resources\\testVertex.txt";
  	String fileOut = ".\\resources\\lexer.ANTRL.txt";
  	FileWriter fOut;
  	Token tk;
  	int i;

		try {
			System.out.println ("Test ANTLR lexer");
			grammaticaLexer lexer = new grammaticaLexer(new ANTLRReaderStream(new FileReader(fileIn))); 
			fOut = new FileWriter (fileOut);
			i = 0;
			while ((tk = lexer.nextToken()).getType() != lexer.EOF) {
				if (tk.getType()!=9)
					System.out.println(++i + ":[" + tk.getLine() + "," + tk.getCharPositionInLine() + "]\t" + 
							"TokenType:" + tk.getType() + ":\t" + tk.getText());
				else
					System.out.println(++i + ":[" + tk.getLine() + "," + tk.getCharPositionInLine() + "]\t" + 
							"TokenType:" + tk.getType());
				
				fOut.append(i + ":[" + tk.getLine() + "," + tk.getCharPositionInLine() + "]\t" + 
														"TokenType:" + tk.getType() + ":\t" + tk.getText() + "\n");
			} 
			fOut.close();
		} catch (Exception e) {
			System.out.println ("Test ANTLR abortito");
			e.printStackTrace();
		}
  }
}


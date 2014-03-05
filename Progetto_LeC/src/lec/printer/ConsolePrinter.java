package lec.printer;

import java.util.ArrayList;

public class ConsolePrinter implements IPrinter {

	@Override
	public void print(ArrayList<String> translation) {
		for (String string : translation)
			System.out.println(string);
	}
}

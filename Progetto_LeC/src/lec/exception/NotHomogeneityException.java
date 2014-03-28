package lec.exception;

public class NotHomogeneityException extends RuntimeException {
	
	public NotHomogeneityException() {
		super("ERROR 3: Not homogeneity error");
	}
	
	public NotHomogeneityException(String graphElementTag) {
		super(graphElementTag);
	}
}

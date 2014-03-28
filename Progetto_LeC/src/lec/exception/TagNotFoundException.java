package lec.exception;

public class TagNotFoundException extends ParserStorageException {

	public TagNotFoundException(String message) {
		super("ERROR 2: tag not found: " + message);
	}

}

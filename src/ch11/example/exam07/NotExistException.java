package ch11.example.exam07;

public class NotExistException extends Exception{
	public NotExistException() {}
	public NotExistException(String message) {
		super(message);
	}
}

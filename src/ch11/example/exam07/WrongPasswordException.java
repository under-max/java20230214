package ch11.example.exam07;

public class WrongPasswordException extends Exception{
	public WrongPasswordException() {
		
	}
	
	public WrongPasswordException(String message) {
		super(message);
	}
}

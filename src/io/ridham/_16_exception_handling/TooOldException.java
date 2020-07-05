package io.ridham._16_exception_handling;

public class TooOldException extends RuntimeException{
	public TooOldException(String s) {
		super(s);
	}
}

package br.com.lbenaducci;

public class QualquerCoisaException extends Exception {
	public QualquerCoisaException() {
	}

	public QualquerCoisaException(String message) {
		super(message);
	}

	public QualquerCoisaException(String message, Throwable cause) {
		super(message, cause);
	}

	public QualquerCoisaException(Throwable cause) {
		super(cause);
	}
}

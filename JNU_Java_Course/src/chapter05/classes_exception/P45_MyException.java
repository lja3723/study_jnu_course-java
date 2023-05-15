package chapter05.classes_exception;

public class P45_MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public P45_MyException() {}
	public P45_MyException(String msg) {
		super(msg);
	}
}

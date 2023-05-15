package chapter05.classes_exception;

public class P48_UserException extends Exception {
	String ownMsg;
	public P48_UserException() {}
	public P48_UserException(String s) {
		super(s);
	}
	public P48_UserException(String s1, String s2) {
		super(s1);
		ownMsg = s2;
	}
	public String getMsg(){
		return ownMsg;
	}

}

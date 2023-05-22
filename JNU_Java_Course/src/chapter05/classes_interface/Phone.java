package chapter05.classes_interface;

public interface Phone {
	void sendCall();
	void receiveCall();
	default void printLogo() { //default ¸Þ¼Òµå
		System.out.println("** Phone **");
	}
}

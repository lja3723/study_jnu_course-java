package chapter05.classes_interface;

public interface Phone {
	void sendCall();
	void receiveCall();
	default void printLogo() { //default �޼ҵ�
		System.out.println("** Phone **");
	}
}

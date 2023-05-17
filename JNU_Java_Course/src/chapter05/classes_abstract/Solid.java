package chapter05.classes_abstract;

public abstract class Solid {
	public abstract double volume(); //����
	public abstract double surfaceArea(); // ǥ����
    public void show() {
       System.out.printf("\n\n%s", this); //this�� �����Ƿ� toString ������ �ʿ�
       System.out.printf("\nIts volume is %6.2f", volume());
       System.out.printf("\nIts surface area is %6.2f", surfaceArea());
    }
}

package chapter05.classes_abstract;

public abstract class Solid {
	public abstract double volume(); //부피
	public abstract double surfaceArea(); // 표면적
    public void show() {
       System.out.printf("\n\n%s", this); //this가 있으므로 toString 재정의 필요
       System.out.printf("\nIts volume is %6.2f", volume());
       System.out.printf("\nIts surface area is %6.2f", surfaceArea());
    }
}

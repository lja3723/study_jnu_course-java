package chapter04_2.classes;

public class p47_Triangle {
	private static int serialNoCounter;
	private double width, height;
	private int serialNo;
	{
		this.serialNo = ++serialNoCounter;
	}
	
	public p47_Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return width * height * 0.5;
	}
	
	public int getSerialNo() {
		return serialNo;
	}
	
}

package chapter05.classes_composition;

public class P07_Ex {
	public static void run() {
		double d1 = Math.random();
		double d2 = Math.random();
		double d3 = Math.random();
		OurMath om = new OurMath();
		System.out.println(d1 + " " + d2 + " " + d3);
		System.out.println("min = " + om.min(d1, d2, d3));
		System.out.println("max = " + om.max(d1, d2, d3));
	}
}

class OurSimpleMath {
	double min(double a, double b) {
		return a < b ? a : b;
	}
	
	double max(double a, double b) {
		return a < b ? b : a;
	}
}

class OurMath {
	private OurSimpleMath osm = new OurSimpleMath();
	double min(double a, double b, double c) {
		return osm.min(osm.min(a, b), c);
	}
	double max(double a, double b, double c) {
		return osm.max(osm.max(a, b), c);
	}
}

package chapter05.classes_composition;

public class Comp01 {
	public static void main(String a[]){
		Compute cp = new Compute();
		System.out.println(cp.add(1.0, 2.0));
		System.out.println(cp.subtract(1.0, 2.0));
		System.out.println(cp.multiply(1.0, 2.0));
		System.out.println(cp.divide(1.0, 2.0));
	}
}

class AddSubtract { 
	public double add(double x, double y){ 
		return x + y;
	}
	public double subtract(double x, double y){ 
		return x - y;
	}
}

class Compute {
	private AddSubtract as = new AddSubtract();
	public double add(double x, double y){ 
		return as.add(x, y);
	}
	public double subtract(double x, double y){ 
		return as.subtract(x, y);
	}
	public double multiply(double x, double y){ 
		return x * y;
	}
	public double divide(double x, double y){ 
		return x / y;
	}
}

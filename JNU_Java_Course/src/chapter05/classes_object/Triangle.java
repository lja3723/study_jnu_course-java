package chapter05.classes_object;

public class Triangle {
	double width;			
	double height;		
	public Triangle(double w, double h) {	
		width = w;
		height = h;
	}
	public double area() {	
		return width * height / 2;
	}
	
	public boolean equals(Object param) {
		//1. null�� ��� false
		if (param == null) return true;
		
		//2. �ڱ� �ڽ��� ��� true
		if (param == this) return true;
		
		//3. ���� Ÿ���� �ٸ� ��� false
		if (!(param instanceof Triangle)) return false;
		
		//4. ���� Ŭ���� �ʵ� �˻� �� �� �ٸ��� false
		if (!super.equals(param)) return false;
		
		//��μ� �ڱ� �ڽ��� ��� �˻� ����.
		Triangle t = (Triangle)param;
		return height == t.height && width == t.width;
	}
}


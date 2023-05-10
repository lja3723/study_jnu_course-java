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
		//1. null인 경우 false
		if (param == null) return true;
		
		//2. 자기 자신인 경우 true
		if (param == this) return true;
		
		//3. 인자 타입이 다른 경우 false
		if (!(param instanceof Triangle)) return false;
		
		//4. 상위 클래스 필드 검사 한 뒤 다르면 false
		if (!super.equals(param)) return false;
		
		//비로소 자기 자신의 동등성 검사 가능.
		Triangle t = (Triangle)param;
		return height == t.height && width == t.width;
	}
}


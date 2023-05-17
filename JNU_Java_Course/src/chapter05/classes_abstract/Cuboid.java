package chapter05.classes_abstract;

public class Cuboid extends Solid {	
	private double height, breadth, length;

	public Cuboid(double h,double b,double l) { 
	    height = h;
	    breadth = b;
	    length = l;
	}

	public Cuboid() { 
	    height = 0.0;
	    breadth = 0.0;
	    length = 0.0;
	}
	
	@Override
	public double volume(){ 
	    return height * breadth * length;
	}
	
	@Override
	public double surfaceArea(){ 	 
	    return 2 * (height * breadth + length * height + breadth * length);
	}
	
	public String toString(){
	    return new String("Cuboid: height = " + height + 
	    ", breadth = " + breadth + 
	    ", length = " + length);
	}
}

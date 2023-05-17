package chapter05.classes_abstract;

public class Cylinder extends Solid {
	  private double height, radius;
	  public Cylinder(double h,double r) { 
	    height = h;
	    radius = r;
	  }

	  public Cylinder() { 
	    height = 0.0;
	    radius = 0.0;
	  }

	  public double volume(){
	    return Math.PI*height*radius*radius;
	  }

	  public double surfaceArea(){ 
	      return 2 * Math.PI * height * radius + 2 * 
	        Math.PI * radius * radius;
	  }

	  public String toString(){ 
	    return new String("Cylinder: height = " + 
	      height + ", radius = " + radius);
	  }
}

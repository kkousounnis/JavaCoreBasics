package inheritance;

public class Rectangle extends TwoDshape {
	Rectangle() {
		super();//call to execute the constructor of the superclass twoDshapes
		// TODO Auto-generated constructor stub
	}
	Rectangle(double v, double h){
		super(v, h, "rectangle");
	}
	Rectangle (double x){
		super(x, "rectangle");
	}

	boolean isSquare() {
		if ( getWidth() == getHeight() ) return true;
		return false;
	}
	
	
	double area() {
		return getWidth() * getHeight();
	}
}

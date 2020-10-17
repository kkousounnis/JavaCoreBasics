package AbstractClasses;

public class ColorTriangle extends Triangle{
	private String color;
	ColorTriangle(String c, String s, double w, double h){ //ColorTriangle inherits Triangle which is descended from  twoDshape
		super(s,w,h);		
		color = c;	
	}
	String getcolor() {
		return color;
	}
	void showColor() {
		System.out.println("Color is"+color);
	}
}


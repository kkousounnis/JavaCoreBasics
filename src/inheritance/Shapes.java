package inheritance;

public class Shapes {
	public static void main(String args[]) {
		TwoDshape shapes[] = new TwoDshape[5];
		
		shapes[0] = new Triangle("Outlined", 8.0, 12.0);
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle(10,4);
		shapes[3] = new Triangle(7.0);
		shapes[4] = new TwoDshape(10, 20, "generic");
		
		for (int i=0; i < shapes.length; i++ ) {
			System.out.println("Object is " + shapes[i].getName());
			System.out.println("Area is "+ shapes[i].area());
			System.out.println("");
		}
	}

}

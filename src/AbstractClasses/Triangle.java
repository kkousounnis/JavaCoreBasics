package AbstractClasses;

public class Triangle extends TwoDshape {
	private String style;
	
	//a default constructor
	Triangle(){
		super();
		this.style="none";
	}
	
	Triangle(String style, double width, double height){
		super(width,height, "Triangle"); //call superclass constructor
		//use super to execute twoDshape constructor		
		this.style=style;		
	}
	Triangle(Triangle ob){
		super(ob); //pass object to TwoDshape
		style = ob.style;
	}
	
	Triangle(double x){
		super(x,"Triangle");
		style = "filled";
	}
	
	double area() {		
		return this.getWidth() * this.getHeight() / 2 ;		
	}
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
	
	
}

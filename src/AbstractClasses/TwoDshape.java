package AbstractClasses;

abstract class TwoDshape { //TwoDshape is now abstarct
	private double width;
	private double height;
	private String name;
	
	
	TwoDshape(){//default constructor
		this.width=this.height=0;
	}
	
	TwoDshape(double width,double height,String name){// parametrized constructor 
		this.width = width;
		this.height = height;
		this.name = name;
	}
	TwoDshape(double x, String name){//construct object with equal width and height
		width=height=x;
		this.name=name;
	}
	TwoDshape(TwoDshape ob){ //construct object from an object
		width = ob.width;
		height = ob.height;
	}
	
	 
	
	
	void showDim() {		
		System.out.println( "Width and height are"+getWidth() + " and " + getHeight());
	}
	
	abstract double area();// area abstract method
	

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

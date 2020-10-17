package vehicle;

public class Truck extends Vehicle{
	private int c; //cargo capacity in pounds
	/* Initialize Vehicle members using Vehicle's constructor*/
	
	Truck(int p,int f, int m,int c){
		super(p, f, m);
		this.c=c;
	}
	//Accessor methods for cargocap.
	int getCargo() {
		
		return c;
		
	}
	void setCargo(int c) {
		this.c=c;
	}
	

}

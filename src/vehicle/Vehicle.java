package vehicle;

public class Vehicle {
	private int p;
	private int f;
	private int m;
	
	
	//this is a constructor for Vehicle
	Vehicle(int p,int f,int m){  //parametrized construction
		this.p=p;
		this.f=f;
		this.m=m;
	}
	
	//Display the range
	int range() {//the range() method is contained within the Vehicle class
		return f*m;
	}
	
	//Compute fuel needed for a given distance
	double fuelneeded(int miles) {
		
		return (double)miles/m;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}
	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}
}

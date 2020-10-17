package enumdemo;

enum Transport1{
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22); //Declare an enumeration
	
	//CONSTRUCTOR
	private int speed;
	Transport1(int speed){
		
		this.speed = speed;
		
	}
	int getSpeed() {
		
		return speed;
		
	}
}

public class EnumDemo3 {
	
	public static void main(String[] args){
		Transport1 tp;
	
		//Display speed of airplane.
		System.out.println("Typical speed of an airplane is "+Transport1.AIRPLANE.getSpeed()+" miles per hour.\n");
		//Display all Transports and speeds
		System.out.println("All Transport speeds: ");
		for (Transport1 t: Transport1.values())
			System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hour ");
	
	}
	
}

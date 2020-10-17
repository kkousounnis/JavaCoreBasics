package enumdemo;
enum Transport{
	CAR, TRUCK, AIRPLANE, TRAIN, BOAT //Declare an enumeration
}
public class EnumDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transport tp; //Declare a Transport reference
		
		tp = Transport.AIRPLANE;
		
		//Output an enum value.
		System.out.println("Value of tp: "+tp+"\n");
		
		tp = Transport.TRAIN;
		
		//Compare two enum values.
		if(tp == Transport.TRAIN)
			System.out.println(("tp contains TRAIN. \n"));
		
		switch(tp) {
			case CAR:
				System.out.println(("A car caries people. \n"));
				break;
			case TRUCK:
				System.out.println(("A truck caries freight. \n"));
				break;
			case AIRPLANE:
				System.out.println(("An airplane flies. \n"));
				break;
			case TRAIN:
				System.out.println(("A train rules on rails. \n"));
				break;
			case BOAT:
				System.out.println(("A boat sails on water. \n"));
				break;
		}
		
		
		
		
		
	}

}

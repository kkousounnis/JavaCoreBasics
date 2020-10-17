package enumdemo;
enum Transport4{
	CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemo4 {
	public static void main (String[] args) {
		Transport4 tp1,tp2,tp3,tp4;
		
		for (Transport4 t: Transport4.values())
			System.out.println(t+ " " + t.ordinal());
		
		tp1 = Transport4.AIRPLANE;
		tp2 = Transport4.TRAIN;
		tp3 = Transport4.AIRPLANE;
		
		System.out.println();
		
		if (tp1.compareTo(tp2) < 0)
			System.out.println(tp1 + " comes before " + tp2);
		if (tp1.compareTo(tp3) > 0)
			System.out.println(tp2+ "comes before " + tp1);
		if (tp1.compareTo(tp3) == 0)
			System.out.println(tp1 + " equals " + tp3);
	}

}

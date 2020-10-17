package enumdemo;

enum Building{
	APARTMENT, VILLA, SKYSCRAPER, DETACHEDHOUSE, ΜΟΤΟΡΗΟΜΕ
}

public class EnumDemoBuilding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Building b;
		b = Building.SKYSCRAPER;
		System.out.println("Value of b is: "+ b +".\n");
		b = Building.APARTMENT;
		
		switch(b) {
		case APARTMENT:
			System.out.println("Apartment is for middle class.\n");
			break;
		}
		

	}

}

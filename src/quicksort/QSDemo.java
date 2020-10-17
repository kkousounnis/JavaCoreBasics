package quicksort;

public class QSDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[] = { 'd', 'x', 'a', 'r', 'p', 'j', 'i' };
		int i;
		
		System.out.println("Original array: ");
		for (i=0; i < a.length; i++) System.out.print(a[i]);
		System.out.println();
		
		//now sort the array
		Quicksort.qsort(a);
		
		System.out.println("Sorted array: ");
		for (i=0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
	}

}

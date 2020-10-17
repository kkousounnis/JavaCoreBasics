package wrappers;

public class AutoBox2 {
	static void m (Integer v) {
		System.out.println(" m() received " + v);
	}
	static int m2() {
		return 10;
	}
	static Integer m3() {
		return 99;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pass an int to m(). Because m() has an Integer
		//parameter, the int value passed is automatically boxed.
		
		m(199);
		//Here, iob receives the int value by m2()
		//This value is automatically boxed so that it can be assigned to ob.
		Integer iOb = m2();
		System.out.println("Return value from m2() is " + iOb);
		
		//Next, m3() is called. It returns an Integer value which is auto-unboxed into an int.
		int i = m3();
		System.out.println("Return value from m3() is " + i);
		
		//Next, Math.sqrt() is called with iOb as an argument.
		//In this case, iOb is auto-unboxed and its value promoted to double, which is the type needed by sqrt().
		iOb = 100;
		System.out.println("Square root of iOb is " + Math.sqrt(iOb));
		
		
	}

}

package varargs;

class VarArgs2 {
	static void vaTest(String msg,int ... v) {
		System.out.println(msg + v.length);
		System.out.println("Contents: ");
		
		for(int i=0; i < v.length; i++) 
			System.out.println(" args" + i + ": " + v[i]);
		System.out.println();	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgs2.vaTest("One vararg: ", 10);
		VarArgs2.vaTest("Three varargs: ", 1,2,3);
		VarArgs2.vaTest("No vararg: " );
		
		

	}

}

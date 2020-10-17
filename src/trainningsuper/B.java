package trainningsuper;

public class B extends A{
	int i; //this i hides the i in A
	
	B (int a, int b){
		super.i=a;  //i in a
		this.i=b; //i in b
	}
	
	void show() {
		System.out.println("i in superclass: " + super.i);
		System.out.println("i in subclass: " + this.i);
	}

}

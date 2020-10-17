package generics;
class Gen<T>{
	T ob;
	Gen (T ob){
		this.ob = ob;
	}
	//return ob
	T getob() {
		return ob;
	}
	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}	
}
class TwoGen<T, V>{
	T ob1;
	V ob2;
	TwoGen (T ob1,V ob2){
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	T getOb1() {
		return ob1;
	}
	V getOb2() {
		return ob2;
	}
	void showType() {
		System.out.println("Type of T is " + ob1.getClass().getName()+ "\nType of V is " + ob2.getClass().getName());
	}
	
}

public class GenDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Gen<Integer> iOb;
		iOb = new Gen<Integer>(88);
		iOb.showType();
		
		int v = iOb.getob();
		System.out.println("value: " + v);
		System.out.println();
		
		Gen<String> strOb = new Gen<String>("Generics Test"); 
		strOb.showType();
		String  str =  strOb.getob();
		System.out.println("value " + str );
		*/
		
		TwoGen <Integer, String> tgObj;
		tgObj = new TwoGen <Integer, String>(88,"Generics");
		tgObj.showType();
		
		int t = tgObj.getOb1();
		System.out.println("The second obj is "+t);
		
		String v = tgObj.getOb2();
		System.out.println("The first obj is "+v);
		
	}

}

package generics;

class generics <T>{
	T ob; //declare an object of type T 
	
	generics(T ob){
		this.ob=ob;
	}
	T getob() {
		return ob;
	}
	void showType() {
		System.out.print("Type of T is" +ob.getClass().getName());
	}
	
	
}

class generics1<T, V>{
	V obv;
	T obt;
	generics1(T obt, V obv){
		this.obv = obv;
		this.obt = obt;
	}
	T getobt() {
		return obt;
	}
	V getobv() {
		return obv;
	}
	void showType(){
		System.out.println(obv);
		System.out.println(obt);
	}

	
}

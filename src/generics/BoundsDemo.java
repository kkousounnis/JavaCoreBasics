package generics;
class NumericFns<T extends Number>{
	T  num;
	NumericFns(T num){
		this.num=num;
	}
	T getNum() {
		return num;
	}
	
	double reciprocal() {
		return 1/num.doubleValue();
	}
	double fraction() {
		return num.doubleValue() - num.intValue();
	}
	boolean absEqual(NumericFns<?> ob) {
		if ( Math.abs ( num.doubleValue() ) == Math.abs( ob.num.doubleValue() ) )return true;
			return false;
	}
	
}
public class BoundsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumericFns obj = new NumericFns<Integer>(14);
		NumericFns obj1 = new NumericFns<Double>(13.0);
		System.out.println("Reciprocal of "+obj.getNum()+"is : "+obj.reciprocal()+"\n Fraction is : "+ obj.fraction() +"\n Check equality "+ obj.absEqual(obj1));

	}

}

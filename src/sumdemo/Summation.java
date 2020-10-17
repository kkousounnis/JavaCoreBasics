package sumdemo;

public class Summation {
	private int sum;
	Summation(int num){
		setSum(0);
		for (int i=1;i<=num;i++) {
			setSum(getSum() + i);
		}
	}
		
		//constructor from another object.
		Summation(Summation ob){
			this.setSum(ob.getSum());
		}

		public int getSum() {
			return sum;
		}

		public void setSum(int sum) {
			this.sum = sum;
		} 
}

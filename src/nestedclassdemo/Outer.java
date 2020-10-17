package nestedclassdemo;

public class Outer {
	
	int nums[];
	Outer(int nums[]){
		this.nums=nums;
	}
	void analyze() {
		Inner inOb = new Inner();
		
		System.out.println(inOb.min());		
		System.out.println(inOb.max());		
		
	}
	
	class Inner{
		int min() {
			int m = nums[0];
			
			for (int i = 0; i < nums.length; i++) {
				
				if( m > nums[i]) m = nums[i];
			}
			return m;
		}
		int max() {
			int m = nums[0];
			
			for (int i = 0; i < nums.length; i++) {
				if ( m < nums[i] ) m=nums[i];
			}
			return m;
			
		}
		
		
	}

}

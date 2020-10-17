package ConsecutiveNumbers;

public class Solution {
	    public static int solve(int [] arr){
	      int counter=0;
	      for(int i=0; i < (arr.length); i+=2){
	    	//System.out.println("("+arr[i]+") - ("+arr[i+1]+")="+(arr[i]-arr[i+1]));   	 
	    	try {  
	    		if((arr[i]-arr[i+1])==1 || (arr[i]-arr[i+1])==-1 ) {
	    			//System.out.println("("+arr[i]+") - ("+arr[i+1]+")="+(arr[i]-arr[i+1]));   
	    			//System.out.println(true);
	    			counter++;
	    		}
	    	}
	    	catch(IndexOutOfBoundsException exc){
	    		System.out.println("Index out of bounds.");
	    	}
	      }
	      System.out.println(counter);
	      return counter;
	    }
	    
	
}

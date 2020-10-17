package longestrepition;

public class Solution {
	
	public static Object[] longestRepetition(String s) {
		if(s.contentEquals(""))return new Object[]{"", 0};
		int counter = 0;
		int max = 0;
		char value = 0;
		char temp = s.charAt(0);
		for(int i=0; i<s.length();i++) {
			//System.out.print(s.charAt(i)+"\n");
			//System.out.print(temp+"\n");
			
			
			if(s.charAt(i) != temp) {
				if(max<counter) {
					max = counter;
					value=temp;
				}
				//System.out.print("CHAR "+value +" MAX "+ max+"\n");
				temp = s.charAt(i);
				counter = 1;
			}else {
				
				counter++;
				//System.out.print(s.charAt(i)+"=="+temp+"\n"+"counter :"+counter+"\n");
			}
		}
		if(max<counter) {
			max = counter;
			value=temp;
		}
		System.out.print("CHAR "+value +" MAX "+ max +"\n");
		return new Object[]{value, max};
	}	

}

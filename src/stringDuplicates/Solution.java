package stringDuplicates;

class Solution {
	public static String[] dup(String[] arr) {
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
			String str="";
			char temp=arr[i].charAt(0);
			str=str+temp;
			for (int j=0; j < arr[i].length(); j++) {
				if(temp != arr[i].charAt(j)) {	
					temp=arr[i].charAt(j);
					str+=temp;
				}
			}
			arr[i]=str;
			System.out.println(arr[i]);
			System.out.println("");
			
		}
		return arr;
	}
}

package generics;

public class GenDemo1 {
	
	public static void main(String[] args) {
		generics<Integer> g = new generics(3);
		g.showType();
		System.out.print("\n"+g.getob());
		
		generics1 <String, String> s = new generics1("kwstas","Chrysa");
		System.out.println(s.getobt());
		System.out.println(s.getobv());
		s.showType();
		
	}

}

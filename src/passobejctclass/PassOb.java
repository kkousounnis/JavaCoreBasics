package passobejctclass;

public class PassOb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Block ob1=new Block(10,2,5);
		Block ob2=new Block(10,2,5);
		Block ob3=new Block(4,5,5);
		
		System.out.println("ob1 same dimension as ob2: "+ob1.sameBlock(ob2));

		System.out.println("ob1 same dimension as ob3: "+ob1.sameBlock(ob3));
		
		System.out.println("ob1 same block as ob3: "+ob1.sameBlock(ob3));
		
	}

}

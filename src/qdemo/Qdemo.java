package qdemo;

public class Qdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//construct 10 element array
		Queue q1=new Queue(10);
		
		//construct queue from array
		char name[]= {'T','o','m'};
		
		Queue q2=new Queue(name);		
		
		char ch;
		int i;
		
		//put some characters into q1
		for (i=0;i<10;i++) {
			q1.put((char)('A'+i));
		}
		//construct queue from another queue
		Queue q3=new Queue(q1);
		
		//Show the queues.
		System.out.println("Contents of q1: ");
		for (i = 0 ; i < q1.q.length; i++) {
			ch = q1.get();
			System.out.print(ch);
		}
		System.out.println("\n");
		
		System.out.println("Contents of q2: ");
		for (i = 0 ; i < q2.q.length; i++) {
			ch = q2.get();
			System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.println("Contents of q3: ");
		for (i = 0 ; i < q3.q.length; i++) {
			ch = q3.get();
			System.out.print(ch);
		}
		
		
	}

}

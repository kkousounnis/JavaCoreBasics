package threadsexamples;

public class UseThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread starting");
		
		MyThread t1 = new MyThread("Child #1"); //Create a runnable object
		
		//Next, construct a thread from that object
		
		Thread newThrd = new Thread(t1); //construct a thread from that object
		
		//Finally, start execution of the thread.
		newThrd.start();
		for (int i=0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
				
			}catch(InterruptedException exc) {
				System.out.println("Main thread interrupted.");
			}
			
		}
		System.out.println("\nMain thread ending.");
		
	}

}

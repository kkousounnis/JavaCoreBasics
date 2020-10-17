package qdemo;

public class Queue {
	 char q[];
	 int putloc,getloc;
	
	Queue(int size){ //Construct an empty queue given size
		q=new char[size];
		putloc=getloc=0;
	}
	
	Queue(Queue ob){
		this.putloc=ob.putloc;
		this.getloc=ob.getloc;
		q=new char[ob.q.length];//allocate new array
		
		//copy elements into that array
		for (int i = getloc; i < putloc; i++) {
			this.q[i]=ob.q[i];
		}
		
	}
	//Get a character from the queue
	Queue(char a[]){
		putloc = 0;
		getloc = 0;
		q=new char[a.length];
		
		for (int i = 0; i < a.length ; i++) {
			put(a[i]);
		}
				
	}
	//put a character into the queue
	void put(char ch) {
		if (putloc==q.length) {
			System.out.println("- Queue is full.");
			return;
		}
		q[putloc++]=ch;
	}
	//get a character from the queue
	char get() {
		if(getloc==putloc) {
			System.out.println("- Queue is empty");
			return (char) 0;
		}
		return q[getloc++];
	}
	
}

package enumdemo;
enum TrafficLightColor{
	RED, GREEN, ORANGE
}

//A computerized traffic light.
public class TrafficLightSimulator implements Runnable{
	private TrafficLightColor tlc;
	private boolean  stop = false;
	private boolean changed = false;
	
	TrafficLightSimulator(TrafficLightColor init){
		tlc = init;
	}
	TrafficLightSimulator(){
		tlc = TrafficLightColor.RED;
	}
	public void run() {
		while(!stop) {
			try {
				switch(tlc) {
				case GREEN:
					Thread.sleep(10000); //green for 10 seconds
					break;
				case ORANGE:
					Thread.sleep(2000); //orange for 10 seconds
					break;
				case RED:
					Thread.sleep(12000); //red for 12 seconds
					break;
				}
				
					
			}catch(InterruptedException exc) {
				System.out.println(exc);
			}
			changeColor();
		}
	}
	synchronized void changeColor() {
		switch(tlc) {
			case RED:
				tlc = TrafficLightColor.GREEN;
				break;
			case ORANGE:
				tlc = TrafficLightColor.RED;
				break;
			case GREEN:
				tlc = TrafficLightColor.ORANGE;
				break;
		}
		changed = true;
		notify(); //signal that the light has changed
	}
	synchronized void waitForChange() {
		try {
			while(!changed)
				wait(); //wait for light to change
			changed=false;
			
		}catch(InterruptedException exc) {
			System.out.println(exc);
		}
	}
	synchronized TrafficLightColor getColor() {
		return tlc;
	}
	synchronized void cancel() {
		stop = true;
	}
	public static void main (String args[]) {
		TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
		Thread thrd = new Thread(t1);
		thrd.start();
		for (int i=0; i < 9; i++) {
			System.out.println(t1.getColor());
			t1.waitForChange();
		}
		
		t1.cancel();
	}
	
}

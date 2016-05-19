import java.util.Random;

public class Data {
	private int number;
	private boolean done = false; // turns true if data is written but not read yet 
	private Random r = new Random();
	
	public synchronized void writeData(){
		if(done){
			try{
				wait();
				System.out.println("The last data written not read yet, waiting...");
			}catch(InterruptedException e){}
		}
		number = r.nextInt(100);
		done = true;
		notifyAll(); // It notifies every working threads and funcs that the writing of the data is finished
	}
	
	public synchronized void readData(){
		if(!done){
			try{
				wait();
				System.out.println("There's no data to be read. Waiting...");
			}catch(InterruptedException e){}
			System.out.println("Number is: " + number );
			number = 0;
			done = false;
			notifyAll();
		}
	}

}

import java.util.Random;

public class Data {
	private int number;
	private boolean done = false; // turns true if data is written but not read yet 
	
	public synchronized void writeData(){
		String name = Thread.currentThread().getName();
		if(done){
			try{
				System.out.println(name + ": The previous data not read yet, waiting...");
				//System.out.println(name + " The previous data is:" + number);
				wait();
				Thread.currentThread();
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println("Problem while writing data");
				System.out.println(e.getMessage());
			}
		}
		number =new Random().nextInt(100);
		done = true;
		notifyAll(); // It notifies every working threads and funcs that the writing of the data is finished
	}
	
	public synchronized void readData(){
		if(!done){
			try{
				System.out.println("Consumer: There's no data to be read. Waiting...");
				wait();
			}catch(InterruptedException e){
				System.out.println("Problem while reading data");
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Number is: " + number );
		number = 0;
		done = false;
		notifyAll();
	}

}

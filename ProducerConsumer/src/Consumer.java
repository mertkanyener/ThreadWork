import java.util.Random;

public class Consumer implements Runnable {
	private Data myData;
	
	public Consumer(Data d){
		myData = d;
	}
	
	public void run(){
		while(true){
			try{
				myData.readData();
				Thread.currentThread();
				Thread.sleep(new Random().nextInt(100));
			}
			catch(InterruptedException e){
				System.out.println("Problem in consumer thread "+e.getMessage());
			}
		}
		

	}

}

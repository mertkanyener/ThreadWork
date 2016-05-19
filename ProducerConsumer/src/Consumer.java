import java.util.Random;

public class Consumer implements Runnable {
	private Data myData;
	private String name;
	
	public Consumer(Data d, String name){
		myData = d;
		this.name = name;
	}
	
	public void run(){
		while(true){
			try{
				myData.readData();
				Thread.currentThread().sleep(new Random().nextInt(100));
			}
			catch(InterruptedException e){
				System.out.println("Problem in consumer thread "+e.getMessage());
			}
		}
		

	}

}

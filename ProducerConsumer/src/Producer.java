import java.util.Random;

public class Producer extends Thread{
	private Data myData;
	public Producer(Data d){
		myData = d;
	}
	
	public void run(){
		while(true){
			try{
				myData.writeData();
				Thread.sleep(new Random().nextInt(1000));
			}
			catch(InterruptedException e){
				System.out.println("Problem in producer thread.."+e.getMessage());
			}
		
		}
	}

}

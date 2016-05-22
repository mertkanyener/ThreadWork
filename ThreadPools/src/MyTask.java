import java.util.Random;

public class MyTask implements Runnable {
	private int number;
	private Random ran;
	
	public MyTask(){
		ran = new Random();
		this.number = ran.nextInt(2000);
	}

	@Override
	public void run() {
		try{
			System.out.println("My Id: "+Thread.currentThread().getId()+"I will wait about "+ number);
			Thread.currentThread().sleep(number);
		}catch(InterruptedException e){
			System.out.println("An error has occured!");
		}
	}
	

}

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class User extends Thread {
	private ATM atm;
	private ReentrantLock myLock;
	private int money;
	private Random r = new Random();
	public User(ATM atm, ReentrantLock myLock, int money){
		this.atm = atm;
		this.money = money;
		this.myLock = myLock;
	}
	public void run(){
		try{
			myLock.lock();
			sleep(r.nextInt(1000));
			atm.getMoney(money);
			myLock.unlock();
		}catch(InterruptedException e){}
	}

}

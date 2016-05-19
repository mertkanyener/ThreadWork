import java.util.concurrent.locks.ReentrantLock;

public class Test {
	public static void main(String[] args){
		ATM atm = new ATM(1000);
		ReentrantLock lock = new ReentrantLock();
		User u1 = new User(atm,lock,700);
		User u2 = new User(atm,lock,500);
		User u3 = new User(atm,lock,300);
		u1.start();
		u2.start();
		u3.start();
		
		
	}

}

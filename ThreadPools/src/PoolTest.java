import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolTest {
	ExecutorService executor = Executors.newFixedThreadPool(3); // Pool size is 3
	
	public void start(){
		while(true)
			executor.execute(new MyTask());
	}

	public static void main(String[] args) {
		PoolTest t = new PoolTest();
		t.start();

	}

}

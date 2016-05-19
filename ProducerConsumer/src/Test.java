
public class Test {

	public static void main(String[] args) {
		Data d = new Data();
		Producer p = new Producer(d,"ProducerOne");
		Consumer c = new Consumer(d,"Consumer");
		Thread t = new Thread(c);
		p.start();
		t.start();
	

	}

}

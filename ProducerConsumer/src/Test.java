
public class Test {

	public static void main(String[] args) {
		Data d = new Data();
		Producer p1 = new Producer(d);
		Producer p2 = new Producer(d);
		Producer p3 = new Producer(d);
		p1.setName("P.No1");
		p2.setName("P.No2");
		p3.setName("P.No3");
		Consumer c = new Consumer(d);
		Thread t = new Thread(c);
		Thread t2 = new Thread(c);
		p1.start();
		p2.start();
		p3.start();
		t.start();
		t2.start();
	

	}

}

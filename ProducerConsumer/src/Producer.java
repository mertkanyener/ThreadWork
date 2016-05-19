
public class Producer extends Thread{
	private Data myData;
	private String name;
	public Producer(Data d, String name){
		myData = d;
		this.name = name;
	}
	
	public void run(){
		while(true){
			myData.writeData();
		}
	}

}

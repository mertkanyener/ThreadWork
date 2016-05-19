
public class ATM {
	private int balance;
	public ATM(int balance){
		this.balance = balance;
	}
	
	public String getMoney(int money){
		String result = "The maximum money you can get is " + balance;
		if(balance>=money){
			balance = balance - money;
			result = "You are able to get " + money + "$";
		}
		System.out.println(result);
		return result;
		
	}

}

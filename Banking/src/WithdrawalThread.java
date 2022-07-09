public class WithdrawalThread extends Thread{
	
	SynchronizedClass obj;
	int amt;
	String msg;

	public WithdrawalThread(SynchronizedClass obj,int amt) {
		this.obj = obj;
		this.amt = amt*-1;
	}

	@Override 
	public void run() {

		try{
			Thread.sleep(2000);
		}

		catch(Exception e){
			System.out.println(e);
		}

		obj.deposit(amt);
	}
}
public class DepositeThread extends Thread{
	SynchronizedClass obj;
	int amt;
	String msg;
	
	// constructors
	public DepositeThread(SynchronizedClass obj,int amt) {
		this.obj = obj;
		this.amt = amt;
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
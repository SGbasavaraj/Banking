public class Account { 
	static int Balance=20000;

	public static void main(String[] args) {
		SynchronizedClass sc=new SynchronizedClass();

		DepositeThread dt1=new DepositeThread(sc, 10000);
		DepositeThread dt3=new DepositeThread(sc, 10000);
		WithdrawalThread dt2=new WithdrawalThread(sc, 40000);
		//dt1.setPriority(10);

		dt1.start();
		dt2.start();
		dt3.start();

		try {
			dt1.join();
			dt2.join();
			dt3.join();
		}
		catch(Exception e) {
			System.out.println(e);
			}

		System.out.println("Total balance is "+Balance);
	}
}
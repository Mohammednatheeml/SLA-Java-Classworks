package synchronizeThreading;

public class Main {

	public static void main(String[] args) {
		SyncThread syncThread  = new SyncThread();
		
		Thread t1 = new Thread(()->{
			syncThread.food();
		});
		Thread t2 = new Thread(()->{
			syncThread.location();
		});

		Thread t3 = new Thread(()->{
			syncThread.Making();
		});
		
		t1.start();
		t2.start();
		t3.start();
		syncThread.delivery();


	}

}

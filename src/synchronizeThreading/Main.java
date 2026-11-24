package synchronizeThreading;

public class Main {

	public static void main(String[] args) {
		SyncThread1 syncThread  = new SyncThread1();
		
		
		Thread t1 = new Thread(()->{
			syncThread.food();
		});
		Thread t2 = new Thread(()->{
			syncThread.location();
		});

		Thread t3 = new Thread(()->{
			syncThread.Making();
		});
		
		Thread t4 = new Thread(()->{
			syncThread.example();
		});
		
		t1.start();
		t2.start();
		t3.start();
		
		syncThread.delivery();


	}

}

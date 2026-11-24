package synchronizeThreading;

public class SyncThread1 extends SyncThread {
	synchronized void example() {
		System.out.println("This is another class thread");
	}
}

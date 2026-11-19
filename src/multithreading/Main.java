package multithreading;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MultiThreading multiThreading = new MultiThreading();
		multiThreading.start();
//		multiThreading.normal();
//		System.out.println("------------------------------------------------------");
//		
		RunnableThreading runnableThreading = new RunnableThreading();
		Thread thread = new Thread(runnableThreading);
		thread.start();
		runnableThreading.evenNo();
		
		System.out.println("T1:"+thread.isAlive());
		System.out.println("T2:"+multiThreading.isAlive());
		if(thread.isAlive()) {
			System.out.println("First Thread is alive");
		}
		else {
			System.out.println("Thread is not alive");
		}
		if(multiThreading.isAlive()) {
			System.out.println("Second Thread is alive");
		}
		else {
			System.out.println("Second Thread is not alive");
		}
		
		thread.join();
		runnableThreading.loops();
	}

}

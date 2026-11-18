package multithreading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreading multiThreading = new MultiThreading();
		multiThreading.start();
		multiThreading.normal();
		System.out.println("------------------------------------------------------");
		
		RunnableThreading runnableThreading = new RunnableThreading();
		Thread thread = new Thread(runnableThreading);
		thread.start();
		runnableThreading.evenNo();
		runnableThreading.loops();
	}

}

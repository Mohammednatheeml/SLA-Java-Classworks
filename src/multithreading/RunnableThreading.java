package multithreading;

public class RunnableThreading extends Parent implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			try {
				System.out.println("Runnable Thread:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void loops() {
		for(int i=0;i<=5;i++) {
			System.out.println("Loops:"+i);
		}
	}

}

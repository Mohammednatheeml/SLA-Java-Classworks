package multithreading;

public class MultiThreading extends Thread {
	public void normal() {
		for (int i =1;i<=10;i++) {
			
			try {
				System.out.println("Normal:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void run() {
		for(int i = 1;i<=30;i++) {
			
			try {
				if(i % 5 == 0) {
					System.out.println("Thread :"+i);
					Thread.sleep(1000);
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thank Youhh");
	}
}

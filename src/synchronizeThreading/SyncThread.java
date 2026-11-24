package synchronizeThreading;

public class SyncThread {
	synchronized void food() {
		
		for(int i=1;i<=10;i++) {
			try {
				System.out.println("food:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	synchronized void location() {
		
		for(int i=1;i<=5;i++) {
			try {
				System.out.println("Location:"+"Chennai");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	synchronized void Making() {
		
		for(int i=1;i<=12;i++) {
			try {
				System.out.println("Making ongoing:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void delivery() {
	
	for(int i=1;i<=30;i++) {
		try {
			System.out.println("Successfully Delivered Food Number:"+i);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
}

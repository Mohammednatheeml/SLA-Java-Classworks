package multithreading;

public class Parent {
	public void evenNo() {
		for(int i=0;i<=10;i++) {
			try {
				if(i%2==0) {
					System.out.println("EvenNumber:"+i);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

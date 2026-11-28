package innerClass;

public class OuterClass {
	
	class Inner{
		public Inner(int a , int b) {
			System.out.println("A:" +a + " " + "B:"+b);
		}
		
		
		void display() {
			System.out.println("This is an Inner Class");
		}
	}
	
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.Inner inner = outerClass.new Inner(10,20);
		
		inner.display();
		
	}

}

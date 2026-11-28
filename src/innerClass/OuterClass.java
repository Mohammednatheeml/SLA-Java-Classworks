package innerClass;

public class OuterClass {
	
	class Inner{
		void display() {
			System.out.println("This is an Inner Class");
		}
	}
	
	static class Inner1{
		static void staticMethod() {
			System.out.println("This is an static Inner Class with static method");
			//ipd irundha namma obj create pannanum nu avasiyam illa direct ah call pannikalam
		}
	}
	
	static class Inner2{
		 void nonstaticMethod() {
			System.out.println("This is an static Inner Class without static  method");
			//method ststic ah illana namma direct ah call panna mudiyathu ...Outerclass.Inner2 = new Outerclass.inner2....ipd obj create pananum
		}
	}
	
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.Inner inner = outerClass.new Inner();
		
		inner.display();
		//Nrml ah irundha frst outer class ku object crate pannnitu then adha vachi inner class ku oru objject create pannanum
		OuterClass.Inner2 inner1 = new OuterClass.Inner2();
		inner1.nonstaticMethod();
		OuterClass.Inner1.staticMethod();
	
	}

}

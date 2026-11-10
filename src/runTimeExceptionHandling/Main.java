package runTimeExceptionHandling;

public class Main {
	public static void main(String [] args) {
		//Runtime Exeption
		
		
		// 1. java.lang.ArithmeticException: / by zero
		try {
			int a=10,b=0;
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		
		// 2.java.lang.NullPointerException
		
		try {
			String data = null;
			System.out.println(data.length());
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
				
		
		
		
	}
}

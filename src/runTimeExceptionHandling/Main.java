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
		
		//3. Index out bound exception
		
		try {
			String[] characters = {"a","b","c"};
			System.out.println(characters[3]);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			String a = "dfgh";
			System.out.println(a.charAt(4));
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}

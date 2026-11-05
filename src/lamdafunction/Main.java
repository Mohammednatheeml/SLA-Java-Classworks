package lamdafunction;

public class Main {
	public static void main(String [] args) {
//		Funtionalnterface funtionalnterface = () ->{
//			System.out.println("check");
//		};
//		
//		funtionalnterface.method();
		
		Funtionalnterface sum = (a, b) ->{
			System.out.println("Addition:" +(a+b));
		};
		
		sum.add(12, 12);
	}
}


/* Syntax
 * (parameters) -> {
    // body
	};
 */
 
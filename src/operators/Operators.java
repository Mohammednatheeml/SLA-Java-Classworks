package operators;

public class Operators {
	public static void main(String []args) {
		int num1 = 3;
		int num2 = 6;
		
		//8421
		//0011
		//0110
		//0010 => output is 2
		System.out.println(num1 & num2);
		//8421
		//0011
		//0110
		//0111 => output is 7
		System.out.println(num1 | num2);
		
		//Strictly OR
		//8421
		//0011
		//0110
		//0101 =>output is 5
		System.out.println(num1 ^ num2);
		
		
	}
}

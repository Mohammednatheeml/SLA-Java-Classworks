package Interface;

import java.util.Scanner;

public class StringCalculater implements Add{
	Scanner sc = new Scanner(System.in);
	@Override
	public void add() {
		
		
			System.out.println("Enter String A");
			String a = sc.nextLine();
			System.out.println("Enter String B");
			String b = sc.nextLine();
			System.out.println("String Concatenation:" +(a+" "+b));
		
		
	}

}

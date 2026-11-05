package Interface;

import java.util.Scanner;

public class Calculater implements Add,Sub,Mul{
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void add() {
		System.out.println("Enter Value A");
		int a = sc.nextInt();
		System.out.println("Enter Value B");
		int b = sc.nextInt();
		System.out.println("Add:" +(a+b));
	}
	@Override
	public void sub() {
		System.out.println("Enter Value A");
		int a = sc.nextInt();
		System.out.println("Enter Value B");
		int b = sc.nextInt();
		System.out.println("Sub:" +(a-b));
		
	}
	
	public void mul() {
		System.out.println("Enter Value A");
		int a = sc.nextInt();
		System.out.println("Enter Value B");
		int b = sc.nextInt();
		System.out.println("Mul:" +(a*b));
		
	}

}

package forloopandarrays;

import java.util.Scanner;

public class ForLoopExample {
	
	void onedimentional() {
		int[] arr = {1,2,3,4,5,};
		
		
		String[] names = new String[3];
	
		names[0]="natheem";
		names[1]="vishnu";
		names[2]="anand";
		
		for(String name:names) {
			System.out.println(name);
		}
	
	for(int term:arr) {
		System.out.println("enhanced array:"+term);
	}
	}
	
	
	void marks() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your array size");
		int size = sc.nextInt();
		int [] marks = new int[size];
		
		for(int i =0; i<marks.length;i++) {
			System.out.println("enter your mark:"+i);
			marks[i]=sc.nextInt();
			
		}
		for(int mark:marks) {
			System.out.println("marks:"+mark);
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Size:" );
		int limit = sc.nextInt();
		sc.nextLine();
		String[] animals = new String[limit];
		
		for (int i =0;i<animals.length;i++) {
			System.out.println("Enter your animal"+" "+i);
			animals[i] = sc.nextLine();
		}
		
		for(String animal:animals) {
			System.out.println("Animal"+" "+animal);
		}
		
	}
}

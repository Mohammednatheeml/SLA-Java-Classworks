package forloopandarrays;

import java.util.Scanner;

public class TwoDimentionalArrays {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Array Size");
		int row = sc.nextInt();
		int col = sc.nextInt();
		sc.nextLine();
		String[][] marks = new String[row][col];
		
		System.out.println(marks[0].length);
		
		
		
		for(int i =0;i<marks.length;i++) {
			for(int j=0;j<marks[i].length;j++) {
				System.out.print("Enter your value:");
				marks[i][j] = sc.nextLine();
			}
		}
		
		System.out.println("Your 2D Array:");

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {

                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

		
	
		
		
		
		
		

	}

}

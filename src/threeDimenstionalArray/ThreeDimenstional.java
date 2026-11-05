package threeDimenstionalArray;

import java.util.Scanner;

public class ThreeDimenstional {
	
	void integermatrix() {
		
		//This is for the sanme row and colomn ..if we want to print two matrix with same row and col we have to use this
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your block");
		int block = sc.nextInt();
		System.out.println("Enter your row");
		int row = sc.nextInt();
		System.out.println("Enter your col");
		int col = sc.nextInt();
		int[][][] studentid = new int [block][row][col];
		
		
		
		for(int i =0;i<studentid.length;i++) {
			for(int j =0;j<studentid[i].length;j++) {
				for(int k=0;k<studentid[i][j].length;k++) {
					System.out.println("Enter your value"+i+" "+j+" "+k);
					studentid[i][j][k] = sc.nextInt();
				}
				
			}
		}
		
		for(int i =0;i<studentid.length;i++) {
			for(int j =0;j<studentid[i].length;j++) {
				for(int k=0;k<studentid[i][j].length;k++) {
					System.out.print(studentid[i][j][k]+" ");
				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}
		
//		System.out.println(" ");
		
//		System.out.println(studentid[0][0][2]);
	}
	public static void main(String[] args) {
		
		//here if we have two matrix ..in first matrix there 2X2 then in second matric we have 3X3 in that situationb we use this method
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your matrix");
		int matrix = sc.nextInt();
		
		String[][][] data = new String[matrix][][];
		
//		System.out.println(data.length);
		for(int i = 0; i<data.length;i++) {
			System.out.println("matrix"+i);
			System.out.println("enter your row");
//			System.out.println("Enter your row");
			int row = sc.nextInt();
			System.out.println("Enter your col");
			int col = sc.nextInt();
			data[i] = new String[row][col]; //this is the main logic to get different row and col for each matric ...we have to put in the for loop.
		}
		
		sc.nextLine();
		for(int i =0;i<data.length;i++) {
			for(int j =0;j<data[i].length;j++) {
				for(int k=0;k<data[i][j].length;k++) {
					System.out.println("Enter your value"+i+" "+j+" "+k);
					data[i][j][k] = sc.nextLine();
				}
				
			}
		}
		
		for(int i =0;i<data.length;i++) {
			for(int j =0;j<data[i].length;j++) {
				for(int k=0;k<data[i][j].length;k++) {
					System.out.print(data[i][j][k]+" ");
				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}
		
		
	}
}



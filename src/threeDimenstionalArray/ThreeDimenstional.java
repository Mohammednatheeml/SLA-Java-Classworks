package threeDimenstionalArray;

import java.util.Scanner;

public class ThreeDimenstional {
	public static void main(String[] args) {
		
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
		
		System.out.println(" ");
		
//		System.out.println(studentid[0][0][2]);
	}
}



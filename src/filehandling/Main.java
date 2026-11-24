package filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your filename");
		
		String filename = sc.nextLine();
		
		File file = new File(filename);
		
		if(file.createNewFile()) {
			System.out.println("File Created");
		}
		else {
			System.out.println("File existed");
		}
	}

}

package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public void CreateFile() throws IOException {
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
	
	public void WriteFile() throws IOException {
		System.out.println("enter your Filename");
		String filename = sc.nextLine();
		FileWriter fileWriter = new FileWriter(filename);
		System.out.println("Entger your data");
		String data = sc.nextLine();
		fileWriter.write(data);
		System.out.println("successfully loaded");
		fileWriter.close(); // file writer will write the data into that file if exist ...otherwise it will automaticatty create that file and load the data
	}
	
	public void ReadFile() throws IOException {
		System.out.println("Enter Your file");
		String filename = sc.nextLine();
		FileReader fileReader = new FileReader(filename);
		System.out.println(fileReader.readAllAsString());
		fileReader.close(); //close edhuku use panrom na .....adhu use pannalana andha function innom running la irukum adhu use panna dhan andha function end aahum....use pannama next function call pannaila output thappa varum
	}
	
	public void DeleteFile() {
		System.out.println("Enter Your file");
		String filename = sc.nextLine();
		File file = new File(filename);
		if(file.delete()) {
			System.out.println("file deleted");	
		}
		else {
			System.out.println("File not exist");
		}
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Main main = new Main();
		
		int choice = 0;
		
		do {
			System.out.println("---File Handling---");
			System.out.println("1.create");
			System.out.println("2.Write");
			System.out.println("3.Read");
			System.out.println("4.delete");
			System.out.println("0.Exit");
			System.out.println("Enter your choice");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			
			switch(choice) {
			case 1:
				main.CreateFile();
				break;
			case 2:
				main.WriteFile();
				break;
			case 3:
				main.ReadFile();
				break;
			case 4:
				main.DeleteFile();
				break;
			case 0:
				System.out.println("Loop Started");
				break;
			default:
				System.out.println("Incorrect option");
			}
			
		}while(choice != 0);
	}

}

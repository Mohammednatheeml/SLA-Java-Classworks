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
		fileReader.close();
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
//		main.CreateFile();
//		main.WriteFile();
		main.ReadFile();
		main.DeleteFile();
		
	}

}

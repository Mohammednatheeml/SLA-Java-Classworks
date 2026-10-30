package datatype;

import java.util.Scanner;

public class EmployeeDetails {
	
	Scanner sc = new Scanner(System.in);
	void employee() {
		System.out.println("Enter an employee details");
		System.out.println("Enter an employee ID");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter an employee Name");
		String name = sc.nextLine();
		System.out.println("Enter an employee timing");
		byte time = sc.nextByte();
		System.out.println("Enter an employee salary");
		double salary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter an employee joining date");
		String joiningDate = sc.nextLine();
		
		System.out.println("Details: ID:"+id+",NAME:"+name+",TIME:"+time+",SALARY:"+salary+",JOINDATE:"+joiningDate);	
	}
	
	public static void main(String []args) {
		EmployeeDetails EmployeeDetails = new EmployeeDetails();
		
		EmployeeDetails.employee();
	}
}

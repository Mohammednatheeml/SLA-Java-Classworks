package overrideconcepts;

public class ClassA {
	
	String employeeName;
	double Salary;
	String shiftTime;
	
 public ClassA(String employeeName, double Salary ,String shiftTime) {
	 this.employeeName = employeeName;
	 this.Salary=Salary;
	 this.shiftTime= shiftTime; 
 }
 
 void display() {
    System.out.println("EmployeeName:" +employeeName);
    System.out.println("EmployeeSalary:" +Salary);
    System.out.println("EmployeeShiftTime:" +shiftTime);
 }
}

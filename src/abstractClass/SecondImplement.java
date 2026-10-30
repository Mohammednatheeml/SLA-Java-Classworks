package abstractClass;

public class SecondImplement extends Employee  {
private String empName,empFeedback;
	@Override
	public void EmployeeDetails(String empName, String empFeedback) {
		this.empName = empName;
		this.empFeedback = empFeedback;
	}
	
	@Override
	public void show(String empName, String empFeedback) {
		System.out.println("Employee Name:"+this.empName+",Employee Feedback:"+(this.empFeedback =" Good"));
		System.out.println("Do not change");
	}
}

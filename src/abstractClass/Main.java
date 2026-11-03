package abstractClass;

public class Main {
 public static void main(String [] args) {
	 Employee E1 = new FirstImplement();
	 E1.EmployeeDetails("Natheem", "bad experience");
	 E1.show("5789", "wexrctvybnmkl,");
	 
	 
	 Employee E2 = new SecondImplement();
	 E2.EmployeeDetails("Alex", "actually it was nice");
	 E2.show(" fghj" , "rctvbn");
 }
}

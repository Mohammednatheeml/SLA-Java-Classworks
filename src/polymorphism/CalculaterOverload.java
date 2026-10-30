package polymorphism;

public class CalculaterOverload {
	void calculate(int a , int b) {
		System.out.println("Addition:" +(a+b));
	}
	void calculate(double a , double b) {
		System.out.println("subraction:" +(a-b));
	}
	void calculate(int a , double b) {
		System.out.println("multiplication:" +(a*b));
	}
	void calculate(double a , int b) {
		System.out.println("division:" +(a/b));
	}
	
	public static void main(String [] args) {
		CalculaterOverload calculaterOverload = new CalculaterOverload();
		calculaterOverload.calculate(5, 5);
		calculaterOverload.calculate(6.00,5.00);
		calculaterOverload.calculate(5, 4.00);
		calculaterOverload.calculate(6.00, 6);
	}
}

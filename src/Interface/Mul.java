package Interface;

public interface Mul {
//	public void mul();
	
	
	default void example1() {
		System.out.println("This is default method");
		example3();
	}
	
	static void example2() {
		System.out.println("this is static method");
	}
	
	private void example3() {
		System.out.println("this is private method");
	}
	
	public static void main(String[] args) {
		Mul example = new Mul() {
		
		};
		
		example.example1();
		
		Mul.example2();
		
		
	
		
	}
	
	
}

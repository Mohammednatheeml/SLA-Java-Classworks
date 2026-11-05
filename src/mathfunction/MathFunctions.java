package mathfunction;

public class MathFunctions {
	public static void main(String[] args) {
		System.out.println(Math.sqrt(25));
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));
        System.out.println(Math.abs(-50)); //returns absolute value ..remove minus
        System.out.println(Math.sqrt(64));
        System.out.println(Math.cbrt(27));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.signum(-10));  //Returns sign of number either -1 , 1
        System.out.println(Math.round(10.6)); //Rounds to nearest integer
        System.out.println(Math.ceil(10.2));  //Rounds upward
        System.out.println(Math.floor(10.8)); //Rounds downward
        System.out.println(Math.rint(10.5));  //Rounds to nearest even integer on a tie
        System.out.println(Math.random());
        
        int num = (int)(Math.random() * 10) + 1;
        System.out.println(num);

	}
}

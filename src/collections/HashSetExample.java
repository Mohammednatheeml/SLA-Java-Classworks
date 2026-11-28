package collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
//		POINTS => Does not allow duplicate elements , Allows one null element , Does not maintain insertion order , Does not provide index-based access,Internally uses a HashMap.

		HashSet<Integer> numbers = new HashSet<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);

		System.out.println(numbers);
		
		HashSet<String> set = new HashSet<>();

		set.add("Java");
		set.add("Python");
		set.add("SQL");

		System.out.println(set);


	}

}

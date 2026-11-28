package collections;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("Natheem");
		array.add("Ashik");
		array.add("Rafi");
		array.add("Shahuban");
		array.add("Lukman");
		array.set(0, "Lukman");
		array.add(1,"Natheem");
		array.remove(5);
		
		System.out.println(array);
		System.out.println(array.get(0));
		System.out.println(array.size());
		System.out.println(array.isEmpty());
		array.clear();
		System.out.println(array.isEmpty());
		System.out.println(array);
	}

}

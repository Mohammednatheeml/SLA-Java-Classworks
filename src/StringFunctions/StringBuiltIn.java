package StringFunctions;

public class StringBuiltIn {
	public static void main(String[] args) {
		String str = "Hello Java";
		String s1 = "Java";
        String s2 = "java";
        String str1 = "Programming";
        String str2 = "Java,Python,C++";
        
        
		System.out.println(str.length()); //returns length
		System.out.println(str.isEmpty()); //Return true if the string is empty..but if it has white space it returns false
		System.out.println(str.isBlank()); // return true if the string is empty including whitespace also
		System.out.println(str.toString()); //It gives string representation
		System.out.println(str.charAt(1)); //returns character at the index
		System.out.println(str.indexOf("z")); //Returns first index of the char
		System.out.println(str.lastIndexOf("l")); //return last index
		System.out.println(s1.concat(str1));
		System.out.println(str.contains("Java"));
		System.out.println(str.startsWith("H"));
		System.out.println(str.endsWith("a"));
		System.out.println(str.toCharArray());
		System.out.println(str.codePointAt(2)); //returns ascii value
		System.out.println(s1.equals(s2)); //Compares content (case-sensitive)
		System.out.println(s1.equalsIgnoreCase(s2)); //Compares content ignoring case
		System.out.println(s1 == s2);
		System.out.println(s1.toLowerCase()); //convert into lower case
		System.out.println(s1.toUpperCase()); //convert into Upper case
		System.out.println(str1.substring(3)); //Creates a substring
        System.out.println(str1.substring(0, 7)); //Create a substring
        System.out.println(str.replace('a', 'o')); //Replaces characters
        System.out.println(str.replace("Java", "Python")); //Replaces characters
        System.out.println(str.replaceFirst("a", "A")); //Replaces first match
        System.out.println(str.replaceAll("l", "A")); //Replaces All match
        System.out.println(str.trim()); //trim spaces fro front and back
        String[] arr = str2.split(",");  //Split string into array  like if the split see the comma then it will split next words into array
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println(s1.repeat(3)); //repeate the  string 
        String result = String.join("-", "Java", "Python", "C++"); //used to join
        System.out.println(result);

        
	}
}

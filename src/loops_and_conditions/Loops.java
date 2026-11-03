package loops_and_conditions;

public class Loops {
	public static void main(String[] args) {
		int i = 1;

        while(i <= 50) {

            if(i % 6 != 0) {
                i++;
                continue;
            }

            System.out.println(i);
            i++;
			
		}
	//  while(i<=20) {
//	  	if(i%5==0) {
//	  		continue;
//	  	}
	  	
//	  	System.out.println(i++);
//	  	break;
	  	
	//  }
}
}

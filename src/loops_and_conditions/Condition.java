package loops_and_conditions;

import java.util.Scanner;

public class Condition {
	public static void main(String []args) {
//		 	Scanner sc = new Scanner(System.in);
//		 	System.out.println("Enter your number:");
//		 	int marks = sc.nextInt();
//		    if(marks>=91 && marks <= 100){
//		        System.out.println("Grade 0");
//		    }
//		    else if(marks>=81 && marks <=90){
//		        System.out.println("Grade 1");
//		    }
//		    else if(marks>=71 && marks<=80){
//		        System.out.println("Grade 2");
//		    }
//		    else if(marks>=61 && marks<=70){
//		        System.out.println("Grade 3");
//		    }
//		    else if(marks>=50 && marks<=60){
//		        System.out.println("Grade 4");
//		    }
//		    else if(marks<50){
//		        System.out.println("fail");
//		    }
//		    else{
//		    	System.out.println("Invalid number");
//		    }
		int option=0;
		 
		
		do {
			Scanner input = new Scanner(System.in);
	        System.out.println("1.Add ");
	        System.out.println("2.Subtract ");
	        System.out.println("3.Multiplication ");
	        System.out.println("4.Division ");
	        System.out.println("0.exit ");
	        System.out.print("Please enter your choice:");
	        option = input.nextInt();
	        

	        switch (option) {
	            case 1:
	            	System.out.println("Enter a number");
	    	        int num = input.nextInt();
	    	        System.out.println("Enter a number 2");
	    	        int num2 = input.nextInt();
	                System.out.println(num+num2);
	                break;
	            case 2:
	            	System.out.println("Enter a number");
	    	        num = input.nextInt();
	    	        System.out.println("Enter a number 2");
	    	        num2 = input.nextInt();
	                System.out.println(num-num2);
	                break;
	            case 3:
	            	System.out.println("Enter a number");
	    	        num = input.nextInt();
	    	        System.out.println("Enter a number 2");
	    	        num2 = input.nextInt();
	                System.out.println(num*num2);
	                break;
	            case 4:
	            	System.out.println("Enter a number");
	    	        num = input.nextInt();
	    	        System.out.println("Enter a number 2");
	    	        num2 = input.nextInt();
	                 System.out.println(num/num2);
	                 break;
	            case 0:
	            	System.out.println("exit");
	            	break;
	            default:
	                     System.out.println("Wrong choice");

	        }
		}while(option != 0);
		
		
//        
        
//        
	}
}

package assignment_1_47;

import java.util.Scanner;

public class Assignment45 {

	public static void main(String[] args) {
		/*		45. Retrieve the non-prime numbers within the range of a given input. 
					Add-up the non-prime numbers and return the result.
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Retrieve the non-prime numbers within the range");
		System.out.println("Enter starting point of range");
		int start = scanner.nextInt();
		System.out.println("Enter ending point of range");
		int end = scanner.nextInt();
		int num, sum = 0;
		System.out.println("Non-Prime Numbers are in between "+start+" and "+end+" :");
		for (int i=start; i<=end; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
	        	 if(i%num == 0)
	        	 	counter ++;
	         }
	         	if (counter != 2)
	         	{
	         		System.out.print(i+ " ");
	         		sum += i;
	         	}
	       }
		System.out.println("\nSum of all Non-Prime Numbers: "+sum);
		
		scanner.close();
	}

}

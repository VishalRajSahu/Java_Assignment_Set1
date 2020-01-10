package assignment_1_47;

import java.util.Scanner;

public class Assignment20 {

	public static void main(String[] args) {
		/*		20. Get a integer array as input. Find the average of the elements 
		 			which are in the position of prime index
					input:{1,2,3,4,5,6,7,8,9,10}
					logic:3+4+6+8(the indexes are prime numbers)
					output:21
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of integer array");
		int size = scanner.nextInt();
		int [] intArray = new int[size];
		int num =0, sum =0;
		
		System.out.println("Enter the elements of Array");
		for(int i=0; i<size; i++)
			intArray[i] = scanner.nextInt();
		
		System.out.print("\nArray Elements:");
		for(int i: intArray) System.out.print("  "+i);
		
		
		System.out.print("\nElements on prime indexes: ");
		for (int i=2; i<=size; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
	        	 if(i%num==0)
	        	 	{
	        		 	counter++;
	        	 	}
	         }
	         	if (counter == 2)
	         		{
	         			System.out.print("  "+intArray[i]);
	         			sum = sum + intArray[i];
	         		}	
	      }
		 System.out.println("\nSum of elements on prime indexes:  "+sum);
	scanner.close();
	}

}
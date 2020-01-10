package assignment_1_47;

import java.util.Scanner;

public class Assignment43 {

	public static void main(String[] args) {
		/*		43. Retrieve the odd-position digits from input integer array. 
		 			Multiply them with their index and return their sum.
		*/

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = scanner.nextInt();
		int intArray [] = new int[size];
		int sum = 0;
		System.out.println("Enter the "+size+" elements of an Array");
		for(int i=0; i<size; i++)
		intArray[i] = scanner.nextInt();
		
		for(int i=0; i<size; i++)
		{
			if(i%2 == 0)
			sum += (i*intArray[i]);
		}
		
		System.out.println("Sum of multiplication of odd position digit and their index: "+sum);
		scanner.close();
	}

}

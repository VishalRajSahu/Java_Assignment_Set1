package assignment_1_47;

import java.util.Scanner;

public class Assignment24 {

	public static void main(String[] args) {
		/*		24. Input a int array. Square the elements in even position and cube the elements in odd position 
		  			and add them as result.
				input: {1,2,3,4}
				output: 1^3+2^2+3^3+4^2
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = scanner.nextInt();
		int[] inputArray = new int[size];
		int sum = 0;
		
		System.out.println("Enter the Elements of Integer Array");
		
		for(int i=0; i<size; i++)
			{
			inputArray[i] = scanner.nextInt();
			}
		
		for(int i=0; i<size; i++)
		{
			if(i % 2 == 0)
				sum = (int) (sum + Math.pow(inputArray[i], 3));
			else
				sum = (int) (sum + Math.pow(inputArray[i], 2));
		}
		
		System.out.println("Addition:  "+sum);
		scanner.close();
	}

}

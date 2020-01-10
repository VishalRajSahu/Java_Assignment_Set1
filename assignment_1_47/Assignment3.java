package assignment_1_47;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		/*  3. A integer array is given as input. find the difference between each element. 
		 	Return the index of the largest element which has the largest difference gap.
			input: {2,3,4,2,3}
			logic: 2-3=1,3-4=1,4-2=2,2-3=1
			2 is the max diff between 4 and 2,return the index of 4 i.e 2
			output:2
		*/
		System.out.println("Enter the length of array");
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int [] array = new int [length];
		int difference;
		int i, j=0, max = 0;
		
		System.out.println("Enter the elements of an array");
		for(i = 0; i < length; i++)
		{
			array[i] = scanner.nextInt();
		}
		
		for(i = 0; i < length-1; i++)
		{
			difference = Math.abs(array[i] - array[i+1]);
			System.out.print(difference+"  ");
			if(max < difference)
			{
				max = difference;
				j = i;
			}
			
		}
		System.out.println("\nMaximum Difference: " + max);
		System.out.println("Index of Maximum difference: " + j+" and "+(j+1));
		scanner.close();
	}

}

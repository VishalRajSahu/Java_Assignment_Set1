package assignment_1_47;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args)
	{
		/*5.Given two arrays list. retrieve the odd position elements from first input and even position elements from second list. 
			put it into the new array list at the same positions from where they are retrieved from.
			(consider 0th position as even position, and two lists are of same size)
			input1:{12,1,32,3}
			input2:{0,12,2,23}
			output:{0,1,2,3} */

		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the size of array for Input 1 and Input 2");
		int size = scanner.nextInt();
		
		int [] input_1 = new int[size];
		int [] input_2 = new int[size];
		int [] merge = new int[size];
				
		System.out.println("Enter the elements of Input 1");
		for(int i=0; i<size; i++)
		{
			input_1[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the elements of Input 2");
		for(int i=0; i<size; i++)
		{
			input_2[i] = scanner.nextInt();
		}
	
		for(int i=0; i<size; i++)
		{
			if(i%2==0)
				merge[i] = input_2[i];
			else
				merge[i] = input_1[i];
		}
		
		System.out.println("Odd Index of List1 and Even Index of List2");
		for(int i=0; i<size; i++)
		{
			System.out.print(" "+merge[i]);
		}
		scanner.close();
		
	}

}

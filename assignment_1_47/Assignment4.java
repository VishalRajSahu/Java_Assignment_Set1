package assignment_1_47;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
	/*	4.Given two integer arrays. merge the common elements into a new array. find the sum of the elements
		input1:{1,2,3,4}
		input2:{3,4,5,6}
		logic:{3,4}
		output:7
    */
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the size of array for Input 1");
		int size_1 = scanner.nextInt();
		
		System.out.println("Enter the size of array for Input 2");
		int size_2 = scanner.nextInt();
		
		int [] input_1 = new int[size_1];
		int [] input_2 = new int[size_2];
		
		ArrayList<Object> mergeArray = new ArrayList<>();
		int sum = 0;
		
		System.out.println("Enter the elements of Input 1");
		for(int i=0; i<size_1; i++)
		{
			input_1[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the elements of Input 2");
		for(int i=0; i<size_2; i++)
		{
			input_2[i] = scanner.nextInt();
		}
	
		
		for(int i=0; i<size_1; i++)
			for(int j=0; j<size_2; j++)
			{
				if(input_1[i] == input_2[j])
				{
					mergeArray.add(input_1[i]);
					sum = sum + input_1[i];
				}
			}

		System.out.println(mergeArray);
		System.out.println("Sum of Common element in given Inputs " +sum);
		scanner.close();	
	}

}

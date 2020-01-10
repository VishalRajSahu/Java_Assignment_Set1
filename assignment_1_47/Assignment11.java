package assignment_1_47;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Assignment11 {

	public static void main(String[] args) {
		/*	11.Two inputs of a string array and a string is received. 
		 	The array should be sorted in descending order. 
		 	The index of second input in a array should be retrieved.
			input1:{"ga","yb","awe"}
			input2:awe
			output:2
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Array Size for Number of Inputs");
		int size = scanner.nextInt();
		String[] input1 = new String[size];
		String input2;
		int flag = 0;
		
		System.out.println("Enter the elements of an array");
		for(int i = 0; i < size; i++)
		{
			input1[i] = scanner.next();
		}
		
		System.out.println("Enter your String to Find index of First Array");
		input2 = scanner.next();
		
		//Sorting of array
		Arrays.sort(input1, Collections.reverseOrder());
		System.out.println("Sorted Array Input1 : "+Arrays.toString(input1)); 
				
		
		//Searching given string and print index of array
		for(int i=0; i < size; i++)
		{
			if(input1[i].equals(input2))
			{
				System.out.println("\nIndex of String in Input_1 Array is:  "+i);
			}
			else
				flag = 1;
		}
		if (flag == 1)
			System.out.println("Entered object not available on list");
        
     scanner.close();   
    }

}

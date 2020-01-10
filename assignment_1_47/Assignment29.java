package assignment_1_47;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment29 {

	public static void main(String[] args) {
		/*		29.An array of integers is given.The given element is removed new array is returned.
				input1:{10,10,20,30,76}
				output: {20,30,76}(10 is asked to remove)
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int size = scanner.nextInt();
		
		int [] inputArray = new int[size];
		ArrayList<Integer> outputArray = new ArrayList<Integer>();
		
		System.out.println("Enter the elements of array");
		for(int i = 0; i < size; i++)
			inputArray[i] = scanner.nextInt();
		
		System.out.println("Enter the element to remove from Array");
		int element = scanner.nextInt();
		
		//Remove element from array
		for(int i = 0; i < size; i++)
		{
			if(inputArray[i] != element)
			{
				outputArray.add(inputArray[i]);
			}
		}
		System.out.println(outputArray);
		
		scanner.close();
		
		
	}

}

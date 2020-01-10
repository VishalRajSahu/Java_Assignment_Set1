package assignment_1_47;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment22 {

	public static void main(String[] args) {
		/*		22.Get two integer arrays as input. Find if there are common elements in the arrays. 
		 		   find the number of common elements.
				   input1: {1,2,3,4}
				   input2: {3,4,5,6}
				   output: 4(3,4,3,4)
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of First Array");
		int size_1 = scanner.nextInt();
		int [] firstArray = new int[size_1];
		
		System.out.println("Enter the size of Second Array");
		int size_2 = scanner.nextInt();		
		int [] secondArray = new int[size_2];
		
		System.out.println("Enter the Elements of First Array");
		for(int i=0; i<size_1; i++)
		{
			firstArray[i] = scanner.nextInt();	
		}
		System.out.println("Enter the Elements of Second Array");
		for(int i=0; i<size_2; i++)
		{
			secondArray[i] = scanner.nextInt();	
		}
		
		System.out.println("Elements of First Array");
		for(int i: firstArray) {System.out.print("  "+i);}
		System.out.println("\nElements of Second Array");
		for(int i: secondArray) {System.out.print("  "+i);}
		
		int k=0;
		ArrayList<Integer> common = new ArrayList<Integer>();
		//int [] common = new int[4];
		for(int i=0; i<size_1; i++)
			{
				for(int j=0; j<size_2; j++)
					{
							if(firstArray[i]==secondArray[j])
							{
								//common[k] = firstArray[i];
								common.add(k, firstArray[i]);
								k++;
							}
					}
			}
		
		for(int j=0; j<size_2; j++)
		{
			for(int i=0; i<size_1; i++)
				{
						if(firstArray[i]==secondArray[j])
						{
							//common[k] = secondArray[j];
							common.add(k, secondArray[j]);
							k++;
						}
				}
		}
		System.out.println("\nNumber of Repeated Elements:  "+k);
		System.out.print("Common elements are: ");
		//for(int i: common)System.out.print("  "+i);
		System.out.print(common);
		scanner.close();
	}

}

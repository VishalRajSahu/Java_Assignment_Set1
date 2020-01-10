package assignment_1_47;

import java.util.Scanner;

public class Assignment38 {

	public static void main(String[] args) {
		/*		38. Retrieve the max from array which is in a odd-index
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int size = scanner.nextInt();
		int max = 0;
		int intArray[] = new int [size];
		System.out.println("Enter the Elements of Array");
		for(int i=0; i<size; i++)
			{
			intArray[i] = scanner.nextInt();
			}
		
		for(int i=0; i<size; i++)
			{
				if(i%2==0)
				{
					if(max < intArray[i])
						max = intArray[i];
				}
			}
		
		System.out.println("Maximum Element of Odd Index: "+max);
		
		scanner.close(); 
	}

}

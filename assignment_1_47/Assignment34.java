package assignment_1_47;
import java.util.Scanner;

public class Assignment34 {

	public static void main(String[] args) {
		/*		34. find the average of the maximum and minimum number in an integer array.
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = scanner.nextInt();
		System.out.println("Enter "+size+" Elements of the Array");
		int intArray[] = new int[size];
		int max = 0, min;
		for(int i=0; i<size; i++)
			intArray[i] = scanner.nextInt();
		min = intArray[0]; // assigning 0th element as minimum value 
		
		//finding max and min element from array
		for(int i=0; i<size; i++)
			{
				if(max < intArray[i])
					max = intArray[i];
				if(min > intArray[i])
					min = intArray[i];
			}
//		int min = max;
//		for(int i=0; i<size; i++)
//		{
//			if(min > intArray[i])
//				min = intArray[i];
//		}
		System.out.println("Maximum Element: "+max);
		System.out.println("Minimum Element: "+min);
		System.out.println("Average of Min and Max: "+(double)(min+max)/2);
		scanner.close();
	}

}
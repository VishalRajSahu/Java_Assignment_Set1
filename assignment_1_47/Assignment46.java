package assignment_1_47;

import java.util.Scanner;

public class Assignment46 {

	public static void main(String[] args) {
		/*		46. Retrieve the elements in a array, which is an input, 
		 			which are greater than a specific input number.
		 			Add them and find the reverse of the sum. 
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = scanner.nextInt();
		System.out.println("Enter "+size+" elements of an array");
		int intArray[] = new int[size];
		for(int i=0; i<size; i++)
			intArray[i] = scanner.nextInt();
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int sum = 0;
		int digit, reverse = 0;
		for(int i=0; i<size; i++)
		{
			if(number < intArray[i])
				sum += intArray[i];
		}
		System.out.println("Sum of Greater Number of "+number+" is: "+sum);
		
		while(sum > 0)
		{
			digit = sum%10;
			reverse = reverse*10 + digit;
			sum /= 10;
		}
		System.out.println("Reverse of Sum: "+reverse);

		scanner.close();
	}

}

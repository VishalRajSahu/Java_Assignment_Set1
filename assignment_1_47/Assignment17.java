package assignment_1_47;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		/*		17. A integer input is accepted. find the square of individual digits and find their sum.
					input:125
					output:1*1+2*2+5*5
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter An Integer");
		int number = scanner.nextInt();
		int sum = 0;
		ArrayList<Integer> digit = new ArrayList<Integer>();
		while(number>0)
		{
			int remainder = number%10;
			digit.add(remainder);
			sum = sum + (remainder*remainder);
			number = number/10;			
		}
		
		System.out.print("Output: ");
		for(int i = digit.size()-1 ; i>=0; i--)
			{
			System.out.print(digit.get(i)+" * "+digit.get(i));
			if(i==0) break;
			System.out.print(" + ");
			}
		
		System.out.print("\nSquare of Digits: ");
		for(int i = digit.size()-1 ; i>=0; i--)
			{
			System.out.print(digit.get(i)*digit.get(i));
			if(i==0) break;
			System.out.print(" + ");
			}
		
		System.out.println("\nSum of Square of Digits "+sum);
		scanner.close();
	}

}

package assignment_1_47;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		/*1. A number is given as input. Find the odd digits in the number, add them and 
		 find if the sum is odd or not.if even return -1, if odd return 1
				input:52315
				logic:5+3+1+5=14(even)
				output:-1
				input:1112
				logic:1+1+1=3(odd)
				output:1
				*/
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter Your Number to find Output");
		int number = scannerObject.nextInt();
		int sum = 0;
		int flag = 1;
		while(number != 0)
		{
			 int odd = number % 10;
			 if (odd % 2 != 0)
			 {
				 sum = sum + odd;
			 }
			 number = number/10;		
		}
		System.out.println("Sum of odd digits in given number " +sum);
	
		if(sum % 2 == 0)
		{
			flag = -1;
			System.out.println("Digit Sum is Even  "+ flag);
		}
		else
		{
			System.out.println("Digit Sum is Odd  "+flag);
		}
scannerObject.close();
	}

}

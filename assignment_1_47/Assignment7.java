package assignment_1_47;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
			/*  7. Retrieve the odd numbers till given input number. add and subtract it consecutively and return the result.
				Input:9
				Output:1+3-5+7-9=-3    */
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the odd number");
		int odd_no = scanner.nextInt();
		int i=1, sum=1;
		
		if(odd_no%2==0)
		{
			System.out.println("Entered number is even\nPlease enter odd number\n");
			System.out.println("Enter the odd number");
			odd_no = scanner.nextInt();
		}
		int terms = (odd_no+1)/2;
		
		System.out.print("1");
		for(int j=0; j<terms-1; j++)
		{
			i= i+2;
			if (j%2==0)
				{
				sum = sum +i;
				System.out.print(" +"+" "+i);
				}
			else
				{
				sum = sum -i;
				System.out.print(" -"+" "+i);
				}
		
		}
		System.out.println("\nSum of Series "+sum);
		scanner.close();
	}

}

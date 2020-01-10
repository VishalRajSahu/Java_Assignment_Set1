package assignment_1_47;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		/*  6. Sum of fibonacci series upto given input.
		sum of first 3 
		logic:1+1+2
		output:4   */
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the number of terms for Fibonacci Series");
		int total_terms = scanner.nextInt();
		int first_term = 0, second_term = 1, next_term, i, sum = 1;
		
		System.out.println("FIBONACCI SERIES:");
		System.out.print(first_term + " " + second_term);
		for(i=0; i < total_terms-2; i++)
		{
			next_term = first_term + second_term;
			sum = sum + next_term;
			System.out.print(" "+next_term);
			first_term = second_term;
			second_term = next_term;
		}
		
		System.out.println("\nSum of first "+total_terms+ " terms\n"+  "Sum of Fibonacci Series " +sum);
		scanner.close();
	}

}

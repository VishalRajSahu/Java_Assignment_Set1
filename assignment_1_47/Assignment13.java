package assignment_1_47;

import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
		/*		13. Retrieve the palindrome-true number set from given number limit and return the sum
				    input1:90 input2:120
				    logic:99+101+111
				    output:311
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Limit and Last Limit to find Palindrome-true Number");
		int firstLimit = scanner.nextInt();
		int lastLimit = scanner.nextInt();
		int sum = 0;
		for(int i=firstLimit; i<lastLimit; i++)
		{
			int rev_number = 0, remainder, number;
			number = i;
			while( number > 0 )
	        {
	            remainder = number % 10;
	            rev_number = rev_number * 10 + remainder;
	            number  /= 10;
	        }
	            if (i == rev_number)
	            {
	            System.out.print(i+"  ");
	            sum += rev_number;
	            }
	    }
		System.out.println("\nSum of Palindrome Number in between "+firstLimit+ " And "+lastLimit+" : "+sum);
		scanner.close();
	}

}

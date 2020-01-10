package assignment_1_47;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment44 {

	public static void main(String[] args) {
		/*		44. Return the number of days in a month, where month and year are given as input.
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter month/year in format of(mm/yyyy)");
		String date = scanner.next();
		StringTokenizer tokens = new StringTokenizer(date,"/");
		int month = Integer.parseInt(tokens.nextToken());
		int year = Integer.parseInt(tokens.nextToken());
		System.out.println(month);
		System.out.println(year);
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		
		if(month==2)
		{
			if(isLeapYear)
				System.out.println("Month: "+month+" (29 Days)");
			else
				System.out.println("Month: "+month+" (28 Days)");
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11)
			System.out.println("Month: "+month+" (30 Days)");
		else
			System.out.println("Month: "+month+" (31 Days)");
		
		scanner.close();
	}

}

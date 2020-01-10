package assignment_1_47;

import java.util.Scanner;

public class Assignment19 {

	public static void main(String[] args) {
		/*
		  19. Accept a string and find if it is of date format "dd/mm/yyyy".
		  input:01/13/2012 output:false
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Date on date format (dd/mm/yyyy)");
		String date = scanner.next();
		String[] date_Array = date.split("/");
		
		int day = Integer.parseInt(date_Array[0]);
		int month = Integer.parseInt(date_Array[1]);
		int year = Integer.parseInt(date_Array[2]);
		Assignment19 assignment19 = new Assignment19();
		assignment19.validation(day, month, year);
		scanner.close();
	}
	public void validation(int intDay, int intMonth, int intYear)
	{
		int flag = 0;
			// To verify months in between 01 to 12
			if (intMonth >= 1 && intMonth <= 12)
				flag++;
			else
				System.out.println("Invalid Month");

			// To verify number of days in a month
			if (intMonth == 4 || intMonth == 6 || intMonth == 9 || intMonth == 11) {
				if (intDay >= 1 && intDay <= 30)
					flag++;
				else
					System.out.println("Invalid Days");
			} else if (intMonth == 2) // To verify leap year for FEB(February) month
			{
				boolean isLeapYear = ((intYear % 4 == 0) && (intYear % 100 != 0) || (intYear % 400 == 0));
				if (isLeapYear) {
					if (intDay >= 1 && intDay <= 29)
						flag++;
					else
						System.out.println("Invalid Days");
				} else {
					if (intDay >= 1 && intDay <= 28)
						flag++;
					else
						System.out.println("Invalid Days");
				}
			} else {
				if (intDay >= 1 && intDay <= 31)
					flag++;
				else
					System.out.println("Invalid Days");
			}

			if (flag == 2)
				System.out.println("Valid Date: True");
			else
				System.out.println("Invalid Date: False");
	}

}

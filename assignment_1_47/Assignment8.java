package assignment_1_47;

import java.util.Scanner;

public class Assignment8 {
	
	enum Months {
		   JANUARY, FEBRAURY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
		}
	public static void main (String[] args) throws Exception 
	{
		/*   8. Given date in dd-MM-yyyy format.return the month in full name format(January)
				input:"23-01-2012"
				output:January
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Date to Find month in full (FORMAT dd-MM-yyyy)");
		String date = scanner.next();
		
					
		String [] dateParts = date.split("-");
		String day = dateParts[0];
		String month = dateParts[1];
		String year = dateParts[2];
		
		System.out.print("Input Date:  ");
		System.out.print(day);
		System.out.print("/"+month);
		System.out.println("/"+year);
		
		System.out.println("\nOutput(Month in full) :");
		int i=Integer.parseInt(month)-1;
		System.out.println(Months.values()[i]);
		scanner.close();
	}
}
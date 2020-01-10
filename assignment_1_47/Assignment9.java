package assignment_1_47;

import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) throws Exception{
		/*	9. Two dates are given as input in "yyyy-MM-dd" format. Find the number of months between the two dates
			input1:"2012-12-01"
			input2:"2012-01-03"
			output:11
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Date to Find the number of months between the two dates (FORMAT yyyy-MM-dd)");
		String date_1 = scanner.next();
		String date_2 = scanner.next();
		
				
		
		String [] dateParts_1 = date_1.split("-");
		String [] dateParts_2 = date_2.split("-");
		
		String strMonth_1 = dateParts_1[1];
		String strMonth_2 = dateParts_2[1];
		String strYear_1 = dateParts_1[0];
		String strYear_2 = dateParts_2[0];
		
		int month_1=Integer.parseInt(strMonth_1);
		int month_2=Integer.parseInt(strMonth_2);
		int year_1=Integer.parseInt(strYear_1);
		int year_2=Integer.parseInt(strYear_2);
		int months_diff;
		
		if(year_1 > year_2)
		{
			if(year_1-year_2==1)
			{
				months_diff = (12-month_2)+month_1;
				System.out.println(months_diff);
			}
			else
			{
				int year_diff = (year_1-year_2)-1;
				months_diff = (12-month_2)+month_1+(year_diff*12);
				System.out.println(months_diff);
			}
		}
		else if (year_1 < year_2)
		{
			if(year_2-year_1==1)
			{
				months_diff = (12-month_1)+month_2;	
				System.out.println(months_diff);
			}
			else
			{
				int year_diff = (year_2-year_1)-1;
				months_diff = (12-month_1)+month_2+(year_diff*12);
				System.out.println(months_diff);
			}
		}
		else
		{
			months_diff = month_1-month_2;
			System.out.println(Math.abs(months_diff));
		}
	scanner.close();		
	}
	
}

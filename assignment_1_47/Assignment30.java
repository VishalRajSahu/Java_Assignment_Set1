package assignment_1_47;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Assignment30 {
	
	static int flag = 0;
	public static void main(String[] args) throws ParseException 
	{
		/*     30. Find the number of days between two input dates.
		*/
		Assignment30 assignment = new Assignment30();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two Date to Find Number of Day in between (in FORMAT dd-MM-yyyy)");
		String first_date = scanner.next();
		String second_date = scanner.next();
		
		String [] dateParts_1 = first_date.split("-");
		String [] dateParts_2 = second_date.split("-");
		
		int year_1=Integer.parseInt(dateParts_1[2]);
		int year_2=Integer.parseInt(dateParts_2[2]);
		int month_1=Integer.parseInt(dateParts_1[1]);
		int month_2=Integer.parseInt(dateParts_2[1]);
		int day_1=Integer.parseInt(dateParts_1[0]);
		int day_2=Integer.parseInt(dateParts_2[0]);
		
		//Validation for date
		Assignment19 assignment19 = new Assignment19();
		assignment19.validation(day_1, month_1, year_1);
		assignment19.validation(day_2, month_2, year_2);
		
		
		Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(first_date);  
		Date date2=new SimpleDateFormat("dd-MM-yyyy").parse(second_date);  
		
		//Calculate days differences
		if(flag == 2)
		{
		assignment.getDifferenceDays(date1,date2);
		}
		else System.out.println("Both dates should be valid");
		scanner.close();
	}	
		public void getDifferenceDays(Date date1, Date date2) 
		{
		    int daysDifference = 0;
		    long diff_in_MS = date2.getTime() - date1.getTime();
		    long diff_in_Days = diff_in_MS / (24 * 60 * 60 * 1000);
		    daysDifference = (int) diff_in_Days;
			System.out.println("Difference " + daysDifference);
		}
		
//		public void validation(int year, int month, int day)
//		{
//			if(month >= 01 && month <= 12 )
//			{
//				if(month == 4 || month == 6 || month == 9 || month == 11)
//						{
//							if(day >= 01 && day <= 30)
//							{
//								System.out.println("Valid Date");
//								flag++;
//								
//							}
//							else System.out.println("Day in between 01 and 30");
//						}
//				else if(month ==2)
//				{			
//							if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) )
//								{
//									if(day >= 01 && day <= 29)
//										{
//										System.out.println("Valid Date");
//										flag++;
//										}
//									else System.out.println("Day in between 01 and 29");
//								}
//							else
//								{
//									if(day >= 01 && day <= 28)
//										{
//										System.out.println("Valid Date");
//										flag++;
//										}
//									else System.out.println("Day in between 01 and 28");									
//								}
//							
//							
//				}
//				else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
//				{
//							if(day >= 01 && day <= 31)
//							{
//								System.out.println("Valid Date");
//								flag++;
//							}	
//							else System.out.println("Day in between 01 and 31");
//				}
//				else
//					System.out.println("Invalid Month");
//			}
//		}
			
}

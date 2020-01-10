package assignment_1_47;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;



public class Assignment2 {
enum Days{Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Monday}
	public static void main(String[] args) throws Exception
	{
		/*2.Find the day(Friday) of a date input given as MM-dd-yyyy (format)
		input:12-27-2012
		output:Thursday */
		
		Assignment2 assignment = new Assignment2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Date to Find Day in FORMAT MM-dd-yyyy");
		
		//LocalDateTime today =  LocalDateTime.now();
		//System.out.println(today);
		String fixDate = "06-25-2019";//Tuesday
		String userDate = scanner.next();
		
		 Date date1=new SimpleDateFormat("MM-dd-yyyy").parse(fixDate);  
		 Date date2=new SimpleDateFormat("MM-dd-yyyy").parse(userDate);  
		 
		 assignment.getDifferenceDays(date1,date2);
		 scanner.close();
	}
	
	public void getDifferenceDays(Date diff_date1, Date diff_date2) 
	{
	    int daysDifference = 0;
	    long diff_in_MS = diff_date2.getTime() - diff_date1.getTime();
	    long diff_in_Days = diff_in_MS / (24 * 60 * 60 * 1000);
	    daysDifference = (int) diff_in_Days;
		System.out.println("Difference " + daysDifference);
		int index = daysDifference%7;
		if(index >= 0)
		System.out.println(Days.values()[index]);
		else //for Negative difference
			{
				index = 7 + index;
				System.out.println(Days.values()[index]);
			}
		
//		switch(index)
//		{
//			case 1:
//				System.out.println("Wednesday");
//				break;
//			case 2:
//				System.out.println("Thursday");
//				break;
//			case 3:
//				System.out.println("Friday");
//				break;
//			case 4:
//				System.out.println("Saturday");
//				break;
//			case 5:
//				System.out.println("Sunday");
//				break;
//			case 6:
//				System.out.println("Monday");
//				break;
//			case 0:
//				System.out.println("Tuesday");
//				break;
//			case -1:
//				System.out.println("Monday");
//				break;
//			case -2:
//				System.out.println("Sunday");
//				break;
//			case -3:
//				System.out.println("Saturday");
//				break;
//			case -4:
//				System.out.println("Friday");
//				break;
//			case -5:
//				System.out.println("Thursday");
//				break;
//			case -6:
//				System.out.println("Wednesday");
//				break;
//		}
	}
}

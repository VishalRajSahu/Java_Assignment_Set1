package assignment_1_47;

import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) {
		/*		12. A time input is received as string. Find if the hour format is in 12 hour format. 
		 * 			The suffix am/pm is case insensitive.
					input:"09:36 am"
					output:true
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Time String (in Format hh:mm am/pm)");
		String string = scanner.nextLine();
		String[] string_array = string.split("[: ]"); 

		int int_hours = Integer.parseInt(string_array[0]);
		int int_min = Integer.parseInt(string_array[1]);
		
		if(int_hours >= 0 && int_hours <= 12)
		{
			if(int_min >= 0 && int_min <= 60)
			{
				if(string_array[2].equalsIgnoreCase("am") || string_array[2].equalsIgnoreCase("pm"))
				{
					System.out.println("12 Hours time fromat:  True");
				}
				else System.out.println("Time Meridiem: Invalid");
			}
			else System.out.println("Minutes: Invalid");				
		}
		else System.out.println("12 Hours time fromat:  Invalid");
		scanner.close();
	}

}

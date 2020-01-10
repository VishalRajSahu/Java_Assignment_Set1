package assignment_1_47;

import java.util.Scanner;

public class Assignment18 {

	public static void main(String[] args) {
	/*		18.Two input strings are accepted. If the two strings are of same length concatenate them and return, 
			   if they are not of same length, reduce the longer string to size of smaller one, and concatenate them.
			   input1:"hello"
			   input2:"hi" 
			   output:"lohi"
			   input1:"aaa"
			   input2:"bbb"
			   output:"aaabbb"
	*/
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Two Strings");
			String string_1 = scanner.next();
			String string_2 = scanner.next();
			
			if(string_1.length() == string_2.length())
			{
				System.out.println("Concatenated String: " + string_1 + " " + string_2);
			}
			else if (string_1.length() > string_2.length())
			{
				int index = string_1.length() - string_2.length();
				System.out.println("Concatenated String: "+ string_1.substring(index) + " " + string_2);
			}
			else
			{
				int index = string_2.length() - string_1.length();
				System.out.println("Concatenated String: "+ string_1 + " " + string_2.substring(index));
			}
				
		scanner.close();
	}

}
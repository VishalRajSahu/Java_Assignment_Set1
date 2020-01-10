package assignment_1_47;

import java.util.Scanner;

public class Assignment36 {

	public static void main(String[] args) {
		/*		36. find the three consecutive characters in a string. if the string consists any three 
		   			consecutive characters return 1 else return -1
		   			like AAAxyzaaa will return true.
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.next();
		int flag = 0, counter = 0;
		
		for(int i=0; i<string.length(); i++)
		{
			if((string.charAt(i) >= 'a' && string.charAt(i) <= 'z')
					||
			   (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'))
			flag ++;
						
			int j=i+1;
			if(j==string.length())
				break;
			if(string.charAt(j)-string.charAt(i)==1)
				counter++;
			// Special Condition for yza OR zab (Circular way)
			if((string.charAt(i)=='Z' || string.charAt(i)=='z') 
				&& (string.charAt(j)=='A' || string.charAt(j)=='a'))
				counter++;
		}

		if(flag != string.length())
			System.out.println("String must consists characters in all position");
		else {
				if(flag >= 1 && counter >= 2)
					System.out.println("True: String Consists Three Consecutive Characters");
				else
					System.out.println("False: String Does Not Consists Three Consecutive Characters");
			 }
		scanner.close();
	}

}

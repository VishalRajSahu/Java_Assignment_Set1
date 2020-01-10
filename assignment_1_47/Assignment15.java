package assignment_1_47;

import java.util.Scanner;

public class Assignment15 {

	public static void main(String[] args) {
		/*		15. Get a input string. reverse it and parse it with '-'.
					input:computer
					output:r-e-t-u-p-m-o-c
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.next();
		
		for(int i=string.length()-1; i>=0; i--)
		{
			System.out.print(string.charAt(i));
			if(i==0)	break;
			System.out.print("-");
		}		
		scanner.close();		
	}
}
package assignment_1_47;

import java.util.Scanner;

public class Assignment31 {

	public static void main(String[] args) {
		/*		31.Enter your name and return a string print the title first 
		  		   and then comma and then first letter of initial name.
		 
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String string = scanner.nextLine();
		System.out.println("Enter you Gender");
		System.out.println("1. for Male \n2. for Female");
		int choice = scanner.nextInt();
		switch(choice)
		{
		case 1: System.out.print("Mr, ");
		break;
		case 2: System.out.print("Ms, ");
		break;
		}
		System.out.println(Character.toUpperCase(string.charAt(0)));
		scanner.close();
	}

}
package assignment_1_47;
import java.util.Scanner;

public class Assignment27 {

	public static void main(String[] args) {
		/*		27. Get a input string. Find if it is a negative number, if true return the absolute value, in other cases return -1.
				input: "-123"
				output: 123
				input: "@123"
				output: -1
		*/
			Scanner S = new Scanner (System.in);
			System.out.println("Enter String");
			String string = S.next();
			System.out.println("Entered String : "+string);
			
				if(string.startsWith("-"))
				{
					System.out.println(string.substring(1));
				}
				else
				{
					System.out.println("-1");
				}
									
		S.close();
	}

}
package assignment_1_47;
import java.util.Scanner;

public class Assignment26 {

	public static void main(String[] args) {
		/*		26. Find no of characters in a given string which are not repeated.
					input: "hello"
					output: 3
		*/
			Scanner S = new Scanner (System.in);
			System.out.println("Enter String");
			String string = S.next();
			System.out.println("Entered String : "+string);
			int counter = 0;
				for(int i=0; i<string.length(); i++)
					{
						for(int j=0; j<string.length(); j++)
							{
								if(i != j)
									{
										if(string.charAt(i) == string.charAt(j))
											{
												counter++;
												break;
											}
									}
							}
					}
				System.out.println("Repeated Letters are :      "+counter);
				System.out.println("Non-Repeated Letters are :  "+(string.length()-counter));
				S.close();
	}

}
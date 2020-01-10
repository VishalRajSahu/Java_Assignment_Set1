package assignment_1_47;
import java.util.Scanner;

public class Assignment32 {

	public static void main(String[] args) {
		/*		32. Write a Program that accepts a string and removes the duplicate characters.
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.next();
		String outputString = "";
		int chCounter = 0;
		//Example: vishalsahu		Output: vilu
		for (int i=0; i<string.length(); i++)
		{
			for (int j=0; j<string.length(); j++)
				{
					if(i != j)
					{
						if (string.charAt(i) == string.charAt(j)) 
							{
								chCounter++;
							}
					}
				}
			if(chCounter == 0)
			{
				outputString = outputString + string.charAt(i);
			}chCounter =0;
		}
		
		//Example: vishalsahu		Output: vishalu
//				for (int i=0; i<string.length(); i++)
//				{
//					for (int j=0; j<outputString.length(); j++)
//						{
//							if(i != j)
//							{
//								if (string.charAt(i) == outputString.charAt(j)) 
//									{
//										chCounter++;
//									}
//							}
//						}
//					if(chCounter == 0)
//					{
//						outputString = outputString + string.charAt(i);
//					}chCounter =0;
//				}
	
		System.out.println(outputString);
		scanner.close();
	}
}

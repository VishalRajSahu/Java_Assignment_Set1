package assignment_1_47;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment28 {

	public static void main(String[] args) {
		/*		 28.An arraylist of Strings is given as input. The count of the String elements 
		 			that are not of size input2 string is to be returned.
					input1: {"aaa","bb","cccc","d"}
					input2: "bb"
					output: 3("bb"-length:2)
		*/
		Scanner scanner = new Scanner(System.in);	
		ArrayList<String> stringList = new ArrayList<String>();
		String string;
		
		String choice = "";
		int i=0;
		int count=0;
		do
			{
				System.out.println("Enter Elements of Array List");
				stringList.add(i, scanner.next());
				System.out.println("Do you want to add more element, Press 'y' for Yes");
				choice = scanner.next();
				i++;
			}while(choice.equalsIgnoreCase("y"));
		
		System.out.println("Enter a String to find in Array List");
		string = scanner.next();
		int lengthOfString = string.length();
		System.out.print("\nArray List's Elements : ");
		System.out.println(stringList);
		
		System.out.print("Entered String : "+string);
		System.out.println("  Length : "+lengthOfString);
		
		
		for(i=0; i<stringList.size(); i++)
		{	
			int length = 0; 
			String listObject = stringList.get(i);
			length = listObject.length();
//			for(char c : listObject.toCharArray())
//			{
//				length++; 
//				System.out.print(" "+c);
//			}
//			System.out.println();
			//System.out.println(i+"th string length "+length);
			if(length == lengthOfString)
			{
				count++;
			}
		}
		System.out.println("No. of Objects are matched with given String: " +count);
		System.out.println("No. of Objects not matched with given String: "+(stringList.size()-count));
		
		
				
		scanner.close();
	}

}
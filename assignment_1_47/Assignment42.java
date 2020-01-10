package assignment_1_47;

import java.util.Scanner;

public class Assignment42 {

	public static void main(String[] args) {
		/*   42. input1=commitment;
		  		 output=cmmitmnt;
				 c be the first index position 
				 remove even vowels from the string
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.next();
		String newString = "";
		int flag;
		for(int i=0; i<string.length(); i++)
		{
			flag = 0;
           	if(string.charAt(i)=='a' || string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u'
            || string.charAt(i)=='A' || string.charAt(i)=='E' || string.charAt(i)=='I' || string.charAt(i)=='O' || string.charAt(i)=='U')
           	{
           		if(i%2 != 0)
           			flag = 1;
           	}
		if(flag == 0)
			newString += string.charAt(i);
		}
		System.out.println("New String: "+newString);
		scanner.close();	
	}		    
}


package assignment_1_47;

import java.util.Scanner;

public class Assignment37 {

	public static void main(String[] args) {
		/*		37. String encryption. Replace the odd-index character with next character
		  			(if it is 'z' replace with 'a'..if 'a' with 'b' as such), 
				    leave the even index as such. return the encrypted string.
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.next();
		String encryptedStr = "";
		for(int i=0; i<string.length(); i++)
		{
			if(i%2 == 0)
			{
				if(string.charAt(i) =='Z')//for last char circular shape
					encryptedStr = encryptedStr+'A';
				else if(string.charAt(i) =='z')
					encryptedStr = encryptedStr+'a';
				else
				encryptedStr = encryptedStr+(char)(string.charAt(i)+1);
			}
			else
				encryptedStr = encryptedStr+(string.charAt(i));
		}
		System.out.println("Encrypted String: "+encryptedStr);
		
		scanner.close();
		
	}

}

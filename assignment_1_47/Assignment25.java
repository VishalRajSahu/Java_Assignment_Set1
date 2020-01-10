package assignment_1_47;

import java.util.Scanner;

public class Assignment25 {

	public static void main(String[] args) {
		/*		25. Check whether a given string is palindrome also check whether it has atleast 2 different vowels
					input: "madam"
					output: false(no 2 diff vowels)
		*/
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a string to check palindrome");
			String palindrome = scanner.nextLine();
			String reverse = "";
			
			
			for(int i=palindrome.length()-1; i>=0; i--)
			{
				reverse = reverse + palindrome.charAt(i);
			}
					if(palindrome.equalsIgnoreCase(reverse))
						{
							System.out.println("String is Palindrome");
							count_vowels(palindrome);
						}
					else
						{
							System.out.println("String is not Palindrome");
						}
			
			
	scanner.close();
	}

	private static void count_vowels(String palindrome) 
	{	int counter =0;
		int vowel_a = 0, vowel_e = 0, vowel_i = 0, vowel_o = 0, vowel_u = 0;
		for(int i=0; i<palindrome.length(); i++ )
			{
			if(palindrome.charAt(i) == 'a' || palindrome.charAt(i) == 'A' )
				{	vowel_a++; 	counter++;	}
			if(palindrome.charAt(i) == 'e' || palindrome.charAt(i) == 'E' )
				{	vowel_e++; 	counter++;	}
			if(palindrome.charAt(i) == 'i' || palindrome.charAt(i) == 'I' )
				{	vowel_i++; 	counter++;	}
			if(palindrome.charAt(i) == 'o' || palindrome.charAt(i) == 'O' )
				{	vowel_o++; 	counter++;	}
			if(palindrome.charAt(i) == 'u' || palindrome.charAt(i) == 'U' )
				{	vowel_u++; 	counter++;	}
			}
				if(vowel_a==counter || vowel_e==counter || vowel_i==counter || vowel_o==counter || vowel_u==counter)
					{	System.out.println("False: No Two Different Vowels");	}
				else 
					{	System.out.println("True: Different Vowels");		}
		
	}

}



package assignment_1_47;
import java.util.Scanner;

public class Assignment14 {

	 public static void main(String[] args) {
		/*		 14.find the max length-word in a given string and return the max-length word. 
		  			if two words are of same length return the first occurring word of max-length.
					input:"hello how are you aaaaa"
					output:hello(length-5)
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String line = scanner.nextLine();
		
		String[] word=line.split(" ");
        String longestWord=" ";
        int maxLength = 0;
        
        for (String str : word)
        {
            if (str.length() > maxLength) 
            	{
                	maxLength = str.length();
                	longestWord = str;
            	}
        }
   		System.out.println(longestWord+" (length - "+maxLength+")");
			
		scanner.close();
	}

}
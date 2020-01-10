package assignment_1_47;
import java.util.Scanner;

public class Assignment33 {

	public static void main(String[] args) {
		/*		33. Validate a Password 
					i) there should be atleast one digit.
					ii) there should be atleast one of '#','@' or '$'.
					iii)the password should be of 6 to 20 characters.
					iv) there should be more uppercase letter than lower case.
					v) should start with an upper case and end with lower case.
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Password Guilelines: \ni) there should be atleast one digit.\nii) there should be atleast one of '#','@' or '$'.\niii)the password should be of 6 to 20 characters.\niv) there should be more uppercase letter than lower case.\nv) should start with an upper case and end with lower case.");
		System.out.println("\nEnter Your Password");
		String password = scanner.next();
		int upperCounter = 0, lowerCounter = 0, digitCounter = 0, specialCounter = 0, flag = 0;
		for(int i=0; i<password.length(); i++)
		{
			if ((password.charAt(0) >= 'A' && password.charAt(0) <= 'Z')
    				&&
    			(password.charAt(password.length()-1) >= 'a' && password.charAt(password.length()-1) <= 'z'))
				flag = 1;
			if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') 
            	upperCounter++; 
            if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') 
            	lowerCounter++; 
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') 
            	digitCounter++; 
            if (password.charAt(i) == '#' || password.charAt(i) == '@' || password.charAt(i) == '$') 
            	specialCounter++;
        }
		if(password.length() >= 6 && password.length() <= 20)
		{
			if(specialCounter >= 1)
			{
				if(digitCounter >= 1)
				{
					if(upperCounter > lowerCounter )
					{
							if(flag == 1)
							{
								System.out.println("Password is Valid");
							}
							else System.out.println("Password must start with an upper case and end with lower case");
					}
					else System.out.println("Password must contain more uppercase than lowercase");
				}
				else System.out.println("Password must contain atleast one digit");
			}
			else System.out.println("Password must contain atleast one of '#','@' or '$' characters");
		}
		else System.out.println("Password must contain 6 to 20 characters");
		scanner.close();
	}
}
package assignment_1_47;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Assignment47 {

	public static void main(String[] args) {
		/*		47. Input a hashmap. Count the keys which are not divisible by 4 and return.
		*/
		
		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		HashMap<Integer, String> student = new HashMap<Integer, String>();
		String choice; 
		do
		{
			System.out.println("Enter Student's Roll No. and Name");
			student.put(scanner.nextInt(), scanner.next());
			System.out.println("Do you want to add more record press 'Y' for Yes and 'N' for No");
			choice = scanner.next();
		}while(choice.equalsIgnoreCase("Y"));
		
		System.out.println("Student's Details:  "+student);
		
		for(Entry<Integer, String> entry : student.entrySet())
		{    
	        int key=entry.getKey();  
	           	if(key%4 != 0)
	        	{
	        		counter++;
	        	}        	
		}
		System.out.println("Number of Keys are not divisible by 4 is: "+counter);
		
		
		scanner.close();
	}

}

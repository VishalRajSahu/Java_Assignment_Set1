package assignment_1_47;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Assignment16 {

	public static void main(String[] args) {
		/*		16. HashMap with reg_num as key and mark as value. find the average of marks whose key is odd.
					input:{12:90,35:90,33:90,56:88}
					output:avg of(90+90) =90
		*/
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, Integer> student = new HashMap<Integer, Integer>();
		String choice;
		int counter=0;
		double sum=0;
		do
		{
		System.out.println("Enter Student's Registration No. and Marks");
		student.put(scanner.nextInt(), scanner.nextInt());
		System.out.println("Do You Want to Continue, Press 'Y' for Yes [OR] 'N' for No ");
		choice = scanner.next();
		}while(choice.equalsIgnoreCase("Y"));
		
		System.out.println("Student's Details:  "+student);
		
		for(Entry<Integer, Integer> entry:student.entrySet())
		{    
	        int key=entry.getKey();  
	        int marks=entry.getValue();
	        	if(key%2 != 0)
	        	{
	        		sum = sum + marks;
	        		counter++;
	        	}        	
		}
		
		if(counter==0)
			System.out.println("No One Have Odd Reg_No.");
		else
			System.out.println("Average Marks of Odd Reg_No. : "+sum/counter);
		scanner.close();
	}

}
package assignment_1_47;
import java.util.Scanner;

public class Assignment40 {

	public static void main(String[] args) {
		/*	40.	input1="Rajasthan";
				input2=2;
				input3=5;
				output=hts;
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.next();
		System.out.println("Enter Start index and End index");
		int start_index = scanner.nextInt();
		int end_index = scanner.nextInt();
		StringBuffer strBuffer = new StringBuffer(string);
		strBuffer.reverse();
		System.out.println("Output: "+strBuffer.substring(start_index, end_index));		
		
		scanner.close();
	}

}

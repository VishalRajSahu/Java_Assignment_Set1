package assignment_1_47;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment39 {

	public static void main(String[] args) {
		/*		39. GIVEN A STRING 555-666-1234
				    DISPLAY AS 55-56-661-234?
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Size");
		String string = scanner.next();
				
		StringTokenizer token = new StringTokenizer(string,"-");
		String strPart1 = token.nextToken();
		String strPart2 = token.nextToken();
		String strPart3 = token.nextToken();
			
		StringBuffer str_buffer = new StringBuffer();
		str_buffer.append(strPart1.substring(0, strPart1.length()-1)).append('-');
		str_buffer.append(strPart1.charAt(strPart1.length()-1)).append(strPart2.charAt(0)).append('-');
		str_buffer.append(strPart2.substring(1, strPart2.length())).append(strPart3.charAt(0)).append('-');
		System.out.println(str_buffer.append(strPart3.substring(1, strPart3.length())).append('?'));
				
		scanner.close();
	}
}

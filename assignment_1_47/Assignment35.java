package assignment_1_47;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment35 {

	public static void main(String[] args) {
		/*		35. Validate the ip address in the form a.b.c.d
		   			where a,b,c,d must be between 0and 255
		   			if validated return 1 else return 2
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ip Address in form of a.b.c.d (Ex. 165.123.50.1)");
		String ipAddress = scanner.next();
		int flag = 0;
		StringTokenizer tokens = new StringTokenizer(ipAddress,".");
		int aClass = Integer.parseInt(tokens.nextToken());
		int bClass = Integer.parseInt(tokens.nextToken());
		int cClass = Integer.parseInt(tokens.nextToken());
		int dClass = Integer.parseInt(tokens.nextToken());
		
		if(aClass >= 0 && aClass <= 255)
			flag++;
		else
			System.out.println("Invalid Class - A ");
		
		if(bClass >= 0 && bClass <= 255)
			flag++;
		else
			System.out.println("Invalid Class - B ");
		
		if(cClass >= 0 && cClass <= 255)
			flag++;
		else
			System.out.println("Invalid Class - C ");
		
		if(dClass >= 0 && dClass <= 255)
			flag++;
		else
			System.out.println("Invalid Class - D ");
		
		if(flag == 4)
			System.out.println("Valid ip Address: 1");
		else
			System.out.println("Invalid ip Address: 2");
		
		scanner.close();
	}

}

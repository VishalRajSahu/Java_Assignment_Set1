package assignment_1_47;

import java.util.Scanner;

public class Assignment21 {

	public static void main(String[] args) {
		/*		21.Find the extension of a given string file.
					input: "hello.jpeg"
					output: "jpeg"
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the File Name to find the extension");
		String fileName = scanner.next();
		 if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
			 // first condition check whether file name exist or not Ex .jpg only
			 // second condition check whether file extension exist or not Ex hello only
		      System.out.println(fileName.substring(fileName.lastIndexOf(".") + 1));
		 else
		      System.out.println("File does not have extention");
	
		 scanner.close();
	}

}

package assignment_1_47;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment10 {
	
		public static void main(String[] args) 
		{
		/*	10. array list of string type which has name#mark1#mark2#mark3 format. retrieve the name of the student 
		        who has scored max marks(total of three).
			input:{"arun#12#12#12","deepak#13#12#12"}
			output:deepak
			*/
		
			Scanner scanner = new Scanner(System.in);
			String choice;
			ArrayList<Student> studentList = new ArrayList<>();
			do
			{
				System.out.println("Enter Elements of Array List");
				System.out.println("Enter Student Details: Name, Mark_1, Mark_2, Mark_3");				
				Student Stud = new Student(scanner.next(), scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
				studentList.add(Stud);
				System.out.println("Do you want to add more element, Press 'y' for Yes");
				choice = scanner.next();
			}while(choice.equalsIgnoreCase("y"));
	      	        
			Assignment10.findTotal(studentList);
	   scanner.close();     
	}
	
	    private static void findTotal(List<Student> list) 
	    {
	    	int max =0;
	    	int index = 0;
	       for (int i = 0; i < list.size(); i++) 
	        {
	            System.out.print("Student Name: "+((Student) list.get(i)).getName());
	            System.out.println("\tTotal Marks: "+((Student) list.get(i)).getMarks());
	            if(((Student) list.get(i)).getMarks() > max)
				{
					max = ((Student) list.get(i)).getMarks();
					index = i;
				}
	      }
	       System.out.println("\nName of Student Scored Highest Total:   " +((Student) list.get(index)).getName()); 
	    }
}


	class Student 
	{
	    private String name;
	    private int marks1;
	    private int marks2;
	    private int marks3;
	    
	    public Student(String name, int marks1, int marks2, int marks3) 
	    	{
	        	this.name = name;
	        	this.marks1 = marks1;
	        	this.marks2 = marks2;
	        	this.marks3 = marks3;
	    	}

	    public String getName() 
	    	{
	        	return name;
	    	}

	    public int getMarks() 
	    	{
	    		return marks1+marks2+marks3;
	    	}
	}
	



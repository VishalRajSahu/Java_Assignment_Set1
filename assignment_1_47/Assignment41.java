package assignment_1_47;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Assignment41 {
	
	public static void main(String[] args) {
		/*		41. input1={1,2,3}
					input2={3,4,5}
					input3;+(union)
					output:inp1+inp2
					input1:{1,2,3,4,5}
					input 2:{2,3,4,5}
					input3=*(intersection)
					output:inp1*inp2
					INPUT1:{1,2,3,4,5}
					INPUT2:{3,6,7,8,9}
					INPUT3:-(MINUS)
					output:inp1-inp2
		*/
		Scanner scanner = new Scanner(System.in);
		String choice;
		
		System.out.println("Enter the size of First Arrays");
		int size1 = scanner.nextInt();
		System.out.println("Enter the size of Second Arrays");
		int size2 = scanner.nextInt();
		int set_1 [] = new int [size1];
		int set_2 [] = new int [size2];
		
		System.out.println("Enter "+size1+" Elements for First Set");
			for(int i=0; i<size1; i++)
				set_1[i] = scanner.nextInt();
		System.out.println("Enter "+size2+" Elements for Second Set");
			for(int i=0; i<size2; i++)
				set_2[i] = scanner.nextInt();
		
		System.out.print("Two Sets are: \n");
		for(int i:set_1)System.out.print(i+" ");
		System.out.println();
		for(int i:set_2)System.out.print(i+" ");
		
		do {
			System.out.println("\n1. Union \n2. Intersection \n3. A Minus B \n4. B Minus A \n5. Difference");
			int option = scanner.nextInt();
			Set<Integer> input_1 = new HashSet<Integer>(); 
			Set<Integer> input_2 = new HashSet<Integer>(); 
			for (int i = 0; i < set_1.length; i++)  
				input_1.add(set_1[i]); 
			for (int i = 0; i < set_2.length; i++)  
				input_2.add(set_2[i]); 
			switch(option)
				{
					case 1: System.out.println("Union of Two Sets");
							Set<Integer> union = new HashSet<Integer>(input_1); 
							union.addAll(input_2); 
							System.out.println(union);
							break;
					case 2: System.out.println("Intersection of Two Sets");
							Set<Integer> intersection = new HashSet<Integer>(input_1); 
							intersection.retainAll(input_2); 
							System.out.println(intersection);
							break;
					case 3: System.out.println("First Minus Second Sets"); 
							Set<Integer> minusAB = new HashSet<Integer>(input_1); 
							minusAB.removeAll(input_2); 
							System.out.println(minusAB); 
							break;
					case 4: System.out.println("Second Minus First Sets"); 
							Set<Integer> minusBA = new HashSet<Integer>(input_2); 
							minusBA.removeAll(input_1); 
							System.out.println(minusBA); 
							break;
					case 5: System.out.println("Difference of Two Sets");
							if(size1 == size2)
							{
								int difference[] = new int[size1];
								for(int i=0; i<size1; i++)
									difference[i] = set_1[i] - set_2[i];
								for(int i: difference) System.out.print(i+" ");
							}
							else System.out.println("Both Sets have Different Size");
							break;
				}
			
			System.out.println("Do you want to add your choice Press 'Y' for Yes or 'N' for No");
			choice = scanner.next();
		   }while(choice.equalsIgnoreCase("y"));
		System.out.println("Exit from Options");
		scanner.close();
	}
}

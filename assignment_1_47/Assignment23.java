package assignment_1_47;

import java.util.Scanner;

public class Assignment23 {

	public static void main(String[] args) {
		/*		23.Find if a given pattern appears in both the input strings at same positions.
				input1: "hh--ww--"
				input2: "rt--er--"
				output: true(false otherwise)
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String ");
		String firstString = scanner.next();
		System.out.println("Enter Second String ");
		String secondString = scanner.next();
		
		System.out.println("First String: "+firstString);
		System.out.println("Second String: "+secondString);
		int [] firstArray = new int[firstString.length()];
		int [] secondArray = new int[secondString.length()];
		int flag=0;
		for(int i=0; i<firstString.length(); i++)
		{
			firstArray[i] = firstString.charAt(i);	
			System.out.print("  "+firstArray[i]);
		}
		System.out.println();
		for(int i=0; i<secondString.length(); i++)
		{
			secondArray[i] = secondString.charAt(i);	
			System.out.print("  "+secondArray[i]);
		}
	
		for(int i=0; i<firstArray.length; i++)
		{
			if(	   (firstArray[i]>= 32 && firstArray[i]<= 47)//(space)	!	"	#	$	%	&	'	(	)	*	+	,	-	.	/
				|| (firstArray[i]>= 58 && firstArray[i]<= 64)//:	; 	<	=	>	?	@
				|| (firstArray[i]>= 91 && firstArray[i]<= 96)//[	\	]	^	_	`
				|| (firstArray[i]>= 123 && firstArray[i]<= 126)//{	|	}	~
			  )
					{				
						if(firstArray[i] != secondArray[i])
						{   flag=1;		break; 	}
					}
		 }
		
		for(int i=0; i<secondArray.length; i++)
		{
			if(	   (secondArray[i]>= 32 && secondArray[i]<= 47)//(space)	!	"	#	$	%	&	'	(	)	*	+	,	-	.	/
				|| (secondArray[i]>= 58 && secondArray[i]<= 64)//:	; 	<	=	>	?	@
				|| (secondArray[i]>= 91 && secondArray[i]<= 96)//[	\	]	^	_	`
				|| (secondArray[i]>= 123 && secondArray[i]<= 126)//{	|	}	~
			  )
					{				
						if(firstArray[i] != secondArray[i])
						{   flag=1;		break; 	}
					}
		 }
		if(flag==0)
			System.out.println("\nTrue: Patteren Matched");
		else
			System.out.println("\nFalse: Patteren Not Matched");
		scanner.close();
	}

}

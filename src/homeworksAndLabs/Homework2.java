package homeworksAndLabs;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

//		1.)  Write Fibonacci series between the user entered start and end values	
		
		Scanner scan = new Scanner(System.in);
	
				
		 System.out.println("Enter TWO values (integers, example: 0 and 10) for the START and END of your fibonacci sequence: ");
		 
		 
		int a = 0;
		int b = 1;
		int c;

		
		int start; 
		int end; 
		start = scan.nextInt(); 
		end = scan.nextInt();
		   

		for (int i = start; i < end; i++) {

			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;

		}
		
		// fibonacci is a+b=c then rolling over through iteration, a becomes b then b becomes c then added again, over and over
		// until start and end of iteration which is entered by the user is fullfilled. 
		System.out.println();
		System.out.println("===================================\n\n");
		
		
//		2.) Determine whether a user entered number is an Armstrong number(example: 153 or 371)	
		
		
		
		System.out.println("Enter numbers up to 3 digits to be tested if it is an Armstrong Number ");
		Scanner scan2 = new Scanner(System.in);
		
		int userInput;
		userInput = scan2.nextInt();
		
		
		int valueHolder = userInput;
		int cube;
		int sum = 0;
		
		
		while (userInput > 0) {
			
		cube = userInput % 10;
		userInput = userInput / 10;
		sum = sum + cube*cube*cube;
		}
		
		if(valueHolder == sum) 
			System.out.println(" ^ is an Armstrong Number");
		else 
			System.out.println(" ^ is NOT an Armstrong Number: ");
		
		
		//while loop over input, get remainder /10, get cube by multiplying 3 times and add together as sum.
		// if total of cubed values is equal to userInput, then number is an Armstron number.
		System.out.println();
		System.out.println("===================================\n\n");

//		3.) Write a program to see if a user entered string is a palindrome or not		

		System.out.println("Enter a string below to be tested whether it is a PALINDROME or not");
		System.out.println("Palindrome string examples: civic, level, radar, rotor.");
		Scanner scan3 = new Scanner(System.in);
		
		String inputString;
		
		inputString = scan3.next();
		
		String stringHolder = inputString;
		String reverse = "";
		
		int stringLength = inputString.length();
		
			for(int i = stringLength -1; i >= 0; i-- ) {
				reverse = reverse + inputString.charAt(i);
			}
			if(stringHolder.equals(reverse)) {
				System.out.println(stringHolder + " is a PALINDROME string");
			}
			else {
				System.out.println(stringHolder + " is NOT a PALINDROME string");
			}
		
		
		// put user input string in a holder, loop and reverse based on length, match string in holder and reversed version with equals
		
		scan.close();
	
	}

}

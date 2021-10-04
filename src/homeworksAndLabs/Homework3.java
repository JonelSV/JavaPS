package homeworksAndLabs;

import java.util.Scanner;


// Calculator that can continuously run calculations by entering "yes" after every completed computation.
// This is done via a do while loop in the main method.
// All operation methods are outside and returning output in the main.
// I have incluuded and exit function using System.exit to terminate the program whenever the user intends to.


public class Homework3 {
	
	public static void main(String[] args) {
		String next;
		Scanner scan = new Scanner(System.in);
		
		
			do {
		
				System.out.println("Enter the operation you want to perform( +, -, *, /):");
				char operator;
				operator = scan.next().charAt(0);
				
				System.out.println("Enter TWO numbers to be calculated");
				
				
				double num1 = scan.nextDouble();
				double num2 = scan.nextDouble();
				
				switch(operator) {
				case '+':
					System.out.println("The sum is: " + add(num1, num2));
					break;
				case '-':
					System.out.println("The difference is: " + subtract(num1, num2));
					break;
				case '*':
					System.out.println("The product is: " + multiply(num1, num2));
					break;
				case '/':
					System.out.println("The qoutient is: " + divide(num1, num2));
					break;
				default:
					System.out.println("INVALID entry, Please try again");
				}
				System.out.println("Type the word (yes) to do another calculation, otherwise press (n) to exit");
				next = scan.next();
			} while (next.equals("yes"));
			
			
			
				System.out.println("Press n again to confirm and exit the program");
				char exit;
				exit = scan.next().charAt(0);
				
				if(exit == 'n') {
				System.exit(0);
				}else {
					System.out.println("Invalid Entry, please try again");
				}
					
		
			scan.close();
		}
	
			public static double add(double num1, double num2) {
				double output;
				output = num1 + num2;
				return output;
			}
			
				
			public static double subtract(double num1, double num2) {
				double output;
				output = num1 - num2;
				return output;	
			}
			public static double multiply(double num1, double num2) {
				double output;
				output = num1 * num2;
				return output;
			}
			public static double divide(double num1, double num2) {
				double output;
				output = num1 / num2;
				return output;
			}
			
				
	}




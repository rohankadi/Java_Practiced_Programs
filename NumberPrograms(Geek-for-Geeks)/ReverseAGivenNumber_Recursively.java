package com.kn.javaNumberPrograms;

import java.util.Scanner;

public class ReverseAGivenNumber_Recursively {
	
	// driver code
	public static void main(String args[]) {
		// number to be reversed
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to be reversed = ");
		int num = scan.nextInt();

		
		System.out.print("Reversed Number: ");
		
		// calling recursive function
		// to print the number in
		// reversed form
		Reverse(num);
		
		scan.close();
	}

	
	// Recursive function to print
	// the number in reversed form
	public static void Reverse(int num) {

		// base condition to end recursive calls
		if (num < 10) {
			System.out.println(num);
			return;
		}

		else {

			// print the unit digit of the given number
			System.out.print(num % 10);

			// calling function for remaining number other
			// than unit digit
			Reverse(num / 10);
		}
	}


}

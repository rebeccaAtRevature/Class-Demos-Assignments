package FlowControlAndLoops;

import java.util.Scanner;

public class LogicProcessFlowPractice {
	// Method 1
	public static String checkForGreaterof2(int num1, int num2) {
		// Method 1
		// print the greater of 2 numbers
		
		// Initialize output variable
		String output = "";
		
		// Use logical operators to determine which is greater
		if(num1 > num2) {
			output = num1 + " is greater than " + num2;
		}else if(num2 > num1) {
			output = num2 + " is greater than " + num1;
		}else {
			// If both values are equal, output an error
			output = "Error: Neither number is greater than the other";
		}
		// send output to be printed back to main
		return output;
	}
	public static String checkForGreaterof3(int num1, int num2, int num3) {
		// Method 2
		// print the greater of 3 numbers

		String output = "";
		
		// determine the greatest of three numbers with different values
		if(num1 != num2 && num1 != num3 && num2 != num3) {
			if(num1 > num2 && num1 > num3) {
				output = num1 + " is greater than " + num2 + " and " + num3;
			}else if(num2 > num1 && num2 > num3) {
				output = num2 + " is greater than " + num1 + " and " + num3;
			}else if(num3 > num1 && num3 > num2) {
				output = num3 + " is greater than " + num1 + " and " + num2;
			}
		// If all three numbers have the same value, print an error
		}else if(num1 == num2 && num1 == num3 && num2 == num3) {
			output = "Error: Neither number is greater than the other";
		// If two values are the same, determine which is greater of the two that differ
		}else if(num1 == num2) {
			if(num1 > num3) { // 1 & 2 are equal, are they both greater than 3?
				output =  num1 + " and " + num2 + " are greater than " + num3;
			}else {
				output = num3 + " is greater than " + num1 + " and " + num2;
			}
		}else if(num1 == num3) {
			if(num1 > num2) { // 1 & 3 are equal, are the both greater than 2?
				output =  num1 + " and " + num3 + " are greater than " + num2;
			}else {
				output = num2 + " is greater than " + num1 + " and " + num3;
			}
		}else if(num3 == num2) {
			if(num2 > num1) { // 2 & 3 are equal, are they both greater than 1?
				output =  num3 + " and " + num2 + " are greater than " + num1;
			}else {
				output = num1 + " is greater than " + num3 + " and " + num2;
			}
		}
		// send output to be printed back to main
		return output;
	}
	public static String evenOrOdd(int num) {
		// Method 3
		// check if even or odd
		
		// Initialize output string
		String output = "";
		
		// Use modulus to determine if divisible by 2
		// if remainder is zero then number is ever
		if(num % 2 == 0) {
			output = num + " is an even number";
		}else {
			output = num + " is an odd number";
		}
		
		// send output to be printed back to main
		return output;
		
	}
	public static StringBuffer oddUpToN(int num) {
		// Method 4
		// print odd numbers up to N
		int i = 0;
		StringBuffer output = new StringBuffer("Method 4: ");
		for(i = 1; i <= num; i = i + 2) {
			output = output.append(i + ", ");
		}
		// Truncate output string to remove final ", "
		int lengthOfOutput = output.length() - 2;
		output.setLength(lengthOfOutput);
		// send output to be printed back to main
		return output;
	}
	public static StringBuffer factorialOfN(int num) {
		// Method 5
		// Print factorial of N
		
		// Initialize the variable for the factorial
		int factorial = 1;
		
		StringBuffer output = new StringBuffer("Method 5: ");
		
		// Multiply the number by the next number down on the number line each loop
		for(int i = 0; i < num; i++) {
			factorial *= (num - i);
			output = output.append(factorial + ", ");
		}
		// Truncate output string to remove final ", "
		int lengthOfOutput = output.length() - 2;
		output.setLength(lengthOfOutput);
		// send output to be printed back to main
		return output;
		
		// breaks at values over 12 - negative number appear -- how is that possible?
	}
	public static String checkForPrime(int num) {
		// Method 6
		// Check for prime number
		
		// Initialize output statement
		String output = "Method 6: ";
		
		// Initialize boolean for prime
		boolean prime = true;
		
		// Outer loop will run through every number greater than 2 up to N
		for(int i = 2; i <= num; i++) {
			// Inner loop will check if the outer loop value is ever divisible by a number besides itself or 1
			for(int j = 2; j < i; j++) {
				
				if (i % j == 0) {
					// If modulus is zero, the number is divisible and thus is not a prime number
					prime = false;
				}
		
			}
			
			// If the number was divisible by and number other than one or itself prime will be false 
			// and the if statement will not execute
			if(prime == true) {
					output += i + " is a prime number. ";
			}else {
				// Set prime back to true until proven wrong in a future loop
				prime = true;
			}
		}	
		return output;
	}
	public static String sumOfDigits(int num) {
		// Method 7
		// print the sum of the digits of a number. 567 should be 18
		int sum = 0;
		int digit = 0;
		while(num > 0) {
			// find the value of the digit at the end
			digit = num % 10;
			// Add the value of the end digit to the sum
			sum += digit;
			// divide by 10 to remove final digit. should truncate rounding down
			num = num / 10;
		}
		// Create statement to be printed to the console and send to main
		String output = "Method 7: " + sum;
		return output;
	}
	public static StringBuffer fibonacci(int num) {
		// Method 8
		// Add the previous two numbers in a series to find the next one
		
		// Previous two numbers
		int fib1 = 1;
		int fib2 = 0;
		// Next value in the series
		int fibonacci = 1;
		StringBuffer output = new StringBuffer("Method 8: ");
		// for loop will determine the next fibonacci number for N values
		for(int i = 0; i < num; i++) {
			// If statement to supress the output of fibonacci values less than N
			if(fibonacci <= num) {
				output = output.append(fibonacci + ", ");
			}
			// Determine the next value in the sequence by adding the previous two
			fibonacci = fib1 + fib2;
			// Update the previous two values by sliding them forward one value
			fib2 = fib1;
			fib1 = fibonacci;
		}
		// Truncate output string to remove final ", "
		int lengthOfOutput = output.length() - 2;
		output.setLength(lengthOfOutput);
		// Send output to main
		return output;
		
		// code breaks after 89, numbers go negative
	}

	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		// Ask user for an integer
		System.out.println("Please enter an integer: ");
		int num1 = sc.nextInt();
		System.out.println("Please enter an integer: ");
		int num2 = sc.nextInt();
		System.out.println("Please enter an integer: ");
		int num3 = sc.nextInt();
		
		sc.close();
		
		// Method Invocation
		String output1 = checkForGreaterof2(num1, num2);
		String output2 = checkForGreaterof3(num1, num2, num3);
		String output3 = evenOrOdd(num1);
		StringBuffer output4 = oddUpToN(num1);
		StringBuffer output5 = factorialOfN(num1);
		String output6 = checkForPrime(num1);
		String output7 = sumOfDigits(num1);
		StringBuffer output8 = fibonacci(num1);
		
		System.out.println("Method 1: " + output1);
		System.out.println("Method 2: " + output2);
		System.out.println("Method 3: " + output3);
		System.out.println("Method 4: " + output4);
		System.out.println("Method 5: " + output5);
		System.out.println("Method 6: " + output6);
		System.out.println("Method 7: " + output7);
		System.out.println("Method 8: " + output8);
	}

}

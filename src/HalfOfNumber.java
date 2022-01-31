import java.util.Scanner;

public class HalfOfNumber {
	// Method Definiton
	public static double halfOfNum(double num) {
		// Process
		double half = num/2;
		return half;
	}
	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		double number = sc.nextDouble();
		sc.close();
		// Method invocation
		double half = halfOfNum(number);
		
		// Output
		System.out.println("Half of " + number + " is : " + half);
	}

}

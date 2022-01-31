// write a program to find the square of a number

//input
//process
//output

public class MethodDemo {
	
	// Method definition
	public static int squareOfNumber(int num) {
		// process
		int ans = num * num;
		return ans;

	}
	
	public static void main(String[] args) {
		// input
		int number = 30;
		
		// method invocation
		int myAnswer = squareOfNumber(number);
		
		// output
		System.out.println("Square of " + number + " is " + myAnswer);

	}

}

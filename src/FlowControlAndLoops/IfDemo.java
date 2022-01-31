package FlowControlAndLoops;

public class IfDemo {

	public static void main(String[] args) {
		// Program to check if a number is greater than 10
		
		// Input
		int number = 5;
		String output = "";
		// process - logic
		if (number > 10) {
			output = number + " is greater than 10";
		} else {
			output = number + " is less than or equal to 10";
		}
		
		// Output
		System.out.println(output);

	}

}

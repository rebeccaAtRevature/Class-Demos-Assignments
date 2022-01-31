package FlowControlAndLoops;

public class ElseIfLadderDemo {

	public static void main(String[] args) {
		// program to check if a number is less than 0 or between 1 and 100 or greater than 100
		
		// Input
		int number = 30;
		String output = "";
		
		// Process
		if(number < 0) {
			output = number + " is less than 0";
		}else if(number >= 1 && number <=100) {
			output = number + " is between 1 and 100";
		}else if(number>100) {
			output = number + " is greater than 100";
		}
		
		// Output
		System.out.println(output);

	}

}

package FlowControlAndLoops;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// Check if char is vowel
		
		//Input
		char letter = 'h';
		String output = "";
		
		// Process
		// switch may only compare a char or an int 
		switch(letter) {
			case 'a','e','i','o','u':
				output = "Vowel";
				break;
/*			case 'e':
				output = "Vowel";
				break;
			case 'i':
				output = "Vowel";
				break;
			case 'o':
				output = "Vowel";
				break;
			case 'u':
				output = "Vowel";
				break;				*/
			default :
				output = "Not a Vowel";
		}
		
		// Output
		System.out.println(letter + ": " + output);
	}

}

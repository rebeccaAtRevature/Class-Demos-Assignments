
public class asciiOfCharacter {
	
	// Method definition
	public static int  asciiOfChar(char a) {
		int asciiValue = a;
		return asciiValue;
	}

	public static void main(String[] args) {
		// Input
		char a = 'C';
		
		// Method Invocation
		int ascii = asciiOfChar(a);
		
		// Output
		System.out.println("The ascii number of '" + a + "' is : " + ascii);
	}

}

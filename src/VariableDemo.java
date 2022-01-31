
public class VariableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 8 primitive data types
		
		// byte - 1 byte - whole numbers
		// short - 2 bytes
		// int - 4 bytes
		// long - 8 bytes
		
		// float - decimal numbers
		// double
		
		// boolean - true or false
		
		// char - single character
		
		// declare a variable
		int englishMark;
		
		// assign a value to a variable
		englishMark = 20;
		
		// initialize a variable
		int mathMark = 50;
		
		System.out.println("English Mark : " + englishMark);
		System.out.println("Math Mark : " + mathMark);
		
		short test = 4567;
		
		long longTest = 234567890;
		
		boolean flag = true;
		boolean result = false;
		
		System.out.println("Flag is : " + flag);
		System.out.println("Result is : " + result);
		
		char option = 'y';
		System.out.println("option is : " + option);
		
		//type casting
		byte data = 45;
		int myData = data; //implicit casting
		
		byte smallData = (byte) myData; // explicit casting
		// if variable is larger than byte capacity, variable will be truncated
		
		double socialMark = 45.67;
		
		// float scienceMark = 56.78;
		/* Gives error because numbers with 2 decimal points 
		 * are by default double and require explicit casting
		 *  to be made float literals*/
		
		// float scienceMark = (float)56.78; // valid
		// float scienceMark = 56.78f; // valid
		float scienceMark = 56.78F;
		
	}

}

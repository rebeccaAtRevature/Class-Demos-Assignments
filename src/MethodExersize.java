
public class MethodExersize {
		// Method Definition
		public static double CtoF(double T) {
			double TinF = T*(9/5) + 32;
			return TinF;
		}
		
		// Second Method
		public static double kmTOm(double km) {
			double miles = km * 0.621371;
			return miles;	
		}
		
		// Third Method
		public static int  asciiOfChar(char a) {
			int asciiValue = a;
			return asciiValue;
		}
		
		// Fourth Method
		public static double halfOfNum(double num) {
			double half = num/2;
			return half;
		}
		// Fifth Method
		public static int cubeOfNum(int num) {
			int cube = num*num*num;
			return cube;
		}

	public static void main(String[] args) {
		// Input
		double TinC = 20;
		double kilom = 100;
		char a = 'C';
		double number = 7;
		int num = 3;
				
		// Method Invocation
		double TinF = CtoF(TinC);
		double miles = kmTOm(kilom);
		int ascii = asciiOfChar(a);
		double half = halfOfNum(number);
		int cubic = cubeOfNum(num);
				
		// Output
		System.out.println("The temperature in Fahrenheit is : " + TinF);
		System.out.println(kilom + " kilometers is equivalent to " + miles + " miles.");
		System.out.println("The ascii number of '" + a + "' is : " + ascii);
		System.out.println("Half of " + number + " is : " + half);
		System.out.println("The cube of " + number + " is " + cubic);
	}

}


public class CelsiusToFarenheit {
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
		
	public static void main(String[] args) {
		// Input
		double TinC = 20;
		double kilom = 100;
		
		// Method Invocation
		double TinF = CtoF(TinC);
		double miles = kmTOm(kilom);
		
		// Output
		System.out.println("The temperature in Fahrenheit is : " + TinF);
		System.out.println(kilom + " kilometers is equivalent to " + miles + " miles.");
	}

}

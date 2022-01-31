package FlowControlAndLoops;

public class ForDemo {

	public static void main(String[] args) {
		// print all even numbers up to N
		
		// Input
		int number = 30;
		
/*		for(int i=1; i<=number; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}								*/
		
		for(int i=2; i<=number; i=i+2) {
			System.out.println(i);
		}
	}

}

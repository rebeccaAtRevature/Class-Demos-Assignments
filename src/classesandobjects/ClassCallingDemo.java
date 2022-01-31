package classesandobjects;

import java.util.Scanner;

public class ClassCallingDemo {

	public static void main(String[] args) {
		// instantiate the BankAccount class
		BankAccount bankAccount = new BankAccount();
		
		System.out.println(bankAccount.createAccount());
		System.out.println(bankAccount.deposit(200));
		System.out.println(bankAccount.widthdraw(100));
		System.out.println(bankAccount.accountBalance());
		
		System.out.println("__________________________");
		
		Room room = new Room();
		
		// Instantiate local variables
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the height of the walls in ft: ");
		double heightOfWalls = sc.nextDouble();
		System.out.println("Please input the width of the walls in ft: ");
		double widthOfWalls = sc.nextDouble();
		System.out.println("Please provide the number of walls: ");
		int numberOfWalls = sc.nextInt();
		System.out.println("Please input the desired color of the walls : ");
		String newColor = sc.nextLine();
		sc.close();
		
		System.out.println("The wall area is : " + room.calculateWallArea(numberOfWalls, heightOfWalls, widthOfWalls));
		System.out.println("The wall area is : " + room.calculateFloorArea(widthOfWalls));
		System.out.println("The total cost of painting the room " + newColor + " is : " + room.predictCostOfPainting(newColor));
	}
	
}

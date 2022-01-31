package classesandobjects;
// I go to the bank and I should be able to create a new account, 
// should be able to check the balance in my account, 
// I should be able to withdraw money from my account.

public class BankAccount {
	// Instance variables
	int userID = 000000;
	double accountBalance;
	
	// Method to create bank account
	String createAccount() {
		// Want to randomly generate a UserID with 6 digits
		for (int i = 0; i <= 6; i++) {
			// Generate random integer between 1 and 10
			int nextDigit = (int)Math.floor(Math.random()*10 + 1);
			// Moves previous values up one decimal place
			userID *= 10;
			// Add the new randomly generated digit
			userID += nextDigit;;
		}
		return "Account created. UserID is : " + userID;
	}
	
	String deposit(double depositAmount) {
		accountBalance += depositAmount;
		return "$" + depositAmount + " deposited to account";
	}

	String widthdraw(double widthdrawlAmount) {
		accountBalance -= widthdrawlAmount;
		return "$" + widthdrawlAmount + " widthdrawn from account";
	}
	
	String accountBalance() {
		return "Account balance is : " + accountBalance;
	}
	
}

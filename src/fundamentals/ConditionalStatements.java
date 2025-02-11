package fundamentals;

public class ConditionalStatements {

	static int balance = 100000;

	public void deposit(String accountType, int depositAmount) {

		switch (accountType) {
		case "SAVINGS":
			if (depositAmount <= 200000) {
				BankTransactions.balance = BankTransactions.balance + depositAmount;
			} else {
				System.out.println("Maximum Deposit amount limit for SAVINGS account is: 200000");
			}
			break;
		case "CURRENT":
			if (depositAmount <= 500000) {
				BankTransactions.balance = BankTransactions.balance + depositAmount;
			} else {
				System.out.println("Maximum Deposit amount limit for CURRENT account is: 500000");
			}
			break;
		case "RETAIL":
			if (depositAmount <= 1000000) {
				BankTransactions.balance = BankTransactions.balance + depositAmount;
			} else {
				System.out.println("Maximum Deposit amount limit for RETAIL account is: 1000000");
			}
			break;
		default:
			System.out.println("Incorrect account typeis selected");
		}

	}

	public void withdrawl(String accountType, int withdrawlAmount) {

		if (withdrawlAmount < balance) {
			switch (accountType) {
			case "SAVINGS":
				if (withdrawlAmount <= 50000) {
					BankTransactions.balance = BankTransactions.balance - withdrawlAmount;
				} else {
					System.out.println("Daily Withdrawllimit for SAVINGS account is : 50000");
				}
				break;

			case "CURRENT":
				if (withdrawlAmount <= 200000) {
					BankTransactions.balance = BankTransactions.balance - withdrawlAmount;
				} else {
					System.out.println("Daily Withdrawllimit for CURRENT account is : 200000");
				}
				break;
			case "RETAIL":
				if (withdrawlAmount <= 500000) {
					BankTransactions.balance = BankTransactions.balance - withdrawlAmount;
				} else {
					System.out.println("Daily Withdrawllimit for RETAIL account is : 500000");
				}
				break;
			default:
				System.out.println("Incorrect account type is selected, Please choose SAVINGS/CURRENT/RETAIL");
				break;
			}

		} else {
			System.out.println("Insufficient Balance");
		}
	}

	public void displayBalance() {
		System.out.println("Balance: " + BankTransactions.balance);
	}

	public static void main(String[] args) {
		ConditionalStatements sbiBank = new ConditionalStatements();
		sbiBank.withdrawl("SAVINGS", 40000);
		sbiBank.displayBalance();

	}

}

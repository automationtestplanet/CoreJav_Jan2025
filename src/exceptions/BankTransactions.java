package exceptions;

public class BankTransactions {

	static int balance = 100000;

	public void deposit(AccountType accountType, int depositAmount) {

		switch (accountType) {
		case SAVINGS:
			if (depositAmount <= 200000) {
				BankTransactions.balance = BankTransactions.balance + depositAmount;
			} else {
				throw new BankTransactionException("Maximum Deposit amount limit for SAVINGS account is: 200000");
			}
			break;
		case CURRENT:
			if (depositAmount <= 500000) {
				BankTransactions.balance = BankTransactions.balance + depositAmount;
			} else {
				throw new BankTransactionException("Maximum Deposit amount limit for CURRENT account is: 500000");
			}
			break;
		case RETAIL:
			if (depositAmount <= 1000000) {
				BankTransactions.balance = BankTransactions.balance + depositAmount;
			} else {
				throw new BankTransactionException("Maximum Deposit amount limit for RETAIL account is: 1000000");
			}
			break;
		default:
			throw new BankTransactionException("Incorrect account typeis selected");
		}

	}

	public void withdrawl(AccountType accountType, int withdrawlAmount) {

		if (withdrawlAmount < balance) {
			switch (accountType) {
			case SAVINGS:
				if (withdrawlAmount <= 50000) {
					BankTransactions.balance = BankTransactions.balance - withdrawlAmount;
				} else {
					throw new BankTransactionException("Daily Withdrawllimit for SAVINGS account is : 50000");
				}
				break;

			case CURRENT:
				if (withdrawlAmount <= 200000) {
					BankTransactions.balance = BankTransactions.balance - withdrawlAmount;
				} else {
					throw new BankTransactionException("Daily Withdrawllimit for CURRENT account is : 200000");
				}
				break;
			case RETAIL:
				if (withdrawlAmount <= 500000) {
					BankTransactions.balance = BankTransactions.balance - withdrawlAmount;
				} else {
					throw new BankTransactionException("Daily Withdrawllimit for RETAIL account is : 500000");
				}
				break;
			default:
				throw new BankTransactionException(
						"Incorrect account type is selected, Please choose SAVINGS/CURRENT/RETAIL");
			}

		} else {
			throw new BankTransactionException("Insufficient Balance");
		}
	}

	public void displayBalance() {
		System.out.println("Balance: " + BankTransactions.balance);
	}

}

package fundamentals;

public class BankTransactions {

	static int balance = 100000;

	public void deposit(int depositAmount) {
		BankTransactions.balance = BankTransactions.balance + depositAmount;
	}

	public void withdrawl(int withdrawlAmount) {
		BankTransactions.balance = BankTransactions.balance - withdrawlAmount;
	}

	public void displayBalance() {
		System.out.println("Balance: " + BankTransactions.balance);
	}

	public static void main(String[] args) {

		BankTransactions iciciBank = new BankTransactions();
		iciciBank.deposit(10000);
		iciciBank.displayBalance();

		BankTransactions sbiBank = new BankTransactions();
		sbiBank.withdrawl(20000);
		sbiBank.displayBalance();

	}

}

package exceptions;

public class UseBankTransactions {

	public static void main(String[] args) {
		BankTransactions sbiBank = new BankTransactions();
		sbiBank.withdrawl(AccountType.SAVINGS, 6000000);
		sbiBank.displayBalance();

	}
}

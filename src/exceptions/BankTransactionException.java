package exceptions;

public class BankTransactionException extends RuntimeException {

	public BankTransactionException(String exceptionMesage) {
		System.out.println(exceptionMesage);
	}
}

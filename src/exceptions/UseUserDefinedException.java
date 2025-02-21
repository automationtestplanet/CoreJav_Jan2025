package exceptions;

public class UseUserDefinedException {

	public static void display(int a) throws UserDefinedException {
		if(a >= 100)
			System.out.println(100);
		else
			throw new UserDefinedException();
	}
	
	public static void main(String[] args) throws UserDefinedException {
		display(99);
	}

}

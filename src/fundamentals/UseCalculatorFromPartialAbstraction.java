package fundamentals;

import oops.abstraction.PartialAbstraction;
import oops.abstraction.UsePartialAbstraction;

public class UseCalculatorFromPartialAbstraction {

	public static void main(String[] args) {
		
		 PartialAbstraction partialAbsCls = new UsePartialAbstraction();
		 System.out.println(partialAbsCls.addition(10, 20));
		 System.out.println(partialAbsCls.mulplication(10, 20));
	}

}

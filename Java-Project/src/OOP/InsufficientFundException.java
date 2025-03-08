

public class InsufficientFundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double amount;
	InsufficientFundException(double amt){
		amount = amt;
	}
}


public class CheckPrimeNumber {


	/**
	 * Check if a number is prime number or not.
	 * @param number
	 * @return prime or not
	 */
	//TODO:
	public boolean isNumberPrime(int number) {
		return false;
	}

	public static void main(String[] args) {
		CheckPrimeNumber instance = new CheckPrimeNumber();
		int number = 33;
		boolean isPrime = instance.isNumberPrime(number);
		System.out.printf("Number %d is %s",  number, isPrime).println();
		
	}

}
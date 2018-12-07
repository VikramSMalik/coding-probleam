package dcp;

/**
 * This problem was asked by Google.
 * 
 * Implement integer exponentiation. That is, implement the pow(x, y) function,
 * where x and y are integers and returns x^y.
 * 
 * Do this faster than the naive method of repeated multiplication.
 * 
 * For example, pow(2, 10) should return 1024.
 * 
 * Power(a,b)={ 1 if b=0, a*power(a,b-1) if b is odd, power(a,b/2)2 if b is even }
 * 
 * @author vikram.singh
 *
 */

public class IntegerExponentiation {

	public static void main(String[] args) {
		System.out.println(power(2,10));

	}

	public static long power(int a, int b) {
		if (b == 0) {
			return 1;
		} else if (b % 2 == 1) {
			return a * power(a, b - 1);
		} else {
			long p = power(a, b / 2);
			return p * p;
		}
	}

}

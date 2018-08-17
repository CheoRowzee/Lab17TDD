

package com.prime;

public class PrimeTest {
	

	public static boolean isPrime1(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

}

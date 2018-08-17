package com.prime;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PrimeTestCase {

	@Test
	public void Prime1() {
		assertEquals(primeNumList(1), PrimeTest.isPrime1(2));
	}
	
	@Test
	public void Prime2() {
		assertEquals(primeNumList(2), PrimeTest.isPrime1(3));
	}
	
	@Test
	public void Prime3() {
		assertEquals(primeNumList(3), PrimeTest.isPrime1(5));
	}
	
	@Test
	public void Prime4() {
		assertEquals(primeNumList(4), PrimeTest.isPrime1(7));
	}

	private List<Integer> primeNumList(int num) {
		List<Integer> prime = new ArrayList<>();
		for (int i = 0; i <= 1000; i++) {
			int counter = 0;

			for (num = i; num >= 0; num--) {
				if (i % num == 0) {
					counter += 1;
				}
			}
			if (counter == 0) {
				prime.add(i);
			}

		}
		return prime;
	}

}

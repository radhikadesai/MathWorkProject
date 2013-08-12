package com.NumberGame.NumberGame;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFilter implements IFilter {
	List<Integer> primeNumbers = new ArrayList<Integer>();

	public List<Integer> filterNumbers(List<Integer> numbers) {
		for (Integer number : numbers) {
			int flag = 0;
			if (number == 1) {

			} else if (number == 2) {
				primeNumbers.add(number);
			} else {
				for (int i = 2; i <= number / 2; i++) {
					if (number % i == 0) {
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					primeNumbers.add(number);
				}
			}
		}
		return primeNumbers;
	}

}

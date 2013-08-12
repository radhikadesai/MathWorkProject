package com.NumberGame.NumberGame;

import java.util.ArrayList;
import java.util.List;

public class MathWork {

	List<Integer> numbers;

	public MathWork(List<Integer> numbers) {
		this.numbers = numbers;
	}

	public List<Integer> filter(IFilter... filters) {

		List<Integer> filteredNumbers = numbers;
		for (IFilter filter : filters) {
			if (filteredNumbers.size() > 0) {
				filteredNumbers = filter.filterNumbers(filteredNumbers);
			}
		}

		return filteredNumbers;
	}

}

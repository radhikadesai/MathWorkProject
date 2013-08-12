package com.NumberGame.NumberGame;

import java.util.ArrayList;
import java.util.List;

public class RangeFilter implements IFilter {

	int min;
	int max;
	public RangeFilter(int min, int max) {
		this.min=min;
		this.max=max;
	}

	public List<Integer> filterNumbers(List<Integer> numbers) {
		List<Integer> rangeNumbers = new ArrayList<Integer>();
		for (Integer number : numbers) {
			if(number>=min&&number<=max)
			{
				rangeNumbers.add(number);
			}
		}
		return rangeNumbers;
	}

}

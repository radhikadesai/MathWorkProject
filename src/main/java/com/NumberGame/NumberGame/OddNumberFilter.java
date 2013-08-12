package com.NumberGame.NumberGame;

import java.util.ArrayList;
import java.util.List;

public class OddNumberFilter implements IFilter {

	public List<Integer> filterNumbers(List<Integer> numbers) {
		List<Integer> oddNumbers= new ArrayList<Integer>();
		for (Integer number : numbers) {
			if(number%2!=0)
			{
				oddNumbers.add(number);
			}
			
		}
		return oddNumbers;
	}
}

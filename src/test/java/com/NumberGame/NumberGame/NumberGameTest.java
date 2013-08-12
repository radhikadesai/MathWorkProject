package com.NumberGame.NumberGame;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class NumberGameTest extends TestCase {

	@Test
	public void testDisplaysPrimeNumbers() throws Exception {
		//Given 
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		MathWork mathWork=new MathWork(numbers);
		IFilter primeNumberFilter= new PrimeNumberFilter(); 
		List<Integer> expectedOutput=Arrays.asList(2, 3, 5, 7, 11, 13 );
		//When
		List<Integer> actualOutput=mathWork.filter(Filter.PRIME);
		//Then
		Assert.assertEquals(expectedOutput, actualOutput);
	}
	@Test
	public void testDisplaysOddNumbers() throws Exception {
		//Given 
				List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
				MathWork mathWork=new MathWork(numbers);
				IFilter oddNumberFilter= new OddNumberFilter(); 
				List<Integer> expectedOutput=Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15);
				//When
				List<Integer> actualOutput=mathWork.filter(oddNumberFilter);
				//Then
				Assert.assertEquals(expectedOutput, actualOutput);
	}
	@Test
	public void testDisplaysOddPrimeNumbers() throws Exception {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		MathWork mathWork=new MathWork(numbers);
		IFilter oddNumberFilter= new OddNumberFilter();
		IFilter primeNumberFilter= new PrimeNumberFilter();
		List<Integer> expectedOutput=Arrays.asList(3, 5, 7, 11, 13);
		//When
		List<Integer> actualOutput=mathWork.filter(oddNumberFilter,primeNumberFilter);
		//Then
		Assert.assertEquals(expectedOutput, actualOutput);
		
	}
	@Test
	public void testDisplaysNumbersWithinARange() throws Exception {
		//Given
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		MathWork mathWork=new MathWork(numbers);
		int min=5;
		int max=10;
		IFilter rangeFilter=new RangeFilter(min,max);
		List<Integer> expectedOutput=Arrays.asList(5,6,7,8,9,10);
		//When
				List<Integer> actualOutput=mathWork.filter(rangeFilter);
				//Then
				Assert.assertEquals(expectedOutput, actualOutput);
	}
	@Test
	public void testDisplaysOddPrimeNumbersWithinARange() throws Exception {
		//Given
		List<Integer> numbers=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35);
		MathWork mathWork=new MathWork(numbers);
		
		
		IFilter oddNumberFilter= new OddNumberFilter();
		IFilter primeNumberFilter= new PrimeNumberFilter();
		IFilter rangeFilter=new RangeFilter(2,31);
		List<Integer> expectedOutput=Arrays.asList(3, 5, 7, 11, 13, 17, 19, 23, 29, 31);
		//When
				List<Integer> actualOutput=mathWork.filter(oddNumberFilter,primeNumberFilter,rangeFilter);
				//Then
				Assert.assertEquals(expectedOutput, actualOutput);
	}
}

package com.mac.java.generics.types1;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildCardExample {

	public static void main(String[] args) {
		// Upper Bound WildCard
		// In upper bound we cannot add data but we can read data from.
		List<? extends Number> numberList = new ArrayList<>();
		// numberList.add(100);
		List<Integer> upperBoundData = new ArrayList<>();
		upperBoundData.add(500);
		numberList = upperBoundData;

		// Lower Bound WildCard
		// In Lower bound we can add data but we cannot read data from.
		List<? super Integer> integerList = new ArrayList<>();
		integerList.add(100);
		// integerList.get(0).

	}

}

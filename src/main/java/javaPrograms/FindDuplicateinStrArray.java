package javaPrograms;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateinStrArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArrays = { "Cabbage", "Kale", "Radish", "Onions", "Garlic", "Beetroot", "Cucumber", "Carrot",
				"Kale" };

		// First convert to List
		List<String> list = Arrays.asList(strArrays);

		// just empty HashSet object
		Set<String> set = new HashSet<String>();

		// iterate through List
		for (String str : list) {
			// add element to Set/HashSet

			boolean flagForDuplicate = set.add(str);

			if (!flagForDuplicate) {
				System.out.println(str + " is duplicate element");
			}

		}
	}
}

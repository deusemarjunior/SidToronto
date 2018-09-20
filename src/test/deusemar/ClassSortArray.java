package test.deusemar;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClassSortArray {

	/*
	 * 2. Write a function that takes array of strings as an argument and returns a
	 * new array that contains the same items as the original array, but in the
	 * following order: first, all strings that start with a digit (0-9), sorted in
	 * descendent order by their numeric value, then all strings that start with
	 * anything except the capital letter "P" in alphabetical order, and then all
	 * strings that start with the "P" in the order of the string length.
	 * 
	 * function sortIt(a) { // TODO return a; }
	 * 
	 * console.log(sortIt(['001', 'Alpha', 'Gamma', 'Peter', '432', 'Beta',
	 * 'Palindrome', '123.4', 'Pit'])); // should print ['432', '123.4', '001',
	 * 'Alpha', 'Beta', 'Gamma', 'Pit', 'Peter', 'Palindrome']
	 * 
	 * 
	 */

	private static List<String> sortIt(String... strings) {
		// TODO REFACTOR

		List<String> inputArray = Arrays.asList(strings);
		List<String> outputArray = new ArrayList<String>();
		List<Double> numberArray = new ArrayList<Double>();
		List<String> alphaArray = new ArrayList<String>();
		List<String> captPArray = new ArrayList<String>();

		for (String element : inputArray) {

			if (!element.chars().allMatch(Character::isAlphabetic)) {
				numberArray.add(Double.valueOf(element));
			} else {
				if (!element.startsWith("P")) {
					alphaArray.add(element);
				} else {
					captPArray.add(element);
				}
			}
		}

		Collections.sort(numberArray, new Comparator<Double>() {
			public int compare(Double i1, Double i2) {
				return i1 < i2 ? 0 : -1;
			}
		});

		Collections.sort(alphaArray);

		Collections.sort(captPArray, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.length() > s2.length() ? 0 : -1;
			}
		});

		for (Double num : numberArray) {
			outputArray.add(new DecimalFormat("0.##").format(num).toString());
		}
		outputArray.addAll(alphaArray);
		outputArray.addAll(captPArray);

		return outputArray;

	}

	public static void main(String[] args) {
		// List<String> arrayResut = sortIt("001", "Alpha", "Gamma", "Peter", "432",
		// "Beta", "Palindrome", "123.4", "Pit");
		List<String> arrayResut = sortIt("Xuxa", "12", "7", "20", "5", "Beta", "Astolfo", "Pinto", "123.4",
				"Paralelepipedo", "Zebra");

		System.out.println("Result Array =============");
		System.out.println(arrayResut.toString());

		System.out.println("Gabarito =============");
		// System.out.println("['432', '123.4', '001', 'Alpha', 'Beta', 'Gamma', 'Pit',
		// 'Peter', 'Palindrome']");
		System.out.println(
				"[ '123.4', '20', '12', '7', '5', 'Astolfo', 'Beta','Xuxa', 'Zebra', 'Pinto', 'Paralelepipedo']");

	}
}

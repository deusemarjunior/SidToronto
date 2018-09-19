package test.deusemar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ClassSortArray {

	/*
	2. Write a function that takes array of strings as an argument and returns a new
	array that contains the same items as the original array, but in the following
	order: first, all strings that start with a digit (0-9), sorted in descendent
	order by their numeric value, then all strings that start with anything except
	the capital letter "P" in alphabetical order, and then all strings that start
	with the "P" in the order of the string length.

	function sortIt(a) {
	  // TODO
	  return a;
	}

	console.log(sortIt(['001', 'Alpha', 'Gamma', 'Peter', '432', 'Beta', 'Palindrome', '123.4', 'Pit']));
	// should print ['432', '123.4', '001', 'Alpha', 'Beta', 'Gamma', 'Pit', 'Peter', 'Palindrome']

	
	/*
	
	private static List<String> sortIt(String... strings) {
		//TODO correct
		/* wrong
		List<String> inputArray = Arrays.asList(strings);
		List<String> outputArray = new ArrayList<String>();
		
		inputArray.sort(Comparator.naturalOrder());
		
		for (String element : inputArray) {
			
			if(!element.chars().allMatch(Character::isAlphabetic)){
				outputArray.add(0,element);
			}else{
				if(!element.startsWith("P")) {
					outputArray.add(element);
				}else {
					outputArray.add(outputArray.size(), element);
				}
			}
		}
		
		return outputArray;
		*/
	}
	
	public static void main(String[] args) {
		List<String> arrayResut = sortIt("001", "Alpha", "Gamma", "Peter", "432", "Beta", "Palindrome", "123.4", "Pit");
		
		System.out.println("Result Array =============");
		System.out.println(arrayResut.toString());
	
	}
}

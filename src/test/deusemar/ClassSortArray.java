package test.deusemar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ClassSortArray {

	private static List<String> sortIt(String... strings) {
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
	}
	
	public static void main(String[] args) {
		List<String> arrayResut = sortIt("001", "Alpha", "Gamma", "Peter", "432", "Beta", "Palindrome", "123.4", "Pit");
		
		System.out.println("Result Array =============");
		System.out.println(arrayResut.toString());
	
	}
}

package test.deusemar;

public class ClassPolidrome {

	private static String removeSpecialCharactheres(String word) {
	
		String regex = "[^a-zA-Z0-9]";
		return word.replaceAll(regex,"");
		 
	}
	
	private static boolean isPalindrome(String word) {
		
		if(word == null) {
			return false;
		}
		
		word = removeSpecialCharactheres(word);
		
		String ivertedWord = new StringBuilder(word).reverse().toString();
		
		if(word.equalsIgnoreCase(ivertedWord)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("A Santa dog lived as a devil God at NASA."));
	}

}

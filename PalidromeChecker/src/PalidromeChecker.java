
public class PalidromeChecker {

	public boolean isPalidrome(String string) {
		
		StringBuffer reverseString = new StringBuffer(string);
		reverseString.reverse();
		
		if (string.equalsIgnoreCase(reverseString.toString()))
			return true;
		return false;
	}

}

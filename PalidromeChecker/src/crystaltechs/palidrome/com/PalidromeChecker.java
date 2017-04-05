package crystaltechs.palidrome.com;

public class PalidromeChecker {

	public boolean isPalidrome(String string) 
	{
		return string.equalsIgnoreCase(getReversedString(string));
	}
	
	private String getReversedString(String string)
	{
		StringBuffer reverseString = new StringBuffer(string);
		reverseString.reverse();
		return reverseString.toString();
	}

}

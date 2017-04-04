import junit.framework.TestCase;

public class PalidromeCheckerTest extends TestCase {
		
	public void testIsObjectNull(){
		PalidromeChecker testObject = new PalidromeChecker();
		assertNotNull(testObject);
	}
	
	public void testIsStringPalidrome() throws Exception
	{
		PalidromeChecker testObject = new PalidromeChecker();
		assertTrue(testObject.isPalidrome("MOM"));
	}

	public void testIsNotStringPalidrome() throws Exception
	{
		PalidromeChecker testObject = new PalidromeChecker();
		assertFalse(testObject.isPalidrome("MOM"));
	}
	
}

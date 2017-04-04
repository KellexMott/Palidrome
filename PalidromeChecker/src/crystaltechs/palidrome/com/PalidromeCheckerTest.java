package crystaltechs.palidrome.com;
import junit.framework.TestCase;

public class PalidromeCheckerTest extends TestCase {
		
	PalidromeChecker testObject;
	public void setUp()
	{
		testObject = new PalidromeChecker();
	}
	public void testIsObjectNull(){
		
		assertNotNull(testObject);
	}
	
	public void testIsStringPalidrome() throws Exception
	{
		assertTrue(testObject.isPalidrome("MOM"));
	}

	public void testIsNotStringPalidrome() throws Exception
	{
		assertFalse(testObject.isPalidrome("DADDY"));
	}
	
}

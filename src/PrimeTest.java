import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 */

/**
 * @author Personal
 *
 */
public class PrimeTest extends TestCase {

	Prime _Prime;
	/**
	 * @param name
	 */
	public PrimeTest(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		_Prime = new Prime();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		_Prime = null;
	}

	/**
	 * Test method for {@link Prime#isPrime(double)}.
	 */
	public void testIsPrime() {
		boolean IsPrime;
		/**
		 * Test Case 1
		 * primality test [6473]
		 */
		IsPrime = _Prime.isPrime(6473);
		assertTrue(IsPrime);
		/**
		 * Test Case 1
		 * primality test [6474]
		 */
		IsPrime = _Prime.isPrime(6474);
		assertFalse(IsPrime);

		
	}
	
	public static Test suite(){
	      TestSuite suite = new TestSuite();
	      suite.addTest(new PrimeTest("testIsPrime"));
		return suite;
	}

}

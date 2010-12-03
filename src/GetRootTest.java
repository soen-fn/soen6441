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
public class GetRootTest extends TestCase {

	private GetRoot _GetRoot;
	/**
	 * @param name
	 */
	public GetRootTest(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		_GetRoot = new GetRoot();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		_GetRoot = null;
	}

	/**
	 * Test method for {@link GetRoot#Calculate(double, double)}.
	 */
	public void testCalculate() {
		double result;
		/**
		 * test case 1
		 *  prime:144, integral degree root:2
		 */
		result = _GetRoot.Calculate(144, 2);
		assertTrue(result==12.0);
		/**
		 * test case 2
		 *  prime:248832, integral degree root:5
		 */
		result = _GetRoot.Calculate(248832, 5);
		assertTrue(result==12.0);
		/**
		 * test case 3
		 *  prime:6899, integral degree root:5
		 */
		result = _GetRoot.Calculate(6899, 5);
		assertTrue(result==5.858106043083157);
		
	}
	
	public static Test suite(){
	      TestSuite suite = new TestSuite();
	      suite.addTest(new GetRootTest("testCalculate"));
		return suite;
	}

}

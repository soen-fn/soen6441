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
public class IPRxmlTest extends TestCase {
	private IPRxml _IPRxml;
	String fileDir, fileName;
	/**
	 * @param name
	 */
	public IPRxmlTest(String name) {
		super(name);
		fileDir = System.getProperty("user.dir");
		fileName = "IPR_Outputs.xml";
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		_IPRxml = new IPRxml(fileDir + "\\"+ fileName ,144,2);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		_IPRxml = null;
	}

	/**
	 * Test method for {@link IPRxml#WriteFile(int)}.
	 */
	public void testWriteFile() {
		/**
		 * Test Case 1
		 * XML file
		 */
		assertTrue(_IPRxml.WriteFile(1));
		/**
		 * Test Case 1
		 * HTML file
		 */
		assertTrue(_IPRxml.WriteFile(2));

	}
	
	public static Test suite(){
	      TestSuite suite = new TestSuite();
	      suite.addTest(new IPRxmlTest("testWriteFile"));
		return suite;
	}

}

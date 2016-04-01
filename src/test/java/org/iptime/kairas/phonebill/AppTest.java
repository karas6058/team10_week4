package org.iptime.kairas.phonebill;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
/*    
    public void testCuteCase(){
    	Calculator calc = new Calculator();
    	assertEquals(calc.goldCost(878, 4), 83.95);
    	assertEquals(calc.goldCost(1123, 1), 105.3);
    	assertEquals(calc.goldCost(1123, 4), 139.3);
    	assertEquals(calc.silverCost(523, 2), 63.87);
    	assertEquals(calc.silverCost(44, 5), 82.95);
    	assertEquals(calc.silverCost(521, 5), 94.29);
    }
    
*/
}
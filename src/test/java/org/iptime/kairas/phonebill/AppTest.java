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

    public void testCalculate1()
    {
    	Calculator calc = new Calculator();
    	calc.setAccount(new Account("gold",999,1));
    	calc.run();
    	assertEquals(49.95 ,calc.totalCost(), 0.05);
    }
    
    public void testCaculate2(){
    	Calculator calc = new Calculator();
    	calc.setAccount(new Account("gold", 1000, 1));
    	calc.run();
    	assertEquals(49.95 ,calc.totalCost(), 0.05);
    }
}
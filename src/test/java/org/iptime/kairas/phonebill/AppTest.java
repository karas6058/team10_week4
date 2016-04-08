package org.iptime.kairas.phonebill;

import org.junit.Ignore;

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
    
    public void testGoldMinuteOver1()
    {
    	Calculator calc = new Calculator();
    	calc.setAccount(new Account("gold",999,1));
    	calc.run();
    	assertEquals(49.95 ,calc.totalCost(), 0.05);
    }
    
    public void testGoldMinuteOver2(){
    	Calculator calc = new Calculator();
    	calc.setAccount(new Account("gold", 1000, 1));
    	calc.run();
    	assertEquals(49.95 ,calc.totalCost(), 0.05);
    }
    
    public void testGoldMinuteOver3(){
    	Calculator calc = new Calculator();
    	calc.setAccount(new Account("gold", 1001, 1));
    	calc.run();
    	assertEquals(50.40 ,calc.totalCost(), 0.05);
    }
    
    public void testGoldMinuteOver4(){
    	Calculator calc = new Calculator();
    	calc.setAccount(new Account("gold", 1010, 1));
    	calc.run();
    	assertEquals(54.45 ,calc.totalCost(), 0.05);
    }
    
    public void testSilverMinuteOver5(){
    	Calculator calc = new Calculator();
    	calc.setAccount(new Account("silver", 499, 1));
    	calc.run();
    	assertEquals(29.95 ,calc.totalCost(), 0.05);
    }
    
    public void testSilverMinuteOver6(){
    	Calculator calc = new Calculator();
    	calc.setAccount(new Account("silver", 500, 1));
    	calc.run();
    	assertEquals(29.95 ,calc.totalCost(), 0.05);
    }
    
    public void testSilverMinuteOver7(){
    	Calculator calc = new Calculator();
    	calc.setAccount(new Account("silver", 520, 1));
    	calc.run();
    	assertEquals(40.75 ,calc.totalCost(), 0.05);
    }
    
    public void testPlan(){
    	Plan plan = new Plan("Gold", 49.95, 14.50, 0.45, 1000){};
    	assertEquals("Gold", plan.PlanType());
    	assertEquals(49.95, plan.BasicMonthlyRate());
    	assertEquals(14.50, plan.RatePerAdditionalLine());
    	assertEquals(0.45, plan.RatePerExcessMinute());
    	assertEquals(1000, plan.IncludedMinutes());	
    	}
    
    public void testGold(){ 
    	Gold gold = new Gold();
    	assertEquals("Gold", gold.PlanType());
    	assertEquals(49.95, gold.BasicMonthlyRate());
    	assertEquals(14.50, gold.RatePerAdditionalLine());
    	assertEquals(0.45, gold.RatePerExcessMinute());
    	assertEquals(1000, gold.IncludedMinutes());	    	
    }
    
    public void testSilver(){ 
    	Silver silver = new Silver();
    	assertEquals("Silver", silver.PlanType());
    	assertEquals(29.95, silver.BasicMonthlyRate());
    	assertEquals(21.50, silver.RatePerAdditionalLine());
    	assertEquals(0.54, silver.RatePerExcessMinute());
    	assertEquals(500, silver.IncludedMinutes());	    	
    }
}
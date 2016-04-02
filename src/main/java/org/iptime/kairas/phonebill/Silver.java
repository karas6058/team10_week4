package org.iptime.kairas.phonebill;

public class Silver extends Plan{
	final static String PLAN_TYPE = "Silver";
	final static double BASIC_MONTHLY_RATE = 29.95;
	final static double RATE_PER_ADDITIONAL_LINE = 21.50;
	final static double RATE_PER_EXCESS_MINUTE = 0.54;
	final static int INCLUDED_MINUTES = 500;
	
	public Silver(){
		super(PLAN_TYPE, BASIC_MONTHLY_RATE, RATE_PER_ADDITIONAL_LINE, RATE_PER_EXCESS_MINUTE, INCLUDED_MINUTES);
	}
}

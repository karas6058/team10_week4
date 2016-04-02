package org.iptime.kairas.phonebill;

public class Gold extends Plan{
	final static String PLAN_TYPE = "Gold";
	final static double BASIC_MONTHLY_RATE = 49.95;
	final static double RATE_PER_ADDITIONAL_LINE = 14.50;
	final static double RATE_PER_EXCESS_MINUTE = 0.45;
	final static int INCLUDED_MINUTES = 1000;
	
	public Gold(){
		super(PLAN_TYPE, BASIC_MONTHLY_RATE, RATE_PER_ADDITIONAL_LINE, RATE_PER_EXCESS_MINUTE, INCLUDED_MINUTES);
	}
}
package org.iptime.kairas.phonebill;

public abstract class Plan {
	static final int LINE_AMOUNT_FOR_FAMILY_DISCOUNT = 4;
	static final double RATE_OF_FAMILY_DISCOUNT = 5.00;
	
	private String planType;
	private double basicMonthlyRate;
	private double ratePerAdditionalLine;
	private double ratePerExcessMinute;
	private int includedMinutes;
	
	private Plan(){
		//hide empty constructor
	}
	
	public Plan(String aPlanType, double aBasicMonthlyRate, double aRatePerAdditionalLine, double aRatePerExcessMinute, int aIncludedMinutes){
		planType = aPlanType;
		basicMonthlyRate = aBasicMonthlyRate;
		ratePerAdditionalLine = aRatePerAdditionalLine;
		ratePerExcessMinute = aRatePerExcessMinute;
		includedMinutes = aIncludedMinutes;
	}
	
	public String PlanType(){
		return planType;
	}
	
	public double BasicMonthlyRate(){
		return basicMonthlyRate;
	}
	
	public double RatePerAdditionalLine(){
		return ratePerAdditionalLine;
	}
	
	public double RatePerExcessMinute(){
		return ratePerExcessMinute;
	}
	
	public int IncludedMinutes(){
		return includedMinutes;
	}
}

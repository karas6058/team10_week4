package org.iptime.kairas.phonebill;

public abstract class Plan {
	protected String planType;
	protected float basicMonthlyRate;
	protected float ratePerExcessMinute;
	protected int includedMinutes;
	protected String Fomula;
	
	private Plan(){
		//hide empty constructor
	}
	
	public Plan(String aPlanType, float basicMonthlyRate, float aRatePerExcessMinute, int aIncludedMinutes, String aFomula){
		
	}
	
	public String getPlanType(){
		
	}
	
	public void setPlanType(String aPlan){
		
	}
	
	public double getBasicMonthlyRate(){
		
	}
	
	public void setBasicMonthlyRate(){
		
	}
	
	public double getRatePerExcessMinute(){
		
	}
	
	public void setRatePerExcessMinute(double aRateperExcessMinute){
		
	}
	
	public int getIncludedMinutes(){
		
	}
	
	public void setIncludedMinutes(int aIncludedMinutes){
		
	}
	
	public String getFomula(){
		
	}
	
	public void setFomula(){
		
	}
}

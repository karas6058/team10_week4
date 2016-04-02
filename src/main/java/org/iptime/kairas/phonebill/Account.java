package org.iptime.kairas.phonebill;

public class Account {
	private int numberOfLines;
	private int minutesUsed;
	private String planType;
	
	private Account(){
		//hide empty constructor
	}
	
	public Account(String aPlanType, int aMinutesUsed, int aNumberOfLines){
		planType = aPlanType;
		minutesUsed = aMinutesUsed;
		numberOfLines = aNumberOfLines;
	}
	
	public int getNumberOfLines(){
		return numberOfLines;
	}
	
	public void setNumberOfLines(int aNumberOfLines){
		numberOfLines = aNumberOfLines;
	}
	
	public int getMinutesUsed(){
		return minutesUsed;
	}
	
	public void setMinutesUsed(int aMinutesUsed){
		minutesUsed = aMinutesUsed;
	}
	
	public String getPlanType(){
		return planType;
	}
	
	public void setPlanType(String aPlanType){
		planType = aPlanType;
	}
}

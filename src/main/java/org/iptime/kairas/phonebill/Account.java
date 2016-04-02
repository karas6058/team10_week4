package org.iptime.kairas.phonebill;

public class Account {
	private int numberOfLines;
	private int minutesUsed;
	private String planType;
	
	private Account(){
		//hide empty constructor
	}
	
	public Account(String aPlanType, int aNumberOfLines, int aMinutesUsed){
		planType = aPlanType;
		numberOfLines = aNumberOfLines;
		minutesUsed = aMinutesUsed;
	}
	
	public int getNumberOfLines(){
		
	}
	
	public void setNumberOfLines(int aNumberOfLines){
		
	}
	
	public int getMinutesUsed(){
		
	}
	
	public void setMinutesUsed(int aMinutesUsed){
		
	}
	
	public String getPlanType(){
		
	}
	
	public void setPlanType(String aPlanType){
		
	}
}

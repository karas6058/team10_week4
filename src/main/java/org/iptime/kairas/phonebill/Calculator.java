package org.iptime.kairas.phonebill;

public class Calculator {
	public static final double GOLD = 49.95;
	public static final double SILVER = 29.95;
	public static final double GOLD_RATE_PER_ADDITIONAL_LINE = 14.5;
	public static final double SILVER_RATE_PER_ADDITIONAL_LINE = 21.5;
	public static final double GOLD_RATE_PER_EXECESS_MINUTES = 0.45;
	public static final double SILVER_RATE_PER_EXECESS_MINUTES = 0.54;
	public static final double FAMILY_DISCOUNT = 5;
	
	public Calculator(){
	}
	
	public double goldCost(int minutes, int numberOfLines){
		double total_cost = 0;
		
		if(minutes<=1000){
			total_cost = GOLD;
		} else {
			total_cost = GOLD + (minutes-1000)*GOLD_RATE_PER_EXECESS_MINUTES;
		}		
		if(numberOfLines<4){
			total_cost = total_cost + (numberOfLines-1)*GOLD_RATE_PER_ADDITIONAL_LINE;
		} else {
			total_cost = total_cost + 2*GOLD_RATE_PER_ADDITIONAL_LINE + (numberOfLines-3)*FAMILY_DISCOUNT;
		}
		return total_cost;	
			
	}
	
	public double silverCost(int minutes, int numberOfLines){
		double totalCost;
			
		if (minutes > 500)
		{
			totalCost = SILVER + (minutes-500)*SILVER_RATE_PER_ADDITIONAL_LINE;
		}
		else{
			totalCost = SILVER;
		}
		
		if(numberOfLines < 4)
		{
			totalCost += (numberOfLines-1)*SILVER_RATE_PER_ADDITIONAL_LINE;
		}
		else{
			totalCost += SILVER_RATE_PER_ADDITIONAL_LINE*2 + (numberOfLines-3)*FAMILY_DISCOUNT;
		}
		
				
		return totalCost;
	}
}

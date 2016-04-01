package org.iptime.kairas.team10_week4;

public class Calculator {
	final double gold = 49.95;
	final double silver = 29.95;
	final double gold_rate_per_additional_line = 14.5;
	final double silver_rate_per_additionla_line = 21.5;
	final double gold_rate_per_excess_minutes = 0.45;
	final double silver_rate_per_excess_minutes = 0.54;
	final double family_discount = 5;
	
	public Calculator(){
	}
	
	public double goldCost(int minutes, int numberOfLines){
		double total_cost = 0;
		
		if(minutes<=1000){
			total_cost = gold;
		} else {
			total_cost = gold + (minutes-1000)*gold_rate_per_excess_minutes;
		}		
		if(numberOfLines<4){
			total_cost = total_cost + (numberOfLines-1)*gold_rate_per_additional_line;
		} else {
			total_cost = total_cost + 2*gold_rate_per_additional_line + (numberOfLines-3)*family_discount;
		}
		return total_cost;	
			
	}
	
	public double silverCost(int minutes, int numberOfLines){
		double totalCost;
			
		if (minutes > 500)
		{
			totalCost = silver + (minutes-500)*silver_rate_per_excess_minutes;
		}
		else{
			totalCost = silver;
		}
		
		if(numberOfLines < 4)
		{
			totalCost += (numberOfLines-1)*silver_rate_per_additionla_line;
		}
		else{
			totalCost += silver_rate_per_additionla_line*2 + (numberOfLines-3)*family_discount;
		}
		
				
		return totalCost;
	}
}

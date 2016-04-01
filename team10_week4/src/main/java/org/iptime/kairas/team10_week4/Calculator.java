package org.iptime.kairas.team10_week4;

public class Calculator {
	final double gold = 49.95;
	final double silver = 29.95;
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
			total_cost = total_cost +numberOfLines*14.50;
		} else {
			total_cost = total_cost + 2*14.50 + (numberOfLines-3)*family_discount;
		}
		return total_cost;	
			
	}
	
	public double silverCost(int minutes, int numberOfLines){
		
		
		
		return 0;
	}
}

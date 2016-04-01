package org.iptime.kairas.team10_week4;

public class Calculator {
	double gold;
	double silver;
	double gold_rate_per_excess_minutes;
	double silver_rate_per_excess_minutes;
	double family_discount;
	
	public Calculator(){
		gold = 49.95;
		silver = 29.95;
		gold_rate_per_excess_minutes = 0.45;
		silver_rate_per_excess_minutes = 0.54;
		family_discount = 5;
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

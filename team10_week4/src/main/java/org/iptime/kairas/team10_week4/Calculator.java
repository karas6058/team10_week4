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
	
	public double goldCost(){
		return 0;
	}
	
	public double silverCost(int minutes, int numberOfLines){
		double totalCost;
			
		if (minutes > 500)
		{
			totalCost = (minutes-500)*silver_rate_per_excess_minutes;
		}
		else{
			totalCost=silver;
		}
		
		if(numberOfLines < 4)
		{
			totalCost += (numberOfLines-1)*21.5;
		}
		else{
			totalCost += 21.5*2 + (numberOfLines-3)*family_discount;
		}
		
				
		return totalCost;
	}
}

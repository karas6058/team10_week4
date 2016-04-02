package org.iptime.kairas.phonebill;

public class Calculator {
	private final int PLAN_AMMOUNT = 2;
	private final int GOLD = 0;
	private final int SILVER = 1;
	private double totalCost;
	private String totalCostFormular;
	private Plan[] plans;
	public Calculator(){
		plans = new Plan[PLAN_AMMOUNT];
		plans[GOLD] = new Gold();
		plans[SILVER] = new Silver();
	}
	
	public void run(Account account){
		if("gold".equals(account.getPlanType().toLowerCase())){
			getCost(account.getMinutesUsed(), account.getNumberOfLines(), plans[GOLD]);
		}
		else if("silver".equals(account.getPlanType().toLowerCase())){
			getCost(account.getMinutesUsed(), account.getNumberOfLines(), plans[SILVER]);
		}
		else{
			totalCost = 0;
			totalCostFormular = "";
		}
	}
	
	public void getCost(int minutes, int numberOfLines, Plan plan){
		if(minutes <= plan.getIncludedMinutes()){
			totalCost = plan.getBasicMonthlyRate();
			totalCostFormular = Double.toString(plan.getBasicMonthlyRate());
		}
		else {
			totalCost = plan.getBasicMonthlyRate() + (minutes - plan.getIncludedMinutes()) * plan.getRatePerExcessMinute();
			totalCostFormular = Double.toString(plan.getBasicMonthlyRate()) + " + (" + Integer.toString(minutes - plan.getIncludedMinutes()) + "*" + Double.toString(plan.getRatePerExcessMinute()) + ")";
		}		
		if(numberOfLines < plan.LINE_AMOUNT_FOR_FAMILY_DISCOUNT){
			totalCost += (numberOfLines-1) * plan.getRatePerAdditionalLine();
			totalCostFormular += " + (" + Integer.toString(numberOfLines-1) + "*" + Double.toString(plan.getRatePerAdditionalLine()) + ")";
		}
		else {
			totalCost += (plan.LINE_AMOUNT_FOR_FAMILY_DISCOUNT -1) * plan.getRatePerAdditionalLine() + (numberOfLines - plan.LINE_AMOUNT_FOR_FAMILY_DISCOUNT + 1) * plan.getRatePerAdditionalLine();
			totalCostFormular += " + (" + Integer.toString(plan.LINE_AMOUNT_FOR_FAMILY_DISCOUNT -1) + "*" + Double.toString(plan.getRatePerAdditionalLine()) + ") + (" + Integer.toString(numberOfLines - plan.LINE_AMOUNT_FOR_FAMILY_DISCOUNT + 1) + "*" + Double.toString(plan.RATE_OF_FAMILY_DISCOUNT) + ")";
		}
	}
	
	public double getTotalCost()
	{
		return totalCost;
	}
	
	public String getTotalCostFormular()
	{
		return totalCostFormular;
	}
}

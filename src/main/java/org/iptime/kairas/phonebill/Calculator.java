package org.iptime.kairas.phonebill;

public class Calculator {
	private static final int PLAN_AMMOUNT = 2;
	private static final int GOLD = 0;
	private static final int SILVER = 1;
	private double totalCost;
	private String totalCostFormular;
	private Plan[] plans;
	private Account account;
	
	public Calculator(){
		plans = new Plan[PLAN_AMMOUNT];
		plans[GOLD] = new Gold();
		plans[SILVER] = new Silver();
	}
	
	public void setAccount(Account aAccount){
		account = aAccount;
	}
	
	public void run(){
		if("gold".equalsIgnoreCase(account.getPlanType())){
			getCost(account.getMinutesUsed(), account.getNumberOfLines(), plans[GOLD]);
		}
		else if("silver".equalsIgnoreCase(account.getPlanType())){
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
			double excessMinutesCost = (minutes - plan.getIncludedMinutes()) * plan.getRatePerExcessMinute();
			totalCost = plan.getBasicMonthlyRate() + excessMinutesCost;
			String excessMinutesFormula =  " + (" + Integer.toString(minutes - plan.getIncludedMinutes()) + "*" + Double.toString(plan.getRatePerExcessMinute()) + ")";
			totalCostFormular = Double.toString( plan.getBasicMonthlyRate() ) + excessMinutesFormula;
		}		
		if(numberOfLines < Plan.LINE_AMOUNT_FOR_FAMILY_DISCOUNT){
			totalCost += (numberOfLines-1) * plan.getRatePerAdditionalLine();
			totalCostFormular += " + (" + Integer.toString(numberOfLines-1) + "*" + Double.toString(plan.getRatePerAdditionalLine()) + ")";
		}
		else {
			totalCost += (Plan.LINE_AMOUNT_FOR_FAMILY_DISCOUNT -2) * plan.getRatePerAdditionalLine() + (numberOfLines - Plan.LINE_AMOUNT_FOR_FAMILY_DISCOUNT + 1) * Plan.RATE_OF_FAMILY_DISCOUNT;
			totalCostFormular += " + (" + Integer.toString(Plan.LINE_AMOUNT_FOR_FAMILY_DISCOUNT -2) + "*" + Double.toString(plan.getRatePerAdditionalLine()) + ") + (" + Integer.toString(numberOfLines - Plan.LINE_AMOUNT_FOR_FAMILY_DISCOUNT + 1) + "*" + Double.toString(Plan.RATE_OF_FAMILY_DISCOUNT) + ")";
		}
	}
	
	public double totalCost()
	{
		return totalCost;
	}
	
	public String getTotalCostFormular()
	{
		return totalCostFormular;
	}
}

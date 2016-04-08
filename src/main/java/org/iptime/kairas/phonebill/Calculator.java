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
		if(planIsGold()){
			calculate(account.getMinutesUsed(), account.getNumberOfLines(), plans[GOLD]);
		}
		else if(planIsSilver()){
			calculate(account.getMinutesUsed(), account.getNumberOfLines(), plans[SILVER]);
		}
		else{
			saveEmptyValue();
		}
	}
	
<<<<<<< HEAD
	private void saveEmptyValue() {
		totalCost = 0;
		totalCostFormular = "";
	}

	private boolean planIsGold(){
		if("gold".equalsIgnoreCase(account.getPlanType())){
			return true;
		}
		return false;
	}
	
	private boolean planIsSilver(){
		if("silver".equalsIgnoreCase(account.getPlanType())){
			return true;
		}
		return false;
	}
	
	private void calculate(int minutes, int numberOfLines, Plan plan){
		if(minutes <= plan.getIncludedMinutes()){
			totalCost = plan.getBasicMonthlyRate();
			totalCostFormular = Double.toString(plan.getBasicMonthlyRate());
=======
	public void getCost(int minutes, int numberOfLines, Plan plan){
		
		if(minutes <= plan.IncludedMinutes()){
			totalCost = plan.BasicMonthlyRate();
			totalCostFormular = Double.toString(plan.BasicMonthlyRate());
>>>>>>> branch 'master' of https://github.com/sanggihong/team10_week4
		}
		else {
			double excessMinutesCost = (minutes - plan.IncludedMinutes()) * plan.RatePerExcessMinute();
			totalCost = plan.BasicMonthlyRate() + excessMinutesCost;
			String excessMinutesFormula =  " + (" + Integer.toString(minutes - plan.IncludedMinutes()) + "*" + Double.toString(plan.RatePerExcessMinute()) + ")";
			totalCostFormular = Double.toString( plan.BasicMonthlyRate() ) + excessMinutesFormula;
		}		
		if(numberOfLines < Plan.LINE_AMOUNT_FOR_FAMILY_DISCOUNT){
			totalCost += (numberOfLines-1) * plan.RatePerAdditionalLine();
			totalCostFormular += " + (" + Integer.toString(numberOfLines-1) + "*" + Double.toString(plan.RatePerAdditionalLine()) + ")";
		}
		else {
			totalCost += (Plan.LINE_AMOUNT_FOR_FAMILY_DISCOUNT -2) * plan.RatePerAdditionalLine() + (numberOfLines - Plan.LINE_AMOUNT_FOR_FAMILY_DISCOUNT + 1) * Plan.RATE_OF_FAMILY_DISCOUNT;
			totalCostFormular += " + (" + Integer.toString(Plan.LINE_AMOUNT_FOR_FAMILY_DISCOUNT -2) + "*" + Double.toString(plan.RatePerAdditionalLine()) + ") + (" + Integer.toString(numberOfLines - Plan.LINE_AMOUNT_FOR_FAMILY_DISCOUNT + 1) + "*" + Double.toString(Plan.RATE_OF_FAMILY_DISCOUNT) + ")";
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

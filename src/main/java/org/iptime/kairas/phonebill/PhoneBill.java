package org.iptime.kairas.phonebill;

public class PhoneBill {
	private Calculator calc;
	private Account account;
	private StringBuilder bill;

	public PhoneBill() {
		calc = new Calculator();
	}

	public void setAccount(Account aAccount) {
		account = aAccount;
	}

	public String getBillForm() {
		bill = new StringBuilder();
		calc.run();
		/*
		 * make a table about bill with StringBuilder
		 * --------------------------------------------
		 * plan|munutesUsed|numberOflines|ExpectedBill
		 * -------------------------------------------- blahblah... (take data
		 * from calc, account)
		 */
		
		bill.append("\n----------------------------------------------------------------------------------------------------------------------------\n");
		bill.append("|\tplan\t|\tMinutes Used\t|\tNumber of Lines\t|\tExpected Bill\t\t\t\t\n");
		bill.append("----------------------------------------------------------------------------------------------------------------------------\n");
		bill.append("|\t"+account.getPlanType()+ "\t|\t" + Integer.toString(account.getMinutesUsed())+ "\t\t|\t"
					+Integer.toString(account.getNumberOfLines()) +"\t\t|\t" + calc.totalCostFormular() + "=" +String.format("%.2f", calc.totalCost())+"\n");
		bill.append("----------------------------------------------------------------------------------------------------------------------------\n");
		

		return bill.toString();
	}
}

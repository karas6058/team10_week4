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
		calc.run(account);
	}

	public String getBill() {
		bill = new StringBuilder();
		/*
		 * make a table about bill with StringBuilder
		 * --------------------------------------------
		 * plan|munutesUsed|numberOflines|ExpectedBill
		 * -------------------------------------------- blahblah... (take data
		 * from calc, account)
		 */
<<<<<<< HEAD
		bill.append("-------------------------------------------------------------------------------------------\n");
		bill.append("|plan| Minutes Used | Number of Lines | Expected Bill                                  | \n");
		bill.append("-------------------------------------------------------------------------------------------\n");
		bill.append("|"+account.getPlanType()+ " | " + Integer.toString(account.getMinutesUsed())+ "|"
					+Integer.toString(account.getNumberOfLines()) +" | " + calc.getTotalCostFormular() + "=" +Double.toString(calc.getTotalCost())+"|");
		bill.append("-------------------------------------------------------------------------------------------\n");
		
		
=======
>>>>>>> branch 'master' of https://github.com/kairas83/team10_week4.git
		return bill.toString();
	}
}

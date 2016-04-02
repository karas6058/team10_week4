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

		return bill.toString();
	}
}

package org.iptime.kairas.phonebill;

public class PhoneBill {
	private Calculator calc;
	private Account account;
	private StringBuilder bill;
	
	private PhoneBill(){
		//hide empty constructor
	}
	
	public PhoneBill(Account aAccount){
		calc = new Calculator();
		account = aAccount;
		calc.run(account);
	}
	
	public void setAccount(Account aAccount){
		account = aAccount;
		calc.run(account);
	}
	
	public StringBuilder getBill(){
		bill = new StringBuilder();
		//make string like table about bill with StringBuilder
		/*--------------------------------------------
		 * plan|munutesUsed|numberOflines|ExpectedBill
		 *--------------------------------------------
		 *blahblah...
		 */
	}
}

package org.iptime.kairas.phonebill;

/**
 * Hello world!
 *
 */
public class App {
	private App() {
		// hide empty Constructor
	}

	public static void main(String[] args) {
		AppView appView = new AppView();
		PhoneBill phoneBill = new PhoneBill();
		Account account[];

		if (args.length == 0) {
			account = appView.getAccountDataFromFile("input_default.txt");
		} else {
			account = appView.getAccountDataFromFile(args[0]);
		}

		for (int i = 0; i < account.length; i++) {
			phoneBill.setAccount(account[i]);
			appView.outputString(phoneBill.getBill());
		}
	}
}

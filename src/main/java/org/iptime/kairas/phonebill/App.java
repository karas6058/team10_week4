package org.iptime.kairas.phonebill;

/**
 * Hello world!
 *
 */
public class App 
{
	private App(){
		//hide empty Constructor
	}
	
	public static void main(String[] args){
		AppView appView = new AppView();
		Account account[];
		
		if(args.length == 0){
			account = appView.getAccountDataFromFile("input_default.txt");
		}
		else{
			account = appView.getAccountDataFromFile(args[0]);
		}
	}
}

package org.iptime.kairas.phonebill;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppView {
	private Scanner scan;
	private Logger log;
	
	public AppView(){
		scan = new Scanner(System.in);
		log = Logger.getLogger("MyLogger");
	}
	
	public int inputInt(){
		return scan.nextInt();
	}
	
	public String inputString(){
		return scan.nextLine();
	}
	
	public void outputString(String output){
		log.log(Level.INFO, output);
	}
}

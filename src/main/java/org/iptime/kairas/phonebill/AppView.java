package org.iptime.kairas.phonebill;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppView {
	private Logger logger;
	
	public AppView(){
		logger = Logger.getLogger("MainLogger");
	}
	
	public void outputString(String output){
		logger.log(Level.INFO, output);
	}
	
	public List<Account> getAccountDataFromFile(String fileName){
		return parsingFile(fileName);
	}
	
	private List<Account> parsingFile(String fileName){
		LinkedList<Account> dataToReturn = new LinkedList<Account>();
		try{
			FileInputStream file = new FileInputStream(fileName);
			BufferedInputStream input = new BufferedInputStream(file);
			Scanner scanner = new Scanner(input);
			while(scanner.hasNextLine()){
				StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine(), " ");
				String planType = tokenizer.nextToken();
				int minuteUsed = Integer.parseInt(tokenizer.nextToken());
				int numberOfLines = Integer.parseInt(tokenizer.nextToken());
				dataToReturn.addLast( new Account(planType, minuteUsed, numberOfLines) );
			}
			scanner.close();
			input.close();
			file.close();
		}catch(Exception e){
			logger.log(Level.INFO, e.toString());
		}finally{
			logger.log(Level.INFO, "ERROR : WHILE READING FILE");
		}
		return dataToReturn;
	}
}

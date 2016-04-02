package org.iptime.kairas.phonebill;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppView {
	public static final int MAX_ACCOUNT = 1000;
	private Logger logger;
	
	public AppView(){
		logger = Logger.getLogger("MainLogger");
	}
	
	public void outputString(String output){
		logger.log(Level.INFO, output);
	}
	
	public Account[] getAccountDataFromFile(String fileName){
		return parsingFile(fileName);
	}
	
	private Account[] parsingFile(String fileName){
		Account[] dataToReturn = new Account[MAX_ACCOUNT];
		int dataIndex = 0;
		try{
			FileInputStream file = new FileInputStream("input_default.txt");
			BufferedInputStream input = new BufferedInputStream(file);
			Scanner scanner = new Scanner(input);
			while(scanner.hasNextLine()){
				StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine(), " ");
				String planType = tokenizer.nextToken();
				int minuteUsed = Integer.parseInt(tokenizer.nextToken());
				int numberOfLines = Integer.parseInt(tokenizer.nextToken());
				dataToReturn[dataIndex] = new Account(planType, minuteUsed, numberOfLines);
			}
			scanner.close();
			input.close();
			file.close();
		}catch(Exception e){
			logger.log(Level.INFO,"ERROR : WHILE READING FILE\n" + e.getStackTrace().toString());
		}
		return dataToReturn;
	}
}

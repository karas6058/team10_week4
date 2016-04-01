package org.iptime.kairas.team10_week4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AppView test = new AppView();
    	
    	System.out.print("총 사용 시간을 입력하세요:");
    	int time = test.inputInt();
    	
    	System.out.print("총 사용 회선을 입력하세요:");
    	int line = test.inputInt();
    	
    	System.out.print("요금제를 입력하세요(gold, silver)");
    	String plan = test.inputString();
    	
    	Calculator cal = new Calculator();
    	double bill = 0;
    	
    	switch (plan) {
    		case"gold":
    			bill = cal.goldCost();
    			break;
    	
    		case"silver":
    			bill = cal.silverCost();
    			break;
    	}
    	
    	test.outputString(""+bill);
    }
}

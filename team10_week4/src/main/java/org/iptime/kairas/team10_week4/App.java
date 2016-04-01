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
    	int time = AppView.inputInt();
    	
    	System.out.print("총 사용 회선을 입력하세요:");
    	int line = AppView.inputInt();
    	
    	System.out.print("요금제를 입력하세요(gold, silver)");
    	String plan = AppView.inputString();
    	
    	Calculator cal = new Calculator();
    	float bill = 0;
    	
    	switch (plan) {
    		"gold":
    			bill = cal.goldCost();
    	
    		"silver":
    			bill = cal.silverCost();
    	}
    	
    	test.outputString(""+bill);
    }
}

package org.iptime.kairas.phonebill;

/**
 * Hello world!
 *
 */
public class App 
{
	public App(){
		//define Constructor
	}
    public static void main( String[] args )
    {
    	AppView test = new AppView();
    	
    	test.outputString("요금제를 입력하세요(gold, silver)");
    	String plan = test.inputString();
    	
    	test.outputString("총 사용 시간(분)을 입력하세요:");
    	int time = test.inputInt();
    	
    	test.outputString("총 사용 회선을 입력하세요:");
    	int line = test.inputInt();
    	
    	Calculator cal = new Calculator();
    	double bill = 0;
    	
    	if ("gold".equals(plan)) 
    		bill = cal.goldCost(time, line);
    	else if ("silver".equals(plan))
    		bill = cal.silverCost(time, line);
    	
    	test.outputString(Double.toString(bill));
    }
}

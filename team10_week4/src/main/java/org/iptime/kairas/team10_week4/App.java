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
    	
    	System.out.print("요금제를 입력하세요(gold, silver)");
    	String plan = test.inputString();
    	
    	System.out.print("총 사용 시간(분)을 입력하세요:");
    	int time = test.inputInt();
    	
    	System.out.print("총 사용 회선을 입력하세요:");
    	int line = test.inputInt();
    	
    	Calculator cal = new Calculator();
    	double bill = 0;
    	
    	if (plan.equals("gold")) 
    		bill = cal.goldCost(time, line);
    	else if (plan.equals("silver"))
    		bill = cal.silverCost(time, line);
    	
    	test.outputString(""+bill);
    }
}

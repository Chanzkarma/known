package drill;

import java.util.Date;

public class NormalThread {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Start time : " + new Date());
		for (int i = 0; i < 7; i++) {
			System.out.println("Counter: " +i + " Started");
			Thread.sleep(5000);
			
		}
		System.out.println("End time : "+ new Date ());
	}

}

package lecture30.ex1;

import java.awt.Dimension;


public class MainClass {
	public static void main(String[] args) {
		
		MakeBtn btn = new MakeBtn();
//		btn.pack();
		btn.setSize(new Dimension(200, 200));
		btn.setVisible(true);
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
		
		btn.setVisible(false);
		btn.dispose();
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
		
		System.exit(0);
		
	}
}

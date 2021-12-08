import java.awt.*;
import java.awt.event.InputEvent;

import javax.swing.JLabel;

public class MouseClicker implements Runnable{
	
	public static final int ONE_MIN = 1000 * 60;
	public static int min = 0;
	
	public MouseClicker(int i) {
		min = i;
		
	}
	
	public static void click(int min) throws Exception {
		Robot robot = new Robot();
		Thread.sleep(ONE_MIN * min);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	    Thread.sleep(1000);
	    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	    System.out.println("Mouse clicked");
	}

	@Override
	public void run() {
		try {
			click(min);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

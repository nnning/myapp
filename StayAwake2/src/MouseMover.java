import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MouseMover implements Runnable{
	public static final int ONE_MIN = 1000 * 60;
	
	public static Point p = null;
	public static int x = 0;
	public static int y = 0;
	public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	public static LocalDateTime now = null;
	public static boolean exit = false;
	

	@Override
	public void run(){
		try {
		Robot robot = new Robot();
		while (!exit) {
			now = LocalDateTime.now();
			p = MouseInfo.getPointerInfo().getLocation();
			x = p.x;
			y = p.y;
			robot.mouseMove(x + 1, y + 1);
			robot.mouseMove(x, y);
			System.out.println(formatter.format(now) + ", mouse moved.");
			
			Thread.sleep(ONE_MIN * 5);
			} 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void stop() {
		exit = true;
	}
	
}

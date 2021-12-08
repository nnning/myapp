
import java.awt.Robot;
import java.io.IOException;
import java.net.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.MouseInfo;
import java.awt.Point;

public class ServiceStart {

	public static final int ONE_MIN = 1000 * 120;
	public static final int FIVE_SECOND = 1000 * 5;
	public static final int ONE_SECOND = 1000;
	public static Point p = null;
	public static int x = 0;
	public static int y = 0;
	public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	public static LocalDateTime now = null;

	public static void start() throws Exception {

		Robot robot = new Robot();
		while (true) {
			now = LocalDateTime.now();
			System.out.println(formatter.format(now));
			p = MouseInfo.getPointerInfo().getLocation();
			x = p.x;
			y = p.y;
			robot.mouseMove(x + 1, y + 1);
			robot.mouseMove(x, y);
			System.out.println("X postition: " + x + "; Y position: " + y);
			getStatus("at-prgvwdfsp1");
			Thread.sleep(ONE_MIN);
		}

	}

	public static void getStatus(String ipAddress) throws UnknownHostException, IOException {
		InetAddress geek = InetAddress.getByName(ipAddress);
		System.out.println("Sending Ping Request to " + ipAddress);
		if (geek.isReachable(5000))
			System.out.println("Host is reachable");
		else
			System.out.println("Sorry ! We can't reach to this host");
	}

}
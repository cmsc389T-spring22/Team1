import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapEatCookie extends TestCase{

	public void testMapEatCookie() throws FileNotFoundException{
		MainFrame frame = new MainFrame();
		Location location = new Location(1, 1);
		PacMan pacman = frame.addPacMan(location);
		Map m = frame.getMap();
		frame.add(new CookieComponent(1, 1, 20));
		frame.getMap().eatCookie(pacman.myName);

		assertTrue(frame.getMap().getLoc(location).contains(Map.Type.COOKIE) == false);

	}
}

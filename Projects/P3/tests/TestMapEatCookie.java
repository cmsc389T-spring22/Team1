import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapEatCookie extends TestCase{

	public void testMapEatCookie() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Location location = new Location(1, 1);
		PacMan pacman = frame.addPacMan(location);
		Map m = frame.getMap();

		assertFalse(frame.getMap().getLoc(location).contains(Map.Type.COOKIE) == false);
	}
}

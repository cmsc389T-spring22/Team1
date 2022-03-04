import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.Map;

public class TestMapEatCookie {

	public void testMapEatCookie() {
		NoFrame frame = new NoFrame();
		Map m = frame.getMap();
		frame.addPacMan(new Location(4, 6));
		assertTrue(m.eatCookie("pacman") == null);

	}
}

import junit.framework.*;
import java.awt.Color;
import java.io.*;


public class TestMapGetLoc {
	
	public void testMapGetLoc() {
		NoFrame frame = new NoFrame();
		PacMan pac = frame.addPacMan(new Location(9,11));
		Map map = frame.getMap();
		assertTrue(map.getLoc(new Location(9,11)) == Map.Type.PACMAN);
	}
}

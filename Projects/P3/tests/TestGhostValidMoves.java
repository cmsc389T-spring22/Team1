import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

import javax.tools.DocumentationTool.Location;

public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException{
			NoFrame frame = new NoFrame();
			Ghost gh = frame.addGhost(new Location(9,11), "Hi", Color.BLACK);
			Map map = frame.getMap();
			ArrayList<Location> s = new ArrayList();
			s.add(new Location(9,12));
			s.add(new Location(10,11));
			s.add(new Location(10,12));
			assertTrue(gh.get_valid_moves().equals(s));
	}
}

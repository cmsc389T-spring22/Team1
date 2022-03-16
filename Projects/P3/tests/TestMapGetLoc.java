import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.HashSet;

public class TestMapGetLoc extends TestCase {
	
	public void testMapGetLoc() throws FileNotFoundException{
		NoFrame frame = new NoFrame(); 
		PacMan pacman = frame.addPacMan(new Location(1,1));

		HashSet<Map.Type> setOne = new HashSet<Map.Type>();
		setOne.add(Map.Type.PACMAN);
		setOne.add(Map.Type.COOKIE);
		assertEquals(frame.getMap().getLoc(new Location(1,1)), setOne);
	}
}

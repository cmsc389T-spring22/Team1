import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.HashSet;

public class TestMapGetLoc extends TestCase {
	
	public void testMapGetLoc() throws FileNotFoundException {
		NoFrame f = new NoFrame();
		HashSet<Map.Type> setOne = new HashSet<Map.Type>();
		setOne.add(Map.Type.EMPTY);
		setOne.add(Map.Type.WALL);
		assertTrue(f.getMap().getLoc(new Location(3,3)) == setOne);
		assertTrue(f.getMap().getLoc(new Location(3,2)) == setOne);
	}
}

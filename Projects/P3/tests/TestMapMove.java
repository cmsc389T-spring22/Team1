import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove {

	public void testMapMove() {
		NoFrame frame = new NoFrame();
		Map m = frame.getMap();
		Ghost ghost = frame.addGhost(new Location(2,4), "g1", Color.black);
		assertTrue(m.move("g1", new Location(2, 4), Map.Type.GHOST ) == true);
	}
}

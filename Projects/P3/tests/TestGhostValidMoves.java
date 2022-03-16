
import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Ghost gh = frame.addGhost(new Location(1,1), "Hi", Color.BLACK);
		Map map = frame.getMap();
		ArrayList<Location> moves = gh.get_valid_moves();
		assertEquals(2, moves.size());

		assertEquals(new Location(2, 1), moves.get(0));
		assertEquals(new Location(1, 2), moves.get(1));
	}
}

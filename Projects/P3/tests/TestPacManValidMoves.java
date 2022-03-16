import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException {
		NoFrame frame = new NoFrame();

		PacMan pacman = frame.addPacMan(new Location(1, 1));
		frame.startGame();

		ArrayList<Location> moves = pacman.get_valid_moves();
		assertEquals(2, moves.size());

		assertEquals(new Location(2, 1), moves.get(0));
		assertEquals(new Location(1, 2), moves.get(1));
	}
}
import java.util.HashSet;
import java.util.ArrayList;

public class Ghost{
	String myName;
	Location myLoc;
	Map myMap;

	public Ghost(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		ArrayList<Location> returner = new ArrayList<>();
		Location right = new Location(myLoc.x + 1, myLoc.y);
		Location left = new Location(myLoc.x - 1, myLoc.y);
		Location up = new Location(myLoc.x, myLoc.y - 1);
		Location down = new Location(myLoc.x, myLoc.y + 1);

		if(myMap.getLoc(right) == Type.EMPTY) {
			returner.add(right);
		}
		if(myMap.getLoc(left) == Type.EMPTY) {
			returner.add(left);
		}
		if(myMap.getLoc(up) == Type.EMPTY) {
			returner.add(up);
		}
		if(myMap.getLoc(down) == Type.EMPTY) {
			returner.add(down);
		}
		return returner;
	}

	public boolean move() {
		return false;
	}

	public boolean is_pacman_in_range() { 
		return false;
	}

	public boolean attack() {
		return false;
	}
}

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

		if(myMap.getLoc(right) == Type.EMPTY || myMap.getLoc(right) == Type.COOKIE) {
			returner.add(right);
		}
		if(myMap.getLoc(left) == Type.EMPTY || myMap.getLoc(left) == Type.COOKIE) {
			returner.add(left);
		}
		if(myMap.getLoc(up) == Type.EMPTY || myMap.getLoc(up) == Type.COOKIE) {
			returner.add(up);
		}
		if(myMap.getLoc(down) == Type.EMPTY || myMap.getLoc(down) == Type.COOKIE) {
			returner.add(down);
		}
		return returner;
	}

	public boolean move() {
		ArrayList<Location> possibleLocations = get_valid_moves();
		if (possibleLocations.size() != 0) {
			myLoc = new Location(possibleLocations.get(0).x, possibleLocations.get(0).y);
			myMap.move(myName, new Location(myLoc.x, myLoc.y), Map.Type.PACMAN);
			return true;
		}
		return false;
	}

	public boolean is_pacman_in_range() {
		boolean foundPacMan = false;

		if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y)) != null && myMap.getLoc(new Location(myLoc.x + 1, myLoc.y)).contains(Map.Type.PACMAN)) {
			foundPacMan = true;
		}

		else if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y)) != null && myMap.getLoc(new Location(myLoc.x - 1, myLoc.y)).contains(Map.Type.PACMAN)) {
			foundPacMan = true;
		}

		else if (myMap.getLoc(new Location(myLoc.x, myLoc.y + 1)) != null && myMap.getLoc(new Location(myLoc.x, myLoc.y + 1)).contains(Map.Type.PACMAN)) {
			foundPacMan = true;
		}

		else if (myMap.getLoc(new Location(myLoc.x, myLoc.y - 1)) != null && myMap.getLoc(new Location(myLoc.x, myLoc.y - 1)).contains(Map.Type.PACMAN)) {
			foundPacMan = true;
		}

		else if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y + 1)) != null && myMap.getLoc(new Location(myLoc.x + 1, myLoc.y + 1)).contains(Map.Type.PACMAN)) {
			foundPacMan = true;
		}

		else if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y - 1)) != null && myMap.getLoc(new Location(myLoc.x - 1, myLoc.y - 1)).contains(Map.Type.PACMAN)) {
			foundPacMan = true;
		}

		else if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y - 1)) != null && myMap.getLoc(new Location(myLoc.x + 1, myLoc.y - 1)).contains(Map.Type.PACMAN)) {
			foundPacMan = true;
		}

		else if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y + 1)) != null && myMap.getLoc(new Location(myLoc.x - 1, myLoc.y + 1)).contains(Map.Type.PACMAN)) {
			foundPacMan = true;
		}

		return foundPacMan;
	}

	public boolean attack() {
		if(is_pacman_in_range()) {
			return myMap.attack(myName)
		} else {
			return false;
		}
	}
}

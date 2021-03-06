import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map{

	public enum Type {
		EMPTY,
		PACMAN,
		GHOST,
		WALL,
		COOKIE
	}

	private HashMap<Location, HashSet<Type>> field;
	private boolean gameOver;
	private int dim;

	private HashMap<String, Location> locations;
	private HashMap<String, JComponent> components;
	private HashSet<Type> emptySet;
	private HashSet<Type> wallSet;

	private int cookies = 0;

	public Map(int dim){
		gameOver = false;
		locations = new HashMap<String, Location>();
		components = new HashMap<String, JComponent>();
		field = new HashMap<Location, HashSet<Type>>();

		emptySet = new HashSet<Type>();
		wallSet = new HashSet<Type>();
		emptySet.add(Type.EMPTY);
		wallSet.add(Type.WALL);
		this.dim = dim;
	}


	public void add(String name, Location loc, JComponent comp, Type type) {
		locations.put(name, loc);
		components.put(name, comp);
		if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
	}

	public int getCookies() {
		return cookies;
	}

	public boolean isGameOver() {
		return gameOver;
	}

	public boolean move(String name, Location loc, Type type) {
		//update locations, components, and field
		//use the setLocation method for the component to move it to the new location
		Location old = locations.get(name);

		if (!locations.containsKey(name) || !field.containsKey(loc) || !components.containsKey(name)) {
			return false;
		}
		field.get(old).remove(type);
		field.get(loc).add(type);

		components.get(name).setLocation(loc.x, loc.y);
		locations.replace(name, loc);
		return true;
	}

	public HashSet<Type> getLoc(Location loc) {
		// wallSet and emptySet will help you write this method
		if (field.containsKey(loc) == false) {
			return wallSet;
		} else {
			return field.get(loc);
		}
		
	}

	public boolean attack(String Name) {
		boolean successfulAttack = false;

		if (locations.get(Name) != null && locations.get(Name).equals(new Location(locations.get("pacman").x + 1, locations.get("pacman").y))) {
			successfulAttack = true;
		}

		else if (locations.get(Name) != null && locations.get(Name).equals(new Location(locations.get("pacman").x - 1, locations.get("pacman").y))) {
			successfulAttack = true;
		}

		else if (locations.get(Name) != null && locations.get(Name).equals(new Location(locations.get("pacman").x, locations.get("pacman").y + 1))) {
			successfulAttack = true;
		}

		else if (locations.get(Name) != null && locations.get(Name).equals(new Location(locations.get("pacman").x, locations.get("pacman").y - 1))) {
			successfulAttack = true;
		}

		else if (locations.get(Name) != null && locations.get(Name).equals(new Location(locations.get("pacman").x + 1, locations.get("pacman").y + 1))) {
			successfulAttack = true;
		}

		else if (locations.get(Name) != null && locations.get(Name).equals(new Location(locations.get("pacman").x - 1, locations.get("pacman").y - 1))) {
			successfulAttack = true;
		}

		else if (locations.get(Name) != null && locations.get(Name).equals(new Location(locations.get("pacman").x + 1, locations.get("pacman").y - 1))) {
			successfulAttack = true;
		}

		else if (locations.get(Name) != null && locations.get(Name).equals(new Location(locations.get("pacman").x - 1, locations.get("pacman").y + 1))) {
			successfulAttack = true;
		}

		gameOver = (successfulAttack == true);
		return successfulAttack;
	}

	public JComponent eatCookie(String name) {
		//update locations, components, field, and cookies
		//the id for a cookie at (10, 1) is tok_x10_y1
		
		if(locations.containsKey(name)) {
			Location loc = locations.get(name);
			String tokid = "tok_x" + loc.x + "_y" + loc.y;

			field.get(loc).remove(Type.COOKIE);
			locations.remove(tokid);
			cookies++;
			return components.remove(tokid);
		} else {
			return null;
		}
	}
}

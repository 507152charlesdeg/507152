package firstProject;

import java.awt.*;
import java.util.*;
import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.gui.*;
import info.gridworld.world.*;

public class powerCritter extends Critter {
	private int health;

	public powerCritter(int h, Color c) {
		health = h;
		this.setColor(c);
	}

	public powerCritter(int h) {
		health = h;
	}

	public void act() {
		if (!(getGrid() == null)) {
			ArrayList<Actor> listOfActors = getActors();
			ArrayList<powerCritter> listOfCritters = getCritters();
			processActors(listOfActors);
			processPowerCritters(listOfCritters);
			if (this.getGrid() != null) {
				ArrayList<Location> moveLocs = this.getMoveLocations();
				Location loc = selectMoveLocation(moveLocs);
				makeMove(loc);
				health--;
				System.out.println("health: " + health);
				if (health == 0) {
					removeSelfFromGrid();
				}
			}
		}
		else return;
	}

	public ArrayList<Actor> getActors() {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		int[] dirs = { Location.AHEAD, Location.HALF_LEFT, Location.HALF_RIGHT };
		for (Location loc : getLocationsInDirections(dirs)) {
			Actor a = getGrid().get(loc);
			actors.add(a);
		}
		return actors;
	}

	public ArrayList<powerCritter> getCritters() {
		ArrayList<powerCritter> pCritters = new ArrayList<powerCritter>();
		int[] dirs = { Location.AHEAD, Location.HALF_LEFT, Location.HALF_RIGHT };
		for (Location loc : getLocationsInDirections(dirs)) {
			Actor a = getGrid().get(loc);
			if (a instanceof powerCritter) {
				powerCritter c = (powerCritter) a;
				pCritters.add(c);
			}
		}
		return pCritters;
	}

	public void processActors(ArrayList<Actor> actors) {
		for (Actor a : actors) {
			if ((a != null) && (!(a instanceof Rock)) && (!(a instanceof powerCritter))) {
				health += 3;
				a.removeSelfFromGrid();
			}
		}
	}

	public void processPowerCritters(ArrayList<powerCritter> critters) {
		for (powerCritter a : critters) {
			this.faceOffAgainst(a);
		}
	}

	public ArrayList<Location> getLocationsInDirections(int[] directions) {
		ArrayList<Location> locs = new ArrayList<Location>();
		Grid<?> gr = getGrid();
		Location loc = getLocation();
		for (int d : directions) {
			Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
			if (gr.isValid(neighborLoc))
				locs.add(neighborLoc);
		}
		return locs;
	}

	public int getHealth() {
		return health;
	}

	public void faceOffAgainst(powerCritter enemy) {
		if (this.health == enemy.getHealth()) {
			enemy.removeSelfFromGrid();
			this.removeSelfFromGrid();
		}
		if (this.health > enemy.getHealth()) {
			this.health += enemy.getHealth();
			enemy.removeSelfFromGrid();
		}

		if (this.health < enemy.getHealth()) {
			enemy.health += this.health;
			this.removeSelfFromGrid();
		}
	}

	public ArrayList<Location> getMoveLocations() {
		return super.getGrid().getEmptyAdjacentLocations(getLocation());
	}

}

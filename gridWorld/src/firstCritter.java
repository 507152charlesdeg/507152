import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class firstCritter extends Critter {

	public firstCritter() {
		// TODO Auto-generated constructor stub
	}
	
	public void makeMove(Location loc) {
		wait();
		moveTo(loc);
	}

}

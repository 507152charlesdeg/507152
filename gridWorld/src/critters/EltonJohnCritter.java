import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;

/** Name: Parker Moore
 * Class: AP Computer Science
 * Teacher: Mr. Klus
 * Program: GridWorld
 * Description: This EltonJohnCritter changes the color of the Actors around him (returned from the getNeighbors() method) to random colors generated by the helper method below.
 */

public class EltonJohnCritter extends Critter {

	/**
	 * This executes the constructor of <code>Critter</code>
	 */
	public EltonJohnCritter(){
		super();
	}
	
	/**
	 * This constructor allows the user to set the color of the <code>EltonJohnCritter</code> before it makes any move.
	 * @param color to be the color of the constructed <code>EltonJohnCritter</code>
	 */
	public EltonJohnCritter(Color color){
		setColor(color);
	}
	
	/* (non-Javadoc)
	 * @see info.gridworld.actor.Critter#processActors(java.util.ArrayList)
	 */
	@Override
	public void processActors(ArrayList<Actor> actors) {
		for (Actor a : actors)
        {
			a.setColor(randomColor());
        }
	}

	/**
	 * Creates a random color
	 * @return random color
	 */
	private Color randomColor() {
		return new Color((int) (Math.random() * 256 * 256 * 256));
	}

}

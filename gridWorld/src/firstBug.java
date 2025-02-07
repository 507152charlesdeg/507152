import boxBug.ZBug;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class firstBug extends Bug{

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		zzBug vw = new zzBug();
		world.add(new Location(5, 5), vw);
		world.show();
	}

}

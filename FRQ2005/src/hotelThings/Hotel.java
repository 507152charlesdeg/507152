package hotelThings;

import java.util.ArrayList;

public class Hotel {

	// a list of reservations
	private Reservation[] rooms;
	private ArrayList<String> waitlist;

	public Hotel(int numRooms) {
		rooms = new Reservation[numRooms];
		waitlist = new ArrayList<String>();
	}

	public Reservation requestRoom(String name) {
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] == null) {
				rooms[i] = new Reservation(name, i);
				return rooms[i];
			}
		}
		waitlist.add(name);
		return null;

	}

	public Reservation[] getReservations() {
		return rooms;
	}
	public ArrayList<String> getWaitlist(){
		return waitlist;
	}

	public Reservation cancelAndReassign(Reservation res) {
		int room = res.getRoomNumber();
		rooms[room] = null;
		if (waitlist.size() != 0) {
			rooms[room] = new Reservation(waitlist.remove(0), room);
		}

		return rooms[room];
	}
}

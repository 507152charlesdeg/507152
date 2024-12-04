package hotelThings;

public class Reservation {

	// instance variables (class variables)
	private String name;
	private int roomNum;

	// constructor
	public Reservation(String guestName, int roomNumber) {
		name = guestName;
		roomNum = roomNumber;
	}

	public int getRoomNumber() {
		return roomNum;
	}

	public void setRoomNumber(int roomNumber) {
		roomNum = roomNumber;
	}

	public String getGuestName() {
		return name;
	}

	public void setGuestName(String guestName) {
		name = guestName;
	}
}

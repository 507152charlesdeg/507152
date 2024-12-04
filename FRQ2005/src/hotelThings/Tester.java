package hotelThings;

public class Tester {

	public static void main(String[] args) {
		Hotel cali = new Hotel(5);
		
		cali.requestRoom("christian");
		cali.requestRoom("caitlyn");
		cali.requestRoom("ed");
		cali.requestRoom("victoria");
		cali.requestRoom("nick, the holy ArrayList<String>");
		cali.requestRoom("roman");

		cali.cancelAndReassign(cali.getReservations()[0]);
		
		/*
		 * should print:
		 * names of guests
		 * names of waitlist
		 * (get rid of a guest)
		 * roman + the rest of the guests that are left
		 * no one left on waitlist
		 * */
	}

}

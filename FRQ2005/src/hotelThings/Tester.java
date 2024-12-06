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
		
		System.out.println(cali.getReservations());
		System.out.println(cali.getWaitlist());
		cali.cancelAndReassign(cali.getReservations()[0]);
		System.out.println(cali.getReservations());
		
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

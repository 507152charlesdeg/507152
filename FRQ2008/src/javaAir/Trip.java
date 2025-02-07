package javaAir;

import java.util.*;

public class Trip {

	private ArrayList<Flight> flights = new ArrayList<Flight>();

	public Trip(ArrayList<Flight> f) {
		flights = f;
	}

	public int getDuration() {
		Time firstDep = flights.get(0).getDepartureTime();
		Time lastArr = flights.get(flights.size() - 1).getArrivalTime();
		int diff = firstDep.minutesUntil(lastArr);
		if (flights.isEmpty())
			return 0;
		else
			return diff;
	}

	public int getShortestLayover() {
		Time lastArr = flights.get(0).getArrivalTime();
		Time nextDep = flights.get(1).getDepartureTime();

		int min = lastArr.minutesUntil(nextDep);
		for (int i = 1; i < flights.size() - 1; i++) {
			lastArr = flights.get(i).getArrivalTime();
			nextDep = flights.get(i + 1).getDepartureTime();
			if (lastArr.minutesUntil(nextDep) < min) {
				min = lastArr.minutesUntil(nextDep);
			}
		}
		if (flights.isEmpty())
			return -1;
		else
			return min;
	}

}

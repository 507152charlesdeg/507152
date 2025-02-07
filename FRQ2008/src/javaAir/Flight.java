package javaAir;

public class Flight {
	
	private Time departureTime;
	private Time arrivalTime;

	public Flight(Time dep, Time arr) {
		departureTime = dep;
		arrivalTime = arr;
	}

	public Time getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Time d) {
		departureTime = d;
	}

	public Time getArrivalTime() {
		return arrivalTime;
	}
}

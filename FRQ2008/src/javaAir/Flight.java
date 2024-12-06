package javaAir;
import java.util.*;
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
	public Time getArrivalTime() {
		return arrivalTime;
	}
}

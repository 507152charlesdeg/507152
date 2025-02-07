package javaAir;

import java.util.*;

public class tester {

	public static void main(String[] args) {
		Time t1 = new Time(11, 30);
		Time t2 = new Time(12, 15);
		Time t3 = new Time(13, 15);
		Time t4 = new Time(15, 45);
		Time t5 = new Time(16, 00);
		Time t6 = new Time(18, 45);
		Time t7 = new Time(22, 15);
		Time t8 = new Time(23, 00);

		Flight part1 = new Flight(t1, t2);
		Flight part2 = new Flight(t3, t4);
		Flight part3 = new Flight(t5, t6);
		Flight part4 = new Flight(t7, t8);

		ArrayList<Flight> thing = new ArrayList<Flight>();

		thing.add(part1);
		thing.add(part2);
		thing.add(part3);
		thing.add(part4);

		Trip vacation = new Trip(thing);

		System.out.println(vacation.getDuration()); // should be 690
		System.out.println(vacation.getShortestLayover()); // should be 15
	}

}

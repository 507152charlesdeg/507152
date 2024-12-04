package frogSimulation;

import java.util.*;

public class FrogSimulation {
	private int goalDistance;

	private int maxHops;

	private int distance;

	public FrogSimulation(int goalDist, int maxHop) {
		goalDistance = goalDist;
		maxHops = maxHop;
	}

	public int hopDistance() {
		// decides if the distance should be positive or negative
		int signDecider = (int) (Math.random() * 10) + 1;
		int number = (int) ((Math.random() * 3) + 1);
		if (signDecider > 2) {
			return number;
		}

		else {
			return -number;
		}
	}

	public boolean simulate() {
		int displacement = 0;
		System.out.println(displacement);
		int numHops = 0;
		while (numHops <= maxHops) {
			displacement += hopDistance();
			System.out.println(displacement);
			numHops++;
			if (displacement >= goalDistance) {
				System.out.println("success");
				return true;
			}
			 if (displacement < 0) {
				 break;
			 }
		}

		System.out.println("fail");
		return false;
	}

	public double runSimulations(int num) {
		double success = 0;
		double fail = 0;

		for (int i = 1; i <= num; i++) {
			if (simulate() == true) {
				success++;
			} else if (simulate() == false) {
				fail++;
			}
		}
		System.out.println();
		System.out.println(success);
		System.out.println("----");
		System.out.println(fail);
		System.out.println();
		double proportion = success / fail;
		return proportion;
	}
}

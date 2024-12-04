package APCalendar;

import java.util.*;

public class APCalendar {

	// constructor
	public APCalendar(){
		//creates a new AP Calendar
	}

	// YES if it's divisible by 4; NO if divisible by 4 && 100; YES if divisible by
	// 400;

	public boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		}
		return false;
	}

	public int numberOfLeapYears(int year, int year2) {
		int numOfLeaps = 0;
		int numYears = Math.abs(year2 - year);
		int[] years = new int[numYears];
		for (int i = 0; i < years.length; i++) {
			years[i] = year + i;
		}

		for (int i = 0; i < years.length; i++) {
			if (isLeapYear(years[i])) {
				numOfLeaps++;
			}
		}

		return numOfLeaps;
	}

	public int firstDayOfYear(int year) {
		int numShifts = Math.abs(year - 1984);
		int offset = numberOfLeapYears(1984, year-1);
		numShifts = numShifts + offset;
		int loops = (numShifts % 7);
		System.out.println(numShifts);
		return loops;
	}

	public int dayOfYear(int day, int month, int year) {
		
		// inspired by Caitlyn Le
		int[] progression = {31, 28, 31, 30, 31, 30, 31, 31, 30, 30, 31};
		
		if (isLeapYear(year) == true) {
				progression[1] += 1;
			}
		for (int i = 0; i < month - 1; i++) {
			day += progression[i];
		}
		return day;

	}

	public int dayOfWeek(int day, int month, int year) {
		int start = firstDayOfYear(year);
		// System.out.println(start);
		int thing = dayOfYear(day, month, year);
		System.out.println(thing);
		int weekday = (thing % 7) + start-1;

		return weekday;
	}
}

package APCalendar;

import java.util.*;

public class APCalendar {

	// constructor
	public APCalendar() {

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
		int numYears = year2 - year;
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
		int numShifts = (year - 1933);
		int offset = numberOfLeapYears(year, year + numShifts);
		numShifts = numShifts + offset;
		int loops = 0;
		if (numShifts >= 0) {
			loops = Math.abs((numShifts % 7));
		} else if (numShifts < 0) {
			loops = (Math.abs((numShifts % 7)));
		}
		return loops;
	}

	public int dayOfYear(int day, int month, int year) {
		if (month == 2) {
			day += 31;
		}
		if (month == 3) {
			day += 31;
			if (isLeapYear(year)) {
				day += 29;
			} else
				day += 28;
			
		}
		if (month == 4) {
			// 30
			day += 31;
			if (isLeapYear(year)) {
				day += 29;
			} else
				day += 28;
			day += 31;
			day += 30;
		}
		if (month == 5){
			day += 31;
			// 31
			if (isLeapYear(year)) {
				day += 29;
			} else
				day += 28;
			day += 31;
			day += 30;
			day += 31;
		}
		if (month == 6) {
			day += 31;
			// 30
			if (isLeapYear(year)) {
				day += 29;
			} else
				day += 28;
			day += 31;
			day += 30;
			day += 31;
			day += 30;
		}
		if (month == 7) {
			day += 31;
			// 31
			if (isLeapYear(year)) {
				day += 29;
			} else
				day += 28;
			day += 31;
			day += 30;
			day += 31;
			day += 30;
			day += 31;
		}
		if (month == 8) {
			day += 31;
			if (isLeapYear(year)) {
				day += 29;
			} else
				day += 28;
			day += 31;
			day += 30;
			day += 31;
			day += 30;
			day += 31;
			day += 31;
		}
		if (month == 9) {
			day += 31;
			if (isLeapYear(year)) {
				day += 29;
			} else
				day += 28;
			day += 31;
			day += 30;
			day += 31;
			day += 30;
			day += 31;
			day += 31;
			day += 30;
		}
		if (month == 10) {
			day += 31;
			if (isLeapYear(year)) {
				day += 29;
			} else
				day += 28;
			day += 31;
			day += 30;
			day += 31;
			day += 30;
			day += 31;
			day += 31;
			day += 30;
		}
		if (month == 11) {
			day += 31;
			if (isLeapYear(year)) {
				day += 29;
			} else
				day += 28;
			day += 31;
			day += 30;
			day += 31;
			day += 30;
			day += 31;
			day += 31;
			day += 30;
			day += 31;
		}
		if (month == 12) {
			day += 31;
			if (isLeapYear(year)) {
				day += 29;
			} else
				day += 28;
			day += 31;
			day += 30;
			day += 31;
			day += 30;
			day += 31;
			day += 31;
			day += 30;
			day += 30;
			day += 31;
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

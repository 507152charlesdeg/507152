package APCalendar;

import java.util.*;

public class APCalendar {
	
	//constructor
	public APCalendar() {
		
	}
	
	// YES if it's divisible by 4; NO if divisible by 4 && 100; YES if divisible by 400;
	
	public boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)){
			return true;
		}
		return false;
	}
	
	public int numberOfLeapYears(int year, int year2) {
		int numOfLeaps = 0;
		int numYears = year2 - year;
		int[] years = new int[numYears];
		for (int i = 0; i < years.length; i++) {
			years[i] = year+i;
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
		System.out.println(numShifts);
		System.out.println();
		int loops = 0;
		if (numShifts >= 0) {
			loops = (numShifts % 6);
			System.out.println(loops);
			System.out.println();
		}
		else if (numShifts < 0) {
			loops = (Math.abs((numShifts % 6)))+1;
			System.out.println(loops);
			System.out.println();
		}
		// TODO resolve issue going from 2017 to 2016, loops never hits 0
		return loops;
	}
	
}

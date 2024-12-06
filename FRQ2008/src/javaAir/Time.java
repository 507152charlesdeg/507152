package javaAir;

public class Time {

	private int hour;
	private int minute;

	// constructor
	public Time(int h, int m) {
		hour = h;
		minute = m;

		// 1:00 should be written as 1300
	}

	/*
	 * * @return difference in minutes, between this time and other; difference is
	 * negative if other is earlier than this time
	 */
	public int minutesUntil(Time other) {
		int thisMins = hour * 60; // 780
		int otherMins = other.hour * 60;// 840
		int otherTotal = otherMins + other.minute;/* 855 */
		int thisTotal = thisMins + minute; /* 780 */
		return (otherTotal - thisTotal);
	}
}

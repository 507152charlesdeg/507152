package DigitThings;

import java.util.*;

public class Digits {

	private ArrayList<Integer> digitList;
	private int number;

	public Digits(int num) {
		digitList = new ArrayList<Integer>();
		if (num != 0) {
			number = num;
			while (number != 0) {
				digitList.add(0, number % 10);
				number /= 10;
			}
		} else
			digitList.add(0);
	}

	public ArrayList<Integer> getDigitList() {
		return digitList;
	}

	public boolean isStrictlyIncreasing() {
		for (int i = 0; i < digitList.size() - 1; i++) {
			if ((digitList.get(i) > digitList.get(i + 1)) || (digitList.get(i) == digitList.get(i + 1))) {
				return false;
			}
		}
		return true;
	}

}

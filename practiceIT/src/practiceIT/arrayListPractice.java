package practiceIT;

import java.util.*;
import java.io.*;

public class arrayListPractice {

	public static void main(String[] args) {
		/*
		 * test #1:["This", "is", "a", "test"] console output: test #2:["even", "odd",
		 * "ev", "o"] console output: test #3:["Did", "you", "solve", "it", "or",
		 * "what?"] console output:
		 */

		ArrayList<String> listy1 = new ArrayList<String>();
		listy1.add("This");
		listy1.add("is");
		listy1.add("a");
		listy1.add("test");
		ArrayList<String> listy2 = new ArrayList<String>();
		listy2.add("even");
		listy2.add("odd");
		listy2.add("ev");
		listy2.add("o");
		ArrayList<String> listy3 = new ArrayList<String>();
		listy3.add("Did");
		listy3.add("you");
		listy3.add("solve");
		listy3.add("it");
		listy3.add("or");
		listy3.add("what?");

		removeEvenLength(listy1);
		System.out.println(listy1);
		removeEvenLength(listy2);
		System.out.println(listy2);
		removeEvenLength(listy3);
		System.out.println(listy3);

		ArrayList<String> listy4 = new ArrayList<String>();
		listy4.add("four");
		listy4.add("score");
		listy4.add("and");
		listy4.add("seven");
		listy4.add("years");
		listy4.add("ago");
		listy4.add("our");

		swapPairs(listy4);
		System.out.println(listy4);
	}

	public static void removeEvenLength(ArrayList<String> strings) {
		for (int i = 0; i < strings.size(); i++) {
			if (strings.get(i).length() % 2 == 0) {
				strings.remove(i);
				i--;
			}
		}
	}

	public static void swapPairs(ArrayList<String> strings) {
		for (int i = 0; i < strings.size() - 1; i += 2) {
			String temp = strings.get(i);// temp holds strings[i]
			strings.set(i, strings.get(i + 1));// strings[i] is changed to the value at [i+1]
			strings.set(i + 1, temp);// strings[i+1] holds temp (the original strings[i])
		}
	}

}

package WordChecker;

import java.util.*;

public class WordChecker {

	private ArrayList<String> wordList;

	public WordChecker(ArrayList<String> l) {
		wordList = l;
	}

	public boolean isWordChain() {
		boolean success = true;
		for (int i = 1; i < wordList.size(); i++) {
			if (wordList.get(i).contains(wordList.get(i - 1)) == false)
				success = false;
		}
		return success;
	}

	// returns a list of all the items in wordList that start with target
	// but it removes target from all those words
	public ArrayList<String> createList(String target) {
		ArrayList<String> output = new ArrayList<String>();
		int length = target.length();

		// get all items w/ target
		for (int i = 0; i < wordList.size() && wordList.get(i).length() >= length; i++) {
			String str = wordList.get(i);

			if (str.substring(0, length).equals(target)) {
				output.add(wordList.get(i));
			}
		}

		// remove "target" from all items in output

		for (int i = 0; i < output.size(); i++) {
			output.set(i, output.get(i).substring(length));
		}

		return output;
	}
}

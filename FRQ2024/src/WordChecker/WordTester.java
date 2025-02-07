package WordChecker;

import java.util.ArrayList;

public class WordTester {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("an");
		list.add("band");
		list.add("band");
		list.add("abandon");
		WordChecker thingy = new WordChecker(list);
		System.out.println(thingy.isWordChain()); // true
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("to");
		list1.add("tool");
		list1.add("stool");
		list1.add("tools");
		WordChecker thingy1 = new WordChecker(list1);
		System.out.println(thingy1.isWordChain());// false

		
		ArrayList<String> wordList = new ArrayList<String>();
		wordList.add("catch");
		wordList.add("bobcat");
		wordList.add("catchacat");
		wordList.add("cat");
		wordList.add("at");
		
		WordChecker thingy2 = new WordChecker(wordList);
		System.out.println(thingy2.createList("cat")); // ["ch", "chacat", ""]
		System.out.println(thingy2.createList("catch")); // ["", "acat"]
		System.out.println(thingy2.createList("dog")); //[]
	}

}

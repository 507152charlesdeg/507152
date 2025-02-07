package wordThings;

import java.util.ArrayList;

public class WordPair {

	private ArrayList<String> list = new ArrayList<String>();
	public WordPair(String first, String second) {
		list.add(first);
		list.add(second);
	}

	public String getFirst() {
		return list.get(0);
	}
	
	public String getSecond() {
		return list.get(1);
	}
	
	public void printWordPair(){
	    System.out.print(list);
	}
	
}
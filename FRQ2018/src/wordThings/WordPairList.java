package wordThings;

import java.util.ArrayList;

public class WordPairList {

	private ArrayList<WordPair> allPairs = new ArrayList<WordPair>();
	
	public WordPairList(String[] words) {
		// 0 1 2 3 4
		// 0-1, 0-2, 0-3, 0-4, 1-2, 1-3, 1-4, 2-3, 2-4, 3-4
		int f = 0;
		int l = 1;
		while (f < words.length - 1){
    		for (; l < words.length; l++){
    		    allPairs.add(new WordPair(words[f],words[l]));
    		}
    		f++;
    		l = f+1;
		}
	}
	
	public void printPairList(){
	    for (WordPair i : allPairs){
	        i.printWordPair();
	    }
	}
	
	

}
package wordThings;

public class Tester {

	public static void main(String[] args) {
		WordPair thing = new WordPair("hello","world");
		System.out.println(thing.getFirst());// hello
		System.out.println(thing.getSecond());// world
		
		String[] listOfWords = {"zero","one","two","three","four"};
		WordPairList listable = new WordPairList(listOfWords);
		listable.printPairList();
		
		/* should return:
	    [[0,1],[0,2],[0,3],[0,4],[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
		
		
		*/
		
	}

}
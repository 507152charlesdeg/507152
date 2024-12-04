package PhraseThings;

public class PhraseTester {

	public static void main(String[] args) {
		Phrase phrasey = new Phrase("Hello worlld");
		System.out.println(phrasey.findNthOccurrence("d", 1));
		// phrasey.replaceNthOccurrence("d", 1, "y");
		phrasey.findLastOccurrence("ll");
		System.out.println(phrasey.toString());
	}

}

package PhraseThings;

public class Phrase {
	private String currentPhrase;

	public Phrase(String p) {
		currentPhrase = p;
	}

	public int findNthOccurrence(String str, int n) {
		int number = 0;
		for (int i = 0; i <= currentPhrase.length() - str.length(); i++) {
			if (currentPhrase.substring(i, i + str.length()).equals(str)) {
				number++;
			}
			if (number == n) {
				return i;
			}
		}

		return -1;
	}

	public void replaceNthOccurrence(String str, int n, String repl) {
		int NthOccurrence = findNthOccurrence(str, n);

		if (NthOccurrence != -1) {
			String firstAndRepl = currentPhrase.substring(0, NthOccurrence) + repl;

			System.out.print(currentPhrase.substring(0, NthOccurrence));
			System.out.print(repl);

			String last = currentPhrase.substring(NthOccurrence + str.length());
			System.out.print(last);
			System.out.println();

			if (currentPhrase.substring(NthOccurrence).equals(last)) {
				currentPhrase = firstAndRepl;
			}

			else
				currentPhrase = firstAndRepl + last;
		}
	}

	public int findLastOccurrence(String str) {
		int count = 0;
		for (int i = 0; i < currentPhrase.length(); i++) {
			if (findNthOccurrence(str,i+1) == -1) {
				count = findNthOccurrence(str,i);
			}
		}
		return count;
	}

	public String toString() {
		return currentPhrase;
	}
}

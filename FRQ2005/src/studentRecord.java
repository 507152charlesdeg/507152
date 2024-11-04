
public class studentRecord {
	private int[] scores; // Global (instance) variable

	// constructor
	public studentRecord(int[] s) {
		scores = s;
	}

	public double average(int first, int last) {
		// 50, 50, 20, 80, 53
		// 0, 1, 2, 3, 4
		// first = 0, last = 4

		double sum = 0;

		for (int i = first; i <= last; i++) {
			sum += scores[i];
		}
		return (sum / ((last - first) + 1));

	}

	public boolean hasImproved() {
		for (int i = 1; i < scores.length - 1; i++) {
			if (scores[i] < scores[i - 1])
				return false;
		}
		return true;
	}

	public double finalAverage() {
		if (hasImproved() == true) {
			return average(scores.length / 2, scores.length - 1);
		} else
			return average(0, scores.length - 1);
	}
}

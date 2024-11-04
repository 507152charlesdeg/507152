package FRQ2009;

public class NumberCubeSim {
	// constructor

	// causing a cube to come into existence
	private NumberCube cube;

	public NumberCubeSim(NumberCube cubeToBeUsed) {
		cube = cubeToBeUsed;
	}

	public int[] getCubeTosses(int numTosses) {
		int[] tosses = new int[numTosses];
		for (int i = 0; i < numTosses; i++)
			tosses[i] = cube.toss();

		return tosses;
	}

	public int getLongestRun(int[] values) {
		int runLength = 1;
		int maxLength = 1;
		int runStartIndex = 0;
		int biggestRunStartIndex = 0;
		int index = 0;

		for (int i = 1; i < values.length; i++) {
			// index starts at 0, i starts at 1

			if (values[index] == values[i]) {
				runLength++;
				if (runLength > maxLength) {
					maxLength = runLength;
					runStartIndex = (i - runLength + 1);
					biggestRunStartIndex = runStartIndex;
				}
			} else {
				runLength = 1;
			}
			index++;
		}

		if (maxLength == 1) {
			return -1;
		} else {
			return biggestRunStartIndex;
		}

	}

}

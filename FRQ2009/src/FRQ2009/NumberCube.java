package FRQ2009;

public class NumberCube {

	private int sides;

	// constructor
	public NumberCube(int numSides) {
		this.sides = numSides;
	}

	public int toss() {
		return (int) (Math.random() * sides) + 1;
	}

	public int[] getCubeTosses(int numTosses) {
		int[] outputs = new int[numTosses + 1];
		for (int i = 0; i < outputs.length; i++) {
			outputs[i] = toss();
		}
		return (outputs);
	}

}
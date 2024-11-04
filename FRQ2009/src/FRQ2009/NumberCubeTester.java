package FRQ2009;

public class NumberCubeTester {

	public static void main(String[] args) {
		NumberCube Cubyx_TheTakenCube = new NumberCube(10);
		// System.out.println(cubey.toss());

		NumberCubeSim sim1 = new NumberCubeSim(Cubyx_TheTakenCube);
		int[] data = sim1.getCubeTosses(5);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

}

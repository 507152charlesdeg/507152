package SoundShenanigans;

// import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		int[] example = { 0, 0, 0, 0, 0, 2246, 2777, -2635, 1415, -296, 1369, 2677, -27, 27, 619, 551 };

		Sound thing = new Sound(example);

		System.out.println(thing.limitAmplitude(2000));
		// thing.trimSilenceFromBeginning();
	}

}

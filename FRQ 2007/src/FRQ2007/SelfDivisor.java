package FRQ2007;

import java.util.*;

public class SelfDivisor {
	private int number;

	public SelfDivisor(int number) {
		this.number = number;
	}

	public boolean isSelfDivisor(int number) {
		int original = number;
		boolean successful = false;
		while (number % 10 != 0) {
			if (original % (number % 10) == 0) {
				successful = true;
			} else {
				successful = false;
				return successful;
			}
			number /= 10;
		}

		return successful;
	}

	public int[] firstNumSelfDivisors(int start, int num) {
		// start = 10, num = 3
		// output should be a list containing 11, 12, and 15
		int[] numbers = new int[num];
		int index = 0;
		int distance = 0;

		while (true) {
			int newnumber = start + distance;
			if (isSelfDivisor(newnumber)) {
				numbers[index] = newnumber;
				if ((index + 1) == num)
					return (numbers);
				else
					index++;
			}

			distance++;
		}
	}

}

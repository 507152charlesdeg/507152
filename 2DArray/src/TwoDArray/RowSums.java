package TwoDArray;

import java.io.*;

public class RowSums {

	public static int[] rowSums(int[][] data) {
		int[] output = new int[data.length];

		// declare the sum
		int sum;
		// compute the sums for each row
		for (int row = 0; row < data.length; row++) {
			// initialize the sum
			sum = 0;
			// compute the sum for this row
			for (int col = 0; col < data[row].length; col++) {
				sum += data[row][col];
			}
			output[row] = sum;
			// write the sum for this row
			System.out.println();
		}
		return output;
	}

	public static void main(String[] args) {
		int[][] data = { { 3, 2, 5 }, { 1, 4, 4, 8, 13 }, { 9, 1, 0, 2 }, { 0, 2, 6, 3, -1, -8 } };
		rowSums(data);
	}

}

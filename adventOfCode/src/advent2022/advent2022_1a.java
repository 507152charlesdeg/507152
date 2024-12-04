package advent2022;

import java.io.*;
import java.util.*;
public class advent2022_1a {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanBoi = new Scanner(new File("data_1a_2022.txt"));
		int k = 0;
		int sum = 0;
		int max = 0;
		while (scanBoi.hasNext()) {
			String data = scanBoi.nextLine();
			if (data.equals("")) {
				if (sum > max) {
					max = sum;
				}
				sum = 0;
			}
			else {
				sum += Integer.parseInt(data);
			}
			k++;
		}
		System.out.println(max);
	}

}

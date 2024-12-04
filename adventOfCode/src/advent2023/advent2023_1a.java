package advent2023;

import java.io.*;
import java.util.*;

public class advent2023_1a {
	public static void main(String[] args) throws FileNotFoundException {
		try (Scanner scanBoi = new Scanner(new File("data_1a_2023.txt"))) {
			String[] data = new String[1000];
			int k = 0;
			while (scanBoi.hasNext()) {
				data[k] = scanBoi.nextLine();
				System.out.println("new line added");
				k++;
			}

			String output = "";
			int result = 0;
			int line = 0;
			int i = 0;
			String output2 = "";
			// data[line] means the line "line + 1" (line 1, line 2, etc.
			int j = data[line].length() - 1;

			while (line < data.length - 1) {

				while (i < data[line].length()) {
					System.out.println(data[line]);
					if (data[line].equals("0") || data[line].equals("1") || data[line].equals("2") || data[line].equals("3")
							|| data[line].equals("4") || data[line].equals("5") || data[line].equals("6") || data[line].equals("7")
							|| data[line].equals("8") || data[line].equals("9")) {
						output = data[line];
						System.out.println(output);
						break;
					}
					i++;
					line++;
				}
				line = data[line].length() - 1;
				while (j > 0) {
					System.out.println(data[line]);
					if (data[line].equals("0") || data[line].equals("1") || data[line].equals("2") || data[line].equals("3")
							|| data[line].equals("4") || data[line].equals("5") || data[line].equals("6") || data[line].equals("7")
							|| data[line].equals("8") || data[line].equals("9")) {
						output2 = data[line].substring(j,j+1);
						System.out.println(output2);
						break;
					}
					j--;
					line++;
				}

				if (output2.equals("")) {
					System.out.println(output);
					output2 = output;
					System.out.println("\"" + output2 + "\"");
				}

				if (output.equals("")) {
					System.out.println(output2);
					output = output2;
					System.out.println('\"' + output + '\"');
				}
				
				int thingamabob = Integer.parseInt(output + output2);
				result += thingamabob;
				System.out.println(result);
			}

			// output things
			System.out.println(output2.equals(""));
			System.out.println(output.equals(""));

			System.out.println(result);

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

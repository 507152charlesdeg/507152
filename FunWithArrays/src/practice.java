import java.util.Iterator;

public class practice {

	public static void main(String[] args) {
		int[] array = { 3, 4, 2, 1, 5 };

		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(max);

		int min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(min);

		/*
		 * System.out.println(array[1]); String name = "computer science";
		 * System.out.println(name.substring(0,1)); for (int i = 0; i <= array.length;
		 * i++) { System.out.println(array[5]); } for (int i = 0; i < name.length();
		 * i++) { System.out.println(name.substring(i,i+1)); } int sum = 0; for (int i =
		 * 0; i <= array.length; i++) { sum = sum + i; } System.out.println(sum);
		 * System.out.println(countEvens([2,1,2,3,4]));
		 */

	}
	/*
	 * public static int countEvens(int[] nums) { int evens = 0; for (int i = 0; i <
	 * nums.length; i++) { if (nums[i] % 2 == 0) { evens++; } } return evens; }
	 */

}

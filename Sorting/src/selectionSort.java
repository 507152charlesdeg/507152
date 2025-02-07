
public class selectionSort {

	public static void main(String[] args) {
		Integer[] nums = { 7, 12, 5, 8, 3, 6 };
		runSelectionSort(nums, nums.length);
		for (Integer i : nums) {
			System.out.print(i + " ");
		}
	}

	public static void runSelectionSort(Integer[] item, int size) {
		for (int k = 0; k < size - 1; k++) {
			swapMinToFront(item, k, size - 1);
		}
	}

	private static void swapMinToFront(Integer[] item, int start, int end) {
		int indexSmallest = start;// 0
		for (int k = start + 1; k <= end; k++) {
			if (item[k].compareTo(item[indexSmallest]) < 0)
				indexSmallest = k;// 4
		}
		Integer saved = item[start];// saved = 7
		item[start] = item[indexSmallest];// = 3
		item[indexSmallest] = saved;// = 7

	}

}


public class exercise13_3 {

	public static void runSelectionSort(Integer[] item, int size) {
		for (int k = 0; k < size - 1; k++) {
			swapMaxToRear(item, 0, size - k - 1);
		}
	}

	private static void swapMaxToRear(Integer[] item, int start, int end) {
		int indexLargest = start;
		for (int i = start + 1; i <= end; i++) {
			if (item[i].compareTo(item[indexLargest]) > 0) {
				indexLargest = i;
			}
		}
		
		Integer temp = item[end];
		item[end] = item[indexLargest];
		item[indexLargest] = temp;
		
		for (Integer i : item) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	private static void swapMinToFront(Integer[] item, int start, int end) {
		int indexSmallest = start;// 0
		for (int k = start + 1; k < end; k++) {
			if (item[k].compareTo(item[indexSmallest]) < 0)
				indexSmallest = k;// 4
		}
		Integer saved = item[start];// saved = 7
		item[start] = item[indexSmallest];// = 3
		item[indexSmallest] = saved;// = 7

		for (Integer i : item) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] nums = { 7, 12, 5, 8, 3, 6 };
		for (Integer i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();
		runSelectionSort(nums, nums.length);
		for (Integer i : nums) {
			System.out.print(i + " ");
		}
	}

}

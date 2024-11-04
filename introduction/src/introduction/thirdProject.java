package introduction;

public class thirdProject {

	public static void main(String[] args) {
		int[] nums = {2,4,6,8,10};
		int x = nums.length;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		for (int i: nums) {
			System.out.print(i+" ");
		}

	}

}

package leetCodeQ;

public class Question3 {

	public static int removeDuplicates(int[] nums) {

		int k = 0;
		int pointer = 0;

		while (pointer + 1 < nums.length) {

			if (nums[pointer] != nums[pointer + 1]) {
				pointer++;
			} else {

				for (int i = pointer + 1; i < nums.length; i++) {

					if (i + 1 < nums.length) {
						int current_value = nums[i];
						int next_value = nums[i + 1];
						nums[i] = next_value;
						nums[i + 1] = current_value;
					}
				}
			}

		}

		for (int i = 0; i < nums.length; i++) {
			if (i + 1 < nums.length) {
				if (nums[i + 1] > nums[i]) {
					k++;
				} else {
					i = nums.length;
				}
			}
		}
		
		System.out.println(" k: " + (k + 1));

		return k+1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[3];
		nums[0] = 1;
		nums[1] = 1;
		nums[2] = 2;
//		nums[3] = 1;
//		nums[4] = 1;
//		nums[5] = 2;
//		nums[6] = 2;
//		nums[7] = 3;
//		nums[8] = 3;
//		nums[9] = 4;

		removeDuplicates(nums); //

	}

}

package leetCodeQ;

import java.util.Arrays;

public class MissingNumber {

	public static int missingNumber(int[] nums) {

		Arrays.sort(nums);
		int answer = 0;

		for (int i = 0; i < nums.length - 1; i++) {

			if (i + 1 < nums.length) {

				int currentNumber = nums[i] + 1;

					if (currentNumber != nums[i + 1]) {
						answer = nums[i] + 1;
						return answer;
					} 
			}
		}

		if (nums[0] == 0) {
			return answer + 1;
		} else {
			return answer = 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {0,1};// [0,4] //3
		System.out.println(missingNumber(nums)); //

	}

}

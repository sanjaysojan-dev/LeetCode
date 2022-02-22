package leetCodeQ;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SingleNumber136 {

	public static int singleNumber(int[] nums) {

		int ans = 0;
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i += 2) {

			if (i + 1 < nums.length - 1) {

				if (nums[i] != nums[i + 1]) {
					ans = nums[i];
					break;
				}
			} else {
				ans = nums[i];
			}

		}
		System.out.println(ans);

		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2,2,1 };
		// [1]
		// {1,1,2,2,3,4,4,5,5};

		singleNumber(nums);
	}

}

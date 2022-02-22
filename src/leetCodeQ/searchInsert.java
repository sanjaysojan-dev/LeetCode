package leetCodeQ;

import java.util.Arrays;

public class searchInsert {

	public static int searchInsert(int[] nums, int target) {

		boolean bool = true;
		int pos = 0;
		int last = nums.length - 1;

		// check for the target = TRUE
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == target) {
				pos = i;
				return pos;

			}

		}

		System.out.println("the target is at " + pos);

		if (pos == 0) {
			bool = false;

		}

		System.out.println("False= " + bool);
		// check for the target = FALSE

		System.out.println("target " + target);
		System.out.println("last " + nums[last]);

		if (bool == false && target < nums[last]) {
			System.out.println("bool false and nums less than target");
			nums[last] = target;
			Arrays.sort(nums);
//				
		} else {
			nums[last] = target;
			Arrays.sort(nums);
			pos = 1;
		}

		for (int i = 0; i < nums.length; i++) {

			System.out.print(nums[i]);
			if (nums[i] == target) {
				pos = pos + i;

			}

		}

		System.out.println("pos= " + pos);

		return pos;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 5,6,9 };
		int target = 10;

		System.out.println(searchInsert(nums, target));
	}

}

//4,7,8 -> 9
//bool=false , target<last
//4,7,9
//sort
//4,7,9
//pos + 1= 


//check if the target is in the array -  1 for loop
//try to add the target number to the array - new array 1 for loop
//sort the new array
//check if the target is in the array 1 for loop



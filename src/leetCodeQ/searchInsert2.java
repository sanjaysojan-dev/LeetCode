package leetCodeQ;

import java.util.Arrays;

public class searchInsert2 {

	// check if the target is in the array - 1 for loop
	// try to add the target number to the array - new array 1 for loop
	// sort the new array
	// check if the target is in the array 1 for loop

	public static int searchInsert(int[] nums, int target) {
		
		int pos = 0;
		int [] newNums = new int [nums.length+1];
		//1,2,3,4 -> 5
		
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == target) {
				pos = i;
				return pos;

			} else {
				newNums[i] = nums[i];
				newNums[nums.length] = target;
			}
		}
		
		Arrays.sort(newNums);
		
		for (int i = 0; i < newNums.length; i++) {

			if (newNums[i] == target) {
				pos = i;
				return pos;
			} 
		}
		
		
		return pos; 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {  2, 3, 4 };
		int target = 1;

		System.out.println(searchInsert(nums, target));
	}

}

package leetCodeQV2;

public class TwoSum {

    /**
     *
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * You can return the answer in any order.
     *
     * **/

    /**
     * Example 1:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     *
     * Example 2:
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     *
     * Example 3:
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     *
     *
     *  a + b = target
     *  a =  target - b
     *  b =  target - a
     **/

    public static int[] twoSumSolutionOne(int[] nums, int target) {
        int[] indices = new int[2];

        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    indices[0] = i;
                    indices[1] = j;
                    System.out.println("Indice 1: " + indices[0] + " Indice 2: " + indices[1]);
                }
            }
        }

        return indices;
    }

    public static void main(String[] args) {
        //int[] nums = {2, 7, 11, 15}; target = 9
        //int[] nums = {15, 7, 11, 2}; target = 0
        //int [] nums = {3, 3};
        int[] nums = {3,2,4};
        int target = 6;

        twoSumSolutionOne(nums,target);
    }
}

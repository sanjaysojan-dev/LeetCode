package leetCodeQV2;

import java.util.Arrays;
import java.util.HashMap;

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
     * <p>
     * Example 2:
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * <p>
     * Example 3:
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
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


    /**
     * Hashmap -> Key Value Pair K -> V
     * O(n) for look up - constant time
     * <p>
     * Loop through the array once and for each
     * iteration or each element you store the number
     * you would need to add to get to the target as
     * the key and you store the index as the value at
     * that point for the key.
     * <p>
     * <p>
     * {5, 2, 4} target = 6
     * <p>
     * K -> V
     * <p>
     * Look up value  = target - current element
     * Each time we calculate look up value we
     * check the hashmap to see if the key and value
     * exists.
     * <p>
     * For the first element = 5
     * K = 1
     * V = 0
     * 1 -> 0
     * <p>
     * For the second element = 2
     * 6 -2 = 4
     * K = 4
     * V = 1
     * <p>
     * For the third element = 4
     * 6 - 4 = 2
     * K = 2
     * V = 2
     * <p>
     * <p>
     * a + b = target
     * a =  target - b
     *
     * We iterate and check if the element exists within the lookup
     *
     *
     */
    public static int[] twoSumSolutionTwo(int[] nums, int target) {
        HashMap<Integer, Integer> complementLookUp = new HashMap<>();

        for (int i = 0; i <= nums.length - 1; i++) {
            int complement = target - nums[i];
            if (complementLookUp.containsKey(nums[i])) {
                return new int[]{i, complementLookUp.get(nums[i])};
            }
            complementLookUp.put(complement, i);
        }

        return nums;
    }


    public static void main(String[] args) {
        //int[] nums = {2, 11, 7, 15}; target = 9
        //int[] nums = {15, 7, 11, 2}; target = 9
        //int [] nums = {3, 3};
        int[] nums = {2, 11, 7, 15};
        int target = 9;

        //twoSumSolutionOne(nums,target);
        System.out.println(Arrays.toString(twoSumSolutionTwo(nums, target)));

    }
}

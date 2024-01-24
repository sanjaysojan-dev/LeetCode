package leetCodeQV2;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {

        int k = 1;
        int i = 0;
        int j = i+1;
        int index = 1;

        while (j <= nums.length -1) {
            if (nums[i] != nums[j]) {
                nums[index] = nums[j];
                k++; index++;
            }
            i++; j++;
        }
        return k;
    }

    public static int removeDuplicatesSolutionTwo(int[] nums) {

        int k = 1;
        int i = 0;
        int j = i+1;
        int index = 1;



        while (j <= nums.length -1) {
            if (nums[i] != nums[j]) {
                nums[index] = nums[j];
                k++; index++;
            }
            i++; j++;
        }
        return k;
    }


    public static void main(String[] args) {
        int[] nums  = {1, 1, 2, 3, 3, 4}; // Input array
        int[] expectedNums = {1, 2, 3, 4}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

}

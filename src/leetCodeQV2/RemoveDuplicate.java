package leetCodeQV2;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class RemoveDuplicate {

    public static int removeElement (int [] nums, int val) {
        int i = 0;
        int j = i +1;
        int index = 0;

        while (j <= nums.length -1) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
            i++; j++;
        }

        return index;

    }
    public static void main (String [] args ) {



        int[] expectedNums = {0 ,1, 3, 0, 4};

        int [] nums = {0,1,2,2,3,0,4,2};
        //[0,1,2,2,3,0,4,2]
        //Output = [0,1,4,0,3,_,_,_]

        int k = removeElement(nums, 2); // Calls your implementation

        assert k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }

        //System.out.println(removeElement(nums, 2));
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

    }
}

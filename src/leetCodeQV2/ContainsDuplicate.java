package leetCodeQV2;

import java.util.HashMap;

import static java.lang.Math.abs;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] input) {
        HashMap<Integer, Integer> uniqueValues = new HashMap<>();

        for (int i = 0; i <= input.length - 1; i++) {

            if (uniqueValues.containsKey(input[i])) {
                int count = 0;
                count = uniqueValues.get(input[i]) + 1;
                if (count >= 2) {
                    return true;
                }
                uniqueValues.put(input[i], count);
            }
            uniqueValues.put(input[i], 1);
        }

        return false;
    }

    public static boolean containsDuplicateII(int[] input, int k) {
        HashMap<Integer, Integer> uniqueValues = new HashMap<>();

        for (int i = 0; i <= input.length - 1; i++) {

            if (uniqueValues.containsKey(input[i])) {
                int indexOfDuplicate = uniqueValues.get(input[i]);
                int cal = i - indexOfDuplicate;
                if ((cal <= k)) {
                    return true;
                }
            }
            uniqueValues.put(input[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        //int []  input = {1,1,1,3,3,4,3,2,4,2};
        //System.out.println(containsDuplicate(input));
        int k = 2;
        int []  input = {1,2,3,1,2,3};

        System.out.println(containsDuplicateII(input, k));

    }
}

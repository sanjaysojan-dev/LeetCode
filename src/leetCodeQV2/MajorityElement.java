package leetCodeQV2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] input) {
        HashMap<Integer, Integer> inputMap = new HashMap<>();
        Map.Entry<Integer, Integer> majorityElement = null;
        for (int element : input) {
            if (inputMap.containsKey(element)) {
                int count = inputMap.get(element) + 1;
                inputMap.put(element, count);
            } else {
                inputMap.put(element, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : inputMap.entrySet()) {
            if (majorityElement == null || entry.getValue().compareTo(majorityElement.getValue()) > 0) {
                majorityElement = entry;
            }
        }

        return majorityElement.getKey();
    }

    public static int majorityElemenntII (int [] input) {
        Arrays.sort(input);
        return input[input.length/2];
    }


    public static void main(String[] args) {
        int[] input = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(majorityElement(input));
    }
}

package leetCodeQV2;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] input) {
        // int [] = {1 ,2, 3, 4};
        String integerValue = "";
        int[] newArray;
        for (int i = 0; i <= input.length -1; i++) {
            integerValue += String.valueOf(input[i]);
        }
        int value = Integer.parseInt(integerValue) +1;
        integerValue =  String.valueOf(value);
        newArray = new int[integerValue.length()];

        for (int i = 0; i <= integerValue.length() -1; i++) {
            newArray[i] = Character.getNumericValue(integerValue.charAt(i));
        }
        return newArray;
    }


    //Solution does not work - maybe?
    public static int [] plusOneV2 (int [] digits) {
        int length = digits.length;
        int [] output = Arrays.copyOf(digits, digits.length+1);
        while (length == 1 && digits[length-1] == 9) {
            output[output.length-2]=1;
            return output;
        }
        digits[length-1]=digits[length-1]+1;
        return digits;
    }

    public static void main(String[] args) {
        int [] input = {1 ,2, 9};
        System.out.println(Arrays.toString(plusOne(input)));
        //Ans: 1, 2, 10
        System.out.println(Arrays.toString(plusOneV2(input)));
    }
}

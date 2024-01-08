package leetCodeQV2;

public class PalindromeNumber {
    /**
     * Given an integer x, return true if x is a
     * palindrome
     * , and false otherwise.
     *
     *
     *
     * Example 1:
     *
     * Input: x = 121
     * Output: true
     * Explanation: 121 reads as 121 from left to right and from right to left.
     * Example 2:
     *
     * Input: x = -121
     * Output: false
     * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
     * Example 3:
     *
     * Input: x = 10
     * Output: false
     * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     */

   public static boolean palindromeSolutionOne (int input) {
       String x = Integer.toString(input);

        String reverseX = "";

        for (int i = x.length()-1; i >= 0; i-- ) {
            String value = String.valueOf(x.charAt(i));
            reverseX += value;
        }

        if (x.equalsIgnoreCase(reverseX)) {
            return true;
        }
        return false;
    }


    public static boolean palindromeSolutionTwo (int x) {
          if (x < 0) {
              return false;
          }

          int ans = x;
          int rev = 0;

          while (x != 0) {
              int digit = x % 10;
              rev = rev * 10 + digit;
              x = x / 10;
          }
          return ans == rev;
    }


    public static boolean palindromeSolutionThree(int x) {
        String s = String.valueOf(x);
        int len = s.length();
        int left = 0; int right = len-1;
        while (left <= right) {
            if (s.charAt(left)!=s.charAt(right)) {
                return false;
            }
            left++; right--;
        }
        return true;
    }

    public static void main (String [] args) {
        System.out.println(palindromeSolutionOne (-121));
        System.out.println(palindromeSolutionTwo (121));
        System.out.println(palindromeSolutionThree (121));
    }

}


package leetCodeQ;

import java.util.Arrays;

public class Udemy {

	public void printElements(int arr[], int arrLength) {
		if (arrLength != 0) {
			arrLength--;
			printElements(arr, arrLength);
			System.out.println(arr[arrLength]);
		}
	}

	public static int sum(int k) {
		if (k > 0) {
			return k + sum(k - 1);
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5, 6, 7 };
		int arrLength = arr.length;

		Udemy mv = new Udemy();
		//mv.printElements(arr, arrLength);
		
		sum(3);
	}

}

/*
 * // arrLength = 4 -> arrLength = 3 calls printElements at Line 8 // printed 1
 * // //printElements (arr[], 3) -> arrLength = 2 printElements at Line 8 //
 * printed 2 // //printElements (arr[], 2) -> arrLength = 1 printElements at
 * Line 8 // printed out 6 // //printElements (arr[], 1) -> arrLength = 0
 * printElements at Line 8 // printed out as 5 // //printElements (arr[], 0) ->
 * 11 then it returns back to when it was first called.
 */

/*
 * class StringClass { String str = new String("Emy is Great");
 * 
 * String getString() { return str.substring(1, 3) + str.substring(9, 12); } }
 */
/*
 * public class Udemy extends StringClass {
 * 
 * // public static void main(String[] args) { // Udemy main = new Udemy(); //
 * System.out.println(main.getString()); // } // // System.out.println("sjsjs");
 * 
 * 
 * public static void main(String[] args) {
 * 
 * int a1[][] = { { 10, 20 }, { 40, 50 }, { 60, 70 } };
 * 
 * int a2[][] = { { 10, 20 }, { 40, 50 }, { 60, 71-1 } };
 * 
 * System.out.println("Check if a1 is equal to a2 : " + Arrays.deepEquals(a1,
 * a2)); } }
 */
// 10 << 1  --> 100 = 4
// 1000 >> 1

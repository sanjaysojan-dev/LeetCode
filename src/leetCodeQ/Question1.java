package leetCodeQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Question1 {

	public static Map<String, Object> values = new HashMap<>();
	// Map values= new HashMap();
	static {

		values.put("M", 1000);
		values.put("D", 500);
		values.put("C", 100);
		values.put("L", 50);
		values.put("X", 10);
		values.put("V", 5);
		values.put("I", 1);
	}

	/**
	 * 
	 * @param s input 
	 * @return
	 */
	public static int romanToInt(String s) {

		int sum = 0;

		//iterates through string input 
		for (int i = 0; i < s.length(); i++) {

			//obtains letter value 
			int s1 = (int) values.get(Character.toString(s.charAt(i)));

			//checks to see if you are in bound
			if (i + 1 < s.length()) {
				
				// obtains letter value to compare against letter before
				int s2 = (int) values.get(Character.toString(s.charAt(i + 1)));

				//if first character is greater than second  - you add
				if (s1 > s2) {

					sum = sum + s1;
					System.out.println("Value of n: " + sum);

				} else {

					//if first character is less than second  - you subtract
					sum = sum + (s2 - s1);
					i++;
					System.out.println("Value of n: " + sum);
				}

			} else {
				//conditional case when input length is 1
				sum = sum + s1;
				System.out.println(sum);
			}
			
		}

		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		romanToInt("MCMIV"); //

	}

}

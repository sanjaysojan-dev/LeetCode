package leetCodeQ;

public class addBinary {

	public static String addBinary(String a, String b) {

//		int A=Integer.parseInt(a);
//		int B=Integer.parseInt(b);	
		int[] first = new int[a.length()];
		int[] sec = new int[b.length()];
		
		int carry = 0;
		
		int[] out = new int[a.length() + b.length()];

		for (int i = 0; i < a.length(); i++) {
			first[i] = a.charAt(i) - '0';
			// System.out.print(first[i]);
		}

		for (int i = 0; i < b.length(); i++) {
			sec[i] = a.charAt(i) - '0';

		}

		for (int i = first.length - 1; i >= 0; i--) {
			for (int j = sec.length - 1; j >= 0; j--) {
				carry = first[i] + sec[j];
				System.out.println(carry);

			}
		}

		return b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "11011";
		String b = "11001";
		addBinary(a, b);
		// 

	}

// if length of arrays are different we sort it out such that they are the same
// convert both inputs into integer arrays - two for loops
// declare carry
// nested for loop, going through first array and then going through second array
// In the body of the nested for loop -
/**
 * Conditions:
 * 	if ()
 *  else 
 *  (
 *   )
 * 
 */
}

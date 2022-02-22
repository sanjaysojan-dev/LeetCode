package leetCodeQ;

public class PlusOne66 {

	public static int[] plusOne(int[] digits) {

		int length = digits.length - 1;// last digit

//		if (digits[length] == 9)// last digit
//		{
//			digits[length] = 0;

			for (int i = length; i >= 0; i--) // from second last
			{
				if (digits[i] == 9) {
					digits[i] = 0;

				} else {
					digits[i] = digits[i] + 1;
					System.out.println("i=" + i);
					i = 0;
				}

			} 
			
//			for (int i = length; i >= 0; i--) {
//				if (digits[i] != 0) {
//					digits[i+1] = digits[i+1] + 1;
//					System.out.println("i=" + i);
//					i = 0;
//				}
//			}
			
			
			//TODO: Fix last segment 
			digits[length] = digits[length] + 1;
			
	

		for (int x : digits) {
			System.out.println(x);
		}

		return digits;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//990
		int[] digits = { 9,9,9 };// 223100
		plusOne(digits);

	}

}


// - Checked last digit to see if it is 9
// - If it is 9 - change last digit to zero 
// - iterate backwards to check if it is 9, if it is 9 
// you change to zero
//- work your way backwards again to check if it is not
// equal to zero, to add the one. 
//
//









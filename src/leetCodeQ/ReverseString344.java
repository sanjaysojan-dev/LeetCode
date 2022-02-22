package leetCodeQ;

public class ReverseString344 extends Thread {
	
	 public static void reverseString(char[] c_arr) {

	    	char ch;
	    	//String ss= new String(c_arr);
	    	char [] new_array = new char[c_arr.length];
	    	
	    	int counter = 0; 

	    	for(int i=c_arr.length-1;i>=0;i--)
	    	{
	    		//System.out.println(i);
	    		new_array[counter] = c_arr[i];
	    		//System.out.println(counter);
	    		counter++;
	    		
	    		
	    	}
	    	
	    	for (int i = 0; i <=new_array.length-1; i++) {
	    		c_arr [i] = new_array[i];
	    		
	    	}
	    	
	    	//Printing 
	    	for (int i = 0; i <=c_arr.length-1; i++) {
	    		System.out.println(c_arr[i]);
	    	}
	    	
	    }
	 
	 public static void main (String [] args) {
		 char[] c_arr= {'n','i','l','o'};
			reverseString(c_arr);
			
			//Thread newThread = new Thread();
			
	 }

}
 
package leetCodeQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses20 {

	// Hash table that takes care of the mappings.
	private HashMap<Character, Character> mappings = new HashMap<Character, Character>();

	// Initialize hash map with mappings. This simply makes the code easier to read.
	public ValidParantheses20() {

		this.mappings.put(')', '(');
		this.mappings.put('}', '{');
		this.mappings.put(']', '[');
	}

	public boolean isValid(String s) {

		// Initialize a stack to be used in the algorithm.
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);//(

			// If the current character is a closing bracket.
			if (this.mappings.containsKey(c)) {

				// Get the top element of the stack. If the stack is empty, set a dummy value of
				// '#'
				char topElement = stack.empty() ? '#' : stack.pop();

				System.out.println("top" + topElement);
				// If the mapping for this bracket doesn't match the stack's top element, return
				// false.
				if (topElement != this.mappings.get(c)) {//
					System.out.println("Stack: "+ stack.toString());
					return false;
				}
			} else {
				// If it was an opening bracket, push to the stack.
				stack.push(c);
				System.out.println("Stack: "+ stack.toString());
			}
		}
		
		System.out.println("Stack: "+ stack.toString());

		// If the stack still contains elements, then it is an invalid expression.
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ValidParantheses20 v = new ValidParantheses20();
		//System.out.println(v.isValid("{}()"));
        //	isValid("{}");
		// isValid("[]");
		// isValid("()[]{}");
		// isValid("cat");
	
		 	int size = 6;
	        int count = 2;
	      
	        while( size-- != count++);
	        //4 - count
	        //4 - size
	        
	      System.out.printf("    "+"%d",count << size >> count );
	       
	      //100 
	      //100 0000
	
	      //100
	      //010
	      //001
	     
	        //System.out.printf("%d",count << size );
	       // System.out.printf("    "+"%d", size >> count );
	        //System.out.printf("    "+"%d",count << size >> count );
	}

}
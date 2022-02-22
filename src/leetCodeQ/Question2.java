package leetCodeQ;

public class Question2 {

	
	public static String longestCommonPrefix(String[] strs) 
	{
		//Basic input validation 
	    if (strs == null || strs.length == 0) 
	    	return "";
	    
	    //For character c
	    for (int i = 0; i <strs.length ; i++)
	    {
	        char c = strs[0].charAt(i);///i refers to letter/character 
	        
	        //j refers to the word 
	        for (int j = 1; j < strs.length; j ++) 
	        {
	            if (i == strs[j].length() || strs[j].charAt(i) != c)
	                return strs[0].substring(0, i);             
	        }
	    }
	    return strs[0];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strs= {"aff", "afff", "affktyfjf"};
		
		System.out.println(longestCommonPrefix(strs));
		
	}
}

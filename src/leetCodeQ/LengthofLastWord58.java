package leetCodeQ;

public class LengthofLastWord58 {

	 public static int lengthOfLastWord(String s) {
		 int start=0;
		 int answer = 0;
		 char[] c = s.toCharArray();
		 System.out.println("total length="+s.length());
		 
		 for(int j=s.length()-1;j>=0;j--)
		 {
			 
			 if(c[j]!=' ')
			 {
				 start=j;
				 System.out.println("c[start]="+c[start]);
				 break;
			 }
			
		 }
		 System.out.println("start="+start);
		 //"joy"

		 for(int i=start;i>=0;i--)
		 { 
			 if(c[i]==' ')
			 {
				 int j=i+1;
				 i=0;
				
				 //System.out.println("until start"+(s.substring(j,start).length()+1));
				 answer=(s.substring(j,start).length()+1);
				 //System.out.println("answer"+answer);
			 } else {
				 answer = answer + 1 ;
			 }
			  
		 }
		 System.out.println("answer: "+answer);
		  
		return answer;
	        
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//"ab joy "
		//"joy "
		//" joy "
		//"joy"
		lengthOfLastWord("l"); 
	   
	}
	
	

}

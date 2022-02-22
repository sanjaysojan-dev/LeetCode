package leetCodeQ;

import java.util.Arrays;

public class RemoveDupl26 {
	
	 public static int removeDuplicates(int[] nums) {
		 int last = 0;
		 int length=0;
	
		 for(int k=0;k<nums.length;k++)
		 {
		 for(int i=0;i<nums.length;i++)
		 {
			 last=nums[nums.length-1];
			 for(int j=i+1;j<nums.length;j++)
			 {
				 if(nums[i]==nums[j])
				 {
					 nums[j]=last;
					 Arrays.sort(nums);
				 } 
				 
			 }
		 
			 
		 }
		 if(nums[k]==last)
		 {
			 System.out.println("pos=="+k);
			 length=k+1;
			System.out.println("length ="+length);
			 break;
				// "boy"		 
		 }
		 		
		 System.out.print(nums[k]);
		 
		 //System.out.print(nums[k]);
		 }
		return length;
	        
	    }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {1,1,2,2,2,3,4,4,5,5,6};

		//1,6,2,6,6,3,4,6,5,6,6
		//1,2,3,4,5,6,6,6,6
		
		 removeDuplicates(nums);// 1,2,3,4= 4
		
	}

}

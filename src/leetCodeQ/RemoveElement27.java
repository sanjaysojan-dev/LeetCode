package leetCodeQ;

import java.util.Arrays;

public class RemoveElement27 {

	public static int removeElement(int[] nums, int val) {
		
		int count=0;
		Arrays.sort(nums);
		
		
		for(int i=0;i<nums.length;i++)
		{
			
			if(nums[i]!=val)
			{
			System.out.print(nums[i]);
			
			count ++;
				
			}
			
		}
			System.out.println("count= "+count);
		
		return count;
	        
	    }

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int[] nums = {0,1,2,2,3,0,4,2};
			int val= 2;
			removeElement(nums,val);

		}

	}

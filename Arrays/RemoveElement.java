package ArrayExecise;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int nums[]= {0,1,2,2,3,0,4,2},val=2,i=0,j=0;
//	        for(i=0;i<nums.length;i++)
//	        {
//	            if(nums[i] != val)
//	            {
//	            nums[j]=nums[i];
//	                j++;
//	            }
//	        }
		 
		 j=nums.length-1;
		 while(i<=j)
		 {
			 if(nums[j]==val)
				 j--;
			 if(nums[i] == val && nums[j] != val)
			 {
				 int temp=nums[i];
				 nums[i]=nums[j];
				 nums[j]=temp;
			 }
			 i++;
			 System.out.println(i+" "+j);
		 }
		 System.out.println(Arrays.toString(nums));
	}

}

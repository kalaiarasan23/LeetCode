package ArrayExecise;

public class MissingNumber {
	public static void main(String[] args) {
		int nums[]= {3,0,1};
		System.out.println(missingNumber(nums));
		
	}
	
	
	public static int missingNumber(int[] nums) {
	        int sum=0,n=nums.length;
	        boolean a = false;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==n)
	                a=true;
	            sum += nums[i];
	        }
	        if(a == true)
	        {   n = (n*(n+1))/2;
	            return n-sum;
	        }
	        else
	            return n;
	    }
}

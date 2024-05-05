package ArrayExecise;

import java.util.HashMap;
import java.util.Map;

public class LargestPositiveInteger2441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {-10,8,6,7,-2,-3};
		System.out.println(new LargestPositiveInteger2441().findMaxK(num));
	}
	
	public int findMaxK(int[] nums) {
		int big=-1;
		Map<Integer,Integer> mp = new HashMap<>();
		for(int i=0;i<nums.length;i++)
		{
			if(mp.containsKey(Math.abs(nums[i])) || mp.containsKey(-nums[i]))
			{
				if(big < Math.abs(nums[i]))
				big=Math.abs(nums[i]);
			}
			else
				mp.put(nums[i],0);
		}
	return big;
    }
}

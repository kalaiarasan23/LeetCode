package ArrayExecise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArray {

	public static void main(String[] args) {
		int nums1[] = {4,5,9}, nums2[] = {9,4,9,8,4};
		int a[]=new IntersectionOfTwoArray().intersection(nums1, nums2);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(a));
	}
	
	public int[] intersection(int[] nums1, int[] nums2) {
		Map<Integer,Integer> mp = new HashMap<>();
		List<Integer> l = new ArrayList<>();
		//inserting map values
		for(int i=0 ;i < nums1.length ; i++)
			if(!mp.containsKey(nums1[i]))
				mp.put(nums1[i], 1);
			else
				mp.put(nums1[i], mp.get(nums1[i])+1);
		
		for(int i=0;i<nums2.length;i++)
		{
			if(mp.containsKey(nums2[i]) && mp.get(nums2[i]) != 0)
			{
				l.add(nums2[i]);
				mp.replace(nums2[i], mp.get(nums2[i])-1);  //if keys is present then the values will reduce
			}
		}
		
		int arr[] = new int[l.size()]; //array convertion
		for(int i=0;i<l.size();i++)
			arr[i]=l.get(i);
        return arr;
    }

}

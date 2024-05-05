package ArrayExecise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArray2 {

	public static void main(String[] args) {
		int nums1[] = {1,2,2,1}, nums2[] = {2,2};
		int a[]=new IntersectionOfTwoArray2().intersection(nums1, nums2);
		System.out.println(Arrays.toString(a));
	}
	
	public int[] intersection(int[] nums1, int[] nums2) {
		List<Integer> ls = new ArrayList<>();
		List<Integer> l = new ArrayList<>();
		for(int i=0 ;i < nums1.length ; i++)
			ls.add(nums1[i]);
		
		for(int i=0;i<nums2.length;i++)
		{
			System.out.println(ls);
			if(ls.contains(nums2[i]))
			{
				l.add(nums2[i]);
			}
		}
		
		int arr[] = new int[l.size()];
		for(int i=0;i<l.size();i++)
			arr[i]=l.get(i);
        return arr;
    }

}

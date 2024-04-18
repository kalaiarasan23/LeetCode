package ArrayExecise;

import java.util.Arrays;

//day2
public class OnePlus {
	public static void main(String[] args) {
		int nums[]= {9};
		int a[] = onePlus(nums);
		System.out.println(Arrays.toString(a));
	}

	private static int[] onePlus(int[] arr) {
		int carry=0;
		arr[arr.length-1] += 1;
		for(int i = arr.length-1;i>=0;i--)
		{
			
			arr[i] += carry;
			if(arr[i]>=10)
			{
				arr[i] -= 10;;
				carry = 1; 
				continue;
			}
			carry=0;
		}
		
		if(carry == 1)
		{
			int array[] = new int[arr.length+1];
			array[0] = 1;
			for(int i =1; i<array.length ;i++)
			{
				array[i] = arr[i-1];
			}
			return array;
		}
		return arr;
	}
}

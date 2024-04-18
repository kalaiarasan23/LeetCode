package ArrayExecise;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,0,1,1,1,2,2,3,3,4},unique=Integer.MIN_VALUE,i,j=0;
		for(i=1;i<arr.length;i++)
		{
			
			if(arr[j] != arr[i])
			{
				j++;
				arr[j]=arr[i];
			}
				
		}
		System.out.println(Arrays.toString(arr)+" unique "+unique);
	}
}

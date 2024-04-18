package ArrayExecise;

import java.util.Arrays;

public class MergeSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {0},a2[]= {1};
		mergeSortArray(a1,a2,0,1);

	}

	private static void mergeSortArray(int[] nums1, int[] nums2, int m, int n) {
		// TODO Auto-generated method stub
		 int i=m-1 , j=n-1 ;
	        while(i>=0 && j>=0 ){
	            if(nums1[i]>=nums2[j]){
	                nums1[i+j+1]=nums1[i] ;
	                i-- ;
	                }else{
	                    nums1[i+j+1]=nums2[j];
	                    j-- ;
	                }
	        }
	        while(j>=0){
	                    nums1[j]=nums2[j];
	                    j-- ;
	                }
	        System.out.println(Arrays.toString(nums1));
	}
	
}

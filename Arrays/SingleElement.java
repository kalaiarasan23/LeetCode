package ArrayExecise;
/* 
 * 	result=1            => 0001
 *  result=2			=> 0010 ^ 0001 = 0011
 *  result=2            => 0011 ^ 0010 = 0001
 *  result=3            => 0001 ^
 * */

public class SingleElement {

	public static void main(String[] args) {
		int nums[]= {1,2,2,3,3,4,4,5,5};
		int result=0;
	    for(int i=0; i<nums.length; i++) {
	         result = result^nums[i];
	    }
	  System.out.println(result);
	}

}

package ArrayExecise;	//day2

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,5,6},targets=7;
		 int s=pos(arr, targets);
		 System.out.println(s);
	}

	private static int pos(int[] num, int targets) {
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>= targets)
				return i;
		}
		return num.length;
	}

}

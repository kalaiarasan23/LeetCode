package stringExecise;

public class IndexOfFirstOccence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack="hello",needle="ll";
//		System.out.println(haystack.length()-needle.length()-1);
		System.out.println(firstOccence(haystack,needle));
	}

	private static int firstOccence(String haystack,String needle) {
		for(int i=0;i<haystack.length()- (needle.length()-1);i++) // i made a mistake (needle.length -1)
		{
            int j=0;
            while(haystack.charAt(i+j) == needle.charAt(j))
            {
                j++;
                if(j == needle.length())
                    return i;
            }
        }
		return -1;
	}

}

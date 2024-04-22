package stringExecise;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="0P";
		System.out.println(isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s) {
        int start=0,end=s.length()-1;
        while(start<end)
        {
        	if(Character.isLetterOrDigit(s.charAt(end)) && Character.isLetterOrDigit(s.charAt(start)))
        	{
        		if(Character.toLowerCase(s.charAt(end)) != Character.toLowerCase(s.charAt(start)))
        			return false;
        		start++;
        		end--;
        	}
            if(!Character.isLetterOrDigit(s.charAt(start)))
            	start++;
            if(!Character.isLetterOrDigit(s.charAt(end)))
            	end--;
            
        }
        return true;
    }
}

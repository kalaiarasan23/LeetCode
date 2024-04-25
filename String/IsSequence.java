package stringExecise;

public class IsSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="adc",t="ahbgdc";
		System.out.println(isSubsequence(s, t));
	}
	
	public static boolean isSubsequence(String s, String t) {
		 if(s.equals("")) 
	        return true;
	     if(t.equals(""))
			return false;
		
	    int j=0;
		
		for(int i=0;i<t.length();i++)
		{
			if(s.charAt(j)==t.charAt(i))
				j++;
			
			if(j ==s.length())
				return true;
		}
		System.out.println("out");
        return j == s.length() ? true : false;
    }
}

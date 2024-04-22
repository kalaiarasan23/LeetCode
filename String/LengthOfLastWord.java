package stringExecise;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a";
		lastString(s);
	}

	private static int lastString(String s) {
		// TODO Auto-generated method stub
		  s=s.trim();
			int i=0,j=s.length()-1;
			while(s.charAt(j) != ' ' )
			{
				i++;
	            if(j==0)
	            break;
				j--;
			}
			System.out.println(i);
	        return i;
	}

}

package stringExecise;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		reverseString(s.toCharArray());
	}
	
	 public static void reverseString(char[] s) {
		 int i=0,n=s.length-1;
		 while(i<s.length/2)
		 {
			 char temp=s[i];
			 s[i]=s[n-i];
			 s[n-i]= temp;
			 i++;
		 }
		 System.out.println(s);
	 }
	 
}

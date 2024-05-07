package stringExecise;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="11",s2="111";
		System.out.println(new AddBinary().addBinary(s1, s2));
	}
	
	public String addBinary(String a, String b) {
        int carry =0,i=a.length()-1,j=b.length()-1;
        StringBuffer sb =new StringBuffer();
        while(i>=0 || j>=0 || carry > 0)
        {
        	if(i>=0)
        		carry += a.charAt(i--)-'0';
        	if(j>=0)
        		carry += b.charAt(j--)-'0';
        	
        	sb.append(carry%2);
        	carry /=2;
        	
        }
        return sb.reverse().toString();
    }
}

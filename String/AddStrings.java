package stringExecise;

public class AddStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 ="1",num2 = "9";
		System.out.println(addStrings(num1, num2));
	}

	public static String addStrings(String num1, String num2) {
        int i=num1.length()-1,j=num2.length()-1,carry=0;
        StringBuffer sb = new StringBuffer();
        while(i>=0 || j>=0 || carry > 0)
        {
        	// condtion for string out of boundary i.e means i should less then 0
        	if(i>=0)
        		carry += num1.charAt(i--) - '0';
        	
        	if(j>=0)
        		carry += num2.charAt(j--) - '0';
        	sb.append(carry%10);
        	carry /= 10;
        }
        
		return sb.reverse().toString();
    }
}

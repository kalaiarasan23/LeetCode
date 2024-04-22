package stringExecise;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=52;
		System.out.println(convertToTitle(n));
	}
	
	public static String convertToTitle(int n) {
		
//		optimisition method
//		
		StringBuilder result = new StringBuilder();
        while (n > 0) {
            n--; 
            char ch = (char) (n % 26 + 'A');
            System.out.println(ch);
            result.insert(0, ch);
            n /= 26;
        }

        return result.toString();
		
//		String s="",s1="";
//		while(n>26) {
//			System.out.println(n/26+" "+n%26);
//			if(n%26 != 0) {
//				s +=String.valueOf((char)(n%26 +'A');
//				n /= 26;
//			}
//			else {
//				s += String.valueOf((char)(90));
//				n=(n/26)-1;
//				System.out.println(n);
//			}
//		}
//		s += String.valueOf((char)(n+64));
//		for(int i=s.length()-1;i>=0;i--)
//			s1 += s.charAt(i);
//		return s1;
    }
}

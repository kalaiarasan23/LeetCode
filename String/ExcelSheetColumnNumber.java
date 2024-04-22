package stringExecise;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n="AAA";
		System.out.println(titleToNumber(n));
	}
	
	public static int titleToNumber(String str) {
		int n=Integer.valueOf(str.charAt(str.length()-1)-64),len=str.length()-2,inc=26;
		while(len>=0)
		{
			System.out.println(n);
			n += Integer.valueOf((str.charAt(len)-64) *inc);
			inc *=26;
			len--;
		}
		return n;
    }
}

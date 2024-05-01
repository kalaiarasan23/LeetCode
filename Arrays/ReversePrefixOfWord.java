package ArrayExecise;

import java.util.Arrays;

public class ReversePrefixOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word ="abcdefd";
		char ch ='d';
		System.out.println(new ReversePrefixOfWord().reversePrefix(word, ch));
	}
	
	public String reversePrefix(String word, char ch) {
        int n=0;
		while(n<word.length())
		{
			if(word.charAt(n) == ch)
				break;
			n++;
		}
		return reverseIndex(word, n);
    }
	
	public String reverseIndex(String s,int n)
	{
		int i=0;
		char[] ch = s.toCharArray();
		while(i<n)
		{
			char temp =ch[i];
			ch[i]=ch[n];
			ch[n]=temp;
			i++;
			n--;
		}
		return String.copyValueOf(ch); // convert charArray to String
	}
}

package stringExecise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseAVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aA";
		System.out.println(reverseVowels(s));
	}
	
	 public static String reverseVowels(String s) {
	     Set<Character> set = new HashSet<>();
	     set.addAll(Arrays.asList(new Character[] {'a','e','i','o','u','A','E','I','O','U'}));
	     char[] ch = s.toCharArray();
	     int i=0,j=s.length()-1;
	     while(i<j)
	     {
	    	 if(set.contains(ch[i]) && set.contains(ch[j]))
	    	 {
	    		 char temp = ch[i];
	    		 ch[i++]=ch[j];
	    		 ch[j--]=temp;
	    		 continue;
	    	 }
	    	 
	    	 if(!set.contains(ch[i]))
	    		 i++;
	    	 if(!set.contains(ch[j]))
	    		 j--;
	    		 
	     }
	    
		 return String.valueOf(ch);
	    }
}

package stringExecise;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="badc",t="baba";
		System.out.println(isIsomorphic(s, t));
	}
	
	public static boolean isIsomorphic(String s, String t) {
		if(s.length() != t.length())
			return false;
		Map<Character,Character> mp = new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(mp.containsKey(s.charAt(i)))
			{
				if(mp.get(s.charAt(i)) != t.charAt(i))
					return false;
			}
			else
			{
				if(mp.containsValue(t.charAt(i)))
					return false;
				mp.put(s.charAt(i), t.charAt(i));
			}
		}
		return true;
    }
}

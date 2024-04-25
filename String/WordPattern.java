package stringExecise;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public static void main(String[] args) {
		String pattern="abba",s="dog cat cat dg";
		System.out.println(wordPattern(pattern, s));
	}
	
public static boolean wordPattern(String pattern, String s) {
	String split[]= s.split(" ");
	if(pattern.length() != split.length)
		return false;
	Map<Character,String> mp =new HashMap<>();
	for(int i=0;i<pattern.length();i++)
	{
		if(!mp.containsKey(pattern.charAt(i)) ) {
			if(mp.containsValue(split[i]))   
				return false;
			mp.put(pattern.charAt(i),split[i]); 
		}
		else
		{
			if(!mp.get(pattern.charAt(i)).equals(split[i]))
				return false;
		}
	}
        return true;
    }
}

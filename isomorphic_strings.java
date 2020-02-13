//Space Complexity - O(n) for maintaining a hashmap and a set 
//Time Complexity-O(n) for going through each and every characters for both the strings.


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
 */

/**
 * @author aupadhye
 *
 */
public class isomorphic_strings {

	/**
	 * @param args
	 */
	
	public static boolean check_isomorphism(String s, String t) {
		
		Map<Character, Character> map = new HashMap<>();
		
		char[] st = s.toCharArray();
		char[] tt = t.toCharArray();
		
		if(s.length()!=t.length()) {return false;}
		
		for(int i=0;i<st.length;i++) {
			char key = st[i];
			if(map.containsKey(key) ) {
				
				if(map.get(key) != tt[i]) {
				
				return false;}
			}
			else {
				
				map.put(key, tt[i]);
			
			}
			
			
		}
		
		Set<Character> set = new HashSet<Character>(map.values());
		
		if(set.size() == map.values().size())
		{
			return true;
			}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "egg";
		String t = "add";
		System.out.println(check_isomorphism(s,t));
		
	}

}

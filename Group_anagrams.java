//Complexity for the algorithm
//O(n) space for maintaining hashmap
//O(n) time complexity for going through all the elements in the array.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */

/**
 * @author aupadhye
 *
 */
public class Group_anagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<String>> f = new ArrayList<>();
		String[] strings = new String[] {"eat","ate","tea"};		
		
		Map<String,List<String>> hmap = new HashMap<String,List<String>>();
		
		
		for(int i=0;i<strings.length;i++) {
			
			char[] s = strings[i].toCharArray();
			
			Arrays.sort(s);
			String newstr = new String(s);
			if(hmap.containsKey(s.toString())) 
			{
				
				List<String> templist = hmap.get(s);
				templist.add(strings[i]);
				hmap.put(s.toString(), templist);
				
			}
			
			else {
				
				List<String> list = new ArrayList<String>();
				list.add(s.toString());
				hmap.put(newstr, list);
			}
			
		}
		
		for(List<String> a:hmap.values()) {
			
			f.add(a);
			
		}
		
		for(int i=0;i<f.size();i++)
		{
			System.out.println(f.get(i));
		}
		
	}

}

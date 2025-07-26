package programforInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes.Name;

public class StringOccurance {

	public static void main(String[] args) {
		String a="ABCABDEF";
		int count = 0;
		Map<Character, Integer> hm=new HashMap<Character, Integer>();// we meed tp crate haspMap collection class object to verify the key and value
		for(int i=0; i<a.length(); i++) {
			if(hm.containsKey(a.charAt(i))) {// verifying the map string value
			count=hm.get(a.charAt(i));
			hm.put(a.charAt(i), ++count);
			}else {
				hm.put(a.charAt(i), 1);// puting value in map 	
			}
		}
		System.out.println(" "+hm);
	}




}

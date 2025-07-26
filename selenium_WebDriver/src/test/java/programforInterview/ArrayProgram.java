package programforInterview;

import java.util.HashMap;
import java.util.Map;

public class ArrayProgram {
	
	public static void main(String[] arg) {
		//ArrayProgram.reverse();
		ArrayProgram.stringOccurance();
	}
	static void reverse() {
		int [] arr={1,2,3,4,5,6};
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
		
	}
	static void stringOccurance() {
		String name="Waghamare";
		int count=0;
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(int i=0; i<name.length(); i++) {
			if(hm.containsKey(name.charAt(i))) {
				count=hm.get(name.charAt(i));
				hm.put(name.charAt(i), ++count);
			}else {
				hm.put(name.charAt(i), 1);
			}
		}
		System.out.println(hm);
	}

}

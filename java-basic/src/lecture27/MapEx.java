package lecture27;

import java.util.HashMap;
import java.util.Iterator;

public class MapEx {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(0, "str0");
		hm.put(1, "str1");
		hm.put(2, "str2");
		hm.put(3, "str3");
		
		System.out.println(hm.toString());
		System.out.println();
		
		String str =hm.get(2);
		System.out.println(str);
		System.out.println();
		
		hm.remove(2);
		System.out.println(hm.toString());
		System.err.println();
		
		hm.clear();
		System.out.println(hm.toString());
		System.err.println();
		
		hm.put(0, "str0");
		hm.put(1, "str1");
		hm.put(2, "str2");
		hm.put(3, "str3");
		
		System.out.println(hm.toString());
		System.out.println();
		
		Iterator<Integer> itr =hm.keySet().iterator();
		while(itr.hasNext()) {
			String string =hm.get(itr.next());
			System.out.println(string);
		}
		
		
		
	}
}

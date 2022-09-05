package lecture27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class InteratorEx {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("str0");
	al.add("str1");
	al.add("str2");
	System.out.println(al.toString());
	Iterator<String> it =al.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	System.out.println();
	
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	hm.put(0, "atr0");
	hm.put(1, "atr1");
	hm.put(2, "atr2");
	hm.put(3, "atr3");
	hm.put(4, "atr4");
	System.out.println(hm.toString());
	
	Set<Integer> set =hm.keySet();
	Iterator<Integer> it2 = set.iterator();
	while(it2.hasNext()) {
		Integer key = it2.next();
		System.out.println(key+" : "+ hm.get(key));
		
	}
}
}

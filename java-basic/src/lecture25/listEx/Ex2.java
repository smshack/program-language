package lecture25.listEx;

import java.util.LinkedList;

public class Ex2 {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("str1");
		ll.add("str2");
		ll.add("str3");
		ll.add("str4");
		
		System.out.println(ll.toString());
		
		ll.add("str5");
		System.out.println(ll.toString());
		
		ll.add(2,"STR2");
		System.out.println(ll.toString());
		
		ll.set(2, "STR3");
		System.out.println(ll.toString());
		
		int size = ll.size();
		System.out.println("사이즈 :"+size);
		
		ll.remove(2);
		System.out.println(ll.toString());
		
		ll.clear();
		System.out.println(ll.toString());
		
		ll =null;
		System.out.println(ll);
	}
}

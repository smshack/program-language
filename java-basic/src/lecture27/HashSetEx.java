package lecture27;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("str0");
		hs.add("str1");
		hs.add("str2");
		hs.add("str3");
		hs.add("str2");
		System.out.println(hs.toString());
		
		hs.remove("str0");
		System.out.println(hs.toString());
		
		int i= hs.size();
		System.out.println("사이즈 : "+i);
		
	}
}

package lecture25.listEx;

import java.util.ArrayList;

public class Ex1 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		//리스트를 만드는데 안에 들어가는 데이터 타입은 String이다
		
		//인덱스에 순차적으로 들어감
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		arrayList.add("str4");
		
		System.out.println(arrayList.toString());
		System.out.println();
		
		String index3 = arrayList.get(3);
		System.out.println("index3 = "+index3 );
		System.out.println();
		
		//인덱스  0 부터 시작
		arrayList.set(2, "str2222222");
		System.out.println(arrayList.get(2));
		System.out.println(arrayList.toString());
		System.out.println();
		
		int size = arrayList.size();
		System.out.println("리스트의 사이즈:"+size);
		
		//리스트 해당 인덱스 값 삭제
		arrayList.remove(2);
		System.out.println(arrayList.toString());
		System.out.println();
		
		//해당 리스트 삭제
		arrayList.clear();
		System.out.println(arrayList.toString());
		
		arrayList =null;
		System.out.println(arrayList);
		try {
			System.out.println(arrayList.size());
		} catch (Exception e) {
			// TODO: handle exception
			arrayList.add("str1");
			System.out.println(arrayList.toString());
		}
		
	}
}

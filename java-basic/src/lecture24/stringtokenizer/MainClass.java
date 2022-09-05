package lecture24.stringtokenizer;

import java.util.StringTokenizer;

public class MainClass {
	public static void main(String[] args) {
		String str1 ="오늘 날씨는 춥고, 눈이 많이 오고 있습니다";
		String str2 = "2014/12/25";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();
		
		StringTokenizer token1 = new StringTokenizer(str1);//매개변수가 없으면 공백문자 기준
		StringTokenizer token2 = new StringTokenizer(str2,"/");
		
		System.out.println("token1 문자열 수 :"+token1.countTokens());
		System.out.println("token2 문자열 수 :"+token2.countTokens());
		System.out.println();
		
		System.out.println(token1.hasMoreElements());
		System.out.println();
		
		while(token1.hasMoreTokens()) { 	
			System.out.println(token1.nextToken());
		}
		System.out.println();
		
		String [] count = new String[token2.countTokens()];
 		
		for (int i = 0; i < count.length; i++) {
			count[i] = token2.nextToken();
			System.out.println(count[i]);
		}
		
		
	}
}

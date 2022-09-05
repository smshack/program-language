package lecture22.String_function;

public class Ex1 {
	public static void main(String[] args) {
		String str1 ="abcdefg";
		String str2 = "HIJKLMN";
		String str3 = "opqrstu";
		
		
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		System.out.println("str3: "+str3);
		System.out.println();
		System.out.print("concat()문자열 연결:");
		System.out.println(str1.concat(str2));
		System.out.println();
		System.out.print("substring()문자열 자르기:");
		System.out.println(str1.substring(3));
		System.out.println();
		System.out.print("length()문자열 길이:");
		System.out.println(str1.length());
		System.out.println();
		System.out.print("toUpperCase()대문자로:");
		System.out.println(str1.toUpperCase());
		System.out.println();
		System.out.print("toLowerCase()소문자로:");
		System.out.println(str1.toLowerCase());
		System.out.println();
		System.out.print("charAt()특정 위치의 글자 찾기:");
		System.out.println(str1.charAt(3));
		System.out.println();
		System.out.print("indexOf()특정 문자열의 위치:");
		System.out.println(str1.indexOf('c'));
		System.out.println();
		String str4 ="abcdefg";
		System.out.print("equals()문자열 비교:");
		System.out.println(str1.equals(str4));
		System.out.println();
		String str5 = " abc def ghi ";
		System.out.print("trim()공백문제 제거 맨앞 맨뒤:");
		System.out.println(str5.trim());
		System.out.println();
		System.out.print("replace()특정문자 변경:");
		System.out.println(str1.replace('a', 'Z'));
		System.out.println();
		System.out.print("replaceAll()특정문자열 변경:");
		System.out.println(str1.replaceAll("abcd", "ZZZZZZZ"));
		
		
	}
}

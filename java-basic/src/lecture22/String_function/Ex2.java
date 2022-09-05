package lecture22.String_function;

public class Ex2 {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("abcdefg");
		
		System.out.println("append 문자열 추가");
		stringBuffer.append("hijklmn");
		System.out.println(stringBuffer);
		System.out.println();
		
		System.out.println("insert 특정위치에 문자열 추가");
		stringBuffer.insert(3, "AAA");
		System.out.println(stringBuffer);
		System.out.println();
		
		System.out.println("delete: 문자열 삭제");
		stringBuffer.delete(3, 5);
		System.out.println(stringBuffer);
		System.out.println();
		
		System.out.println("특정 문자 하나 삭제");
		stringBuffer.deleteCharAt(10);
		System.out.println(stringBuffer);
		
		
	}
}

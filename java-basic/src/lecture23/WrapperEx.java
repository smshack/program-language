package lecture23;

public class WrapperEx {
	public static void main(String[] args) {
		Integer num = new Integer(17);// 박싱
		int n = num.intValue(); // 언박싱
		System.out.println(n);

		String str = "10";
		String str2 = "10.5";
		String str3 = "true";
		System.out.println("----------------------------------------------------");
		// 형변환하기
		byte b = Byte.parseByte(str);
		int i = Integer.parseInt(str);
		short s = Short.parseShort(str);
		long l = Long.parseLong(str);
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		boolean bool = Boolean.parseBoolean(str3);

		System.out.println("문자열 byte값 변환 : " + b);
		System.out.println("문자열 int값 변환 : " + i);
		System.out.println("문자열 short값 변환 : " + s);
		System.out.println("문자열 long값 변환 : " + l);
		System.out.println("문자열 float값 변환 : " + f);
		System.out.println("문자열 double값 변환 : " + d);
		System.out.println("문자열 boolean값 변환 : " + bool);
		System.out.println();
		System.out.println("----------------------------------------------------");
		
		Integer num1 = new Integer(10); // 래퍼 클래스1
		Integer num2 = new Integer(10); // 래퍼 클래스2
		int j = 10; // 기본타입

		System.out.println("래퍼클래스 == 기본타입 : " + (num1 == j)); // true
		System.out.println("래퍼클래스.equals(기본타입) : " + num1.equals(j)); // true
		System.out.println("래퍼클래스 == 래퍼클래스 : " + (num1 == num2)); // false
		System.out.println("래퍼클래스.equals(래퍼클래스) : " + num1.equals(num2)); // true
	}
}

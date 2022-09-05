package lecture27;

import java.util.HashSet;

public class HashSetEx2 {
	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();
		hs.add(new Student("홍길동", 1));
		hs.add(new Student("홍길서", 2));
		hs.add(new Student("홍길남", 4));
		hs.add(new Student("홍길북", 2));
		System.out.println(hs.toString());
		
		Student student = new Student("홍길서",2);
		System.out.println(hs.toString());
		hs.remove(student);
		System.out.println(hs.toString());
		System.out.println(hs.equals(student));
		System.out.println(hs.hashCode());
	}
}

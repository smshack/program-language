package chap_08;

public class GetterSetter {
    public static void main(String[] args) {
        // Person 객체 생성
        Person person = new Person();

        // Setter 사용
        person.setName("John");
        person.setAge(25);

        // Getter 사용
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // 메서드 호출
        person.introduce();

        // 유효성 검사 테스트
        person.setName("");  // Invalid name!
        person.setAge(-5);   // Age cannot be negative!
    }
}

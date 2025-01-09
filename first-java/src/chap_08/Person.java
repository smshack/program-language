package chap_08;

public class Person {
    // private 필드: 직접 접근 불가
    private String name;
    private int age;

    // Getter: name
    public String getName() {
        return name;
    }

    // Setter: name
    public void setName(String name) {
        // 유효성 검사
        if (name == null || name.isEmpty()) {
            System.out.println("Invalid name!");
        } else {
            this.name = name;
        }
    }

    // Getter: age
    public int getAge() {
        return age;
    }

    // Setter: age
    public void setAge(int age) {
        // 유효성 검사: 나이는 0 이상만 가능
        if (age < 0) {
            System.out.println("Age cannot be negative!");
        } else {
            this.age = age;
        }
    }

    // 메서드
    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}
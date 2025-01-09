package chap_10;

// 인터페이스 선언
interface Animal {
    // 상수
    String CATEGORY = "Living Being"; // public static final이 자동으로 붙음

    // 추상 메서드
    void eat(); // public abstract가 자동으로 붙음
    void sleep();
}

// Mammal 인터페이스 선언
interface Mammal {
    void walk(); // 추가 메서드
}

// Cat 클래스는 Animal과 Mammal 인터페이스를 구현
class Cat implements Animal, Mammal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating Cat food.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    @Override
    public void walk() {
        System.out.println(name + " is walking.");
    }
}

// Main 클래스
public class InterfaceExample {
    public static void main(String[] args) {
        // 인터페이스 타입으로 객체 참조 (다형성)
        Animal animal = new Cat("Buddy");
        animal.eat();
        animal.sleep();
        // animal.walk(); // 오류: Animal 타입으로는 walk() 호출 불가능

        // Mammal 타입으로 객체 참조
        Mammal mammal = (Mammal) animal; // 업캐스팅
        mammal.walk();

        // Cat 타입으로 다시 참조
        Cat Cat = (Cat) animal; // 다운캐스팅
        Cat.eat();
        Cat.walk();

        // 인터페이스 상수 사용
        System.out.println("Category: " + Animal.CATEGORY);
    }
}
package chap_09;

// 상속 관련 개념을 설명하는 예제 코드

// 부모 클래스
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// 자식 클래스
class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name); // 부모 클래스의 생성자 호출
        this.breed = breed; // this로 현재 클래스의 필드 초기화
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks.");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }

    public String getBreed() {
        return breed;
    }
}

// 메인 클래스
public class InheritanceExample {
    public static void main(String[] args) {
        // 부모 클래스 객체 생성
        Animal genericAnimal = new Animal("Generic Animal");
        genericAnimal.makeSound();
        genericAnimal.eat();

        // 자식 클래스 객체 생성
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.makeSound();  // 오버라이딩된 메서드 호출
        dog.eat();        // 부모 클래스 메서드 호출
        dog.fetch();      // 자식 클래스 고유 메서드 호출
        System.out.println("Breed: " + dog.getBreed());

        // 업캐스팅
        Animal upcastedDog = dog;
        upcastedDog.makeSound(); // 런타임 시 자식 클래스의 메서드 호출
        upcastedDog.eat();
        // upcastedDog.fetch(); // 오류: 업캐스팅된 객체는 부모 클래스 메서드만 호출 가능
    }
}

// 상속과 중복 제거

// name과 eat 메서드는 부모 클래스 Animal에 정의되어 자식 클래스 Dog에서 중복 작성하지 않아도 사용 가능.
// 업캐스팅

// Animal upcastedDog = dog;는 자식 객체 dog를 부모 타입으로 참조.
// 업캐스팅된 객체는 부모 클래스에서 정의된 메서드만 호출 가능. (자식 클래스의 고유 메서드 호출 불가)
// 메서드 오버라이딩

// Dog 클래스에서 makeSound를 오버라이딩.
// 런타임 시 다형성에 따라 Dog 클래스의 makeSound가 호출됨.
// protected 접근 제한자

// name 필드는 protected로 선언되어 자식 클래스에서 직접 접근 가능.
// this와 super

// this.breed: 현재 클래스의 필드를 참조.
// super(name): 부모 클래스의 생성자를 호출하여 name을 초기화.

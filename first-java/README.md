# 자바 기초 연습 프로젝트
## 챕터 1
1. HELLO WORLD
2. 데이터 타입
3. 변수
4. 주석
5. 변수 이름 짓는법
6. 상수
7. 형변환

## 챕터 2
1. 산술연산자1
2. 산술연산자2
3. 대입 연산자
4. 비교 연산자
5. 논리 연산자
6. 삼항 연산자

## 챕터 3
1. 문자열1
2. 문자열2
3. 문자열 비교
4. 특수문자

## 챕터 4
1. 조건문 IF
2. 조건문 ELSE
3. 조건문 ELSEIF
4. 조건문 SWITCH CASE
5. 반복문 FOR
6. 반복문 WHILE
7. 반복문 DOWHILE
8. 이중 반복문1
9. 이중 반복문2
10. BREAK
11. CONTINUE

## 챕터 5
1. 배열
2. 배열 순회
3. 다차원 배열
4. 다차원 배열 순회
5. 아스키코드

## 챕터 6
1. 메소드
2. 파라미터(전달값)
3. 리턴(반환값)
4. 오버라이딩
5. 메소드가 필요한 이유
6. 변수의 범위
6. MAIN 메소드

# 객체지향
[참고](https://cloudstudying.kr/challenges/369)

## OOP 객체지향프로그래밍 이란(Object-Oriented Programming, OOP)
- 현실 세계의 사물이나 개념을 객체로 표현하고, 이러한 객체들 간의 상호작용을 통해 프로그램을 구현
### OOP의 주요 개념
1. 캡슐화
2. 상속
3. 다형성
4. 추상화

### OOP 장점
1. 코드의 재사용성이 높아짐
2. 유지 보수가 용이
3. 코드의 구조가 직관적이며, 설계 단계에서의 생각을 코드로 쉽게 전환 가능

### OOP 단점
1. 설계 초기 단계에서 많은 시간과 노력이 필요
2. 객체 간의 관계가 복잡해질 경우, 전체 시스템의 이해가 어려울수 있음

## 챕터 7
### 클래스와 객체
- 클래스: 객체를 만들기 위한 설계도
- 객체: 클래스를 통해 만들어진 것(오브젝트)

### 클래스 구조
- 필드: 상태를 정의
- 메서드: 동작을 정의

![image](https://i.imgur.com/CmaAvxL.png)
![image](https://i.imgur.com/0zMzYXO.png)

## 챕터 8
### 생성자
- 객체를 만드는 특별한 메소드
- 객체 생성, 객체 초기화의 역할

```
/* 1. 객체 생성 */
Cat c = new Cat();
/* 2. 필드 초기화 */
c.name = "네로";
c.weight = 3.78;
c.age = 3;
```
```
/* 객체 생성과 동시에 초기화 */
Cat c = new Cat("네로", 3.78, 3);
```

![image](https://i.imgur.com/EJNuDFo.png)

### 클래스 메소드(static) vs 인스턴스 메소드
- 클래스 메소드(객체의 상태와는 무관한 작업) => 전역적인 계산, 유틸리티 기능 
    - 메소드 앞에 static가 붙은 메소드
    - 객체 생성 없이 호출이 가능한 메소드
    - 유틸리티 클래스,독립적인 계산 기능, 싱글톤 패턴에서의 인스턴스 접근
    - 로깅, 포맷팅, 데이터 변환

```Java
    public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() {
        return instance;
    }
}
```

- 인스턴스 메소드(객체의 상태를 기반으로 한 연산)
    - 인스턴스 생성 후 "참조변수.메소드명()" 으로 호출
    - 호출하려면 객체를 생성해야 함(instance.methodName()).
    - 상태 정보를 다룰 때 적합.
    - 비즈니스 로직(데이터)

```Java
class MyMath2 {
	long a, b;
	
	// 인스턴스변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다. ( 인스턴스 메서드 )
	long add() 	    { return a + b; }  // a, b는 인스턴스변수
	long subtract() { return a - b; }
	long multiply() { return a * b; }
	double divide() { return a / b; }
 
	// 인스턴스변수와 관계없이 매개변수만으로 작업이 가능하다. (클래스 메서드)
	static long   add(long a, long b) 	   	 { return a + b; } // a, b는 지역변수
	static long   subtract(long a, long b)   { return a - b; }
	static long   multiply(long a, long b)	 { return a * b; }
	static double divide(double a, double b) { return a / b; }
}
 
class MyMathTest2 {
	public static void main(String args[]) {
		/* (클래스 메서드) */
		// 클래스메서드 호출. 인스턴스 생성없이 호출가능
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));
 
		/* ( 인스턴스 메서드 ) */
		MyMath2 mm = new MyMath2(); // 인스턴스를 생성
		mm.a = 200L;
		mm.b = 100L;
		// 인스턴스메서드는 객체생성 후에만 호출이 가능함. 
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}

```

### 접근 제한자
- 접근 권한을 제한하는 키워드
- 접근 제한자는 필드와 메소드에 적용될 수 있다. public 선언되면 외부의 접근이 가능하나, private의 경우 외부 접근이 불가능하다.

- **public**
    - 완전한 공개 모두가 사용할 수 있는 공공의 산물
- **private**
    - 비공개 => 오직 해당 클래스 내부에서만 사용
- **protect**
    - 같은 패키지 또는 자식 클래스
- **default**
    - 같은 패키지에 소속되는 클래스


```
- 클래스       : public, default
- 생성자       : public, protected, default, private
- 멤버변수    : public, protected, default, private
- 멤버메소드 : public, protected, default, private
- 지역변수    : 접근제한자 사용 불허
```
```
한 파일에는 하나의 public 클래스만 포함 가능:

public 클래스를 포함하려면 그 클래스 이름과 파일 이름이 동일해야 합니다.
예: Person 클래스가 public이라면 파일 이름은 Person.java여야 합니다.
다른 클래스는 public으로 선언할 수 없고, default 접근 수준(접근 제한자를 명시하지 않음)이어야 합니다.
```

```Java
class AAA {
  /* 필드 */
  private String aaa;   // 비공개
  int bbb;              // 디폴트 공개
  protected double ccc; // 상속 공개
  public boolean ddd;   // 완전 공개
  /* 메소드 */
  private void eee() {}     // 비공개
  int fff() {}              // 디폴트 공개
  protected double ggg() {} // 상속 공개
  public boolean hhh() {}   // 비공개
}
```


### Getter & Setter
- private 선언된 필드는 외부 접근이 불가능
- 정상적인 사용자도 직접 접근 할 수 없어 이를 해결하기 위해 getter & setter를 사용

```
- 데이터 보호: 필드에 직접 접근을 막고, 접근 로직을 메서드로 통제.
- 유효성 검사: Setter에서 값 변경 전에 유효성을 검사.
- 유연성: 나중에 내부 구현을 변경해도 외부 코드에 영향을 주지 않음.
```
- **Getter**
    - 객체의 필드 값을 외부에서 읽을 수 있도록 제공하는 메서드

- **Setter**
    - 객체의 필드 값을 외부에서 변경할 수 있도록 제공하는 메서드

![image](https://i.imgur.com/lH6c84w.png)

### 스코프
- 변수나 메서드가 유효한 범위
    - 클래스 스코프: 클래스 내부에서 선언된 변수나 메서드는 클래스 전체에서 접근 가능 
    - 메서드 스코프: 메서드 내부에서 선언된 변수는 해당 메서드 안에서만 유효
    - 블록 스코프: {} 블록 내부에서 선언된 변수는 블록 안에서만 유효

### this 키워드
- 현재 객체 자신을 참조하는 키워드
    - 멤버 변수와 로컬 변수의 구분 => 로컬 변수와 멤버 변수의 이름이 같으면 혼동 가능.this 키워드를 사용하면 멤버 변수에 접근한다는 것을 명확히 알 수 있음.
    - 현재 객체의 참조를 전달 => 현재 객체를 다른 객체나 메서드에서 활용하고 싶을 때 유용.클래스 간 협업(객체 간 상호작용)을 쉽게 구현.
    - 생성자에서 다른 생성자 호출 => 코드 중복을 줄일 수 있음.생성자에서 공통 작업을 하나의 생성자에 위임 가능.



## 챕터 9
### JAVA API
- 자바 프로그램을 만들기 위한 패키지 도구
- 패키지: 관련 코드를 하나로 묶어, 관리를 수월하기 함

### 상속
- 기존 클래스를 확장하여 새 클래스를 만드는 것
- 부모 클래스(슈퍼 클래스)의 속성과 메서드를 자식 클래스(서브 클래스)가 물려받아 사용할 수 있게 함.
- 중복을 제거(공통된 속성과 메서드를 부모 클래스에 정의하여 자식 클래스에서 중복 작성하지 않아도 됨.) 
- 프로그램을 더 쉽게 확장 가능
- extends 키워드로 상속을 구현

- ***업캐스팅(Upcasting)***
    - 자식 클래스의 객체를 부모 클래스 타입으로 참조.
    - 다형성을 활용해 코드의 유연성을 높임.
    - 예: Parent parent = new Child();

- **메서드 오버라이딩(Method Overriding)**
    - 부모 클래스의 메서드를 자식 클래스에서 재정의.
    - 런타임 시 자식 클래스의 메서드가 호출됨.
    - @Override 애너테이션으로 재정의를 명시.

- **protected 접근 제한자**
    - 같은 패키지나 상속받은 클래스에서 접근 가능.
    - 상속 관계에서 자식 클래스가 부모 클래스의 멤버를 사용할 때 적합.

- **this와 super**
    - this: 현재 객체를 참조.
    - super: 부모 클래스를 참조. 주로 부모 클래스의 생성자나 메서드를 호출할 때 사용.


## 인터페이스
- 클래스 간의 규칙을 정의하는데 사용
    - 추상클래스와 비슷하지만 더 제한적으로 오직 추상 메서드와 상수만 가질 수 있었음
    - 다중 상속이 불가능한 자바에서 다중 구현을 제공하기 위해 사용
    - 구현하는 클래스가 인터페이스에 정의된 모든 메서드를 반드시 구현해야함

### 인터페이스 특징
1. 구현 강제
    - 인터페이스에 정의된 메서드는 구현 클래스에서 반드시 구현해야함
    - 어떤 메서드가 반드시 필요하다라는 규칙을 강제할 수 있음

2. 다중 구현
    - 자바의 클래스는 하나의 부모만 상속받을 수 있지만, 인터페이스는 여러 개를 구현할 수 있음

3. 추상화
    - 인터페이스를 통해 구현과 세부 사항을 분리하고, 다형성을 쉽게 활용

### 인터페이스 사용하는 이유
1. 다형성을 극대화
- 같은 인터페이스를 구현하는 클래스는 동일한 방식으로 다룰 수 있음.

2. 코드의 유연성과 확장성
- 인터페이스로 설계하면 구현 클래스를 쉽게 교체 가능.

3. 다중 구현 지원
- 하나의 클래스가 여러 인터페이스를 구현하여 다양한 역할을 수행 가능.


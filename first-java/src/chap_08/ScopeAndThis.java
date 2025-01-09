package chap_08;

class Employee {
    // 클래스 스코프
    private String name;
    private int id;

    // 생성자
    public Employee(String name, int id) {
        // this를 사용해 멤버 변수와 로컬 변수 구분
        this.name = name;
        this.id = id;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 메서드 스코프의 name과 멤버 변수 name 구분
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // 메서드: 현재 객체의 참조를 전달
    public void introduce() {
        System.out.println("Hello, my name is " + this.name + " and my ID is " + this.id);
        this.greet(); // this를 사용해 클래스 내의 다른 메서드 호출
    }

    public void greet() {
        System.out.println("Nice to meet you!");
    }

    // 생성자에서 다른 생성자 호출
    public Employee() {
        this("Unknown", 0); // 다른 생성자를 호출
        System.out.println("Default Employee created.");
    }
}

public class ScopeAndThis {
    public static void main(String[] args) {
        // Employee 객체 생성
        Employee emp1 = new Employee("Alice", 101);
        emp1.introduce();

        // Default 생성자 호출
        Employee emp2 = new Employee();
        emp2.setName("Bob");
        emp2.setId(102);
        emp2.introduce();
    }
}
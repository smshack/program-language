package chap_07;

public class _01_Class {
    public static void main(String[] args) {
      // Cat 객체 생성
      Cat c = new Cat();
      c.name = "나비";
      c.breeds = "페르시안";
      c.age = 3;
      
      /* 1. 객체의 필드 값을 변경하시오. */
      
      // Dog 객체 필드값 출력
      System.out.printf("이름: %s\n", c.name);
      System.out.printf("품종: %s\n", c.breeds);
      System.out.printf("나이: %s\n", c.age);
      c.claw();
      c.meow();
    }
  }
  
  /* Cat 클래스 */
  class Cat {
    String name;   // 이름
    String breeds; // 품종
    int age;       // 나이
  
    void claw() {
        System.out.printf("[%s]의 야옹~\n", name);
    }
    
    void meow() {
        System.out.println("할퀴기! 샥샥~");
    }
  }
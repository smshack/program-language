package chap_07;

public class _04_Class {
  public static void main(String[] args) {
    /* 객체 생성 */
    Square s =new Square();
    /* 필드 초기화(값 변경) */
    s.length = 5;
    /* 결과 출력 */
    System.out.println(s.area());
  }
}


class Square {
  // 한변의 길이
  int length;
  // 메소드 - 정사각형의 넓이 반환
  int area() {
    return length * length;
  }
}
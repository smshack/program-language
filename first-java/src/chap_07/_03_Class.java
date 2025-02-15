package chap_07;

public class _03_Class {
  public static void main(String[] args) {
    // 객체 생성
    DrinkMachine machine1 = new DrinkMachine();
    DrinkMachine machine2 = new DrinkMachine();
    
    // 음료 뽑기
    machine1.pushButton(0);
    machine2.pushButton(0);
    
    // 음료 확인
    machine1.printOutput();
    machine2.printOutput();
  }
}

class DrinkMachine {
  /* 필드 */
  String output;
  
  /* 메소드 */
  void pushButton(int num) {
    String[] drinks = {"콜라", "사이다", "맥주"};
    output = drinks[num];
  }
  
  void printOutput() {
    System.out.println(output);
  }
}
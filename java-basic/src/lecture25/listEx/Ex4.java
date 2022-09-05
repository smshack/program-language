package lecture25.listEx;

import java.util.Vector;

public class Ex4 extends Vector{
	   
    public Ex4(int i){
        super(i);
    }
   
    public static void main(String[] args) {
       
    	Ex4 v1 = new Ex4(2);
       
        System.out.println("v1의 용량은 "+v1.capacity());
       
        System.out.println("증가치는 "+v1.capacityIncrement);
        System.out.println("현재 요소의 수는 "+v1.elementCount);
       
        v1.addElement(new Integer(10));
        v1.addElement(new Double(10.0));
        v1.addElement(new String("안녕"));
       
        System.out.println("3개의 요소 삽입 후 현재 요소의 수 : "+v1.elementCount);
        System.out.println(v1.toString());
        
        if(v1.contains("안녕")){//v1 에 문자열 안녕이 포함되어 있다면
            System.out.println("안녕 문자열은 "+v1.indexOf("안녕")+"번째 인덱스에 있다.");
        }
       
        System.out.println("1번째 인덱스의 요소는 "+ v1.elementAt(1));
    }

}




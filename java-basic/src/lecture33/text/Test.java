package lecture33.text;

import java.io.File;
import java.io.FileWriter;
 
 
public class Test {
     
     
    public static void main(String[] args) {
         
        String txt = "테스트입니다!!" ;
         
        String fileName = "D:\\test11.txt" ;
         
         
        try{
             
            // 파일 객체 생성
            File file = new File(fileName) ;
             
            // true 지정시 파일의 기존 내용에 이어서 작성
            FileWriter fw = new FileWriter(file, true) ;
             
            // 파일안에 문자열 쓰기
            fw.write(txt);
            fw.flush();
 
            // 객체 닫기
            fw.close();
             
             
        }catch(Exception e){
            e.printStackTrace();
        }
         
 
    }
}


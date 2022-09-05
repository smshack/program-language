package lecture28;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//읽고 쓰기를 동시에 파일 복사
public class IOEx4 {
	public static void main(String[] args) {
		InputStream is =null;
		OutputStream os =null;
		
		
		try {
			is=new FileInputStream("D:\\bread.json");
			os = new FileOutputStream("D:\\bread_copy2.json");
			
			byte [] bs = new byte[5];
			
			while(true) {
				int count =is.read(bs);
				if(count==-1) break;
				os.write(bs,0,count);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(is !=null) {
				try {
					is.close();
				}catch(Exception e2) {
					e2.printStackTrace();
				}
			}
			
			if(os !=null) {
				try {
					os.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
}

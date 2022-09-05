package lecture28;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOEx2 {
	public static void main(String[] args) {
		OutputStream os=null;
		try {
			os = new FileOutputStream("D:\\out.txt");
			String str = "오늘 날씨는 아주 좋습니다";
			byte[] bs = str.getBytes();
			os.write(bs);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(os !=null) os.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}

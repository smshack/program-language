package lecture28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class IOEx {
	public static void main(String[] args) throws IOException {
		ArrayList<Character> al = new ArrayList<Character>();
		try {
			InputStream is = new FileInputStream("D:\\bread.json");
			while(true) {
				int i = is.read();
				System.out.print("데이터(int): "+i+"\t");
				char c = (char)i;
				al.add(c);
				System.out.println("데이터(char): "+c);
				if(i==-1) break;
			}
			System.out.println(al.toString());
			System.out.println();
			int j =0;
			while(j<al.size()) {
				
				if(al.get(j).equals('"')||al.get(j).equals('}')||al.get(j).equals('{')||al.get(j).equals('[')||al.get(j).equals(']')||al.get(j).equals(' ')) {
					al.remove(j);
				}
				j++;
			}
			System.out.println();
			System.out.println(al.toString());
			
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

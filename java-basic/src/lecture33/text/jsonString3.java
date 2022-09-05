package lecture33.text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsonString3 {
	public static void main(String args[]) throws Exception {

		JSONParser parser = new JSONParser();

		try {
			FileReader reader = new FileReader("D:\\bread.json");
			// json 파일 읽기
			JSONArray obj = (JSONArray)parser.parse(reader);
			System.out.println(obj);
			String[] str =obj.toString().split("}");
			
			for (int i = 0; i < str.length; i++) {
				
				System.out.println(str[i]);
				System.out.println();
			}

			/*
			 * JSONArray breadList = (JSONArray) obj; System.out.println(breadList);
			 */

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
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

public class jsonString {
	public static void main(String args[]) throws Exception {

		JSONParser parser = new JSONParser();

		try {
			FileReader reader = new FileReader("D:\\bread.json");
			// json 파일 읽기
			Object obj = parser.parse(reader);
			System.out.println(obj);
			Object obj2 =JSONValue.parse(obj.toString());  
			System.out.println(obj2);
			JSONArray jsonArray =(JSONArray)obj;
			System.out.println(jsonArray);
			
			
			JSONObject jobj1= (JSONObject) obj;
			String breadType =(String)jobj1.get("breadType");
			JSONObject jobj2 =(JSONObject)jobj1.get("recipe");
			Integer flour =(Integer)jobj2.get("flour");
			Integer water =(Integer)jobj2.get("water");
			Integer type =(Integer)jobj2.get(breadType);
			
			System.out.println("breadType:"+breadType);
			System.out.println("flour:" + flour);
			System.out.println("water:" + water);
			System.out.println(breadType+":" + type);
			
			
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
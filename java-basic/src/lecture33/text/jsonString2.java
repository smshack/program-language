package lecture33.text;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsonString2 {
	public static void main(String args[]) throws Exception {

		JSONParser parser = new JSONParser();

		try {
			FileReader reader = new FileReader("D:\\bread.json");
			// json 파일 읽기
			JSONArray obj = (JSONArray)parser.parse(reader);
	
			System.out.println(obj);
			
			JSONObject [] obj1 = new JSONObject[obj.size()];
			
			System.out.println(obj.size());
			for (int i = 0; i < obj.size(); i++) {
				
				obj1[i] = (JSONObject)obj.get(i);
				
				System.out.println(obj1[i]);
			}
			
			String[] typeObj = new String[obj1.length];
			JSONObject[] recipeObj = new JSONObject[obj1.length];
			
			for (int i = 0; i < obj1.length; i++) {
				typeObj[i]=(String)obj1[i].get("breadType");
				recipeObj[i] = (JSONObject)obj1[i].get("recipe");
						
				System.out.println(typeObj[i]);
				System.out.println(recipeObj[i]);
			}
			
			Long [] flour = new Long[recipeObj.length];
			Long [] water = new Long[recipeObj.length];
			Long [] type = new Long[recipeObj.length];
			
			for (int i = 0; i < recipeObj.length; i++) {
				flour[i]=(Long)recipeObj[i].get("flour");
				water[i]=(Long)recipeObj[i].get("water");
				type[i]=(Long)recipeObj[i].get(typeObj[i]);
			}
			
			for (int i = 0; i < type.length; i++) {
				System.out.println("breadType :"+typeObj[i]);
				System.out.println("recipe");
				System.out.println("flour: "+flour[i]);
				System.out.println("water: "+water[i]);
				System.out.println(typeObj[i]+": "+type[i]);
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
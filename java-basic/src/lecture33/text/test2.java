package lecture33.text;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class test2 {
public static void main(String[] args) {
	JSONParser parser = new JSONParser();
	List breadtype = new ArrayList<String>();
	List recipe = new ArrayList<JSONObject>();
	Map<String, Object> mapSender = new HashMap<String, Object>();


	try {FileReader reader = new FileReader("D:\\bread.json");
		//json 파일 읽기
	Object obj =parser.parse(reader);
	JSONArray breadList =(JSONArray)obj;
	System.out.println(breadList);
	

	for (int i = 0; i < breadList.size(); i++) {
		breadtype.add(breadList.get(i).toString());
		System.out.println(breadtype);
	}
	for (int i = 0; i < breadtype.size(); i++) {
		System.out.println(breadtype.get(i));
	}

		  
	} catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException e) { e.printStackTrace(); } catch (ParseException e) { e.printStackTrace(); }

	
}
}

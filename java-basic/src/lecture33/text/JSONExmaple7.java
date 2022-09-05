package lecture33.text;

import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JSONExmaple7 {
public static void main(String[] args) {
	JSONArray obj = new JSONArray();
	

	
	JSONObject obj1 = new JSONObject();
	JSONObject obj2 = new JSONObject();
	
	
	obj1.put("breadtype", "cream");
	
	
	obj2.put("flour","100");
	obj2.put("water","100");
	obj2.put("cream","200");
	obj1.put("recipe",obj2 );
	
	obj.add(obj1);
	System.out.println(obj);
}
}

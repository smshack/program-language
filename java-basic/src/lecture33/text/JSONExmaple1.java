package lecture33.text;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JSONExmaple1 {
public static void main(String[] args) {
	JSONObject obj = new JSONObject();
	
	obj.put("name", "Jensen");
	obj.put("age", new Integer(27));
	obj.put("salary", new Double(60000.90));
	

	
	System.out.println(obj);
}
}

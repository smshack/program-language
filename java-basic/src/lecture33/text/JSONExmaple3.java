package lecture33.text;

import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JSONExmaple3 {
public static void main(String[] args) {
	  JSONArray obj = new JSONArray();
	  obj.add("Jensen");
	  obj.add(new Integer(27));
	  obj.add(new Double(60000.90));
	  System.out.println(obj);
	 }
}


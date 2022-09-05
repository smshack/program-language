package lecture33.text;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONValue;

public class JSONExmaple4 {
public static void main(String[] args) {
	List obj = new ArrayList();
	obj.add("Jensen");
	obj.add( new Integer(27));
	obj.add(new Double(60000.90));
	String jsonText =JSONValue.toJSONString(obj);
	System.out.println(jsonText);
}
}

package lecture33.text;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONExmaple8 {
	 public static void main(String[] args) {
		  JSONParser jsonP = new JSONParser();
		  
		  try(FileReader reader = new FileReader("D:\\emps.json")){
		   //Read JSON File
		   Object obj = jsonP.parse(reader);
		   JSONArray empList = (JSONArray) obj;
		   System.out.println(empList);
		   //Iterate over emp array
		   empList.forEach(emp -> parseEmpObj((JSONObject)emp));
		  }
		  catch (FileNotFoundException e) {
		            e.printStackTrace();
		        } catch (IOException e) {
		            e.printStackTrace();
		        } catch (ParseException e) {
		            e.printStackTrace();
		        }
		 }
		 private static void parseEmpObj(JSONObject emp) {
		  JSONObject empObj = (JSONObject) emp.get("employee");
		  //get emp firstname, lastname, website
		  String fname = (String) empObj.get("firstname");
		  String lname = (String) empObj.get("lastname");
		  String website = (String) empObj.get("website");
		  System.out.println("First Name: " + fname);
		  System.out.println("Last Name: " + lname);
		  System.out.println("Website: " + website);
		 }
}

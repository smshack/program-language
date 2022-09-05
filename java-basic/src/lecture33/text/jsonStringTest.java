package lecture33.text;

import java.io.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class jsonStringTest
{
    public static void main(String args[]) throws Exception {
        CheckJSON cjson = new CheckJSON();
        cjson.check();
        System.out.println(cjson.getDriver());
    }
}

class CheckJSON
{
    String driver = null;

    public void check() throws Exception{
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("./conf/mozi.json"));
        JSONObject jo = (JSONObject) obj;

        setDriver((String) jo.get("JDBCDriver"));
    }

    public void setDriver(String driver){
        this.driver = driver;
    }
    public String getDriver(){
        return driver;
    }
}
package lecture32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSQLEx3 {
	public static Connection getConnection2(String server, String user, String pw) {
        Connection conn = null;
        Statement st=null;
        String driver = "oracle.jdbc.driver.OracleDriver";
        String sql = "select id,title,hit from notice where hit<15";
        String url = String.format("jdbc:oracle:thin:@%s:1521/orcl",server);
        String sql2 = "select id,title,hit from notice where hit<15";
        try {
            Class.forName(driver);
 
            conn = DriverManager.getConnection(url, user, pw);
            st =conn.createStatement();
    		ResultSet rs =st.executeQuery(sql);
    		int id=0;
    		String title="";
    		int hit=0;
    		
    		while(rs.next()){     
   			 id=rs.getInt("id");
   			 title =rs.getString("title");
   			 hit =rs.getInt("hit");
   			System.out.printf("id:%d\t title:%s\t hit:%d\n",id,title,hit);
    		}
            return conn;
        } catch (Exception e) {
            System.out.println("연결이 안됬습니다() : " + e.toString());
        }
 
        return null;
    }
}

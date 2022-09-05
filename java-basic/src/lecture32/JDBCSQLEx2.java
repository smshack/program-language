package lecture32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSQLEx2 {
	 public static Connection getConnection() {
		 
	        Connection conn = null;
	        Statement st=null;
	        String driver = "oracle.jdbc.driver.OracleDriver";
	        String url  ="jdbc:oracle:thin:@localhost:1521/orcl";
	        String user = "practice";
	        String pw = "1111";
	        String sql = "select id,title,hit from notice where hit<15";
	 
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
	            System.out.println("DBUtil.getConnection() : " + e.toString());
	        }
	 
	        return null;
	    }
}

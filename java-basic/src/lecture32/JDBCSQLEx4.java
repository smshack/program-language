package lecture32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCSQLEx4 {
	public static Connection getConnection4(String server, String user, String pw,String tableName) {
		Connection conn = null;
		Statement  st1 = null;
	    ResultSet rs = null;
	    ResultSet rs2 = null;
        String driver = "oracle.jdbc.driver.OracleDriver";
        String sql1 = String.format("select id,title,hit as cnt from %s", tableName);
        String sql2 = String.format("select count(*) as cnt from %s", tableName);
        String url = String.format("jdbc:oracle:thin:@%s:1521/orcl",server);
        
        try {
            Class.forName(driver);
 
            conn = DriverManager.getConnection(url, user, pw);
            st1 =conn.createStatement();
    		 rs =st1.executeQuery(sql1);
    		int id=0;
    		String title="";
    		int hit=0;
    		
    		while(rs.next()){     
   			 id=rs.getInt("id");
   			 title =rs.getString("title");
   			 hit =rs.getInt("hit");
   			System.out.printf("id:%d\t title:%s\t hit:%d\n",id,title,hit);
    		}
    		int cnt =0;
    		while(rs2.next()) {
    			rs2 =st1.executeQuery(sql2);
        		
    		}
    		
    		
    		cnt =rs2.getInt("cnt");
    		System.out.println("총 행의 개수는 "+cnt);
    		
            return conn;
        } catch (Exception e) {
            System.out.println("연결이 안됬습니다() : " + e.toString());
        }
 
        return null;
    }
}

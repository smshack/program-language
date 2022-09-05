package lecture32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSQLEx {
	public static void main(String[] args) throws ClassNotFoundException, SQLException,Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521/orcl";
		String user ="practice";
		String pass="1111";
		String sql = "select id,title,hit from notice where hit>15";
		
		
		Class.forName(driver);//예외 처리 원래 나옴
		Connection con =DriverManager.getConnection(url,user,pass);
		Statement st =con.createStatement();
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


		
		rs.close();
		st.close();
		con.close();
	}
}

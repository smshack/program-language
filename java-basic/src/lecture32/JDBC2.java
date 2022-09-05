package lecture32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC2 {
	// 생성할 때 DB 연결을 하고 시작
	public Connection connect() throws ClassNotFoundException {
		// TODO Auto-generated constructor stub
		Connection con=null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521/orcl";
		String user ="practice";
		String pass="1111";
		Class.forName(driver);//예외 처리 원래 나옴
		try {
			con =DriverManager.getConnection(url,user,pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public ResultSet select (Connection con) {
		String sql = "select id,title,hit from notice where hit>15";
		Statement st=null;
		ResultSet rs = null;
		try {
			st = con.createStatement();
			rs =st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
		
	}
	
	public void print(ResultSet rs) throws SQLException {
		int id=0;
		String title="";
		int hit=0;
		while(rs.next()){     
			 id=rs.getInt("id");
			 title =rs.getString("title");
			 hit =rs.getInt("hit");
			System.out.printf("id:%d\t title:%s\t hit:%d\n",id,title,hit);	
		}
	}
	
	
}

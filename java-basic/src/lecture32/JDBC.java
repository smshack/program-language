package lecture32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBC {
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	//DB 연결 메서드
	public JDBC DBconnetct() throws ClassNotFoundException, SQLException {
		JDBC db = new JDBC();
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521/orcl";
		String user ="practice";
		String pass="1111";
		Class.forName(driver);//예외 처리 원래 나옴
		Connection con =DriverManager.getConnection(url,user,pass);
		return db;
	}
	
	
	
	public ArrayList<NoticeClass> SelectInfo(JDBC db) {
		String sql = "select id,title,writer_id,content,regdate,hit,files from notice where hit>15";
		try {
			db.st = db.con.createStatement();
			db.rs = db.st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<NoticeClass> al = new ArrayList<NoticeClass>();
		
		try {
			while(rs.next()){     
				al.add(new NoticeClass(
						db.rs.getString("id"),
						db.rs.getString("title"),
						db.rs.getString("writer_id"),
						db.rs.getString("content"),
						db.rs.getString("regdate"),
						db.rs.getString("hit"),
						db.rs.getString("files")
						));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.toString());
		}
		
		return al;
	}
	
	
	
	
	//DB 연결을 끊는 메서드
	public void DBconclose(JDBC db) throws SQLException {
		db.rs.close();
		db.st.close();
		db.con.close();
	}
}

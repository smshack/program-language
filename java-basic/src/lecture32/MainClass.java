package lecture32;

import java.sql.SQLException;

public class MainClass {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	System.out.println("========================================");
	JDBCSQLEx2.getConnection();
	System.out.println();
	System.out.println("========================================");
	JDBCSQLEx3.getConnection2("localhost", "practice", "1111");
	System.out.println();
	System.out.println("========================================");
	JDBCSQLEx4.getConnection4("localhost", "practice", "1111", "notice");
	System.out.println("========================================");
	JDBC db =new JDBC();
	db=db.DBconnetct();
	
	db.SelectInfo(db);
	
	db.DBconclose(db);
}
}

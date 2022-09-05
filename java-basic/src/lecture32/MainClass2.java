package lecture32;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainClass2 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	JDBC2 db = new JDBC2();
	Connection con = db.connect();
	ResultSet rs =db.select(con);
	db.print(rs);
}
}

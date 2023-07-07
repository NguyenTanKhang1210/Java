import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
	  Connection con  ;
	  
	public void ConnectDb()
	{
		String url = "jdbc:mysql://localhost:3306/QLSP";
	    String user = "root";
	    String password = "123456";  
	
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Ket noi thanh cong");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public ResultSet LoadDb (String sql) 
	{
		
		ConnectDb();
		ResultSet r = null; 
		//System.out.println(sql);
		Statement stm ;
		try {
			stm = con.createStatement();
			return stm.executeQuery(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		System.out.println(e.toString());
			return null;
		}
		
		
	}
	// them sua xoa 
	public void UpdateDB(String sql)
	{
		ConnectDb();
		Statement stm;
		try {
			stm = con.createStatement();
			stm.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
		
	}

}


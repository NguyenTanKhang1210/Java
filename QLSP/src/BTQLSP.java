import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BTQLSP {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connect cn = new Connect();
		cn.ConnectDb();
		QuantriObj qto = new QuantriObj("user1", "123");
		QuantriControl qtc = new QuantriControl();
		ResultSet rs = qtc.LoadDangnhap(qto);
	     
	    	    	while (rs.next()) {
	                System.out.println( rs.getString(1)  + " - " + rs.getString(2) );
	            }
	
	}

}

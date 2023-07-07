import java.sql.ResultSet;
import java.sql.SQLException;

public class QuantriControl {
	Connect cn  = new Connect();
	public ResultSet LoaddbQuantri(String sql) throws SQLException
	{
		ResultSet rs = null; 
		
		rs = cn.LoadDb(sql);
		return rs;
	}
	
	public ResultSet LoadDangnhap(QuantriObj qto) 
	{
		ResultSet rs = null; 
		String sql = "Select * from QUANTRI where User = N'" + qto.getUser() +"' and Pass = N'" + qto.getPass() +"'";
		rs = cn.LoadDb(sql);
		return rs;
	}

}

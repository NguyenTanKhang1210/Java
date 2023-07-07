import java.sql.ResultSet;
import java.sql.SQLException;

public class LoaispController {
	
	Connect cn = new Connect();
	public ResultSet LoadSP() throws SQLException
	{
		ResultSet rs = null; 
		String sql = "Select * from Loaisp";
		rs = cn.LoadDb(sql);
		return rs;
	}
	public void ThemLoaisp(LoaispObj lsp) 
	{
		
		String sql = " insert into loaisp values(N'"+ lsp.getMaloai() +"', N'" + lsp.getTenloai()+ "')";
		 cn.UpdateDB(sql);
	}

}

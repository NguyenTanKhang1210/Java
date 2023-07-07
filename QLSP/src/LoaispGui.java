import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class LoaispGui extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaloai;
	private JTextField txtTenloai;
	private JTable table;
String colname [] = new String[] {"Ma loai", "Ten Loai"}; 
DefaultTableModel dtm = new DefaultTableModel();
void clearData()
{
	int n = dtm.getRowCount() - 1; 
	for(int i = n ;i>=0 ;i -- )
		dtm.removeRow(i);	
}

void showData() throws SQLException
{
	LoaispController lspc = new LoaispController();
	ResultSet rs = lspc.LoadSP();
	clearData();
	while (rs.next())
	{
		String data[] = new String [2]; 
		data[0] = rs.getString(1); 
		data[1] = rs.getString(2); 
		dtm.addRow(data);
	}
}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoaispGui frame = new LoaispGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public LoaispGui() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ma Loai SP");
		lblNewLabel.setBounds(10, 26, 102, 14);
		contentPane.add(lblNewLabel);
		
		txtMaloai = new JTextField();
		txtMaloai.setBounds(156, 23, 86, 20);
		contentPane.add(txtMaloai);
		txtMaloai.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ten Loai");
		lblNewLabel_1.setBounds(10, 74, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtTenloai = new JTextField();
		txtTenloai.setBounds(156, 71, 86, 20);
		contentPane.add(txtTenloai);
		txtTenloai.setColumns(10);
		
		JButton btnThem = new JButton("Them");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String masp = txtMaloai.getText(); 
				String tsp = txtTenloai.getText();
				LoaispObj lsp = new LoaispObj(masp, tsp);
				LoaispController lspc = new LoaispController(); 
				lspc.ThemLoaisp(lsp);
				try {
					showData();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, "them thanh cong");
				
			}
		});
		btnThem.setBounds(10, 133, 89, 23);
		contentPane.add(btnThem);
		
		JButton btnSua = new JButton("Sua");
		btnSua.setBounds(109, 133, 89, 23);
		contentPane.add(btnSua);
		
		JButton btnXoa = new JButton("Xoa");
		btnXoa.setBounds(202, 133, 89, 23);
		contentPane.add(btnXoa);
		
		JButton btnLuu = new JButton("Luu");
		btnLuu.setBounds(301, 133, 89, 23);
		contentPane.add(btnLuu);
		
		JButton btnThoat = new JButton("Thoat");
		btnThoat.setBounds(400, 133, 89, 23);
		contentPane.add(btnThoat);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 177, 486, 178);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Ma loai", "Ten Loai"
			}
		));
		table.setModel(dtm);
		dtm.setColumnIdentifiers(colname);
		showData();
		scrollPane.setViewportView(table);
	}
}

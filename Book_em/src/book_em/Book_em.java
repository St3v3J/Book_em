package book_em;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;

public class Book_em {

	private JFrame frame;
	private JTextField txtbname;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField_2;

	/**
	 * This single page app page takes customer search and compares
	 *  to a database just like a regular bookstore for a buy and 
	 *  sell style bookstore. Customers can check to see the offered 
	 *  purchase price of specific books and sale price of any 
	 *  books available.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Book_em window = new Book_em();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Book_em() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
			frame = new JFrame();
		frame.setBounds(100, 100, 877, 566);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
			JLabel lblNewLabel_1 = new JLabel("Book_em");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(362, 9, 207, 106);
		frame.getContentPane().add(lblNewLabel_1);
		
			JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Registration", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(24, 116, 451, 193);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
			JLabel lblNewLabel = new JLabel("Book Name");
		lblNewLabel.setBounds(31, 30, 92, 32);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel);
		
			JLabel lblNewLabel_2 = new JLabel("Edition");
		lblNewLabel_2.setBounds(31, 79, 92, 32);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_2);
		
			JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(31, 122, 92, 39);
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblPrice);
		
			txtbname = new JTextField();
		txtbname.setBounds(151, 38, 184, 26);
		panel.add(txtbname);
		txtbname.setColumns(10);
		
			textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(151, 87, 184, 26);
		panel.add(textField);
		
			textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(151, 130, 184, 26);
		panel.add(textField_1);
		
			JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(34, 330, 131, 73);
		frame.getContentPane().add(btnNewButton);
		
			JButton btnExit = new JButton("Exit");
		btnExit.setBounds(189, 330, 131, 73);
		frame.getContentPane().add(btnExit);
		
			JButton btnClear = new JButton("Delete");
		btnClear.setBounds(344, 330, 131, 73);
		frame.getContentPane().add(btnClear);
		
			table = new JTable();
		table.setBounds(494, 116, 349, 303);
		frame.getContentPane().add(table);
		
			JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(24, 431, 460, 96) ;
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
			JLabel lblNewLabel_2_1 = new JLabel("BookID");
		lblNewLabel_2_1.setBounds(21, 30, 85, 28);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(lblNewLabel_2_1);
		
			textField_2 = new JTextField();
		textField_2.setBounds(116, 30, 265, 31);
		textField_2.setColumns(10);
		panel_1.add(textField_2);
		
			JButton btnUpdate = new JButton("Refresh");
		btnUpdate.setBounds(528, 439, 131, 73);
		frame.getContentPane().add(btnUpdate);
		
			JButton btnClear_1_1 = new JButton("Remove");
		btnClear_1_1.setBounds(684, 439, 131, 73);
		frame.getContentPane().add(btnClear_1_1);
	}
}

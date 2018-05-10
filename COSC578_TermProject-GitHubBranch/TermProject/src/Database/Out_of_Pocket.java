package Database;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

public class Out_of_Pocket extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private Button INSERT;
	private Button UPDATE;
	private Button DISPLAY;
	
	
	public class outOfPocket{
		
		private int id;
		
		private String Default_Coins;
		private String Default_Copay;
		private String Combined_Deduct_Flag;
		private String HSAHRA;
		
		
		public outOfPocket(int ID,String DefaultCopay,String CombinedDeductFlag,String HsaHra){
			
			this.id=ID;
			this.Default_Copay=DefaultCopay;
			this.Combined_Deduct_Flag=CombinedDeductFlag;
			this.HSAHRA=HsaHra;
			
			
			
		}
		
		public int getID(){
			return id;
		}
		
		public String getDefaultCopay(){
			
			return Default_Copay;
		}
		public String getCombinedDefaultFlag(){
			
			return Combined_Deduct_Flag;
		}
		public String HsaHra(){
			
			return HSAHRA;
		}
		
	}
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Out_of_Pocket frame = new Out_of_Pocket();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Out_of_Pocket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 908, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOutofpocketplans = new JLabel("Out_Of_Pocket_Plans");
		lblOutofpocketplans.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblOutofpocketplans.setBounds(363, 32, 236, 35);
		contentPane.add(lblOutofpocketplans);
		
		JLabel lblPlanid = new JLabel("Plan_ID");
		lblPlanid.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblPlanid.setBounds(15, 78, 138, 35);
		contentPane.add(lblPlanid);
		
		textField = new JTextField();
		textField.setBounds(15, 120, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDefaultcoms = new JLabel("Default_Coms");
		lblDefaultcoms.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblDefaultcoms.setBounds(15, 180, 165, 26);
		contentPane.add(lblDefaultcoms);
		
		textField_1 = new JTextField();
		textField_1.setBounds(15, 212, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDefaultcopay = new JLabel("Default_Copay");
		lblDefaultcopay.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblDefaultcopay.setBounds(25, 264, 165, 35);
		contentPane.add(lblDefaultcopay);
		
		textField_2 = new JTextField();
		textField_2.setBounds(15, 311, 146, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCombineddeductflag = new JLabel("Combined_Deduct_Flag");
		lblCombineddeductflag.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblCombineddeductflag.setBounds(15, 380, 278, 26);
		contentPane.add(lblCombineddeductflag);
		
		textField_3 = new JTextField();
		textField_3.setBounds(15, 422, 146, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblHsahra = new JLabel("HSA/HRA");
		lblHsahra.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblHsahra.setBounds(15, 449, 165, 35);
		contentPane.add(lblHsahra);
		
		textField_4 = new JTextField();
		textField_4.setBounds(7, 485, 154, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		INSERT = new Button("Insert");
		INSERT.setForeground(Color.YELLOW);
		INSERT.setBackground(Color.GREEN);
		INSERT.setFont(new Font("Copperplate Gothic Light", Font.BOLD | Font.ITALIC, 26));
		INSERT.setBounds(742, 115, 108, 41);
		contentPane.add(INSERT);
		
		UPDATE = new Button("Update");
		UPDATE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		UPDATE.setBackground(Color.GRAY);
		UPDATE.setForeground(Color.YELLOW);
		UPDATE.setFont(new Font("Copperplate Gothic Light", Font.BOLD | Font.ITALIC, 26));
		UPDATE.setBounds(742, 264, 108, 49);
		contentPane.add(UPDATE);
		
		DISPLAY = new Button("Display");
		DISPLAY.setBackground(Color.BLUE);
		DISPLAY.setForeground(Color.YELLOW);
		DISPLAY.setFont(new Font("Copperplate Gothic Light", Font.BOLD | Font.ITALIC, 26));
		DISPLAY.setBounds(742, 401, 108, 41);
		contentPane.add(DISPLAY);
	}

}

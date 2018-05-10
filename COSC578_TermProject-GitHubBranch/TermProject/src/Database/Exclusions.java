package Database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Exclusions extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private String Benefit_Service;
	private String MOOP_In_Excl;
	private String Moop_Out_Excl;
	private String Subj_To_Ded_Excl;
	
	
	public Exclusions(String BenefitService,String MoopInExcl,String MoopOutExcl,String SubjToDedExcl){
		
		this.Benefit_Service =BenefitService;
		this.MOOP_In_Excl =MoopInExcl;
		this.Moop_Out_Excl =MoopOutExcl;
		this.Subj_To_Ded_Excl =SubjToDedExcl;
		
		
		
	}
	public  String getBenefitService(){
		return Benefit_Service;
	}
	
	public String getMoopInExcl(){
		return MOOP_In_Excl;
	}
	public String getMoopOutExcl(){
		return Moop_Out_Excl;
	}
	public String getSubjToDedExcl(){
		return Subj_To_Ded_Excl;
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exclusions window = new Exclusions();
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
	public Exclusions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 803, 682);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblExclusions = new JLabel("Exclusions");
		lblExclusions.setForeground(Color.YELLOW);
		lblExclusions.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 26));
		lblExclusions.setBounds(375, 16, 204, 35);
		frame.getContentPane().add(lblExclusions);
		
		JLabel lblBenefitservice = new JLabel("Benefit_Service");
		lblBenefitservice.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 26));
		lblBenefitservice.setBounds(26, 116, 212, 51);
		frame.getContentPane().add(lblBenefitservice);
		
		JLabel lblMoopinexcl = new JLabel("Moop_In_Excl");
		lblMoopinexcl.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 26));
		lblMoopinexcl.setBounds(26, 199, 212, 51);
		frame.getContentPane().add(lblMoopinexcl);
		
		JLabel lblMoopoutecl = new JLabel("Moop_Out_Ecl");
		lblMoopoutecl.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 26));
		lblMoopoutecl.setBounds(26, 281, 248, 35);
		frame.getContentPane().add(lblMoopoutecl);
		
		JLabel lblSubjecttodedexcl = new JLabel("Subject_To_Ded_Excl");
		lblSubjecttodedexcl.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 26));
		lblSubjecttodedexcl.setBounds(15, 341, 288, 41);
		frame.getContentPane().add(lblSubjecttodedexcl);
		
		textField = new JTextField();
		textField.setBounds(375, 116, 146, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(375, 211, 146, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(375, 285, 146, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(375, 348, 146, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton Insert = new JButton("Insert");
		Insert.setForeground(Color.YELLOW);
		Insert.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 26));
		Insert.setBounds(76, 542, 146, 35);
		frame.getContentPane().add(Insert);
		
		JButton Update = new JButton("Update");
		Update.setForeground(Color.GREEN);
		Update.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 26));
		Update.setBounds(318, 542, 152, 35);
		frame.getContentPane().add(Update);
		
		JButton Display = new JButton("Display");
		Display.setForeground(Color.BLUE);
		Display.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 26));
		Display.setBounds(575, 548, 146, 29);
		frame.getContentPane().add(Display);
	}

}

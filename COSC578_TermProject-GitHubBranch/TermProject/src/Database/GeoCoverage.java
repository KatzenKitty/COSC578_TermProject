package Database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;

public class GeoCoverage extends JFrame{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private String NatNetFlag;
	private int Plan_ID;
	private String OutServAreaCov;
	private String Out_Of_Country_Cov;
	private Button INSERT;
	private Button UPDATE;
	private Button DISPLAY;
	
	public GeoCoverage(int ID,String OutSerAreaCov,String OutOfCountCov){
		
		this.Plan_ID =ID;
		this.Out_Of_Country_Cov =OutServAreaCov;
		
	this.Out_Of_Country_Cov =OutOfCountCov;
		
			
		
	}
	public int getID(){
		return Plan_ID;
	}
	public String getOutServAreaCov(){
		return OutServAreaCov;
	}
	public String getOutOfCountCov(){
		return Out_Of_Country_Cov;
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeoCoverage window = new GeoCoverage();
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
	public GeoCoverage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 826, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGeographicCoverage = new JLabel("Geographic Coverage");
		lblGeographicCoverage.setForeground(new Color(255, 255, 0));
		lblGeographicCoverage.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 27));
		lblGeographicCoverage.setBounds(282, 42, 338, 34);
		frame.getContentPane().add(lblGeographicCoverage);
		
		JLabel lblPlanid = new JLabel("Plan_ID");
		lblPlanid.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 26));
		lblPlanid.setBounds(15, 149, 206, 58);
		frame.getContentPane().add(lblPlanid);
		
		JLabel lblNatnetflag = new JLabel("Nat_Net_Flag");
		lblNatnetflag.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 26));
		lblNatnetflag.setBounds(15, 246, 237, 58);
		frame.getContentPane().add(lblNatnetflag);
		
		JLabel lblOutservareacov = new JLabel("OutServAreaCov");
		lblOutservareacov.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 26));
		lblOutservareacov.setBounds(15, 321, 274, 58);
		frame.getContentPane().add(lblOutservareacov);
		
		JLabel lblOutofcountrycov = new JLabel("Out_Of_Country_Cov");
		lblOutofcountrycov.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 26));
		lblOutofcountrycov.setBounds(15, 432, 315, 44);
		frame.getContentPane().add(lblOutofcountrycov);
		
		textField = new JTextField();
		textField.setBounds(407, 149, 213, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(407, 238, 213, 34);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(407, 329, 213, 34);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(407, 432, 213, 35);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnInsert.setForeground(Color.YELLOW);
		btnInsert.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 26));
		btnInsert.setBounds(71, 549, 150, 29);
		frame.getContentPane().add(btnInsert);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setForeground(Color.GREEN);
		btnUpdate.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 26));
		btnUpdate.setBounds(352, 549, 137, 29);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.setForeground(Color.BLUE);
		btnDisplay.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 26));
		btnDisplay.setBounds(606, 549, 145, 29);
		frame.getContentPane().add(btnDisplay);
	}

}

package Database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.Color;
import javax.swing.JTextField;

public class ReferalRequired extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private String SpecialistRegRef;
	private int Plan_ID;
	private String Ref_Req;

	
	public ReferalRequired (int ID,String SpecRegRef,String RefReq){
		
		this.Plan_ID =ID;
		this.SpecialistRegRef =SpecRegRef;
		this.Ref_Req = RefReq;
		
		
		
	}
	public int getID(){
		return Plan_ID;
		
	}
	public String getSpecRegRef(){
		return SpecialistRegRef;
		
	}
	public String getRefReg(){
		
		return Ref_Req;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReferalRequired window = new ReferalRequired();
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
	public ReferalRequired() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 773, 609);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPlanid = new JLabel("Plan_ID");
		lblPlanid.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 26));
		lblPlanid.setBounds(15, 91, 200, 45);
		frame.getContentPane().add(lblPlanid);
		
		JLabel lblSpecialistregref = new JLabel("SpecialistRegRef");
		lblSpecialistregref.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 26));
		lblSpecialistregref.setBounds(15, 186, 200, 35);
		frame.getContentPane().add(lblSpecialistregref);
		
		JLabel lblNewLabel = new JLabel("Ref_Req");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(15, 268, 200, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblReferalRequired = new JLabel("Referal Required");
		lblReferalRequired.setForeground(Color.YELLOW);
		lblReferalRequired.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 26));
		lblReferalRequired.setBounds(237, 0, 296, 45);
		frame.getContentPane().add(lblReferalRequired);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 27));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.YELLOW);
		btnNewButton.setBounds(25, 394, 172, 45);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setBounds(450, 414, 69, 20);
		frame.getContentPane().add(label);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setForeground(Color.GREEN);
		btnNewButton_1.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 26));
		btnNewButton_1.setBounds(254, 394, 150, 45);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Display");
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 26));
		btnNewButton_2.setBounds(460, 410, 143, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(275, 91, 172, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(275, 190, 172, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(275, 269, 172, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}

}

package Database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;

public class CostSharing extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private int Plan_ID;
	private String Variant_Flag;
	private String Adv_Payment;
	
	public CostSharing(int ID,String VariantFlag,String AdvPayment){
		
		this.Plan_ID =ID;
		this.Variant_Flag =VariantFlag;
		this.Adv_Payment =AdvPayment;
		
		
		
	}
	
	public int getID(){
		return Plan_ID;
	}
	
	public String getVariantFlag(){
		return Variant_Flag;
	}
  
	public String getAdvPayment(){
		return Adv_Payment;
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CostSharing window = new CostSharing();
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
	public CostSharing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 748, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCostsharing = new JLabel("CostSharing");
		lblCostsharing.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 26));
		lblCostsharing.setBackground(Color.CYAN);
		lblCostsharing.setForeground(Color.MAGENTA);
		lblCostsharing.setBounds(333, 16, 172, 35);
		frame.getContentPane().add(lblCostsharing);
		
		JLabel lblPlanid = new JLabel("Plan_ID");
		lblPlanid.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 26));
		lblPlanid.setBounds(0, 95, 184, 20);
		frame.getContentPane().add(lblPlanid);
		
		JLabel lblVariantflag = new JLabel("Variant_Flag");
		lblVariantflag.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 26));
		lblVariantflag.setBounds(0, 175, 210, 20);
		frame.getContentPane().add(lblVariantflag);
		
		JLabel lblAdvpayment = new JLabel("Adv_Payment");
		lblAdvpayment.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 26));
		lblAdvpayment.setBounds(0, 255, 210, 35);
		frame.getContentPane().add(lblAdvpayment);
		
		textField = new JTextField();
		textField.setBounds(217, 92, 245, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(225, 172, 237, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(225, 259, 237, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInsert.setBackground(Color.LIGHT_GRAY);
		btnInsert.setForeground(Color.YELLOW);
		btnInsert.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 25));
		btnInsert.setBounds(40, 364, 115, 29);
		frame.getContentPane().add(btnInsert);
		
		JButton Display = new JButton("Display");
		Display.setForeground(Color.GREEN);
		Display.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 26));
		Display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Display.setBounds(213, 364, 152, 29);
		frame.getContentPane().add(Display);
		
		JButton Update = new JButton("Update");
		Update.setForeground(Color.BLUE);
		Update.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 26));
		Update.setBounds(422, 364, 152, 29);
		frame.getContentPane().add(Update);
	}
}

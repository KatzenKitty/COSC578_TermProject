package Database;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

public class Premium extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private  int Plan_ID;
	private String Indiv_Rate;
	private String Age_Range;
	
	public Premium(int ID, String IndivRate, String AgeRange){
		
		this.Plan_ID=ID;
		this.Indiv_Rate=IndivRate;
		this.Age_Range=AgeRange;
		
		
	}
	public int getID(){
		return Plan_ID;
		
	}
	public String IndivRate(){
		
		return Indiv_Rate;
		
	}
	public String AgeRange(){
		return Age_Range;
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Premium frame = new Premium();
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
	public Premium() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 549);
		contentPane = new JPanel();
		contentPane.setForeground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPremium = new JLabel("Premium");
		lblPremium.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblPremium.setBounds(370, 47, 189, 31);
		contentPane.add(lblPremium);
		
		JLabel lblPlanid = new JLabel("Plan_ID");
		lblPlanid.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblPlanid.setBounds(15, 94, 116, 20);
		contentPane.add(lblPlanid);
		
		textField = new JTextField();
		textField.setBounds(15, 120, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(15, 205, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(15, 316, 146, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblIndivrate = new JLabel("Indiv_Rate");
		lblIndivrate.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblIndivrate.setBounds(25, 169, 136, 20);
		contentPane.add(lblIndivrate);
		
		JLabel lblAgerange = new JLabel("Age_Range");
		lblAgerange.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblAgerange.setBounds(15, 265, 146, 35);
		contentPane.add(lblAgerange);
		
		Button INSERT = new Button("Insert");
		INSERT.setBackground(Color.GREEN);
		INSERT.setFont(new Font("Eras Bold ITC", Font.BOLD | Font.ITALIC, 26));
		INSERT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		INSERT.setBounds(68, 410, 146, 45);
		contentPane.add(INSERT);
		
		Button UPDATE = new Button("Update");
		UPDATE.setBackground(Color.GRAY);
		UPDATE.setFont(new Font("Eras Bold ITC", Font.BOLD | Font.ITALIC, 26));
		UPDATE.setBounds(349, 410, 146, 45);
		contentPane.add(UPDATE);
		
		Button DELETE = new Button("Delete");
		DELETE.setFont(new Font("Eras Medium ITC", Font.BOLD | Font.ITALIC, 26));
		DELETE.setBackground(Color.RED);
		DELETE.setBounds(624, 410, 136, 45);
		contentPane.add(DELETE);
	}
}

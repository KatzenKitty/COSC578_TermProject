package Database;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Provider extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private int Hios_Issuer_id;
	private String Name;
	private String Service_Area;
	private Button INSERT;
	private Button UPDATE;
	private Button DISPLAY;
	
	public Provider(int ID, String Name, String ServiceArea){
		this.Hios_Issuer_id =ID;
		this.Name =Name;
		this.Service_Area=ServiceArea;	
	}

	public int getID(){
		
		return Hios_Issuer_id;
	}
	public String getName(){
		
		return Name;
	}
	
	public String getServiceArea(){
		
		return Service_Area;
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Provider frame = new Provider();
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
	public Provider() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 917, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInsuranceProvider = new JLabel("Insurance Provider");
		lblInsuranceProvider.setFont(new Font("Sylfaen", Font.PLAIN, 27));
		lblInsuranceProvider.setBounds(392, 47, 231, 36);
		contentPane.add(lblInsuranceProvider);
		
		JLabel lblHiosissuerid = new JLabel("HIOS_Issuer_ID");
		lblHiosissuerid.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblHiosissuerid.setBounds(15, 101, 218, 20);
		contentPane.add(lblHiosissuerid);
		
		textField = new JTextField();
		textField.setBounds(15, 143, 185, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblName.setBounds(15, 212, 94, 20);
		contentPane.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(15, 244, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblServicearea = new JLabel("Service_Area");
		lblServicearea.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblServicearea.setBounds(15, 302, 146, 26);
		contentPane.add(lblServicearea);
		
		textField_2 = new JTextField();
		textField_2.setBounds(15, 353, 146, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		INSERT = new Button("Insert");
		INSERT.setFont(new Font("Eras Bold ITC", Font.BOLD | Font.ITALIC, 26));
		INSERT.setBackground(Color.GREEN);
		INSERT.setForeground(Color.YELLOW);
		INSERT.setBounds(97, 473, 100, 36);
		contentPane.add(INSERT);
		
		UPDATE = new Button("Update");
		UPDATE.setFont(new Font("Eras Bold ITC", Font.BOLD | Font.ITALIC, 26));
		UPDATE.setBackground(Color.GRAY);
		UPDATE.setForeground(Color.YELLOW);
		UPDATE.setBounds(326, 473, 109, 36);
		contentPane.add(UPDATE);
		
		DISPLAY = new Button("Display");
		DISPLAY.setFont(new Font("Eras Bold ITC", Font.BOLD | Font.ITALIC, 26));
		DISPLAY.setForeground(Color.YELLOW);
		DISPLAY.setBackground(Color.BLUE);
		DISPLAY.setBounds(608, 473, 109, 36);
		contentPane.add(DISPLAY);
	}

}

package Database;

import javax.swing.*;
import java.awt.*;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

public class Plans extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	
	public class Plan{
		private int  id;
		
		private String Plan_Name;
		private String Service_Area;
		private String MetalV;
		private String Status;
		private String QHP_status;
		private String Plan_URL;
		private String Plan_Type;
		private String PlanVExclusions;
		private String ChildOnlyPlanFlag;
		private String EhbPercPrem;
		private String HiosIssuerId;
		
		public Plan(int  ID,String PlanName,String ServiceArea,String MetalV,String Status,String QhpStatus,
			String PlanUrl,String PlanType,String PlanVExclusions,String ChildOnlyPlanFlag,String EhbPercPrem,String HiosIssuerId)
		{
			
		this.id=ID;
		this.Plan_Name=PlanName;
		this.Service_Area=ServiceArea;
		this.MetalV=MetalV;
		this.Status=Status;
		this.QHP_status=QhpStatus;
		this.Plan_URL=PlanUrl;
		this.Plan_Type=PlanType;
		this.PlanVExclusions=PlanVExclusions;
		this.ChildOnlyPlanFlag=ChildOnlyPlanFlag;
		this.EhbPercPrem=EhbPercPrem;
		this.HiosIssuerId=HiosIssuerId;
		
		
			
			
			
		}
		public int getID(){
			
			
			return id;
		}
		public String getPlanNme(){
			return Plan_Name;
		}
		
		public String getServiceArea(){
			
			return Service_Area;
		}
		
		public String getMetalV(){
			return MetalV;
			
		}
		public String getStatus(){
			return Status;
			
		}
		public String getQhpStatus(){
			return QHP_status;
			
		}
		public String getPlanUrl(){
			return Plan_URL;
			
		}
		public String getPlanType(){
			return Plan_Type;
			 
		}
		public String getPlanVExclusions(){
			
			return PlanVExclusions;
			
		}
		public String getChildOnlyPlanFlag(){
			return ChildOnlyPlanFlag;	
		}
		public String getEhbPercPrem(){
			return EhbPercPrem;
			
			
		}
		public String getHiosIssuerId(){
			
			
			return HiosIssuerId;
		}
	
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Plans frame = new Plans();
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
	public Plans() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 908, 663);
		
		JLabel lblPlans = new JLabel("PLANS");
		lblPlans.setFont(new Font("Stencil", Font.BOLD, 26));
		
		JLabel lblPlanid = new JLabel("Plan_ID");
		lblPlanid.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblPlanname = new JLabel("Plan_Name");
		lblPlanname.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblServicearea = new JLabel("Service_Area");
		lblServicearea.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblMetalv = new JLabel("Metal_|v|");
		lblMetalv.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblQhpstatus = new JLabel("QHP_status");
		lblQhpstatus.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblPlanurl = new JLabel("Plan_URL");
		lblPlanurl.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel lblPlantype = new JLabel("Plan_Type");
		lblPlantype.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JLabel lblPlanvexclusions = new JLabel("Plan_|v|_Exclusions");
		lblPlanvexclusions.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		JLabel lblChildonlyflagplan = new JLabel("Child_Only_Flag_Plan");
		lblChildonlyflagplan.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		
		JLabel lblEhbpercprem = new JLabel("EHB_Perc_Prem");
		lblEhbpercprem.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		JLabel lblHiosissuerid = new JLabel("HIOS_Issuer_ID");
		lblHiosissuerid.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		Button INSERT = new Button("Insert");
		INSERT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		INSERT.setFont(new Font("Eras Bold ITC", Font.BOLD | Font.ITALIC, 26));
		INSERT.setForeground(Color.YELLOW);
		INSERT.setBackground(Color.GREEN);
		
		Button UPDATE = new Button("Update");
		UPDATE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		UPDATE.setForeground(Color.YELLOW);
		UPDATE.setBackground(Color.CYAN);
		UPDATE.setFont(new Font("Bodoni MT Black", Font.BOLD | Font.ITALIC, 26));
		
		Button DELETE = new Button("Delete");
		DELETE.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			}
		});
		DELETE.setForeground(Color.YELLOW);
		DELETE.setFont(new Font("Bernard MT Condensed", Font.BOLD | Font.ITALIC, 26));
		DELETE.setBackground(Color.RED);
		
		Button DISPLAY = new Button("Display");
		DISPLAY.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			}
		});
		DISPLAY.setBackground(Color.BLUE);
		DISPLAY.setForeground(Color.YELLOW);
		DISPLAY.setFont(new Font("Eras Medium ITC", Font.BOLD | Font.ITALIC, 26));
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(lblPlans);
		getContentPane().add(lblPlanid);
		getContentPane().add(textField);
		getContentPane().add(lblPlanname);
		getContentPane().add(textField_1);
		getContentPane().add(lblServicearea);
		getContentPane().add(textField_2);
		getContentPane().add(lblMetalv);
		getContentPane().add(textField_3);
		getContentPane().add(lblStatus);
		getContentPane().add(textField_4);
		getContentPane().add(lblQhpstatus);
		getContentPane().add(textField_5);
		getContentPane().add(lblPlanurl);
		getContentPane().add(textField_6);
		getContentPane().add(lblPlantype);
		getContentPane().add(textField_7);
		getContentPane().add(lblPlanvexclusions);
		getContentPane().add(textField_8);
		getContentPane().add(lblChildonlyflagplan);
		getContentPane().add(lblEhbpercprem);
		getContentPane().add(textField_9);
		getContentPane().add(textField_10);
		getContentPane().add(lblHiosissuerid);
		getContentPane().add(textField_11);
		getContentPane().add(INSERT);
		getContentPane().add(UPDATE);
		getContentPane().add(DELETE);
		getContentPane().add(DISPLAY, BorderLayout.NORTH);
	}
}

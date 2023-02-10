package StudentRecordd;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentRecordd {

	private JFrame frame;
	private JTextField jtxtStudentID;
	private JTextField jtxtFirstname;
	private JTextField jtxtSurname;
	private JTextField jtxtDOB;
	private JTextField jtxtEnglish;
	private JTextField jtxtMaths;
	private JTextField jtxtScience;
	private JTextField jtxtTotalScore;
	private JTextField jtxtAverage;
	private JTextField jtxtRanking;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRecordd window = new StudentRecordd();
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
	public StudentRecordd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new LineBorder(new Color(95, 158, 160), 12));
		panel.setBounds(10, 11, 962, 413);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		jtxtStudentID = new JTextField();
		jtxtStudentID.setBounds(172, 32, 173, 20);
		panel.add(jtxtStudentID);
		jtxtStudentID.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Student ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(36, 32, 137, 14);
		panel.add(lblNewLabel);
		
		JLabel lblFirstname = new JLabel("Firstname:");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFirstname.setBounds(36, 67, 137, 14);
		panel.add(lblFirstname);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSurname.setBounds(36, 101, 137, 14);
		panel.add(lblSurname);
		
		JLabel lblCourseCode = new JLabel("Course Code:");
		lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCourseCode.setBounds(36, 146, 137, 14);
		panel.add(lblCourseCode);
		
		JLabel lblSemester = new JLabel("Semester:");
		lblSemester.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSemester.setBounds(36, 183, 137, 14);
		panel.add(lblSemester);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGender.setBounds(36, 229, 137, 14);
		panel.add(lblGender);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDob.setBounds(36, 273, 137, 14);
		panel.add(lblDob);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddress.setBounds(36, 319, 137, 14);
		panel.add(lblAddress);
		
		jtxtFirstname = new JTextField();
		jtxtFirstname.setColumns(10);
		jtxtFirstname.setBounds(172, 63, 173, 20);
		panel.add(jtxtFirstname);
		
		jtxtSurname = new JTextField();
		jtxtSurname.setColumns(10);
		jtxtSurname.setBounds(172, 101, 173, 20);
		panel.add(jtxtSurname);
		
		jtxtDOB = new JTextField();
		jtxtDOB.setColumns(10);
		jtxtDOB.setBounds(172, 273, 173, 20);
		panel.add(jtxtDOB);
		
		JLabel lblEnglish = new JLabel("English:");
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnglish.setBounds(517, 42, 137, 23);
		panel.add(lblEnglish);
		
		JLabel lblMaths = new JLabel("Maths:");
		lblMaths.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMaths.setBounds(517, 76, 137, 14);
		panel.add(lblMaths);
		
		JLabel lblNewLabel_10_1 = new JLabel("Science:");
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_10_1.setBounds(517, 101, 137, 14);
		panel.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("Total Score:");
		lblNewLabel_10_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_10_2.setBounds(518, 186, 137, 14);
		panel.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_10_3 = new JLabel("Average:");
		lblNewLabel_10_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_10_3.setBounds(517, 229, 137, 20);
		panel.add(lblNewLabel_10_3);
		
		jtxtEnglish = new JTextField();
		jtxtEnglish.setColumns(10);
		jtxtEnglish.setBounds(647, 46, 173, 20);
		panel.add(jtxtEnglish);
		
		jtxtMaths = new JTextField();
		jtxtMaths.setColumns(10);
		jtxtMaths.setBounds(647, 76, 173, 20);
		panel.add(jtxtMaths);
		
		jtxtScience = new JTextField();
		jtxtScience.setColumns(10);
		jtxtScience.setBounds(647, 101, 173, 20);
		panel.add(jtxtScience);
		
		jtxtTotalScore = new JTextField();
		jtxtTotalScore.setColumns(10);
		jtxtTotalScore.setBounds(660, 183, 173, 20);
		panel.add(jtxtTotalScore);
		
		jtxtAverage = new JTextField();
		jtxtAverage.setColumns(10);
		jtxtAverage.setBounds(660, 229, 173, 20);
		panel.add(jtxtAverage);
		
		JComboBox cmbCourseCode = new JComboBox();
		cmbCourseCode.setFont(new Font("Tahoma", Font.BOLD, 15));
		cmbCourseCode.setModel(new DefaultComboBoxModel(new String[] {"4456", "4457", "4458"}));
		cmbCourseCode.setBounds(172, 145, 173, 22);
		panel.add(cmbCourseCode);
		
		JComboBox cmbSemester = new JComboBox();
		cmbSemester.setFont(new Font("Tahoma", Font.BOLD, 15));
		cmbSemester.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		cmbSemester.setBounds(172, 182, 173, 22);
		panel.add(cmbSemester);
		
		JLabel lblNewLabel_10_3_1 = new JLabel("Ranking:");
		lblNewLabel_10_3_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_10_3_1.setBounds(517, 276, 137, 20);
		panel.add(lblNewLabel_10_3_1);
		
		jtxtRanking = new JTextField();
		jtxtRanking.setColumns(10);
		jtxtRanking.setBounds(660, 279, 173, 20);
		panel.add(jtxtRanking);
		
		JTextArea jtxtAddress = new JTextArea();
		jtxtAddress.setFont(new Font("Monospaced", Font.BOLD, 13));
		jtxtAddress.setBounds(172, 317, 255, 73);
		panel.add(jtxtAddress);
		
		JComboBox cmbGender = new JComboBox();
		cmbGender.setFont(new Font("Tahoma", Font.BOLD, 14));
		cmbGender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		cmbGender.setBounds(172, 228, 173, 22);
		panel.add(cmbGender);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(95, 158, 160), 12));
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(997, 11, 363, 413);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea jtxtTranscript = new JTextArea();
		jtxtTranscript.setBounds(10, 11, 343, 391);
		panel_1.add(jtxtTranscript);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(95, 158, 160), 12));
		panel_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1.setBounds(10, 435, 1350, 115);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JButton btnResult = new JButton("Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double[] R = new double[14];
				R[0] = Double.parseDouble(jtxtMaths.getText());
				R[1] = Double.parseDouble(jtxtEnglish.getText());
				R[2] = Double.parseDouble(jtxtScience.getText());
				
				R[3] = (R[0] + R[1] + R[2])/3;
				R[4] = (R[0] + R[1] + R[2]);
				
				String Average = String.format("%.0f",R[3]);
				jtxtAverage.setText(Average);
				
				String TotalScore = String.format("%.0f",R[4]);
				jtxtTotalScore.setText(TotalScore);
				
				//==============Ranking================
				
				if(R[4]>= 700)
				{
					jtxtRanking.setText("1st Class");
					
				}
				if(R[4]>= 600)
				{
					jtxtRanking.setText("2nd Class");
				}
				else if(R[4]>= 500)
				{
					jtxtRanking.setText("3rd Class");
				}
				else if(R[4]>= 400)
				{
					jtxtRanking.setText("4th Class");
				}
				else if(R[4]>= 300)
				{
					jtxtRanking.setText("CoHe");
				}
				else if(R[4]>= 200)
				{
					jtxtRanking.setText("Fail");
				}
					
				
			}
		});
		btnResult.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnResult.setBounds(35, 41, 107, 23);
		panel_1_1.add(btnResult);
		
		JButton btnTranscript = new JButton("Transcript");
		btnTranscript.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtTranscript.setText("");
				jtxtTranscript.append("Student Result Recording System\n"
				+ "=============================\n"
				+ "Student ID:\t\t"+jtxtStudentID.getText()
				+ "\nFirstname:\t\t"+jtxtFirstname.getText()
				+ "\nSurnmae:\t\t"+jtxtSurname.getText()
				+ "\nEnglish:\t\t"+jtxtEnglish.getText()
				+ "\nMaths:\t\t"+jtxtMaths.getText()
				+ "\nScience:\t\t"+jtxtScience.getText()
				+ "\n========================="
				+ "\nTotal Score:\t\t"+jtxtTotalScore.getText()
				+ "\nAverage:\t\t"+jtxtAverage.getText()
				+ "\nRanking:\t\t"+jtxtRanking.getText()+"\n");
				
				
				
			
				
			}
		});
		btnTranscript.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTranscript.setBounds(239, 41, 107, 23);
		panel_1_1.add(btnTranscript);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MessageFormat header = new MessageFormat("Printing in progress");
				MessageFormat footer = new MessageFormat("Page{0,number,integer}");
				
				try
				{
					jtxtTranscript.print();
				}
				catch(java.awt.print.PrinterException ev) {
					System.err.format("NO Printer found", ev.getMessage());
				}
				
				
				
				
				
				
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPrint.setBounds(465, 41, 107, 23);
		panel_1_1.add(btnPrint);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField temp=null;
				for(Component c:panel.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JTextField")) {
						temp=(JTextField)c;
						temp.setText(null);
					}
				}
				jtxtTranscript.setText(null);
				jtxtAddress.setText(null);
				
				
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReset.setBounds(711, 41, 118, 23);
		panel_1_1.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Student Result System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExit.setBounds(1003, 41, 125, 23);
		panel_1_1.add(btnExit);
	}
}

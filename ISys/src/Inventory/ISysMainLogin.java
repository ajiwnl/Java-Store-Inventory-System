package Inventory;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ISysMainLogin extends ISysMain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel Usericon;
	private JPanel decorpaneabove;
	private JPanel decorpanebelow;
	private JLabel Ownrtxt;
	private JLabel Usertxt;
	private JTextField Usertxtfield;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JButton loginbtn;
	private JLabel Errormsg;
	//**********Application Launch**********
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ISysMainLogin framee = new ISysMainLogin();
					framee.setVisible(true);
					framee.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//**********Frame Layout**********
	public ISysMainLogin() {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 150, 300, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		decorpaneabove = new JPanel();
		decorpaneabove.setBackground(Color.GREEN);
		decorpaneabove.setBounds(0, 0, 300, 35);
		contentPane.add(decorpaneabove);
		
		decorpanebelow = new JPanel();
		decorpanebelow.setBackground(Color.GREEN);
		decorpanebelow.setBounds(0, 334, 300, 35);
		contentPane.add(decorpanebelow);
		
		Usericon = new JLabel("");
		Usericon.setBounds(93, 46, 128, 128);
		contentPane.add(Usericon);
		
		ImageIcon mainframeimgX = new ImageIcon ("images/User.png");
		Usericon.setIcon(mainframeimgX);
		
		//*********User and Password Layout**********
		
		Ownrtxt = new JLabel("OWNER LOG-IN");
		Ownrtxt.setForeground(Color.GREEN);
		Ownrtxt.setFont(new Font("Century Gothic", Font.BOLD, 25));
		Ownrtxt.setBounds(55, 46, 188, 35);
		contentPane.add(Ownrtxt);
		
		Usertxt = new JLabel("User:");
		Usertxt.setForeground(Color.GREEN);
		Usertxt.setFont(new Font("Century Gothic", Font.BOLD, 20));
		Usertxt.setBounds(5, 162, 88, 35);
		contentPane.add(Usertxt);
		
		Usertxtfield = new JTextField();
		Usertxtfield.setBounds(108, 162, 147, 33);
		contentPane.add(Usertxtfield);
		
		Font txtfieldfont = new Font("Century Gothic", Font.PLAIN,12);
		Usertxtfield.setFont(txtfieldfont);
		
		getContentPane().add(Usertxtfield);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.GREEN);
		lblPassword.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblPassword.setBounds(10, 218, 128, 35);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(108, 220, 147, 33);
		contentPane.add(passwordField);
		
		Font passfieldfont = new Font("Century Gothic", Font.BOLD,12);
		passwordField.setFont(passfieldfont);
		
		getContentPane().add(passwordField);
		
		Errormsg = new JLabel("");
		Errormsg.setForeground(Color.RED);
		Errormsg.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Errormsg.setBounds(20, 249, 259, 35);
		contentPane.add(Errormsg);
		
		loginbtn = new JButton("LOG-IN");
		
		//*********Action Listener to run the code**********
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				
				String userget = Usertxtfield.getText();
				@SuppressWarnings("deprecation")
				String passwordget = passwordField.getText();
				
				
				if (userget.equals("Alvin123") && passwordget.equals("araneta")) {
					ISysMain ISys = new ISysMain();
					ISys.setVisible(true);
					dispose();
				}
				
				else if (userget.equals("Kem123") && passwordget.equals("franco")) {
					ISysMain ISys = new ISysMain();
					ISys.setVisible(true);
					dispose();
				}
				
				else if (userget.equals("Lloyd123") && passwordget.equals("alberio")) {
					ISysMain ISys = new ISysMain();
					ISys.setVisible(true);
					dispose();
				}
				
				else if (userget.equals("Abegeil123") && passwordget.equals("layon")) {
					ISysMain ISys = new ISysMain();
					ISys.setVisible(true);
					dispose();
				}
				
				else {
					Usertxtfield.setText("");
					passwordField.setText("");
					Errormsg.setText("Try again or contact the owner to gain access!");
					
				}	
			}
		});
		loginbtn.setBackground(Color.GREEN);
		loginbtn.setFont(new Font("Century Gothic", Font.BOLD, 20));
		loginbtn.setBounds(108, 281, 113, 42);
		contentPane.add(loginbtn);
		
		
	}
}

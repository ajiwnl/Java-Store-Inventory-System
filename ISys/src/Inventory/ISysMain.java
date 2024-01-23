package Inventory;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ISysMain extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFrame exitframe;
	private JPanel Invpanel;
	private JLabel Storetitle;
	private JLabel InySysLbl;
	private JLabel StoreImage;
	private JButton mainframeEXTbtn;
	private JPanel decorpane001;
	private JPanel decorpane002;
	private JLabel Producticon;
	private JLabel prdctlist;
	private JLabel Prdctupdatetxt;
	private JLabel Prdctupdateicon;
	private JLabel Cashier;
	private JLabel POS;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ISysMain frame = new ISysMain();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					frame.setBounds(350, 150, 636, 426);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ISysMain() {
		setUndecorated(true);
		setResizable(false);
		setForeground(Color.GREEN);
		setBackground(Color.GREEN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 636, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Invpanel = new JPanel();
		Invpanel.setBounds(0, 29, 721, 103);
		contentPane.add(Invpanel);
		Invpanel.setLayout(null);
		
		Storetitle = new JLabel("NENE's RETAIL STORE");
		Storetitle.setBackground(Color.BLACK);
		Storetitle.setForeground(Color.GREEN);
		Storetitle.setFont(new Font("Century Gothic", Font.BOLD, 36));
		Storetitle.setBounds(90, 0, 370, 53);
		Invpanel.add(Storetitle);
		
		InySysLbl = new JLabel("INVENTORY MANAGEMENT SYSTEM");
		InySysLbl.setForeground(Color.GREEN);
		InySysLbl.setFont(new Font("Century Gothic", Font.BOLD, 30));
		InySysLbl.setBounds(22, 50, 513, 53);
		Invpanel.add(InySysLbl);
		
		StoreImage = new JLabel("");
		StoreImage.setBounds(526, 0, 96, 92);
		Invpanel.add(StoreImage);
		
		ImageIcon mainframeimg01 = new ImageIcon ("images/Store.png");
		StoreImage.setIcon(mainframeimg01);
		
		mainframeEXTbtn = new JButton("EXIT");
		mainframeEXTbtn.setFont(new Font("Century Gothic", Font.BOLD, 25));
		mainframeEXTbtn.setForeground(Color.BLACK);
		mainframeEXTbtn.setBackground(Color.RED);
		mainframeEXTbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				exitframe = new JFrame("Exit");
				 if (JOptionPane.showConfirmDialog(exitframe,"Confirm if you want to terminate the application:", "ISys: Powered by EclipseIDE",
						 JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					 System.exit(0);
				 }
			}
		});
		mainframeEXTbtn.setBounds(520, 343, 106, 41);
		contentPane.add(mainframeEXTbtn);
		
		decorpane001 = new JPanel();
		decorpane001.setBounds(0, 0, 691, 31);
		decorpane001.setForeground(Color.GREEN);
		decorpane001.setBackground(Color.GREEN);
		contentPane.add(decorpane001);
		
		decorpane002 = new JPanel();
		decorpane002.setForeground(Color.GREEN);
		decorpane002.setBackground(Color.GREEN);
		decorpane002.setBounds(0, 395, 691, 31);
		contentPane.add(decorpane002);
		
		Producticon = new JLabel("");
		Producticon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PrdctList Producticon= new PrdctList();
				Producticon.setVisible(true);
			}
		});
		Producticon.setBounds(150, 115, 128, 128);
		contentPane.add(Producticon);
		
		ImageIcon mainframeimg02 = new ImageIcon ("images/cart.png");
		Producticon.setIcon(mainframeimg02);
		
		prdctlist = new JLabel("PRODUCT MONITORING");
		prdctlist.setForeground(Color.GREEN);
		prdctlist.setFont(new Font("Century Gothic", Font.BOLD, 18));
		prdctlist.setBounds(97, 226, 218, 31);
		contentPane.add(prdctlist);
		
		Prdctupdateicon = new JLabel("");
		Prdctupdateicon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PrdctUpdate Prdctupdateicon = new PrdctUpdate();
				Prdctupdateicon.setVisible(true);
			}
		});
		Prdctupdateicon.setBounds(363, 126, 128, 128);
		contentPane.add(Prdctupdateicon);
		
		ImageIcon mainframeimg03 = new ImageIcon ("images/Update.png");
		Prdctupdateicon.setIcon(mainframeimg03);
		
		Prdctupdatetxt = new JLabel("STOCKS UPDATE SYSTEM");
		Prdctupdatetxt.setForeground(Color.GREEN);
		Prdctupdatetxt.setFont(new Font("Century Gothic", Font.BOLD, 18));
		Prdctupdatetxt.setBounds(325, 226, 225, 31);
		contentPane.add(Prdctupdatetxt);
		
		Cashier = new JLabel("CASHIER SYSTEM");
		Cashier.setForeground(Color.GREEN);
		Cashier.setFont(new Font("Century Gothic", Font.BOLD, 18));
		Cashier.setBounds(242, 350, 166, 31);
		contentPane.add(Cashier);
		
		POS = new JLabel("");
		POS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PrdctPOS POS= new PrdctPOS();
				POS.setVisible(true);
			}
		});
		POS.setBounds(256, 254, 128, 128);
		contentPane.add(POS);
		
		ImageIcon mainframeimg05 = new ImageIcon ("images/POS.png");
		POS.setIcon(mainframeimg05);
		
	}
}

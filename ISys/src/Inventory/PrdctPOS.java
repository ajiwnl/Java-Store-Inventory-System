package Inventory;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class PrdctPOS extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTextField ASopastxtfield;
	public static JTextField JunkfoodsMtxtfield;
	public static JTextField JunkfoodsLtxtfield;
	public static JTextField CandiesandSweetstxtfield;
	public static JTextField ABsctstxtfield;
	public static JTextField AChitxtfield;
	public static JTextField SMB500txtfield;
	public static JTextField SMB250txtfield;
	public static JTextField SMB1ktxtfield;
	public static JTextField CBeertxtfield;
	public static JTextField TLongnecktxtfield;
	public static JTextField TFlattxtfield;
	public static JTextField EmperadorLNtxtfield;
	public static JTextField Kulafu250txtfield;
	public static JTextField ACantontxtfield;
	public static JTextField ANoodlestxtfield;
	public static JTextField ACNoodlestxtfield;
	public static JTextField ACSardinestxtfield;
	public static JTextField ACTunatxtfield;
	public static JTextField ABeefLtxtfield;
	public static JTextField AMeatLtxtfield;
	public static JTextField ACSaussagetxtfield;
	public static JTextField Maistxtfield;
	public static JTextField BRicetxtfield;
	public static JTextField Tomatotxtfield;
	public static JTextField Potatotxtfield;
	public static JTextField Oniontxtfield;
	public static JTextField Garlictxtfield;
	public static JTextField Bananatxtfield;
	public static JTextField Appletxtfield;
	public static JTextField Ponkantxtfield;
	public static JTextField Butanetxtfield;
	public static JTextField Ulingtxtfield;
	public static JTextField Asintxtfield;
	public static JTextField Vetsintxtfield;
	public static JTextField Spicetxtfield;
	public static JTextField Vinegartxtfield;
	public static JTextField SSaucetxtfield;
	public static JTextField Shampootxtfield;
	public static JTextField Soap250txtfield;
	public static JTextField Soap500txtfield;
	public static JTextField FacialWashtxtfield;
	public static JTextField PowderedWashtxtfield;
	public static JTextField BarSoaptxtfield;
	public static JTextField FConditionertxtfield;
	public static JTextField NetBrushtxtfield;
	public static JTextField Ganadortxtfield;
	public static JTextField ABreadtxtfield;
	private static JButton btnClear;
	private static JButton btnNewButton;
	private static JButton btnReturn;
	private static JCheckBox ABreadchckbox;
	private static JCheckBox ASopaschckbox;
	private static JCheckBox JunkfoodsMchckbox;
	private static JCheckBox JunkfoodsLchckbox;
	private static JCheckBox CandiesandSweetschckbox;
	private static JCheckBox ABsctschckbox;
	private static JCheckBox AChichckbox;
	private static JCheckBox SMB500chckbox;
	private static JCheckBox SMB250chckbox;
	private static JCheckBox SMB1kchckbox;
	private static JCheckBox TLongneckchckbox;
	private static JCheckBox TFlatchckbox;
	private static JCheckBox EmperadorLNchckbox;
	private static JCheckBox Kulafu250chckbox;
	private static JCheckBox ACantonchckbox;
	private static JCheckBox ANoodleschckbox;
	private static JCheckBox ACNoodleschckbox;
	private static JCheckBox CBeerchckbox;
	private static JCheckBox ACSardineschckbox;
	private static JCheckBox ABeefLchckbox;
	private static JCheckBox AMeatLchckbox;
	private static JCheckBox ACSaussagechckbox;
	private static JCheckBox BRicechckbox;
	private static JCheckBox Maischckbox;
	private static JCheckBox Ganadorchckbox;
	private static JCheckBox Tomatochckbox;
	private static JCheckBox Potatochckbox;
	private static JCheckBox Shampoochckbox;
	private static JCheckBox Asinchckbox;
	private static JCheckBox Vetsinchckbox;
	private static JCheckBox Spicechckbox;
	private static JCheckBox Vinegarchckbox;
	private static JCheckBox SSaucechckbox;
	private static JCheckBox Soap250chckbox;
	private static JCheckBox Soap500chckbox;
	private static JCheckBox FacialWashchckbox;
	private static JCheckBox PowderedWashchckbox;
	private static JCheckBox BarSoapchckbox;
	private static JCheckBox FConditionerchckbox;
	private static JLabel BreadSRP;
	private static JLabel SopasSRP;
	private static JLabel JunkFLSRP;
	private static JLabel CandSSRP;
	private static JLabel BsctsSRP;
	private static JLabel ChiSRP;
	private static JLabel JunkFMSRP;
	private static JLabel SMB500_SRP;
	private static JLabel SMB250_SRP;
	private static JLabel SMB1k_SRP;
	private static JLabel CBeerSRP;
	private static JLabel TLongneckSRP;
	private static JLabel TFlatSRP;
	private static JLabel EmperadorLNSRP;
	private static JLabel Kulafu250SRP;
	private static JLabel ACantonSRP;
	private static JLabel ANoodlesSRP;
	private static JLabel ACNoodlesSRP;
	private static JLabel ACSardinesSRP;
	private static JLabel ACTunaSRP;
	private static JCheckBox ACTunachckbox;
	private static JLabel ABeefLSRP;
	private static JLabel AMeatLSRP;
	private static JLabel ACSaussageSRP;
	private static JLabel GanadorSRP;
	private static JLabel MaisSRP;
	private static JLabel BRiceSRP;
	private static JLabel TomatoSRP;
	private static JLabel PotatoSRP;
	private static JLabel OnionSRP;
	private static JLabel GarlicSRP;
	private static JLabel BananaSRP;
	private static JLabel AppleSRP;
	private static JLabel PonkanSRP;
	private static JCheckBox Onionchckbox;
	private static JCheckBox Garlicchckbox;
	private static JCheckBox Bananachckbox;
	private static JCheckBox Applechckbox;
	private static JCheckBox Ponkanchckbox;
	private static JCheckBox Butanechckbox;
	private static JCheckBox Ulingchckbox;
	private static JLabel ButaneSRP;
	private static JLabel UlingSRP;
	private static JLabel AsinSRP;
	private static JLabel VetsinSRP;
	private static JLabel SpiceSRP;
	private static JLabel VinegarSRP;
	private static JLabel SSauceSRP;
	private static JLabel ShampooSRP;
	private static JLabel Soap250SRP;
	private static JLabel Soap500SRP;
	private static JLabel FacialWashSRP;
	private static JLabel PowderedWashSRP;
	private static JLabel BarSoapSRP;
	private static JLabel FConditionerSRP;
	private static JLabel NetbrushSRP;
	private static JCheckBox NetBrushchckbox;
	private static JTextArea Receipt;
	private static JTextField Breadinv;
	private static JTextField Sopasinv;
	private static JTextField JFMinv;
	private static JTextField JFLinv;
	private static JTextField CandSinv;
	private static JTextField Bisctsinv;
	private static JTextField Chiinv;
	private static JTextField SMB500inv;
	private static JTextField SMB250inv;
	private static JTextField SMB1kinv;
	private static JTextField CBeerinv;
	private static JTextField TLongNeckinv;
	private static JTextField TFlatinv;
	private static JTextField Empeinv;
	private static JTextField Kulafuinv;
	private static JTextField PCantoninv;
	private static JTextField Noodlesinv;
	private static JTextField CNoodlesinv;
	private static JTextField Sardinesinv;
	private static JTextField Tunainv;
	private static JTextField BeefLinv;
	private static JTextField MeatLinv;
	private static JTextField Sausinv;
	private static JTextField Ganadorinv;
	private static JTextField Maisinv;
	private static JTextField BRiceinv;
	private static JTextField Tomatoinv;
	private static JTextField Potatoinv;
	private static JTextField Onioninv;
	private static JTextField Garlicinv;
	private static JTextField Bananainv;
	private static JTextField Appleinv;
	private static JTextField Ponkaninv;
	private static JTextField Butaneinv;
	private static JTextField Ulinginv;
	private static JTextField Asininv;
	private static JTextField Vetsininv;
	private static JTextField Spiceinv;
	private static JTextField Vinegarinv;
	private static JTextField SSauceinv;
	private static JTextField Shampooinv;
	private static JTextField Soap250inv;
	private static JTextField Soap500inv;
	private static JTextField FWashinv;
	private static JTextField PWashinv;
	private static JTextField BSoapinv;
	private static JTextField FConditionerinv;
	private static JTextField NetBrushinv;
	private static JTextField cashin;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JLabel lblNewLabel_26;
	private JLabel lblNewLabel_27;
	private JLabel lblNewLabel_28;
	private JLabel lblNewLabel_29;
	private JLabel lblNewLabel_30;
	private JLabel lblNewLabel_31;
	private JLabel lblNewLabel_32;
	private JLabel lblNewLabel_33;
	private JLabel lblNewLabel_34;
	private JLabel lblNewLabel_35;
	private JLabel lblNewLabel_36;
	private JLabel lblNewLabel_37;
	private JLabel lblNewLabel_38;
	private JLabel lblNewLabel_39;
	private JLabel lblNewLabel_40;
	private JLabel lblNewLabel_41;
	private JLabel lblNewLabel_42;
	private JLabel lblNewLabel_43;
	private JLabel lblNewLabel_44;
	private JLabel lblNewLabel_45;
	private JLabel lblNewLabel_46;
	private JLabel lblNewLabel_47;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrdctPOS frame = new PrdctPOS();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setBounds(10, 10, 1350, 700);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrdctPOS() {
		setUndecorated(true);
		setResizable(false);
		setForeground(Color.GREEN);
		setBackground(Color.GREEN);
		setTitle("Nene's Retail Store");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(10, 10, 1350, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.GREEN);
		panel.setBounds(0, 0, 1350, 96);
		contentPane.add(panel);

		JLabel Storetitle = new JLabel("NENE's RETAIL STORE");
		Storetitle.setForeground(Color.WHITE);
		Storetitle.setFont(new Font("Century Gothic", Font.BOLD, 60));
		Storetitle.setBackground(Color.BLACK);
		Storetitle.setBounds(10, 0, 695, 53);
		panel.add(Storetitle);

		JLabel lblProductManagementSystem = new JLabel("CASHIER SYSTEM");
		lblProductManagementSystem.setForeground(Color.WHITE);
		lblProductManagementSystem.setFont(new Font("Century Gothic", Font.BOLD, 40));
		lblProductManagementSystem.setBounds(10, 43, 678, 53);
		panel.add(lblProductManagementSystem);

		JLabel pos = new JLabel("");
		pos.setBounds(1210, 0, 140, 96);
		panel.add(pos);

		ImageIcon mainframeimg08 = new ImageIcon("images/POS.png");
		pos.setIcon(mainframeimg08);

		/*
		 * Checbox with action and item event handler and textfield settings and
		 * conditions
		 */

		// Snackers area
		JLabel SnackersLbl = new JLabel("Snackers");
		SnackersLbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SnackersLbl.setBounds(25, 107, 71, 14);
		contentPane.add(SnackersLbl);

		JLabel SnackersQty = new JLabel("Qty");
		SnackersQty.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SnackersQty.setBounds(194, 107, 71, 14);
		contentPane.add(SnackersQty);

		JLabel SnackersSRP = new JLabel("SRP");
		SnackersSRP.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SnackersSRP.setBounds(275, 107, 71, 14);
		contentPane.add(SnackersSRP);

		ABreadchckbox = new JCheckBox("Bread");
		ABreadchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ABreadchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Breadinv.setText(" Bread");
				}
				;
			}
		});
		ABreadchckbox.setBackground(Color.LIGHT_GRAY);
		ABreadchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ABreadchckbox.setBounds(6, 121, 97, 23);
		contentPane.add(ABreadchckbox);

		ABreadtxtfield = new JTextField();
		ABreadtxtfield.setText("0");
		ABreadtxtfield.setEnabled(false);
		ABreadtxtfield.setColumns(10);
		ABreadtxtfield.setBounds(168, 123, 71, 20);
		contentPane.add(ABreadtxtfield);

		BreadSRP = new JLabel("7.00");
		BreadSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BreadSRP.setBackground(Color.LIGHT_GRAY);
		BreadSRP.setBounds(264, 126, 46, 14);
		contentPane.add(BreadSRP);

		ASopaschckbox = new JCheckBox("Sopas");
		ASopaschckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ASopaschckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Sopasinv.setText(" Sopas");
				}
				;
			}
		});
		ASopaschckbox.setBackground(Color.LIGHT_GRAY);
		ASopaschckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ASopaschckbox.setBounds(6, 151, 97, 23);
		contentPane.add(ASopaschckbox);

		ASopastxtfield = new JTextField();
		ASopastxtfield.setText("0");
		ASopastxtfield.setEnabled(false);
		ASopastxtfield.setColumns(10);
		ASopastxtfield.setBounds(168, 154, 71, 20);
		contentPane.add(ASopastxtfield);

		SopasSRP = new JLabel("7.00");
		SopasSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SopasSRP.setBackground(Color.LIGHT_GRAY);
		SopasSRP.setBounds(264, 156, 46, 14);
		contentPane.add(SopasSRP);

		JunkfoodsMchckbox = new JCheckBox("Junkfoods (M)");
		JunkfoodsMchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JunkfoodsMchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					JFMinv.setText(" Junkfoods (M)");
				}
				;
			}
		});
		JunkfoodsMchckbox.setBackground(Color.LIGHT_GRAY);
		JunkfoodsMchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		JunkfoodsMchckbox.setBounds(6, 177, 133, 23);
		contentPane.add(JunkfoodsMchckbox);

		JunkfoodsMtxtfield = new JTextField();
		JunkfoodsMtxtfield.setText("0");
		JunkfoodsMtxtfield.setEnabled(false);
		JunkfoodsMtxtfield.setColumns(10);
		JunkfoodsMtxtfield.setBounds(168, 179, 71, 20);
		contentPane.add(JunkfoodsMtxtfield);

		JunkFMSRP = new JLabel("7.00");
		JunkFMSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		JunkFMSRP.setBackground(Color.LIGHT_GRAY);
		JunkFMSRP.setBounds(264, 182, 46, 14);
		contentPane.add(JunkFMSRP);

		JunkfoodsLchckbox = new JCheckBox("Junkfoods (L)");
		JunkfoodsLchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JunkfoodsLchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					JFLinv.setText(" Junkfoods (L)");
				}
				;
			}
		});
		JunkfoodsLchckbox.setBackground(Color.LIGHT_GRAY);
		JunkfoodsLchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		JunkfoodsLchckbox.setBounds(6, 203, 133, 23);
		contentPane.add(JunkfoodsLchckbox);

		JunkfoodsLtxtfield = new JTextField();
		JunkfoodsLtxtfield.setText("0");
		JunkfoodsLtxtfield.setEnabled(false);
		JunkfoodsLtxtfield.setColumns(10);
		JunkfoodsLtxtfield.setBounds(168, 205, 71, 20);
		contentPane.add(JunkfoodsLtxtfield);

		JunkFLSRP = new JLabel("18.00");
		JunkFLSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		JunkFLSRP.setBackground(Color.LIGHT_GRAY);
		JunkFLSRP.setBounds(264, 208, 46, 14);
		contentPane.add(JunkFLSRP);

		CandiesandSweetschckbox = new JCheckBox("Candies and Sweets");
		CandiesandSweetschckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CandiesandSweetschckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					CandSinv.setText(" Candies and Sweets");
				}
				;
			}
		});
		CandiesandSweetschckbox.setBackground(Color.LIGHT_GRAY);
		CandiesandSweetschckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		CandiesandSweetschckbox.setBounds(6, 228, 160, 23);
		contentPane.add(CandiesandSweetschckbox);

		CandiesandSweetstxtfield = new JTextField();
		CandiesandSweetstxtfield.setText("0");
		CandiesandSweetstxtfield.setEnabled(false);
		CandiesandSweetstxtfield.setColumns(10);
		CandiesandSweetstxtfield.setBounds(168, 230, 71, 20);
		contentPane.add(CandiesandSweetstxtfield);

		CandSSRP = new JLabel("1.00");
		CandSSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		CandSSRP.setBackground(Color.LIGHT_GRAY);
		CandSSRP.setBounds(264, 233, 46, 14);
		contentPane.add(CandSSRP);

		ABsctschckbox = new JCheckBox("Biscuits");
		ABsctschckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ABsctschckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Bisctsinv.setText(" Biscuits");
				}
				;
			}
		});
		ABsctschckbox.setBackground(Color.LIGHT_GRAY);
		ABsctschckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ABsctschckbox.setBounds(6, 254, 144, 23);
		contentPane.add(ABsctschckbox);

		ABsctstxtfield = new JTextField();
		ABsctstxtfield.setText("0");
		ABsctstxtfield.setEnabled(false);
		ABsctstxtfield.setColumns(10);
		ABsctstxtfield.setBounds(168, 256, 71, 20);
		contentPane.add(ABsctstxtfield);

		BsctsSRP = new JLabel("7.00");
		BsctsSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BsctsSRP.setBackground(Color.LIGHT_GRAY);
		BsctsSRP.setBounds(264, 259, 46, 14);
		contentPane.add(BsctsSRP);

		AChichckbox = new JCheckBox("Chichiryas");
		AChichckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AChichckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Chiinv.setText(" Chichiryas");
				}
				;
			}
		});
		AChichckbox.setBackground(Color.LIGHT_GRAY);
		AChichckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		AChichckbox.setBounds(6, 280, 144, 23);
		contentPane.add(AChichckbox);

		AChitxtfield = new JTextField();
		AChitxtfield.setText("0");
		AChitxtfield.setEnabled(false);
		AChitxtfield.setColumns(10);
		AChitxtfield.setBounds(168, 282, 71, 20);
		contentPane.add(AChitxtfield);

		ChiSRP = new JLabel("2.00");
		ChiSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ChiSRP.setBackground(Color.LIGHT_GRAY);
		ChiSRP.setBounds(264, 285, 46, 14);
		contentPane.add(ChiSRP);

		// Liquors area
		JLabel Liquorslbl = new JLabel("Liquors");
		Liquorslbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Liquorslbl.setBounds(25, 306, 71, 14);
		contentPane.add(Liquorslbl);

		JLabel LiquorsQty = new JLabel("Qty");
		LiquorsQty.setFont(new Font("Century Gothic", Font.BOLD, 11));
		LiquorsQty.setBounds(194, 306, 71, 14);
		contentPane.add(LiquorsQty);

		JLabel LiquorsSRP = new JLabel("SRP");
		LiquorsSRP.setFont(new Font("Century Gothic", Font.BOLD, 11));
		LiquorsSRP.setBounds(275, 307, 71, 14);
		contentPane.add(LiquorsSRP);

		SMB500chckbox = new JCheckBox("SMB Product 500mL");
		SMB500chckbox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (SMB500chckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					SMB500inv.setText(" SMB Product 500mL");
				}
				;
			}
		});
		SMB500chckbox.setBackground(Color.LIGHT_GRAY);
		SMB500chckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SMB500chckbox.setBounds(6, 320, 144, 23);
		contentPane.add(SMB500chckbox);

		SMB500txtfield = new JTextField();
		SMB500txtfield.setText("0");
		SMB500txtfield.setEnabled(false);
		SMB500txtfield.setColumns(10);
		SMB500txtfield.setBounds(168, 322, 71, 20);
		contentPane.add(SMB500txtfield);

		SMB500_SRP = new JLabel("60.00");
		SMB500_SRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SMB500_SRP.setBackground(Color.LIGHT_GRAY);
		SMB500_SRP.setBounds(264, 325, 46, 14);
		contentPane.add(SMB500_SRP);

		SMB250chckbox = new JCheckBox("SMB Product 250mL");
		SMB250chckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (SMB250chckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					SMB250inv.setText(" SMB Product 250mL");
				}
				;
			}
		});
		SMB250chckbox.setBackground(Color.LIGHT_GRAY);
		SMB250chckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SMB250chckbox.setBounds(6, 350, 133, 23);
		contentPane.add(SMB250chckbox);

		SMB250txtfield = new JTextField();
		SMB250txtfield.setText("0");
		SMB250txtfield.setEnabled(false);
		SMB250txtfield.setColumns(10);
		SMB250txtfield.setBounds(168, 353, 71, 20);
		contentPane.add(SMB250txtfield);

		SMB250_SRP = new JLabel("45.00\r\n");
		SMB250_SRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SMB250_SRP.setBackground(Color.LIGHT_GRAY);
		SMB250_SRP.setBounds(264, 355, 46, 14);
		contentPane.add(SMB250_SRP);

		SMB1kchckbox = new JCheckBox("SMB Products 1000mL");
		SMB1kchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (SMB1kchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					SMB1kinv.setText(" SMB Product 1000mL");
				}
				;
			}
		});
		SMB1kchckbox.setBackground(Color.LIGHT_GRAY);
		SMB1kchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SMB1kchckbox.setBounds(6, 376, 144, 23);
		contentPane.add(SMB1kchckbox);

		SMB1ktxtfield = new JTextField();
		SMB1ktxtfield.setText("0");
		SMB1ktxtfield.setEnabled(false);
		SMB1ktxtfield.setColumns(10);
		SMB1ktxtfield.setBounds(168, 378, 71, 20);
		contentPane.add(SMB1ktxtfield);

		SMB1k_SRP = new JLabel("120.00");
		SMB1k_SRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SMB1k_SRP.setBackground(Color.LIGHT_GRAY);
		SMB1k_SRP.setBounds(264, 381, 46, 14);
		contentPane.add(SMB1k_SRP);

		CBeerchckbox = new JCheckBox("Canned Beer");
		CBeerchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CBeerchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					CBeerinv.setText(" Canned Beer");
				}
				;
			}
		});
		CBeerchckbox.setBackground(Color.LIGHT_GRAY);
		CBeerchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		CBeerchckbox.setBounds(6, 402, 133, 23);
		contentPane.add(CBeerchckbox);

		CBeertxtfield = new JTextField();
		CBeertxtfield.setText("0");
		CBeertxtfield.setEnabled(false);
		CBeertxtfield.setColumns(10);
		CBeertxtfield.setBounds(168, 404, 71, 20);
		contentPane.add(CBeertxtfield);

		CBeerSRP = new JLabel("65.00");
		CBeerSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		CBeerSRP.setBackground(Color.LIGHT_GRAY);
		CBeerSRP.setBounds(264, 407, 46, 14);
		contentPane.add(CBeerSRP);

		TLongneckchckbox = new JCheckBox("Tanduay 5YRS/65 Longneck");
		TLongneckchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (TLongneckchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					TLongNeckinv.setText(" Tanduay 5YRS/65 Longneck");
				}
				;
			}
		});
		TLongneckchckbox.setBackground(Color.LIGHT_GRAY);
		TLongneckchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		TLongneckchckbox.setBounds(6, 427, 160, 23);
		contentPane.add(TLongneckchckbox);

		TLongnecktxtfield = new JTextField();
		TLongnecktxtfield.setText("0");
		TLongnecktxtfield.setEnabled(false);
		TLongnecktxtfield.setColumns(10);
		TLongnecktxtfield.setBounds(168, 429, 71, 20);
		contentPane.add(TLongnecktxtfield);

		TLongneckSRP = new JLabel("105.00\r\n");
		TLongneckSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		TLongneckSRP.setBackground(Color.LIGHT_GRAY);
		TLongneckSRP.setBounds(264, 432, 46, 14);
		contentPane.add(TLongneckSRP);

		TFlatchckbox = new JCheckBox("Tanduay 5YRS/65 Flat");
		TFlatchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (TFlatchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					TFlatinv.setText(" Tanduay 5YRS/65 Flat");
				}
				;
			}
		});
		TFlatchckbox.setBackground(Color.LIGHT_GRAY);
		TFlatchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		TFlatchckbox.setBounds(6, 453, 144, 23);
		contentPane.add(TFlatchckbox);

		TFlattxtfield = new JTextField();
		TFlattxtfield.setText("0");
		TFlattxtfield.setEnabled(false);
		TFlattxtfield.setColumns(10);
		TFlattxtfield.setBounds(168, 455, 71, 20);
		contentPane.add(TFlattxtfield);

		TFlatSRP = new JLabel("55.00");
		TFlatSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		TFlatSRP.setBackground(Color.LIGHT_GRAY);
		TFlatSRP.setBounds(264, 458, 46, 14);
		contentPane.add(TFlatSRP);

		EmperadorLNchckbox = new JCheckBox("Emperador Longneck");
		EmperadorLNchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EmperadorLNchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Empeinv.setText(" Emperador Longneck");
				}
				;
			}
		});
		EmperadorLNchckbox.setBackground(Color.LIGHT_GRAY);
		EmperadorLNchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		EmperadorLNchckbox.setBounds(6, 479, 144, 23);
		contentPane.add(EmperadorLNchckbox);

		EmperadorLNtxtfield = new JTextField();
		EmperadorLNtxtfield.setText("0");
		EmperadorLNtxtfield.setEnabled(false);
		EmperadorLNtxtfield.setColumns(10);
		EmperadorLNtxtfield.setBounds(168, 481, 71, 20);
		contentPane.add(EmperadorLNtxtfield);

		EmperadorLNSRP = new JLabel("120.00");
		EmperadorLNSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		EmperadorLNSRP.setBackground(Color.LIGHT_GRAY);
		EmperadorLNSRP.setBounds(264, 484, 46, 14);
		contentPane.add(EmperadorLNSRP);

		Kulafu250chckbox = new JCheckBox("Kulafu 250mL");
		Kulafu250chckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Kulafu250chckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Kulafuinv.setText(" Kulafu 250mL ");
				}
				;
			}
		});
		Kulafu250chckbox.setBackground(Color.LIGHT_GRAY);
		Kulafu250chckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Kulafu250chckbox.setBounds(6, 505, 144, 23);
		contentPane.add(Kulafu250chckbox);

		Kulafu250txtfield = new JTextField();
		Kulafu250txtfield.setText("0");
		Kulafu250txtfield.setEnabled(false);
		Kulafu250txtfield.setColumns(10);
		Kulafu250txtfield.setBounds(168, 507, 71, 20);
		contentPane.add(Kulafu250txtfield);

		Kulafu250SRP = new JLabel("40.00");
		Kulafu250SRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Kulafu250SRP.setBackground(Color.LIGHT_GRAY);
		Kulafu250SRP.setBounds(264, 510, 46, 14);
		contentPane.add(Kulafu250SRP);

		// Instant Noodles area
		JLabel INoodleslbl = new JLabel("Instant Noodles");
		INoodleslbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		INoodleslbl.setBounds(25, 531, 97, 14);
		contentPane.add(INoodleslbl);

		JLabel INoodlesQty = new JLabel("Qty");
		INoodlesQty.setFont(new Font("Century Gothic", Font.BOLD, 11));
		INoodlesQty.setBounds(194, 531, 71, 14);
		contentPane.add(INoodlesQty);

		JLabel INoodlesSRP = new JLabel("SRP");
		INoodlesSRP.setFont(new Font("Century Gothic", Font.BOLD, 11));
		INoodlesSRP.setBounds(275, 532, 71, 14);
		contentPane.add(INoodlesSRP);

		ACantonchckbox = new JCheckBox("LuckyMe Pancit Canton");
		ACantonchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ACantonchckbox.isSelected()) {

					cashin.setEditable(true);
					cashin.setEnabled(true);	
					PCantoninv.setText(" Pancit Canton");
				}
				;
			}
		});
		ACantonchckbox.setBackground(Color.LIGHT_GRAY);
		ACantonchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ACantonchckbox.setBounds(6, 545, 160, 23);
		contentPane.add(ACantonchckbox);

		ACantontxtfield = new JTextField();
		ACantontxtfield.setText("0");
		ACantontxtfield.setEnabled(false);
		ACantontxtfield.setColumns(10);
		ACantontxtfield.setBounds(168, 547, 71, 20);
		contentPane.add(ACantontxtfield);

		ACantonSRP = new JLabel("9.00");
		ACantonSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ACantonSRP.setBackground(Color.LIGHT_GRAY);
		ACantonSRP.setBounds(264, 550, 46, 14);
		contentPane.add(ACantonSRP);

		ANoodleschckbox = new JCheckBox("LuckyMe Noodles");
		ANoodleschckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ANoodleschckbox.isSelected()) {

					cashin.setEditable(true);
					cashin.setEnabled(true);	
					Noodlesinv.setText(" Noodles");
				}
				;
			}
		});
		ANoodleschckbox.setBackground(Color.LIGHT_GRAY);
		ANoodleschckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ANoodleschckbox.setBounds(6, 575, 160, 23);
		contentPane.add(ANoodleschckbox);

		ANoodlestxtfield = new JTextField();
		ANoodlestxtfield.setText("0");
		ANoodlestxtfield.setEnabled(false);
		ANoodlestxtfield.setColumns(10);
		ANoodlestxtfield.setBounds(168, 577, 71, 20);
		contentPane.add(ANoodlestxtfield);

		ANoodlesSRP = new JLabel("9.00");
		ANoodlesSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ANoodlesSRP.setBackground(Color.LIGHT_GRAY);
		ANoodlesSRP.setBounds(264, 580, 46, 14);
		contentPane.add(ANoodlesSRP);

		ACNoodleschckbox = new JCheckBox("Cup Noodles");
		ACNoodleschckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ACNoodleschckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					CNoodlesinv.setText(" Cup Noodles ");
				}
				;
			}
		});
		ACNoodleschckbox.setBackground(Color.LIGHT_GRAY);
		ACNoodleschckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ACNoodleschckbox.setBounds(6, 601, 144, 23);
		contentPane.add(ACNoodleschckbox);

		ACNoodlestxtfield = new JTextField();
		ACNoodlestxtfield.setText("0");
		ACNoodlestxtfield.setEnabled(false);
		ACNoodlestxtfield.setColumns(10);
		ACNoodlestxtfield.setBounds(168, 603, 71, 20);
		contentPane.add(ACNoodlestxtfield);

		ACNoodlesSRP = new JLabel("25.00");
		ACNoodlesSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ACNoodlesSRP.setBackground(Color.LIGHT_GRAY);
		ACNoodlesSRP.setBounds(264, 606, 46, 14);
		contentPane.add(ACNoodlesSRP);

		// Canned Goods area
		JLabel CannedGoodslbl = new JLabel("Canned Goods");
		CannedGoodslbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		CannedGoodslbl.setBounds(25, 627, 97, 14);
		contentPane.add(CannedGoodslbl);

		JLabel CannedGoodsQty = new JLabel("Qty");
		CannedGoodsQty.setFont(new Font("Century Gothic", Font.BOLD, 11));
		CannedGoodsQty.setBounds(194, 627, 71, 14);
		contentPane.add(CannedGoodsQty);

		JLabel CannedGoodSRP = new JLabel("SRP");
		CannedGoodSRP.setFont(new Font("Century Gothic", Font.BOLD, 11));
		CannedGoodSRP.setBounds(275, 628, 71, 14);
		contentPane.add(CannedGoodSRP);

		ACSardineschckbox = new JCheckBox("Canned Sardines");
		ACSardineschckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ACSardineschckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Sardinesinv.setText(" Canned Sardines");
				}
				;
			}
		});
		ACSardineschckbox.setBackground(Color.LIGHT_GRAY);
		ACSardineschckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ACSardineschckbox.setBounds(6, 641, 160, 23);
		contentPane.add(ACSardineschckbox);

		ACSardinestxtfield = new JTextField();
		ACSardinestxtfield.setText("0");
		ACSardinestxtfield.setEnabled(false);
		ACSardinestxtfield.setColumns(10);
		ACSardinestxtfield.setBounds(168, 643, 71, 20);
		contentPane.add(ACSardinestxtfield);

		ACSardinesSRP = new JLabel("18.00");
		ACSardinesSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ACSardinesSRP.setBackground(Color.LIGHT_GRAY);
		ACSardinesSRP.setBounds(264, 646, 46, 14);
		contentPane.add(ACSardinesSRP);

		ACTunachckbox = new JCheckBox("Canned Tuna (M)");
		ACTunachckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ACTunachckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Tunainv.setText(" Canned Tuna (M)");
				}
				;
			}
		});
		ACTunachckbox.setBackground(Color.LIGHT_GRAY);
		ACTunachckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ACTunachckbox.setBounds(6, 671, 160, 23);
		contentPane.add(ACTunachckbox);

		ACTunatxtfield = new JTextField();
		ACTunatxtfield.setText("0");
		ACTunatxtfield.setEnabled(false);
		ACTunatxtfield.setColumns(10);
		ACTunatxtfield.setBounds(168, 673, 71, 20);
		contentPane.add(ACTunatxtfield);

		ACTunaSRP = new JLabel("30.00");
		ACTunaSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ACTunaSRP.setBackground(Color.LIGHT_GRAY);
		ACTunaSRP.setBounds(264, 676, 46, 14);
		contentPane.add(ACTunaSRP);

		// Canned Goods 2 area
		JLabel CannedGoodslbl_2 = new JLabel("Canned Goods");
		CannedGoodslbl_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		CannedGoodslbl_2.setBounds(342, 107, 97, 14);
		contentPane.add(CannedGoodslbl_2);

		JLabel CannedGoodsQty_2 = new JLabel("Qty");
		CannedGoodsQty_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		CannedGoodsQty_2.setBounds(511, 107, 71, 14);
		contentPane.add(CannedGoodsQty_2);

		JLabel CannedGoodsSRP_2 = new JLabel("SRP");
		CannedGoodsSRP_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		CannedGoodsSRP_2.setBounds(592, 108, 71, 14);
		contentPane.add(CannedGoodsSRP_2);

		ABeefLchckbox = new JCheckBox("Canned Beefloaf (M)");
		ABeefLchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ABeefLchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					BeefLinv.setText(" Canned Beefloaf (M)");
				}
				;
			}
		});
		ABeefLchckbox.setBackground(Color.LIGHT_GRAY);
		ABeefLchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ABeefLchckbox.setBounds(323, 121, 160, 23);
		contentPane.add(ABeefLchckbox);

		ABeefLtxtfield = new JTextField();
		ABeefLtxtfield.setText("0");
		ABeefLtxtfield.setEnabled(false);
		ABeefLtxtfield.setColumns(10);
		ABeefLtxtfield.setBounds(485, 123, 71, 20);
		contentPane.add(ABeefLtxtfield);

		ABeefLSRP = new JLabel("35.00");
		ABeefLSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ABeefLSRP.setBackground(Color.LIGHT_GRAY);
		ABeefLSRP.setBounds(581, 126, 46, 14);
		contentPane.add(ABeefLSRP);

		AMeatLchckbox = new JCheckBox("Canned Meatloaf (M)");
		AMeatLchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AMeatLchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					MeatLinv.setText(" Canned Meatloaf (M)");
				}
				;
			}
		});
		AMeatLchckbox.setBackground(Color.LIGHT_GRAY);
		AMeatLchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		AMeatLchckbox.setBounds(323, 151, 160, 23);
		contentPane.add(AMeatLchckbox);

		AMeatLtxtfield = new JTextField();
		AMeatLtxtfield.setText("0");
		AMeatLtxtfield.setEnabled(false);
		AMeatLtxtfield.setColumns(10);
		AMeatLtxtfield.setBounds(485, 153, 71, 20);
		contentPane.add(AMeatLtxtfield);

		AMeatLSRP = new JLabel("38.00");
		AMeatLSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		AMeatLSRP.setBackground(Color.LIGHT_GRAY);
		AMeatLSRP.setBounds(581, 156, 46, 14);
		contentPane.add(AMeatLSRP);

		ACSaussagechckbox = new JCheckBox("Canned Saussage");
		ACSaussagechckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ACSaussagechckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Sausinv.setText(" Canned Saussage");
				}
				;
			}
		});
		ACSaussagechckbox.setBackground(Color.LIGHT_GRAY);
		ACSaussagechckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ACSaussagechckbox.setBounds(323, 177, 160, 23);
		contentPane.add(ACSaussagechckbox);

		ACSaussagetxtfield = new JTextField();
		ACSaussagetxtfield.setText("0");
		ACSaussagetxtfield.setEnabled(false);
		ACSaussagetxtfield.setColumns(10);
		ACSaussagetxtfield.setBounds(485, 179, 71, 20);
		contentPane.add(ACSaussagetxtfield);

		ACSaussageSRP = new JLabel(" 48.00");
		ACSaussageSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ACSaussageSRP.setBackground(Color.LIGHT_GRAY);
		ACSaussageSRP.setBounds(581, 182, 46, 14);
		contentPane.add(ACSaussageSRP);

		// Rice area
		JLabel Ricelbl = new JLabel("Rice");
		Ricelbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Ricelbl.setBounds(342, 203, 97, 14);
		contentPane.add(Ricelbl);

		JLabel RiceQty = new JLabel("Qty");
		RiceQty.setFont(new Font("Century Gothic", Font.BOLD, 11));
		RiceQty.setBounds(511, 203, 71, 14);
		contentPane.add(RiceQty);

		JLabel RiceSRP = new JLabel("SRP");
		RiceSRP.setFont(new Font("Century Gothic", Font.BOLD, 11));
		RiceSRP.setBounds(592, 204, 71, 14);
		contentPane.add(RiceSRP);

		Ganadorchckbox = new JCheckBox("Ganador");
		Ganadorchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Ganadorchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Ganadorinv.setText(" Ganador");
				}
				;
			}
		});
		Ganadorchckbox.setBackground(Color.LIGHT_GRAY);
		Ganadorchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Ganadorchckbox.setBounds(323, 217, 160, 23);
		contentPane.add(Ganadorchckbox);

		Ganadortxtfield = new JTextField();
		Ganadortxtfield.setText("0");
		Ganadortxtfield.setEnabled(false);
		Ganadortxtfield.setColumns(10);
		Ganadortxtfield.setBounds(485, 219, 71, 20);
		contentPane.add(Ganadortxtfield);

		GanadorSRP = new JLabel("55.00");
		GanadorSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorSRP.setBackground(Color.LIGHT_GRAY);
		GanadorSRP.setBounds(581, 222, 54, 14);
		contentPane.add(GanadorSRP);

		Maischckbox = new JCheckBox("Mais #16");
		Maischckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Maischckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Maisinv.setText(" Mais");
				}
				;
			}
		});
		Maischckbox.setBackground(Color.LIGHT_GRAY);
		Maischckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Maischckbox.setBounds(323, 247, 160, 23);
		contentPane.add(Maischckbox);

		Maistxtfield = new JTextField();
		Maistxtfield.setText("0");
		Maistxtfield.setEnabled(false);
		Maistxtfield.setColumns(10);
		Maistxtfield.setBounds(485, 249, 71, 20);
		contentPane.add(Maistxtfield);

		MaisSRP = new JLabel("40.00");
		MaisSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		MaisSRP.setBackground(Color.LIGHT_GRAY);
		MaisSRP.setBounds(581, 254, 54, 14);
		contentPane.add(MaisSRP);

		BRicechckbox = new JCheckBox("Broken Rice");
		BRicechckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (BRicechckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					BRiceinv.setText(" Broken Rice");
				}
				;
			}
		});
		BRicechckbox.setBackground(Color.LIGHT_GRAY);
		BRicechckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BRicechckbox.setBounds(323, 273, 160, 23);
		contentPane.add(BRicechckbox);

		BRicetxtfield = new JTextField();
		BRicetxtfield.setText("0");
		BRicetxtfield.setEnabled(false);
		BRicetxtfield.setColumns(10);
		BRicetxtfield.setBounds(485, 275, 71, 20);
		contentPane.add(BRicetxtfield);

		BRiceSRP = new JLabel("39.00");
		BRiceSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BRiceSRP.setBackground(Color.LIGHT_GRAY);
		BRiceSRP.setBounds(581, 280, 54, 14);
		contentPane.add(BRiceSRP);

		// Vegetables and Fruits area
		JLabel VandFlbl = new JLabel("Vegetables and Fruits");
		VandFlbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		VandFlbl.setBounds(342, 306, 122, 14);
		contentPane.add(VandFlbl);

		JLabel VandFQty = new JLabel("Qty");
		VandFQty.setFont(new Font("Century Gothic", Font.BOLD, 11));
		VandFQty.setBounds(511, 306, 71, 14);
		contentPane.add(VandFQty);

		JLabel VandFSRP = new JLabel("SRP");
		VandFSRP.setFont(new Font("Century Gothic", Font.BOLD, 11));
		VandFSRP.setBounds(592, 307, 71, 14);
		contentPane.add(VandFSRP);

		Tomatochckbox = new JCheckBox("Tomato");
		Tomatochckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Tomatochckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Tomatoinv.setText(" Tomato");
				}
				;
			}
		});
		Tomatochckbox.setBackground(Color.LIGHT_GRAY);
		Tomatochckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Tomatochckbox.setBounds(323, 320, 160, 23);
		contentPane.add(Tomatochckbox);

		Tomatotxtfield = new JTextField();
		Tomatotxtfield.setText("0");
		Tomatotxtfield.setEnabled(false);
		Tomatotxtfield.setColumns(10);
		Tomatotxtfield.setBounds(485, 322, 71, 20);
		contentPane.add(Tomatotxtfield);

		TomatoSRP = new JLabel("5.00");
		TomatoSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		TomatoSRP.setBackground(Color.LIGHT_GRAY);
		TomatoSRP.setBounds(581, 325, 54, 14);
		contentPane.add(TomatoSRP);

		Potatochckbox = new JCheckBox("Potato");
		Potatochckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Potatochckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Potatoinv.setText(" Potato");
				}
				;
			}
		});
		Potatochckbox.setBackground(Color.LIGHT_GRAY);
		Potatochckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Potatochckbox.setBounds(323, 350, 160, 23);
		contentPane.add(Potatochckbox);

		Potatotxtfield = new JTextField();
		Potatotxtfield.setText("0");
		Potatotxtfield.setEnabled(false);
		Potatotxtfield.setColumns(10);
		Potatotxtfield.setBounds(485, 352, 71, 20);
		contentPane.add(Potatotxtfield);

		PotatoSRP = new JLabel("12.00");
		PotatoSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		PotatoSRP.setBackground(Color.LIGHT_GRAY);
		PotatoSRP.setBounds(581, 355, 65, 14);
		contentPane.add(PotatoSRP);

		Onionchckbox = new JCheckBox("Onion");
		Onionchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Onionchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Onioninv.setText(" Onion");
				}
				;
			}
		});
		Onionchckbox.setBackground(Color.LIGHT_GRAY);
		Onionchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Onionchckbox.setBounds(323, 376, 160, 23);
		contentPane.add(Onionchckbox);

		Oniontxtfield = new JTextField();
		Oniontxtfield.setText("0");
		Oniontxtfield.setEnabled(false);
		Oniontxtfield.setColumns(10);
		Oniontxtfield.setBounds(485, 378, 71, 20);
		contentPane.add(Oniontxtfield);

		OnionSRP = new JLabel(" 4.00");
		OnionSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		OnionSRP.setBackground(Color.LIGHT_GRAY);
		OnionSRP.setBounds(581, 381, 54, 14);
		contentPane.add(OnionSRP);

		Garlicchckbox = new JCheckBox("Garlic");
		Garlicchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Garlicchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Garlicinv.setText(" Garlic"); 
				}
				;
			}
		});
		Garlicchckbox.setBackground(Color.LIGHT_GRAY);
		Garlicchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Garlicchckbox.setBounds(323, 402, 160, 23);
		contentPane.add(Garlicchckbox);

		Garlictxtfield = new JTextField();
		Garlictxtfield.setText("0");
		Garlictxtfield.setEnabled(false);
		Garlictxtfield.setColumns(10);
		Garlictxtfield.setBounds(485, 404, 71, 20);
		contentPane.add(Garlictxtfield);

		GarlicSRP = new JLabel("2.00");
		GarlicSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GarlicSRP.setBackground(Color.LIGHT_GRAY);
		GarlicSRP.setBounds(581, 407, 54, 14);
		contentPane.add(GarlicSRP);

		Bananachckbox = new JCheckBox("Banana");
		Bananachckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Bananachckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Bananainv.setText(" Banana"); 
				}
				;
			}
		});
		Bananachckbox.setBackground(Color.LIGHT_GRAY);
		Bananachckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Bananachckbox.setBounds(323, 427, 160, 23);
		contentPane.add(Bananachckbox);

		Bananatxtfield = new JTextField();
		Bananatxtfield.setText("0");
		Bananatxtfield.setEnabled(false);
		Bananatxtfield.setColumns(10);
		Bananatxtfield.setBounds(485, 429, 71, 20);
		contentPane.add(Bananatxtfield);

		BananaSRP = new JLabel("8.00");
		BananaSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BananaSRP.setBackground(Color.LIGHT_GRAY);
		BananaSRP.setBounds(581, 432, 54, 14);
		contentPane.add(BananaSRP);

		Applechckbox = new JCheckBox("Apple");
		Applechckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Applechckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Appleinv.setText(" Apple");
				}
				;
			}
		});
		Applechckbox.setBackground(Color.LIGHT_GRAY);
		Applechckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Applechckbox.setBounds(323, 453, 160, 23);
		contentPane.add(Applechckbox);

		Appletxtfield = new JTextField();
		Appletxtfield.setText("0");
		Appletxtfield.setEnabled(false);
		Appletxtfield.setColumns(10);
		Appletxtfield.setBounds(485, 455, 71, 20);
		contentPane.add(Appletxtfield);

		AppleSRP = new JLabel("15.00");
		AppleSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		AppleSRP.setBackground(Color.LIGHT_GRAY);
		AppleSRP.setBounds(581, 458, 65, 14);
		contentPane.add(AppleSRP);

		Ponkanchckbox = new JCheckBox("Ponkan");
		Ponkanchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Ponkanchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Ponkaninv.setText(" Ponkan"); 
				}
				;
			}
		});
		Ponkanchckbox.setBackground(Color.LIGHT_GRAY);
		Ponkanchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Ponkanchckbox.setBounds(323, 479, 160, 23);
		contentPane.add(Ponkanchckbox);

		Ponkantxtfield = new JTextField();
		Ponkantxtfield.setText("0");
		Ponkantxtfield.setEnabled(false);
		Ponkantxtfield.setColumns(10);
		Ponkantxtfield.setBounds(485, 481, 71, 20);
		contentPane.add(Ponkantxtfield);

		PonkanSRP = new JLabel("10.00");
		PonkanSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		PonkanSRP.setBackground(Color.LIGHT_GRAY);
		PonkanSRP.setBounds(581, 484, 64, 14);
		contentPane.add(PonkanSRP);

		// Others area
		JLabel Otherslbl = new JLabel("Others");
		Otherslbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Otherslbl.setBounds(342, 501, 122, 14);
		contentPane.add(Otherslbl);

		JLabel OthersQty = new JLabel("Qty");
		OthersQty.setFont(new Font("Century Gothic", Font.BOLD, 11));
		OthersQty.setBounds(511, 501, 71, 14);
		contentPane.add(OthersQty);

		JLabel OthersSRP = new JLabel("SRP");
		OthersSRP.setFont(new Font("Century Gothic", Font.BOLD, 11));
		OthersSRP.setBounds(592, 502, 71, 14);
		contentPane.add(OthersSRP);

		Butanechckbox = new JCheckBox("Butane");
		Butanechckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Butanechckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Butaneinv.setText(" Butane");
				}
				;
			}
		});
		Butanechckbox.setBackground(Color.LIGHT_GRAY);
		Butanechckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Butanechckbox.setBounds(323, 515, 160, 23);
		contentPane.add(Butanechckbox);

		Butanetxtfield = new JTextField();
		Butanetxtfield.setText("0");
		Butanetxtfield.setEnabled(false);
		Butanetxtfield.setColumns(10);
		Butanetxtfield.setBounds(485, 517, 71, 20);
		contentPane.add(Butanetxtfield);

		ButaneSRP = new JLabel("25.00");
		ButaneSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ButaneSRP.setBackground(Color.LIGHT_GRAY);
		ButaneSRP.setBounds(581, 514, 65, 14);
		contentPane.add(ButaneSRP);

		Ulingchckbox = new JCheckBox("Uling");
		Ulingchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Ulingchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Ulinginv.setText(" Uling");
				}
				;
			}
		});
		Ulingchckbox.setBackground(Color.LIGHT_GRAY);
		Ulingchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Ulingchckbox.setBounds(323, 545, 160, 23);
		contentPane.add(Ulingchckbox);

		Ulingtxtfield = new JTextField();
		Ulingtxtfield.setText("0");
		Ulingtxtfield.setEnabled(false);
		Ulingtxtfield.setColumns(10);
		Ulingtxtfield.setBounds(485, 547, 71, 20);
		contentPane.add(Ulingtxtfield);

		UlingSRP = new JLabel("10.00");
		UlingSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		UlingSRP.setBackground(Color.LIGHT_GRAY);
		UlingSRP.setBounds(581, 549, 82, 14);
		contentPane.add(UlingSRP);

		// Spices area
		JLabel Spiceslbl = new JLabel("Spices");
		Spiceslbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Spiceslbl.setBounds(342, 574, 122, 14);
		contentPane.add(Spiceslbl);

		JLabel SpicesQty = new JLabel("Qty");
		SpicesQty.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SpicesQty.setBounds(511, 574, 71, 14);
		contentPane.add(SpicesQty);

		JLabel SpicesSRP = new JLabel("SRP");
		SpicesSRP.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SpicesSRP.setBounds(592, 575, 71, 14);
		contentPane.add(SpicesSRP);

		Asinchckbox = new JCheckBox("Pack of Rack Salt");
		Asinchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Asinchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Asininv.setText(" Pack of Rack Salt");
				}
				;
			}
		});
		Asinchckbox.setBackground(Color.LIGHT_GRAY);
		Asinchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Asinchckbox.setBounds(323, 588, 160, 23);
		contentPane.add(Asinchckbox);

		Asintxtfield = new JTextField();
		Asintxtfield.setText("0");
		Asintxtfield.setEnabled(false);
		Asintxtfield.setColumns(10);
		Asintxtfield.setBounds(485, 590, 71, 20);
		contentPane.add(Asintxtfield);

		AsinSRP = new JLabel("1.00");
		AsinSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		AsinSRP.setBackground(Color.LIGHT_GRAY);
		AsinSRP.setBounds(581, 593, 54, 14);
		contentPane.add(AsinSRP);

		Vetsinchckbox = new JCheckBox("Vetsin");
		Vetsinchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Vetsinchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Vetsininv.setText(" Vetsin");
				}
				;
			}
		});
		Vetsinchckbox.setBackground(new Color(192, 192, 192));
		Vetsinchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Vetsinchckbox.setBounds(323, 618, 160, 23);
		contentPane.add(Vetsinchckbox);

		Vetsintxtfield = new JTextField();
		Vetsintxtfield.setText("0");
		Vetsintxtfield.setEnabled(false);
		Vetsintxtfield.setColumns(10);
		Vetsintxtfield.setBounds(485, 620, 71, 20);
		contentPane.add(Vetsintxtfield);

		VetsinSRP = new JLabel("2.00");
		VetsinSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		VetsinSRP.setBackground(Color.LIGHT_GRAY);
		VetsinSRP.setBounds(581, 627, 54, 14);
		contentPane.add(VetsinSRP);

		Spicechckbox = new JCheckBox("Class A Spice");
		Spicechckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Spicechckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Spiceinv.setText(" Class A Spice");
				}
				;
			}
		});
		Spicechckbox.setBackground(Color.LIGHT_GRAY);
		Spicechckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Spicechckbox.setBounds(323, 649, 160, 23);
		contentPane.add(Spicechckbox);

		Spicetxtfield = new JTextField();
		Spicetxtfield.setText("0");
		Spicetxtfield.setEnabled(false);
		Spicetxtfield.setColumns(10);
		Spicetxtfield.setBounds(485, 651, 71, 20);
		contentPane.add(Spicetxtfield);

		SpiceSRP = new JLabel("3.50");
		SpiceSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SpiceSRP.setBackground(Color.LIGHT_GRAY);
		SpiceSRP.setBounds(581, 654, 54, 14);
		contentPane.add(SpiceSRP);

		JLabel Spiceslbl_2 = new JLabel("Spices");
		Spiceslbl_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Spiceslbl_2.setBounds(660, 103, 122, 14);
		contentPane.add(Spiceslbl_2);

		JLabel SpicesQty_2 = new JLabel("Qty");
		SpicesQty_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SpicesQty_2.setBounds(829, 103, 71, 14);
		contentPane.add(SpicesQty_2);

		JLabel SpicesSRP_2 = new JLabel("SRP");
		SpicesSRP_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SpicesSRP_2.setBounds(910, 104, 71, 14);
		contentPane.add(SpicesSRP_2);

		Vinegarchckbox = new JCheckBox("Vinegar");
		Vinegarchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Vinegarchckbox.isSelected()) {

					cashin.setEditable(true);
					cashin.setEnabled(true);
					Vinegarinv.setText(" Vinegar");
				}
				;
			}
		});
		Vinegarchckbox.setBackground(Color.LIGHT_GRAY);
		Vinegarchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Vinegarchckbox.setBounds(641, 117, 160, 23);
		contentPane.add(Vinegarchckbox);

		Vinegartxtfield = new JTextField();
		Vinegartxtfield.setText("0");
		Vinegartxtfield.setEnabled(false);
		Vinegartxtfield.setColumns(10);
		Vinegartxtfield.setBounds(803, 119, 71, 20);
		contentPane.add(Vinegartxtfield);

		VinegarSRP = new JLabel("8.00");
		VinegarSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		VinegarSRP.setBackground(Color.LIGHT_GRAY);
		VinegarSRP.setBounds(899, 126, 71, 14);
		contentPane.add(VinegarSRP);

		SSaucechckbox = new JCheckBox("Soy Sauce");
		SSaucechckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (SSaucechckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					SSauceinv.setText(" Soy Sauce");
				}
				;
			}
		});
		SSaucechckbox.setBackground(Color.LIGHT_GRAY);
		SSaucechckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SSaucechckbox.setBounds(641, 147, 160, 23);
		contentPane.add(SSaucechckbox);

		SSaucetxtfield = new JTextField();
		SSaucetxtfield.setText("0");
		SSaucetxtfield.setEnabled(false);
		SSaucetxtfield.setColumns(10);
		SSaucetxtfield.setBounds(803, 149, 71, 20);
		contentPane.add(SSaucetxtfield);

		SSauceSRP = new JLabel("10.00");
		SSauceSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SSauceSRP.setBackground(Color.LIGHT_GRAY);
		SSauceSRP.setBounds(899, 152, 71, 14);
		contentPane.add(SSauceSRP);

		// Bathe Essentials area
		JLabel BatheElbl = new JLabel("Bathe Essentials");
		BatheElbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		BatheElbl.setBounds(660, 184, 122, 14);
		contentPane.add(BatheElbl);

		JLabel BatheEQty = new JLabel("Qty");
		BatheEQty.setFont(new Font("Century Gothic", Font.BOLD, 11));
		BatheEQty.setBounds(829, 184, 71, 14);
		contentPane.add(BatheEQty);

		JLabel BatheESRP = new JLabel("SRP");
		BatheESRP.setFont(new Font("Century Gothic", Font.BOLD, 11));
		BatheESRP.setBounds(910, 185, 71, 14);
		contentPane.add(BatheESRP);

		Shampoochckbox = new JCheckBox("Shampoo");
		Shampoochckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Shampoochckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					Shampooinv.setText(" Shampoo");
				}
				;
			}
		});
		Shampoochckbox.setBackground(Color.LIGHT_GRAY);
		Shampoochckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Shampoochckbox.setBounds(641, 198, 160, 23);
		contentPane.add(Shampoochckbox);

		Shampootxtfield = new JTextField();
		Shampootxtfield.setText("0");
		Shampootxtfield.setEnabled(false);
		Shampootxtfield.setColumns(10);
		Shampootxtfield.setBounds(803, 200, 71, 20);
		contentPane.add(Shampootxtfield);

		ShampooSRP = new JLabel("6.00");
		ShampooSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ShampooSRP.setBackground(Color.LIGHT_GRAY);
		ShampooSRP.setBounds(899, 203, 54, 14);
		contentPane.add(ShampooSRP);

		Soap250chckbox = new JCheckBox("Soap 250 grams");
		Soap250chckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Soap250chckbox.isSelected()) {

					cashin.setEditable(true);
					cashin.setEnabled(true);
					Soap250inv.setText(" Soap 250 grams");
				}
				;
			}
		});
		Soap250chckbox.setBackground(Color.LIGHT_GRAY);
		Soap250chckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Soap250chckbox.setBounds(641, 228, 160, 23);
		contentPane.add(Soap250chckbox);

		Soap250txtfield = new JTextField();
		Soap250txtfield.setText("0");
		Soap250txtfield.setEnabled(false);
		Soap250txtfield.setColumns(10);
		Soap250txtfield.setBounds(803, 230, 71, 20);
		contentPane.add(Soap250txtfield);

		Soap250SRP = new JLabel("15.00");
		Soap250SRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Soap250SRP.setBackground(Color.LIGHT_GRAY);
		Soap250SRP.setBounds(899, 233, 71, 14);
		contentPane.add(Soap250SRP);

		Soap500chckbox = new JCheckBox("Soap 500 grams");
		Soap500chckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Soap500chckbox.isSelected()) {

					cashin.setEditable(true);
					cashin.setEnabled(true);
					Soap500inv.setText(" Soap 500 grams");
				}
				;
			}
		});
		Soap500chckbox.setBackground(Color.LIGHT_GRAY);
		Soap500chckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Soap500chckbox.setBounds(641, 254, 160, 23);
		contentPane.add(Soap500chckbox);

		Soap500txtfield = new JTextField();
		Soap500txtfield.setText("0");
		Soap500txtfield.setEnabled(false);
		Soap500txtfield.setColumns(10);
		Soap500txtfield.setBounds(803, 256, 71, 20);
		contentPane.add(Soap500txtfield);

		Soap500SRP = new JLabel("26.00");
		Soap500SRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Soap500SRP.setBackground(Color.LIGHT_GRAY);
		Soap500SRP.setBounds(899, 259, 65, 14);
		contentPane.add(Soap500SRP);

		FacialWashchckbox = new JCheckBox("Facial Wash 250 grams");
		FacialWashchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (FacialWashchckbox.isSelected()) {

					cashin.setEditable(true);
					cashin.setEnabled(true);
					FWashinv.setText(" Facial Wash 250 grams");
				}
				;
			}
		});
		FacialWashchckbox.setBackground(Color.LIGHT_GRAY);
		FacialWashchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		FacialWashchckbox.setBounds(641, 280, 160, 23);
		contentPane.add(FacialWashchckbox);

		FacialWashtxtfield = new JTextField();
		FacialWashtxtfield.setText("0");
		FacialWashtxtfield.setEnabled(false);
		FacialWashtxtfield.setColumns(10);
		FacialWashtxtfield.setBounds(803, 282, 71, 20);
		contentPane.add(FacialWashtxtfield);

		FacialWashSRP = new JLabel("9.00");
		FacialWashSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		FacialWashSRP.setBackground(Color.LIGHT_GRAY);
		FacialWashSRP.setBounds(899, 285, 54, 14);
		contentPane.add(FacialWashSRP);

		// Laundry Essentials area
		JLabel LaundryElbl = new JLabel("Laundry Essentials");
		LaundryElbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		LaundryElbl.setBounds(660, 306, 122, 14);
		contentPane.add(LaundryElbl);

		JLabel LaundryEQty = new JLabel("Qty");
		LaundryEQty.setFont(new Font("Century Gothic", Font.BOLD, 11));
		LaundryEQty.setBounds(829, 306, 71, 14);
		contentPane.add(LaundryEQty);

		JLabel LaundryESRP = new JLabel("SRP");
		LaundryESRP.setFont(new Font("Century Gothic", Font.BOLD, 11));
		LaundryESRP.setBounds(910, 307, 71, 14);
		contentPane.add(LaundryESRP);

		PowderedWashchckbox = new JCheckBox("Powdered Wash");
		PowderedWashchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PowderedWashchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					PWashinv.setText(" Powdered Wash");
				}
				;
			}
		});
		PowderedWashchckbox.setBackground(Color.LIGHT_GRAY);
		PowderedWashchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		PowderedWashchckbox.setBounds(641, 320, 160, 23);
		contentPane.add(PowderedWashchckbox);

		PowderedWashtxtfield = new JTextField();
		PowderedWashtxtfield.setText("0");
		PowderedWashtxtfield.setEnabled(false);
		PowderedWashtxtfield.setColumns(10);
		PowderedWashtxtfield.setBounds(803, 322, 71, 20);
		contentPane.add(PowderedWashtxtfield);

		PowderedWashSRP = new JLabel("9.00");
		PowderedWashSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		PowderedWashSRP.setBackground(Color.LIGHT_GRAY);
		PowderedWashSRP.setBounds(899, 325, 54, 14);
		contentPane.add(PowderedWashSRP);

		BarSoapchckbox = new JCheckBox("Bar Soap");
		BarSoapchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (BarSoapchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					BSoapinv.setText(" Bar Soap");
				}
				;
			}
		});
		BarSoapchckbox.setBackground(Color.LIGHT_GRAY);
		BarSoapchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BarSoapchckbox.setBounds(641, 350, 160, 23);
		contentPane.add(BarSoapchckbox);

		BarSoaptxtfield = new JTextField();
		BarSoaptxtfield.setText("0");
		BarSoaptxtfield.setEnabled(false);
		BarSoaptxtfield.setColumns(10);
		BarSoaptxtfield.setBounds(803, 352, 71, 20);
		contentPane.add(BarSoaptxtfield);

		BarSoapSRP = new JLabel("12.00");
		BarSoapSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BarSoapSRP.setBackground(Color.LIGHT_GRAY);
		BarSoapSRP.setBounds(899, 355, 71, 14);
		contentPane.add(BarSoapSRP);

		FConditionerchckbox = new JCheckBox("Fabric Conditioner");
		FConditionerchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (FConditionerchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					FConditionerinv.setText(" Fabric Conditioner");
				}
				;
			}
		});
		FConditionerchckbox.setBackground(Color.LIGHT_GRAY);
		FConditionerchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		FConditionerchckbox.setBounds(641, 376, 160, 23);
		contentPane.add(FConditionerchckbox);

		FConditionertxtfield = new JTextField();
		FConditionertxtfield.setText("0");
		FConditionertxtfield.setEnabled(false);
		FConditionertxtfield.setColumns(10);
		FConditionertxtfield.setBounds(803, 378, 71, 20);
		contentPane.add(FConditionertxtfield);

		FConditionerSRP = new JLabel("8.00");
		FConditionerSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		FConditionerSRP.setBackground(Color.LIGHT_GRAY);
		FConditionerSRP.setBounds(899, 381, 54, 14);
		contentPane.add(FConditionerSRP);

		NetBrushchckbox = new JCheckBox("Netbrush");
		NetBrushchckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (NetBrushchckbox.isSelected()) {
					
					cashin.setEditable(true);
					cashin.setEnabled(true);
					NetBrushinv.setText(" Netbrush");
				}
				;
			}
		});
		NetBrushchckbox.setBackground(Color.LIGHT_GRAY);
		NetBrushchckbox.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		NetBrushchckbox.setBounds(641, 402, 160, 23);
		contentPane.add(NetBrushchckbox);

		NetBrushtxtfield = new JTextField();
		NetBrushtxtfield.setText("0");
		NetBrushtxtfield.setEnabled(false);
		NetBrushtxtfield.setColumns(10);
		NetBrushtxtfield.setBounds(803, 404, 71, 20);
		contentPane.add(NetBrushtxtfield);

		NetbrushSRP = new JLabel("5.00");
		NetbrushSRP.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		NetbrushSRP.setBackground(Color.LIGHT_GRAY);
		NetbrushSRP.setBounds(899, 407, 54, 14);
		contentPane.add(NetbrushSRP);

		// POS Area or receipt
		JLabel CashierList = new JLabel("CASHIER SYSTEM");
		CashierList.setForeground(Color.GREEN);
		CashierList.setFont(new Font("Century Gothic", Font.BOLD, 30));
		CashierList.setBounds(1028, 121, 394, 53);
		contentPane.add(CashierList);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(980, 177, 360, 351);
		contentPane.add(scrollPane);
		
		Receipt = new JTextArea();
		scrollPane.setViewportView(Receipt);
		Receipt.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Receipt.setEditable(false);
		
		
		// Buttons and its functions	
		btnNewButton = new JButton("TOTAL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//String and double format for the quantity, stocks, money input, total, and etc. 
				
				//getting the quantity inputted in the textfield
				String qbread = PrdctPOS.ABreadtxtfield.getText();
				String qsopas = PrdctPOS.ASopastxtfield.getText();
				String qjfm = PrdctPOS.JunkfoodsMtxtfield.getText();
				String qjfl = PrdctPOS.JunkfoodsLtxtfield.getText();
				String qcandies = PrdctPOS.CandiesandSweetstxtfield.getText();
				String qbiscuits = PrdctPOS.ABsctstxtfield.getText();
				String qchi = PrdctPOS.AChitxtfield.getText();
				
				String qsmb500 = PrdctPOS.SMB500txtfield.getText();
				String qsmb250 = PrdctPOS.SMB250txtfield.getText();
				String qsmb1k = PrdctPOS.SMB1ktxtfield.getText();
				String qcbeer = PrdctPOS.CBeertxtfield.getText();
				String qtlong = PrdctPOS.TLongnecktxtfield.getText();
				String qtflat = PrdctPOS.TFlattxtfield.getText();
				String qempe = PrdctPOS.EmperadorLNtxtfield.getText();
				String qkulafu = PrdctPOS.Kulafu250txtfield.getText();
				
				String qcanton = PrdctPOS.ACantontxtfield.getText();
				String qnoodles = PrdctPOS.ANoodlestxtfield.getText();
				String qcnoodles = PrdctPOS.ACNoodlestxtfield.getText();
				
				String qsardines = PrdctPOS.ACSardinestxtfield.getText();
				String qtuna = PrdctPOS.ACTunatxtfield.getText();
				String qbeefl = PrdctPOS.ABeefLtxtfield.getText();
				String qmeatl = PrdctPOS.AMeatLtxtfield.getText();
				String qsaus = PrdctPOS.ACSaussagetxtfield.getText();
				
				String qganador = PrdctPOS.Ganadortxtfield.getText();
				String qmais = PrdctPOS.Maistxtfield.getText();
				String qbrice = PrdctPOS.BRicetxtfield.getText();
				
				String qtomato = PrdctPOS.Tomatotxtfield.getText();
				String qpotato = PrdctPOS.Potatotxtfield.getText();
				String qonion = PrdctPOS.Oniontxtfield.getText();
				String qgarlic = PrdctPOS.Garlictxtfield.getText();
				String qbanana = PrdctPOS.Bananatxtfield.getText();
				String qapple = PrdctPOS.Appletxtfield.getText();
				String qponkan = PrdctPOS.Ponkantxtfield.getText();
				
				String qbutane = PrdctPOS.Butanetxtfield.getText();
				String quling = PrdctPOS.Ulingtxtfield.getText();
				
				String qasin = PrdctPOS.Asintxtfield.getText();
				String qvetsin = PrdctPOS.Vetsintxtfield.getText();
				String qspice = PrdctPOS.Spicetxtfield.getText();
				String qvinegar = PrdctPOS.Vinegartxtfield.getText();
				String qssauce = PrdctPOS.SSaucetxtfield.getText();
				
				String qshampoo = PrdctPOS.Shampootxtfield.getText();
				String qsoap250 = PrdctPOS.Soap250txtfield.getText();
				String qsoap500 = PrdctPOS.Soap500txtfield.getText();
				String qfwash = PrdctPOS.FacialWashtxtfield.getText();
				
				String qpwash = PrdctPOS.PowderedWashtxtfield.getText();
				String qbsoap = PrdctPOS.BarSoaptxtfield.getText();
				String qfcondi = PrdctPOS.FConditionertxtfield.getText();
				String qnetbrush = PrdctPOS.NetBrushtxtfield.getText();
				
				double quanbread = Double.parseDouble(qbread);
				double quansopas = Double.parseDouble(qsopas);
				double quanjfm = Double.parseDouble(qjfm);
				double quanjfl = Double.parseDouble(qjfl);
				double quancandies = Double.parseDouble(qcandies);
				double quanbiscuits = Double.parseDouble(qbiscuits);
				double quanchi = Double.parseDouble(qchi);
				
				double quansmb500 = Double.parseDouble(qsmb500);
				double quansmb250 = Double.parseDouble(qsmb250);
				double quansmb1k = Double.parseDouble(qsmb1k);
				double quancbeer = Double.parseDouble(qcbeer);
				double quantlong = Double.parseDouble(qtlong);
				double quantflat = Double.parseDouble(qtflat);
				double quanempe = Double.parseDouble(qempe);
				double quankulafu = Double.parseDouble(qkulafu);
				
				double quancanton = Double.parseDouble(qcanton);
				double quannoodles = Double.parseDouble(qnoodles);
				double quancnoodles = Double.parseDouble(qcnoodles);
				
				double quansardines = Double.parseDouble(qsardines);
				double quantuna = Double.parseDouble(qtuna);
				double quanbeefl = Double.parseDouble(qbeefl);
				double quanmeatl = Double.parseDouble(qmeatl);
				double quansaus = Double.parseDouble(qsaus);
				
				double quanganador = Double.parseDouble(qganador);
				double quanmais = Double.parseDouble(qmais);
				double quanbrice = Double.parseDouble(qbrice);
				
				double quantomato = Double.parseDouble(qtomato);
				double quanpotato = Double.parseDouble(qpotato);
				double quanonion = Double.parseDouble(qonion);
				double quangarlic = Double.parseDouble(qgarlic);
				double quanbanana = Double.parseDouble(qbanana);
				double quanapple = Double.parseDouble(qapple);
				double quanponkan = Double.parseDouble(qponkan);
				
				double quanbutane = Double.parseDouble(qbutane);
				double quanuling = Double.parseDouble(quling);
				
				double quanasin = Double.parseDouble(qasin);
				double quanvetsin = Double.parseDouble(qvetsin);
				double quanspice = Double.parseDouble(qspice);
				double quanvinegar = Double.parseDouble(qvinegar);
				double quanssauce = Double.parseDouble(qssauce);
				
				double quanshampoo = Double.parseDouble(qshampoo);
				double quansoap250 = Double.parseDouble(qsoap250);
				double quansoap500 = Double.parseDouble(qsoap500);
				double quanfwash = Double.parseDouble(qfwash);
				
				double quanpwash = Double.parseDouble(qpwash);
				double quanbsoap = Double.parseDouble(qbsoap);
				double quanfcondi = Double.parseDouble(qfcondi);
				double quannetbrush = Double.parseDouble(qnetbrush);
				
				//getting the stock from the other class
				String sbread = PrdctList.Breadin.getText();
				String ssopas = PrdctList.Sopasin.getText();
				String sjfm = PrdctList.JFMin.getText();
				String sjfl = PrdctList.JFLin.getText();
				String scandies = PrdctList.CandSin.getText();
				String sbiscuits = PrdctList.Bsctsin.getText();
				String schi = PrdctList.Chiin.getText();
				
				String ssmb500 = PrdctList.SMB500in.getText();
				String ssmb250 = PrdctList.SMB250in.getText();
				String ssmb1k = PrdctList.SMB1kin.getText();
				String scbeer = PrdctList.CBeerin.getText();
				String stlong = PrdctList.TLongNin.getText();
				String stflat = PrdctList.TFlatin.getText();
				String sempe = PrdctList.Empein.getText();
				String skulafu = PrdctList.Kulafuin.getText();
				
				String scanton = PrdctList.PCantonin.getText();
				String snoodles = PrdctList.Noodlesin.getText();
				String scnoodles = PrdctList.CNoodlesin.getText();
				
				String ssardines = PrdctList.Sardinesin.getText();
				String stuna = PrdctList.Tunain.getText();
				String sbeefl = PrdctList.BeefLin.getText();
				String smeatl = PrdctList.MeatLin.getText();
				String ssaus = PrdctList.Sausin.getText();
				
				String sganador = PrdctList.Ganadorin.getText();
				String smais = PrdctList.Maisin.getText();
				String sbrice = PrdctList.BRicein.getText();
				
				String stomato = PrdctList.Tomatoin.getText();
				String spotato = PrdctList.Potatoin.getText();
				String sonion = PrdctList.Onionin.getText();
				String sgarlic = PrdctList.Garlicin.getText();
				String sbanana = PrdctList.Bananain.getText();
				String sapple = PrdctList.Applein.getText();
				String sponkan = PrdctList.Ponkanin.getText();
				
				String sbutane = PrdctList.Butanein.getText();
				String suling = PrdctList.Ulingin.getText();
				
				String sasin = PrdctList.Asinin.getText();
				String svetsin = PrdctList.Vetsinin.getText();
				String sspice = PrdctList.Spicein.getText();
				String svinegar = PrdctList.Vinegarin.getText();
				String sssauce = PrdctList.SSaucein.getText();
				
				String sshampoo = PrdctList.Shampooin.getText();
				String ssoap250 = PrdctList.Soap250in.getText();
				String ssoap500 = PrdctList.Soap500in.getText();
				String sfwash = PrdctList.FWashin.getText();
				
				String spwash = PrdctList.PWashin.getText();
				String sbsoap = PrdctList.BSoapin.getText();
				String sfcondi = PrdctList.FConditionerin.getText();
				String snetbrush = PrdctList.Netbrushin.getText();
				
				double stockbread = Double.parseDouble(sbread);
				double stocksopas = Double.parseDouble(ssopas);
				double stockjfm = Double.parseDouble(sjfm);
				double stockjfl = Double.parseDouble(sjfl);
				double stockcandies = Double.parseDouble(scandies);
				double stockbiscuits = Double.parseDouble(sbiscuits);
				double stockchi = Double.parseDouble(schi);
				
				double stocksmb500 = Double.parseDouble(ssmb500);
				double stocksmb250 = Double.parseDouble(ssmb250);
				double stocksmb1k = Double.parseDouble(ssmb1k);
				double stockcbeer = Double.parseDouble(scbeer);
				double stocktlong = Double.parseDouble(stlong);
				double stocktflat = Double.parseDouble(stflat);
				double stockempe = Double.parseDouble(sempe);
				double stockkulafu = Double.parseDouble(skulafu);
				
				double stockcanton = Double.parseDouble(scanton);
				double stocknoodles = Double.parseDouble(snoodles);
				double stockcnoodles = Double.parseDouble(scnoodles);
				
				double stocksardines = Double.parseDouble(ssardines);
				double stocktuna = Double.parseDouble(stuna);
				double stockbeefl = Double.parseDouble(sbeefl);
				double stockmeatl = Double.parseDouble(smeatl);
				double stocksaus = Double.parseDouble(ssaus);
				
				double stockganador = Double.parseDouble(sganador);
				double stockmais = Double.parseDouble(smais);
				double stockbrice = Double.parseDouble(sbrice);
				
				double stocktomato = Double.parseDouble(stomato);
				double stockpotato = Double.parseDouble(spotato);
				double stockonion = Double.parseDouble(sonion);
				double stockgarlic = Double.parseDouble(sgarlic);
				double stockbanana = Double.parseDouble(sbanana);
				double stockapple = Double.parseDouble(sapple);
				double stockponkan = Double.parseDouble(sponkan);
				
				double stockbutane = Double.parseDouble(sbutane);
				double stockuling = Double.parseDouble(suling);
				
				double stockasin = Double.parseDouble(sasin);
				double stockvetsin = Double.parseDouble(svetsin);
				double stockspice = Double.parseDouble(sspice);
				double stockvinegar = Double.parseDouble(svinegar);
				double stockssauce = Double.parseDouble(sssauce);
				
				double stockshampoo = Double.parseDouble(sshampoo);
				double stocksoap250 = Double.parseDouble(ssoap250);
				double stocksoap500 = Double.parseDouble(ssoap500);
				double stockfwash = Double.parseDouble(sfwash);
				
				double stockpwash = Double.parseDouble(spwash);
				double stockbsoap = Double.parseDouble(sbsoap);
				double stockfcondi = Double.parseDouble(sfcondi);
				double stocknetbrush = Double.parseDouble(snetbrush);
				
				//getting the price
				String breadpr = PrdctPOS.BreadSRP.getText();
				String sopaspr = PrdctPOS.SopasSRP.getText();
				String jfmpr = PrdctPOS.JunkFMSRP.getText();
				String jflpr = PrdctPOS.JunkFLSRP.getText();
				String candiespr = PrdctPOS.CandSSRP.getText();
				String biscuitspr = PrdctPOS.BsctsSRP.getText();
				String chipr = PrdctPOS.ChiSRP.getText();
				
				String smb500pr = PrdctPOS.SMB500_SRP.getText();
				String smb250pr = PrdctPOS.SMB250_SRP.getText();
				String smb1kpr = PrdctPOS.SMB1k_SRP.getText();
				String cbeerpr = PrdctPOS.CBeerSRP.getText();
				String tlongpr = PrdctPOS.TLongneckSRP.getText();
				String tflatpr = PrdctPOS.TFlatSRP.getText();
				String empepr = PrdctPOS.EmperadorLNSRP.getText();
				String kulafupr = PrdctPOS.Kulafu250SRP.getText();
				
				String cantonpr = PrdctPOS.ACantonSRP.getText();
				String noodlespr = PrdctPOS.ANoodlesSRP.getText();
				String cnoodlespr = PrdctPOS.ACNoodlesSRP.getText();
				
				String sardinespr = PrdctPOS.ACSardinesSRP.getText();
				String tunapr = PrdctPOS.ACTunaSRP.getText();
				String beeflpr = PrdctPOS.ABeefLSRP.getText();
				String meatlpr = PrdctPOS.AMeatLSRP.getText();
				String sauspr = PrdctPOS.ACSaussageSRP.getText();
				
				String ganadorpr = PrdctPOS.GanadorSRP.getText();
				String maispr = PrdctPOS.MaisSRP.getText();
				String bricepr = PrdctPOS.BRiceSRP.getText();
				
				String tomatopr = PrdctPOS.TomatoSRP.getText();
				String potatopr = PrdctPOS.PotatoSRP.getText();
				String onionpr = PrdctPOS.OnionSRP.getText();
				String garlicpr = PrdctPOS.GarlicSRP.getText();
				String bananapr = PrdctPOS.BananaSRP.getText();
				String applepr = PrdctPOS.AppleSRP.getText();
				String ponkanpr = PrdctPOS.PonkanSRP.getText();
				
				String butanepr = PrdctPOS.ButaneSRP.getText();
				String ulingpr = PrdctPOS.UlingSRP.getText();
				
				String asinpr = PrdctPOS.AsinSRP.getText();
				String vetsinpr = PrdctPOS.VetsinSRP.getText();
				String spicepr = PrdctPOS.SpiceSRP.getText();
				String vinegarpr = PrdctPOS.VinegarSRP.getText();
				String ssaucepr = PrdctPOS.SSauceSRP.getText();
				
				String shampoopr = PrdctPOS.ShampooSRP.getText();
				String soap250pr = PrdctPOS.Soap250SRP.getText();
				String soap500pr = PrdctPOS.Soap500SRP.getText();
				String fwashpr = PrdctPOS.FacialWashSRP.getText();
				
				String pwashpr = PrdctPOS.PowderedWashSRP.getText();
				String bsoappr = PrdctPOS.BarSoapSRP.getText();
				String fcondipr = PrdctPOS.FConditionerSRP.getText();
				String netbrushpr = PrdctPOS.NetbrushSRP.getText();
				
				double breadprice = Double.parseDouble(breadpr);
				double sopasprice = Double.parseDouble(sopaspr);
				double jfmprice = Double.parseDouble(jfmpr);
				double jflprice = Double.parseDouble(jflpr);
				double candiesprice = Double.parseDouble(candiespr);
				double biscuitsprice = Double.parseDouble(biscuitspr);
				double chiprice = Double.parseDouble(chipr);
				
				double smb500price = Double.parseDouble(smb500pr);
				double smb250price = Double.parseDouble(smb250pr);
				double smb1kprice = Double.parseDouble(smb1kpr);
				double cbeerprice = Double.parseDouble(cbeerpr);
				double tlongprice = Double.parseDouble(tlongpr);
				double tflatprice = Double.parseDouble(tflatpr);
				double empeprice = Double.parseDouble(empepr);
				double kulafuprice = Double.parseDouble(kulafupr);
				
				double cantonprice = Double.parseDouble(cantonpr);
				double noodlesprice = Double.parseDouble(noodlespr);
				double cnoodlesprice = Double.parseDouble(cnoodlespr);
				
				double sardinesprice = Double.parseDouble(sardinespr);
				double tunaprice = Double.parseDouble(tunapr);
				double beeflprice = Double.parseDouble(beeflpr);
				double meatlprice = Double.parseDouble(meatlpr);
				double sausprice = Double.parseDouble(sauspr);
				
				double ganadorprice = Double.parseDouble(ganadorpr);
				double maisprice = Double.parseDouble(maispr);
				double briceprice = Double.parseDouble(bricepr);
				
				double tomatoprice = Double.parseDouble(tomatopr);
				double potatoprice = Double.parseDouble(potatopr);
				double onionprice = Double.parseDouble(onionpr);
				double garlicprice = Double.parseDouble(garlicpr);
				double bananaprice = Double.parseDouble(bananapr);
				double appleprice = Double.parseDouble(applepr);
				double ponkanprice = Double.parseDouble(ponkanpr);
				
				double butaneprice = Double.parseDouble(butanepr);
				double ulingprice = Double.parseDouble(ulingpr);
				
				double asinprice = Double.parseDouble(asinpr);
				double vetsinprice = Double.parseDouble(vetsinpr);
				double spiceprice = Double.parseDouble(spicepr);
				double vinegarprice = Double.parseDouble(vinegarpr);
				double ssauceprice = Double.parseDouble(ssaucepr);
				
				double shampooprice = Double.parseDouble(shampoopr);
				double soap250price = Double.parseDouble(soap250pr);
				double soap500price = Double.parseDouble(soap500pr);
				double fwashprice = Double.parseDouble(fwashpr);
				
				double pwashprice = Double.parseDouble(pwashpr);
				double bsoapprice = Double.parseDouble(bsoappr);
				double fcondiprice = Double.parseDouble(fcondipr);
				double netbrushprice = Double.parseDouble(netbrushpr);
				
				// getting invicible textfield for the product name appear on the receipt pane
				String Breadrec = Breadinv.getText();
				String Sopasrec = Sopasinv.getText();
				String JFMrec = JFMinv.getText();
				String JFLrec = JFLinv.getText();
				String Candiesrec = CandSinv.getText();
				String Biscuitsrec = Bisctsinv.getText();
				String Chirec = Chiinv.getText();
				
				String SMB500rec = SMB500inv.getText();
				String SMB250rec = SMB250inv.getText();
				String SMB1krec= SMB1kinv.getText();
				String CBeerrec = CBeerinv.getText();
				String TLongrec = TLongNeckinv.getText();
				String TFlatrec = TFlatinv.getText();
				String Emperec = Empeinv.getText();
				String Kulafurec = Kulafuinv.getText();
				
				String Cantonrec = PCantoninv.getText();
				String Noodlesrec = Noodlesinv.getText();
				String CNoodlesrec = CNoodlesinv.getText();
				
				String Sardinesrec = Sardinesinv.getText();
				String Tunarec = Tunainv.getText();
				String BeefLrec = BeefLinv.getText();
				String MeatLrec = MeatLinv.getText();
				String Sausrec = Sausinv.getText();
				
				String Ganadorrec = Ganadorinv.getText();
				String Maisrec = Maisinv.getText();
				String Bricerec = BRiceinv.getText();
				
				String Tomatorec = Tomatoinv.getText();
				String Potatorec = Potatoinv.getText();
				String Onionrec = Onioninv.getText();
				String Garlicrec = Garlicinv.getText();
				String Bananarec = Bananainv.getText();
				String Applerec = Appleinv.getText();
				String Ponkanrec = Ponkaninv.getText();
				
				String Butanerec = Butaneinv.getText();
				String Ulingrec = Ulinginv.getText();
				
				String Asinrec = Asininv.getText();
				String Vetsinrec = Vetsininv.getText();
				String Spicerec = Spiceinv.getText();
				String Vinegarrec = Vinegarinv.getText();
				String SSaucerec = SSauceinv.getText();
				
				String Shampoorec = Shampooinv.getText();
				String Soap250rec = Soap250inv.getText();
				String Soap500rec = Soap500inv.getText();
				String FWashrec = FWashinv.getText();
				
				String PWashrec = PWashinv.getText();
				String BSoaprec = BSoapinv.getText();
				String FCondirec = FConditionerinv.getText();
				String Netbrushrec = NetBrushinv.getText();
				
				//Money Input
				String moneyin = PrdctPOS.cashin.getText();
				double moneyinn = Double.parseDouble(moneyin);
				
				//Calculations
				double snacks = (quanbread * breadprice) + (quansopas * sopasprice) + (quanjfm * jfmprice) + (quanjfl * jflprice) 
				+ (quancandies * candiesprice) + (quanbiscuits * biscuitsprice) + (quanchi * chiprice);
				
				double liquors = (quansmb500 * smb500price) + (quansmb250 * smb250price) + (quansmb1k * smb1kprice) 
				+ (quancbeer * cbeerprice) + (quantlong * tlongprice) + (quantflat * tflatprice) 
				+ (quanempe * empeprice) + (quankulafu * kulafuprice); 
				
				double instant = (quancanton * cantonprice) + (quannoodles * noodlesprice) + (quancnoodles * cnoodlesprice);
				
				double can = (quansardines * sardinesprice) + (quantuna * tunaprice) + (quanbeefl * beeflprice) 
				+ (quanmeatl * meatlprice) + (quansaus * sausprice); 
				
				double rice = (quanganador * ganadorprice) + (quanmais * maisprice) +(quanbrice * briceprice);
				
				double vandf = (quantomato * tomatoprice) + (quanpotato * potatoprice) + (quanonion * onionprice) + (quangarlic * garlicprice)
				+ (quanbanana * bananaprice) + (quanapple * appleprice) + (quanponkan * ponkanprice);
				
				double others = (quanbutane * butaneprice) + (quanuling * ulingprice);
				
				double spices = (quanasin * asinprice) + (quanvetsin * vetsinprice) + (quanspice * spiceprice) + (quanvinegar * vinegarprice) + (quanssauce * ssauceprice); 
				
				double bath = (quanshampoo * shampooprice) + (quansoap250 * soap250price) + (quansoap500 * soap500price) + (quanfwash * fwashprice);
				
				double laundry = (quanpwash * pwashprice) + (quanbsoap * bsoapprice) + (quanfcondi * fcondiprice) + (quannetbrush * netbrushprice);
				
				double total = snacks + liquors + instant + can + rice + vandf + others + spices + bath + laundry;
				
				double breadleft = stockbread - quanbread;
				double sopasleft = stocksopas - quansopas; 
				double jfmleft = stockjfm - quanjfm;
				double jflleft = stockjfl - quanjfl;
				double candiesleft = stockcandies - quancandies;
				double biscuitsleft = stockbiscuits - quanbiscuits;
				double chileft = stockchi - quanbiscuits;
				
				double smb500left = stocksmb500 - quansmb500;
				double smb250left = stocksmb250 - quansmb250;
				double smb1kleft = stocksmb1k - quansmb1k;
				double cbeerleft = stockcbeer - quancbeer;
				double tlongleft = stocktlong -quantlong;
				double tflatleft = stocktflat - quantflat;
				double empeleft = stockempe - quanempe;
				double kulafuleft = stockkulafu - quankulafu;
				
				double cantonleft = stockcanton - quancanton;
				double noodlesleft = stocknoodles - quannoodles;
				double cnoodlesleft = stockcnoodles - quancnoodles;
				
				double sardinesleft = stocksardines - quansardines;
				double tunaleft = stocktuna - quantuna;
				double beeflleft = stockbeefl - quanbeefl;
				double meatlleft = stockmeatl - quanmeatl;
				double sausleft = stocksaus - quansaus;
				
				double ganadorleft = stockganador - quanganador;
				double maisleft = stockmais - quanmais;
				double briceleft = stockbrice - quanbrice;
			
				double tomatoleft = stocktomato - quantomato;
				double potatoleft = stockpotato - quanpotato;
				double onionleft = stockonion - quanonion;
				double garlicleft = stockgarlic - quangarlic;
				double bananaleft = stockbanana - quanbanana;
				double appleleft = stockapple - quanapple;
				double ponkanleft = stockponkan - quanponkan;
				
				double butaneleft = stockbutane - quanbutane;
				double ulingleft = stockuling - quanuling;
				
				double asinleft = stockasin - quanasin;
				double vetsinleft = stockvetsin - quanvetsin;
				double spiceleft = stockspice - quanspice;
				double vinegarleft = stockvinegar - quanvinegar;
				double ssauceleft = stockssauce - quanssauce;
				
				double shampooleft = stockshampoo - quanshampoo;
				double soap250left = stocksoap250 - quansoap250;
				double soap500left = stocksoap500 - quansoap500;
				double fwashleft = stockfwash - quanfwash;
				
				double pwashleft = stockpwash - quanpwash;
				double bsoapleft = stockbsoap - quanbsoap;
				double fcondileft = stockfcondi - quanfcondi;
				double netbrushleft = stocknetbrush - quannetbrush;
				
				String Snackers = Breadrec + Sopasrec + JFMrec + JFLrec + Candiesrec + Biscuitsrec + Chirec;
				String Liquors = SMB500rec + SMB250rec + SMB1krec + CBeerrec + TLongrec + TFlatrec + Emperec + Kulafurec;
				String Instant = Cantonrec + Noodlesrec + CNoodlesrec;
				String Can = Sardinesrec + Tunarec + BeefLrec + MeatLrec + Sausrec;
				String Rice = Ganadorrec + Maisrec + Bricerec;
				String VandF = Tomatorec + Potatorec + Onionrec + Garlicrec + Bananarec + Applerec + Ponkanrec;
				String Others = Butanerec + Ulingrec;
				String Spices = Asinrec + Vetsinrec + Spicerec + Vinegarrec + SSaucerec;
				String Bathe = Shampoorec + Soap250rec + Soap500rec + FWashrec;
				String Laundry = PWashrec + BSoaprec + FCondirec + Netbrushrec;
				
				double change = moneyinn - total;				
				
				//OUTPUT LINE
				 Receipt.setText("                                             Purchase Summary\n"
				 + "Item Purchased:\n "
				 +"\n" +String.format("%s",Snackers)
				 +"\n" +String.format("%s",Liquors)
				 +"\n" +String.format("%s",Instant)
				 +"\n" +String.format("%s",Can)
				 +"\n" +String.format("%s",Rice)
				 +"\n" +String.format("%s",VandF)
				 +"\n" +String.format("%s",Others)
				 +"\n" +String.format("%s",Spices)
				 +"\n" +String.format("%s",Bathe)
				 +"\n" +String.format("%s",Laundry)
				 + "\n\nTotal Payment:\t"+String.format("P %.2f\n\n",total)
				 + "\n\n Cash Received:\t"+String.format("P %.2f\n\n",moneyinn)
				 + "\n\n Change:\t"+String.format("P %.2f\n\n",change));
				 
				 
				 //Stock Update
				PrdctList.Breadin.setText(""+String.format("%.0f",breadleft));
					if (breadleft < 0) {
						PrdctList.Breadin.setText("0");
					}
				PrdctList.Sopasin.setText(""+String.format("%.0f",sopasleft));
					if (sopasleft < 0) {
						PrdctList.Sopasin.setText("0");
					}
				PrdctList.JFMin.setText(""+String.format("%.0f",jfmleft));
					if (jfmleft < 0) {
						PrdctList.JFMin.setText("0");
					}
				PrdctList.JFLin.setText(""+String.format("%.0f",jflleft));
					if (jflleft < 0) {
						PrdctList.JFLin.setText("0");
					}
				PrdctList.CandSin.setText(""+String.format("%.0f",candiesleft));
					if (candiesleft < 0) {
						PrdctList.CandSin.setText("0");
					}
				PrdctList.Bsctsin.setText(""+String.format("%.0f",biscuitsleft));
					if (biscuitsleft < 0) {
						PrdctList.Bsctsin.setText("0");
					}
				PrdctList.Chiin.setText(""+String.format("%.0f",chileft));
					if (chileft < 0) {
						PrdctList.Chiin.setText("0");
					}
				PrdctList.SMB500in.setText(""+String.format("%.0f",smb500left));
					if (smb500left < 0) {
						PrdctList.SMB500in.setText("0");
					}
				PrdctList.SMB250in.setText(""+String.format("%.0f",smb250left));
					if (smb250left < 0) {
						PrdctList.SMB250in.setText("0");
					}
				PrdctList.SMB1kin.setText(""+String.format("%.0f",smb1kleft));
					if (smb1kleft < 0) {
						PrdctList.SMB1kin.setText("0");
					}
				PrdctList.CBeerin.setText(""+String.format("%.0f",cbeerleft));
					if (cbeerleft < 0) {
						PrdctList.CBeerin.setText("0");
					}
				PrdctList.TLongNin.setText(""+String.format("%.0f",tlongleft));
					if (tlongleft < 0) {
						PrdctList.TLongNin.setText("0");
					}
				PrdctList.TFlatin.setText(""+String.format("%.0f",tflatleft));
					if (tflatleft < 0) {
						PrdctList.TFlatin.setText("0");
					}
				PrdctList.Empein.setText(""+String.format("%.0f",empeleft));
					if (empeleft < 0) {
						PrdctList.Empein.setText("0");
					}
				PrdctList.Kulafuin.setText(""+String.format("%.0f",kulafuleft));
					if (kulafuleft < 0) {
						PrdctList.Kulafuin.setText("0");
					}
				PrdctList.PCantonin.setText(""+String.format("%.0f",cantonleft));
					if (cantonleft < 0) {
						PrdctList.PCantonin.setText("0");
					}
				PrdctList.Noodlesin.setText(""+String.format("%.0f",noodlesleft));
					if (noodlesleft < 0) {
						PrdctList.Noodlesin.setText("0");
					}

				PrdctList.Sardinesin.setText(""+String.format("%.0f",sardinesleft));
					if (sardinesleft < 0) {
						PrdctList.Sardinesin.setText("0");
					}
				PrdctList.Tunain.setText(""+String.format("%.0f",tunaleft));
					if (tunaleft < 0) {
						PrdctList.Tunain.setText("0");
					}
				PrdctList.BeefLin.setText(""+String.format("%.0f",beeflleft));
					if (beeflleft < 0) {
						PrdctList.BeefLin.setText("0");
					}
				PrdctList.MeatLin.setText(""+String.format("%.0f",meatlleft));
					if (cnoodlesleft < 0) {
						PrdctList.CNoodlesin.setText("0");
					}
				PrdctList.Sausin.setText(""+String.format("%.0f",sausleft));
					if (sausleft < 0) {
						PrdctList.Sausin.setText("0");
					}
				PrdctList.Ganadorin.setText(""+String.format("%.2f",ganadorleft));
					if (ganadorleft < 0) {
						PrdctList.Ganadorin.setText("0");
					}
				PrdctList.Maisin.setText(""+String.format("%.2f",maisleft));
					if (maisleft < 0) {
						PrdctList.Maisin.setText("0");
					}
				PrdctList.BRicein.setText(""+String.format("%.2f",briceleft));
					if (briceleft < 0) {
						PrdctList.BRicein.setText("0");
					}
					PrdctList.Tomatoin.setText(""+String.format("%.0f",tomatoleft));
					if (tomatoleft < 0) {
						PrdctList.Tomatoin.setText("0");
					}
				PrdctList.Potatoin.setText(""+String.format("%.0f",potatoleft));
					if (potatoleft < 0) {
						PrdctList.Potatoin.setText("0");
					}
				PrdctList.Onionin.setText(""+String.format("%.0f",onionleft));
					if (onionleft < 0) {
						PrdctList.Onionin.setText("0");
					}
				PrdctList.Garlicin.setText(""+String.format("%.0f",garlicleft));
					if (garlicleft < 0) {
						PrdctList.Garlicin.setText("0");
					}
				PrdctList.Bananain.setText(""+String.format("%.0f",bananaleft));
					if (bananaleft < 0) {
						PrdctList.Bananain.setText("0");
					}
				PrdctList.Applein.setText(""+String.format("%.0f",appleleft));
					if (appleleft < 0) {
						PrdctList.Applein.setText("0");
					}
				PrdctList.Ponkanin.setText(""+String.format("%.0f",ponkanleft));
					if (ponkanleft < 0) {
						PrdctList.Ponkanin.setText("0");
					}
				PrdctList.Butanein.setText(""+String.format("%.0f",butaneleft));
					if (butaneleft < 0) {
						PrdctList.Butanein.setText("0");
					}
				PrdctList.Ulingin.setText(""+String.format("%.0f",ulingleft));
					if (ulingleft < 0) {
						PrdctList.Ulingin.setText("0");
					}
				PrdctList.Asinin.setText(""+String.format("%.0f",asinleft));
					if (asinleft < 0) {
						PrdctList.Asinin.setText("0");
					}
				PrdctList.Vetsinin.setText(""+String.format("%.0f",vetsinleft));
					if (vetsinleft < 0) {
						PrdctList.Vetsinin.setText("0");
					}
				PrdctList.Spicein.setText(""+String.format("%.0f",spiceleft));
					if (spiceleft < 0) {
						PrdctList.Spicein.setText("0");
					}
				PrdctList.Vinegarin.setText(""+String.format("%.0f",vinegarleft));
					if (vinegarleft < 0) {
						PrdctList.Vinegarin.setText("0");
					}
				PrdctList.SSaucein.setText(""+String.format("%.0f",ssauceleft));
					if (ssauceleft < 0) {
						PrdctList.SSaucein.setText("0");
					}
				PrdctList.Shampooin.setText(""+String.format("%.0f",shampooleft));
					if (shampooleft < 0) {
						PrdctList.Shampooin.setText("0");
					}
				PrdctList.Soap250in.setText(""+String.format("%.0f",soap250left));
					if (soap250left < 0) {
						PrdctList.Soap250in.setText("0");
					}
				PrdctList.Soap500in.setText(""+String.format("%.0f",soap500left));
					if (soap500left < 0) {
						PrdctList.Soap500in.setText("0");
					}
				PrdctList.FWashin.setText(""+String.format("%.0f",fwashleft));
					if (fwashleft < 0) {
						PrdctList.FWashin.setText("0");
					}
				PrdctList.PWashin.setText(""+String.format("%.0f",pwashleft));
					if (pwashleft < 0) {
						PrdctList.PWashin.setText("0");
					}
				PrdctList.BSoapin.setText(""+String.format("%.0f",bsoapleft));
					if (bsoapleft < 0) {
						PrdctList.BSoapin.setText("0");
					}
				PrdctList.FConditionerin.setText(""+String.format("%.0f",fcondileft));
					if (fcondileft < 0) {
						PrdctList.FConditionerin.setText("0");
					}
				PrdctList.Netbrushin.setText(""+String.format("%.0f",netbrushleft));
					if (netbrushleft < 0) {
						PrdctList.FWashin.setText("0");
					}
					
				//If the item is out of stock
					if (PrdctPOS.ABreadchckbox.isSelected())
					{
						if (breadleft < 0)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.ASopaschckbox.isSelected())
					{
						if (quansopas < sopasleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.JunkfoodsMchckbox.isSelected())
					{
						if (quanjfm < jfmleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.JunkfoodsLchckbox.isSelected())
					{
						if (quanjfl < jflleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.CandiesandSweetschckbox.isSelected())
					{
						if (quancandies < candiesleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.ABsctschckbox.isSelected())
					{
						if (quanbiscuits < biscuitsleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.AChichckbox.isSelected())
					{
						if (quanchi < chileft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}	
					if (PrdctPOS.SMB500chckbox.isSelected())
					{
						if (quansmb500 < smb500left)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.SMB250chckbox.isSelected())
					{
						if (quansmb250 < smb250left)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.SMB1kchckbox.isSelected())
					{
						if (quansmb1k < smb1kleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.TLongneckchckbox.isSelected())
					{
						if (quantlong < tlongleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.TFlatchckbox.isSelected())
					{
						if (quantflat < tflatleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.EmperadorLNchckbox.isSelected())
					{
						if (quanempe < empeleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.Kulafu250chckbox.isSelected())
					{
						if (quankulafu < kulafuleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.ACantonchckbox.isSelected())
					{
						if (quancanton < cantonleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}	
					if (PrdctPOS.ANoodleschckbox.isSelected())
					{
						if (quannoodles < noodlesleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.ACNoodleschckbox.isSelected())
					{
						if (quancnoodles < cnoodlesleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.ACSardineschckbox.isSelected())
					{
						if (quansardines < sardinesleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.ACTunachckbox.isSelected())
					{
						if (quantuna < tunaleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.ABeefLchckbox.isSelected())
					{
						if (quanbeefl < beeflleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.AMeatLchckbox.isSelected())
					{
						if (quanmeatl < meatlleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.ACSaussagechckbox.isSelected())
					{
						if (quansaus < sausleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.Ganadorchckbox.isSelected())
					{
						if (quanganador < ganadorleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.Maischckbox.isSelected())
					{
						if (quanmais < maisleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.BRicechckbox.isSelected())
					{
						if (quanbrice < briceleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.Tomatochckbox.isSelected())
					{
						if (quantomato < tomatoleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.Potatochckbox.isSelected())
					{
						if (quanpotato < potatoleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.Onionchckbox.isSelected())
					{
						if (quanonion < onionleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.Garlicchckbox.isSelected())
					{
						if (quangarlic < garlicleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.Bananachckbox.isSelected())
					{
						if (quanbanana < bananaleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.Applechckbox.isSelected())
					{
						if (quanapple < appleleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.Ponkanchckbox.isSelected())
					{
						if (quanponkan < ponkanleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.Butanechckbox.isSelected())
					{
						if (quanbutane < butaneleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.Ulingchckbox.isSelected())
					{
						if (quanuling < ulingleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.Asinchckbox.isSelected())
					{
						if (quanasin < asinleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.Vetsinchckbox.isSelected())
					{
						if (quanvetsin < vetsinleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.Spicechckbox.isSelected())
					{
						if (quanspice < spiceleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.Vinegarchckbox.isSelected())
					{
						if (quanvinegar < vinegarleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.SSaucechckbox.isSelected())
					{
						if (quanssauce < ssauceleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.Shampoochckbox.isSelected())
					{
						if (quanshampoo < shampooleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.Soap250chckbox.isSelected())
					{
						if (quansoap250 < soap250left)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.Soap500chckbox.isSelected())
					{
						if (quansoap500 < soap500left)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.FacialWashchckbox.isSelected())
					{
						if (quanfwash < fwashleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.PowderedWashchckbox.isSelected())
					{
						if (quanpwash < pwashleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.BarSoapchckbox.isSelected())
					{
						if (quanbsoap < bsoapleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.FConditionerchckbox.isSelected())
					{
						if (quanfcondi < fcondileft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
					if (PrdctPOS.NetBrushchckbox.isSelected())
					{
						if (quannetbrush < netbrushleft)
						{
							Receipt.setText("Item Is Out Of Stock\n\nPlease restock!");
						}
					}
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnNewButton.setBounds(1020, 575, 122, 42);
		contentPane.add(btnNewButton);
		
		// It resets the selection
		
		btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Checboxes
				ABreadchckbox.setSelected(false);
				ASopaschckbox.setSelected(false);
				JunkfoodsMchckbox.setSelected(false);
				JunkfoodsLchckbox.setSelected(false);
				CandiesandSweetschckbox.setSelected(false);
				ABsctschckbox.setSelected(false);
				AChichckbox.setSelected(false);
				SMB500chckbox.setSelected(false);
				SMB250chckbox.setSelected(false);
				SMB1kchckbox.setSelected(false);
				TLongneckchckbox.setSelected(false);
				TFlatchckbox.setSelected(false);
				EmperadorLNchckbox.setSelected(false);
				Kulafu250chckbox.setSelected(false);
				ACantonchckbox.setSelected(false);
				ANoodleschckbox.setSelected(false);
				ACNoodleschckbox.setSelected(false);
				CBeerchckbox.setSelected(false);
				ACSardineschckbox.setSelected(false);
				ABeefLchckbox.setSelected(false);
				AMeatLchckbox.setSelected(false);
				ACSaussagechckbox.setSelected(false);
				BRicechckbox.setSelected(false);
				Maischckbox.setSelected(false);
				Ganadorchckbox.setSelected(false);
				Tomatochckbox.setSelected(false);
				Potatochckbox.setSelected(false);
				Shampoochckbox.setSelected(false);
				Asinchckbox.setSelected(false);
				Vetsinchckbox.setSelected(false);
				Spicechckbox.setSelected(false);
				Vinegarchckbox.setSelected(false);
				SSaucechckbox.setSelected(false);
				Soap250chckbox.setSelected(false);
				Soap500chckbox.setSelected(false);
				FacialWashchckbox.setSelected(false);
				PowderedWashchckbox.setSelected(false);
				BarSoapchckbox.setSelected(false);
				FConditionerchckbox.setSelected(false);
				ACTunachckbox.setSelected(false);
				Onionchckbox.setSelected(false);
				Garlicchckbox.setSelected(false);
				Bananachckbox.setSelected(false);
				Applechckbox.setSelected(false);
				Ponkanchckbox.setSelected(false);
				Butanechckbox.setSelected(false);
				Ulingchckbox.setSelected(false);
				NetBrushchckbox.setSelected(false);
				Receipt.setText("");
				cashin.setEnabled(false);
				cashin.setText("0.00");
				
				//Textfields
				ASopastxtfield.setText("0");
				JunkfoodsMtxtfield.setText("0");
				JunkfoodsLtxtfield.setText("0");
				CandiesandSweetstxtfield.setText("0");
				ABsctstxtfield.setText("0");
				AChitxtfield.setText("0");
				SMB500txtfield.setText("0");
				SMB250txtfield.setText("0");
				SMB1ktxtfield.setText("0");
				CBeertxtfield.setText("0");
				TLongnecktxtfield.setText("0");
				TFlattxtfield.setText("0");
				EmperadorLNtxtfield.setText("0");
				Kulafu250txtfield.setText("0");
				ACantontxtfield.setText("0");
				ANoodlestxtfield.setText("0");
				ACNoodlestxtfield.setText("0");
				ACSardinestxtfield.setText("0");
				ACTunatxtfield.setText("0");
				ABeefLtxtfield.setText("0");
				AMeatLtxtfield.setText("0");
				ACSaussagetxtfield.setText("0");
				Maistxtfield.setText("0");
				BRicetxtfield.setText("0");
				Tomatotxtfield.setText("0");
				Potatotxtfield.setText("0");
				Oniontxtfield.setText("0");
				Garlictxtfield.setText("0");
				Bananatxtfield.setText("0");
				Appletxtfield.setText("0");
				Ponkantxtfield.setText("0");
				Butanetxtfield.setText("0");
				Ulingtxtfield.setText("0");
				Asintxtfield.setText("0");
				Vetsintxtfield.setText("0");
				Spicetxtfield.setText("0");
				Vinegartxtfield.setText("0");
				SSaucetxtfield.setText("0");
				Shampootxtfield.setText("0");
				Soap250txtfield.setText("0");
				Soap500txtfield.setText("0");
				FacialWashtxtfield.setText("0");
				PowderedWashtxtfield.setText("0");
				BarSoaptxtfield.setText("0");
				FConditionertxtfield.setText("0");
				NetBrushtxtfield.setText("0");
				Ganadortxtfield.setText("0");
				ABreadtxtfield.setText("0");
				Breadinv.setText("");
				Sopasinv.setText("");
				JFMinv.setText(" ");
				JFLinv.setText(" ");
				CandSinv.setText(" ");
				Bisctsinv.setText(" ");
				Chiinv.setText(" ");
				SMB500inv.setText(" ");
				SMB250inv.setText(" ");
				SMB1kinv.setText(" ");
				CBeerinv.setText(" ");
				TLongNeckinv.setText(" ");
				TFlatinv.setText(" ");
				Empeinv.setText(" ");
				Kulafuinv.setText(" ");
				PCantoninv.setText(" ");
				Noodlesinv.setText(" ");
				CNoodlesinv.setText(" ");
				Sardinesinv.setText(" ");
				Tunainv.setText(" ");
				BeefLinv.setText(" ");
				MeatLinv.setText(" ");
				Sausinv.setText(" ");
				Ganadorinv.setText(" ");
				Maisinv.setText(" ");
				BRiceinv.setText(" ");
				Tomatoinv.setText(" ");
				Potatoinv.setText(" ");
				Onioninv.setText(" ");
				Garlicinv.setText(" ");
				Bananainv.setText(" ");
				Appleinv.setText(" ");
				Ponkaninv.setText(" ");
				Butaneinv.setText(" ");
				Ulinginv.setText(" ");
				Asininv.setText(" ");
				Vetsininv.setText(" ");
				Spiceinv.setText(" ");
				Vinegarinv.setText(" ");
				SSauceinv.setText(" ");
				Shampooinv.setText(" ");
				Soap250inv.setText(" ");
				Soap500inv.setText(" ");
				FWashinv.setText(" ");
				PWashinv.setText(" ");
				BSoapinv.setText(" ");
				FConditionerinv.setText(" ");
				NetBrushinv.setText(" ");
			}
		});
		btnClear.setBackground(Color.ORANGE);
		btnClear.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnClear.setBounds(1170, 575, 122, 42);
		contentPane.add(btnClear);

		btnReturn = new JButton("RETURN");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnReturn.setBackground(Color.RED);
		btnReturn.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnReturn.setBounds(1103, 627, 122, 42);
		contentPane.add(btnReturn);
		
		Breadinv = new JTextField();
		Breadinv.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Breadinv.setBackground(Color.LIGHT_GRAY);
		Breadinv.setVisible(false);
		Breadinv.setBounds(275, 123, 54, 20);
		contentPane.add(Breadinv);
		Breadinv.setColumns(10);
		
		Sopasinv = new JTextField();
		Sopasinv.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Sopasinv.setBackground(Color.LIGHT_GRAY);
		Sopasinv.setVisible(false);
		Sopasinv.setColumns(10);
		Sopasinv.setBounds(275, 153, 54, 20);
		contentPane.add(Sopasinv);
		
		JFMinv = new JTextField();
		JFMinv.setBackground(Color.LIGHT_GRAY);
		JFMinv.setVisible(false);
		JFMinv.setBounds(275, 181, 54, 20);
		contentPane.add(JFMinv);
		JFMinv.setColumns(10);
		
		JFLinv = new JTextField();
		JFLinv.setVisible(false);
		JFLinv.setColumns(10);
		JFLinv.setBackground(Color.LIGHT_GRAY);
		JFLinv.setBounds(275, 207, 54, 20);
		contentPane.add(JFLinv);
		
		CandSinv = new JTextField();
		CandSinv.setVisible(false);
		CandSinv.setColumns(10);
		CandSinv.setBackground(Color.LIGHT_GRAY);
		CandSinv.setBounds(275, 233, 54, 20);
		contentPane.add(CandSinv);
		
		Bisctsinv = new JTextField();
		Bisctsinv.setVisible(false);
		Bisctsinv.setColumns(10);
		Bisctsinv.setBackground(Color.LIGHT_GRAY);
		Bisctsinv.setBounds(275, 258, 54, 20);
		contentPane.add(Bisctsinv);
		
		Chiinv = new JTextField();
		Chiinv.setVisible(false);
		Chiinv.setColumns(10);
		Chiinv.setBackground(Color.LIGHT_GRAY);
		Chiinv.setBounds(275, 284, 54, 20);
		contentPane.add(Chiinv);
		
		cashin = new JTextField();
		cashin.setEditable(false);
		cashin.setText("0.00");
		cashin.setEnabled(false);
		cashin.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		cashin.setColumns(10);
		cashin.setBounds(1160, 531, 143, 36);
		contentPane.add(cashin);
		
		SMB500inv = new JTextField();
		SMB500inv.setBackground(Color.LIGHT_GRAY);
		SMB500inv.setVisible(false);
		SMB500inv.setBounds(275, 322, 54, 20);
		contentPane.add(SMB500inv);
		SMB500inv.setColumns(10);
		
		SMB250inv = new JTextField();
		SMB250inv.setVisible(false);
		SMB250inv.setColumns(10);
		SMB250inv.setBackground(Color.LIGHT_GRAY);
		SMB250inv.setBounds(275, 352, 54, 20);
		contentPane.add(SMB250inv);
		
		SMB1kinv = new JTextField();
		SMB1kinv.setVisible(false);
		SMB1kinv.setColumns(10);
		SMB1kinv.setBackground(Color.LIGHT_GRAY);
		SMB1kinv.setBounds(275, 380, 54, 20);
		contentPane.add(SMB1kinv);
		
		CBeerinv = new JTextField();
		CBeerinv.setVisible(false);
		CBeerinv.setColumns(10);
		CBeerinv.setBackground(Color.LIGHT_GRAY);
		CBeerinv.setBounds(275, 406, 54, 20);
		contentPane.add(CBeerinv);
		
		TLongNeckinv = new JTextField();
		TLongNeckinv.setVisible(false);
		TLongNeckinv.setColumns(10);
		TLongNeckinv.setBackground(Color.LIGHT_GRAY);
		TLongNeckinv.setBounds(275, 432, 54, 20);
		contentPane.add(TLongNeckinv);
		
		TFlatinv = new JTextField();
		TFlatinv.setVisible(false);
		TFlatinv.setColumns(10);
		TFlatinv.setBackground(Color.LIGHT_GRAY);
		TFlatinv.setBounds(275, 455, 54, 20);
		contentPane.add(TFlatinv);
		
		Empeinv = new JTextField();
		Empeinv.setVisible(false);
		Empeinv.setColumns(10);
		Empeinv.setBackground(Color.LIGHT_GRAY);
		Empeinv.setBounds(275, 483, 54, 20);
		contentPane.add(Empeinv);
		
		Kulafuinv = new JTextField();
		Kulafuinv.setVisible(false);
		Kulafuinv.setColumns(10);
		Kulafuinv.setBackground(Color.LIGHT_GRAY);
		Kulafuinv.setBounds(275, 509, 54, 20);
		contentPane.add(Kulafuinv);
		
		JLabel Cash = new JLabel("CASH:");
		Cash.setFont(new Font("Century Gothic", Font.BOLD, 30));
		Cash.setBounds(1028, 531, 122, 36);
		contentPane.add(Cash);
		
		PCantoninv = new JTextField();
		PCantoninv.setVisible(false);
		PCantoninv.setColumns(10);
		PCantoninv.setBackground(Color.LIGHT_GRAY);
		PCantoninv.setBounds(275, 547, 54, 20);
		contentPane.add(PCantoninv);
		
		Noodlesinv = new JTextField();
		Noodlesinv.setVisible(false);
		Noodlesinv.setBackground(Color.LIGHT_GRAY);
		Noodlesinv.setBounds(275, 577, 54, 20);
		contentPane.add(Noodlesinv);
		Noodlesinv.setColumns(10);
		
		CNoodlesinv = new JTextField();
		CNoodlesinv.setVisible(false);
		CNoodlesinv.setColumns(10);
		CNoodlesinv.setBackground(Color.LIGHT_GRAY);
		CNoodlesinv.setBounds(275, 605, 54, 20);
		contentPane.add(CNoodlesinv);
		
		Sardinesinv = new JTextField();
		Sardinesinv.setVisible(false);
		Sardinesinv.setColumns(10);
		Sardinesinv.setBackground(Color.LIGHT_GRAY);
		Sardinesinv.setBounds(275, 643, 54, 20);
		contentPane.add(Sardinesinv);
		
		Tunainv = new JTextField();
		Tunainv.setVisible(false);
		Tunainv.setColumns(10);
		Tunainv.setBackground(Color.LIGHT_GRAY);
		Tunainv.setBounds(275, 673, 54, 20);
		contentPane.add(Tunainv);
		
		BeefLinv = new JTextField();
		BeefLinv.setVisible(false);
		BeefLinv.setColumns(10);
		BeefLinv.setBackground(Color.LIGHT_GRAY);
		BeefLinv.setBounds(592, 123, 54, 20);
		contentPane.add(BeefLinv);
		
		MeatLinv = new JTextField();
		MeatLinv.setVisible(false);
		MeatLinv.setColumns(10);
		MeatLinv.setBackground(Color.LIGHT_GRAY);
		MeatLinv.setBounds(592, 153, 54, 20);
		contentPane.add(MeatLinv);
		
		Sausinv = new JTextField();
		Sausinv.setVisible(false);
		Sausinv.setColumns(10);
		Sausinv.setBackground(Color.LIGHT_GRAY);
		Sausinv.setBounds(592, 179, 54, 20);
		contentPane.add(Sausinv);
		
		Ganadorinv = new JTextField();
		Ganadorinv.setBackground(Color.LIGHT_GRAY);
		Ganadorinv.setVisible(false);
		Ganadorinv.setBounds(592, 230, 54, 20);
		contentPane.add(Ganadorinv);
		Ganadorinv.setColumns(10);
		
		Maisinv = new JTextField();
		Maisinv.setBackground(Color.LIGHT_GRAY);
		Maisinv.setVisible(false);
		Maisinv.setColumns(10);
		Maisinv.setBounds(591, 256, 54, 20);
		contentPane.add(Maisinv);
		
		BRiceinv = new JTextField();
		BRiceinv.setBackground(Color.LIGHT_GRAY);
		BRiceinv.setVisible(false);
		BRiceinv.setColumns(10);
		BRiceinv.setBounds(592, 282, 54, 20);
		contentPane.add(BRiceinv);
		
		
		Tomatoinv = new JTextField();
		Tomatoinv.setBackground(Color.LIGHT_GRAY);
		Tomatoinv.setVisible(false);
		Tomatoinv.setColumns(10);
		Tomatoinv.setBounds(592, 322, 54, 20);
		contentPane.add(Tomatoinv);
		
		Potatoinv = new JTextField();
		Potatoinv.setBackground(Color.LIGHT_GRAY);
		Potatoinv.setVisible(false);
		Potatoinv.setColumns(10);
		Potatoinv.setBounds(592, 352, 54, 20);
		contentPane.add(Potatoinv);
		
		Onioninv = new JTextField();
		Onioninv.setBackground(Color.LIGHT_GRAY);
		Onioninv.setVisible(false);
		Onioninv.setColumns(10);
		Onioninv.setBounds(592, 378, 54, 20);
		contentPane.add(Onioninv);
		
		Garlicinv = new JTextField();
		Garlicinv.setBackground(Color.LIGHT_GRAY);
		Garlicinv.setVisible(false);
		Garlicinv.setColumns(10);
		Garlicinv.setBounds(592, 404, 54, 20);
		contentPane.add(Garlicinv);
		
		Bananainv = new JTextField();
		Bananainv.setBackground(Color.LIGHT_GRAY);
		Bananainv.setVisible(false);
		Bananainv.setColumns(10);
		Bananainv.setBounds(592, 429, 54, 20);
		contentPane.add(Bananainv);
		
		Appleinv = new JTextField();
		Appleinv.setBackground(Color.LIGHT_GRAY);
		Appleinv.setVisible(false);
		Appleinv.setColumns(10);
		Appleinv.setBounds(592, 455, 54, 20);
		contentPane.add(Appleinv);
		
		Ponkaninv = new JTextField();
		Ponkaninv.setBackground(Color.LIGHT_GRAY);
		Ponkaninv.setVisible(false);
		Ponkaninv.setColumns(10);
		Ponkaninv.setBounds(592, 481, 54, 20);
		contentPane.add(Ponkaninv);
	
		Butaneinv = new JTextField();
		Butaneinv.setBackground(Color.LIGHT_GRAY);
		Butaneinv.setVisible(false);
		Butaneinv.setColumns(10);
		Butaneinv.setBounds(592, 507, 54, 20);
		contentPane.add(Butaneinv);
		
		Ulinginv = new JTextField();
		Ulinginv.setBackground(Color.LIGHT_GRAY);
		Ulinginv.setVisible(false);
		Ulinginv.setColumns(10);
		Ulinginv.setBounds(592, 547, 54, 20);
		contentPane.add(Ulinginv);
		
		Asininv = new JTextField();
		Asininv.setBackground(Color.LIGHT_GRAY);
		Asininv.setVisible(false);
		Asininv.setColumns(10);
		Asininv.setBounds(592, 590, 54, 20);
		contentPane.add(Asininv);
		
		Vetsininv = new JTextField();
		Vetsininv.setBackground(Color.LIGHT_GRAY);
		Vetsininv.setVisible(false);
		Vetsininv.setColumns(10);
		Vetsininv.setBounds(592, 625, 54, 20);
		contentPane.add(Vetsininv);
		
		Spiceinv = new JTextField();
		Spiceinv.setBackground(Color.LIGHT_GRAY);
		Spiceinv.setVisible(false);
		Spiceinv.setColumns(10);
		Spiceinv.setBounds(592, 651, 54, 20);
		contentPane.add(Spiceinv);
		
		Vinegarinv = new JTextField();
		Vinegarinv.setVisible(false);
		Vinegarinv.setBackground(Color.LIGHT_GRAY);
		Vinegarinv.setBounds(920, 123, 54, 20);
		contentPane.add(Vinegarinv);
		Vinegarinv.setColumns(10);
		
		SSauceinv = new JTextField();
		SSauceinv.setVisible(false);
		SSauceinv.setColumns(10);
		SSauceinv.setBackground(Color.LIGHT_GRAY);
		SSauceinv.setBounds(910, 153, 54, 20);
		contentPane.add(SSauceinv);
		
		Soap250inv = new JTextField();
		Soap250inv.setVisible(false);
		Soap250inv.setColumns(10);
		Soap250inv.setBackground(Color.LIGHT_GRAY);
		Soap250inv.setBounds(910, 230, 54, 20);
		contentPane.add(Soap250inv);
		
		Soap500inv = new JTextField();
		Soap500inv.setVisible(false);
		Soap500inv.setColumns(10);
		Soap500inv.setBackground(Color.LIGHT_GRAY);
		Soap500inv.setBounds(910, 256, 54, 20);
		contentPane.add(Soap500inv);
		
		FWashinv = new JTextField();
		FWashinv.setVisible(false);
		FWashinv.setColumns(10);
		FWashinv.setBackground(Color.LIGHT_GRAY);
		FWashinv.setBounds(910, 282, 54, 20);
		contentPane.add(FWashinv);
		
		Shampooinv = new JTextField();
		Shampooinv.setVisible(false);
		Shampooinv.setColumns(10);
		Shampooinv.setBackground(Color.LIGHT_GRAY);
		Shampooinv.setBounds(910, 205, 54, 20);
		contentPane.add(Shampooinv);
		
		PWashinv = new JTextField();
		PWashinv.setVisible(false);
		PWashinv.setColumns(10);
		PWashinv.setBackground(Color.LIGHT_GRAY);
		PWashinv.setBounds(910, 322, 54, 20);
		contentPane.add(PWashinv);
		
		BSoapinv = new JTextField();
		BSoapinv.setVisible(false);
		BSoapinv.setColumns(10);
		BSoapinv.setBackground(Color.LIGHT_GRAY);
		BSoapinv.setBounds(910, 352, 54, 20);
		contentPane.add(BSoapinv);
		
		FConditionerinv = new JTextField();
		FConditionerinv.setVisible(false);
		FConditionerinv.setColumns(10);
		FConditionerinv.setBackground(Color.LIGHT_GRAY);
		FConditionerinv.setBounds(910, 378, 54, 20);
		contentPane.add(FConditionerinv);
		
		NetBrushinv = new JTextField();
		NetBrushinv.setVisible(false);
		NetBrushinv.setColumns(10);
		NetBrushinv.setBackground(Color.LIGHT_GRAY);
		NetBrushinv.setBounds(910, 404, 54, 20);
		contentPane.add(NetBrushinv);
		
		JLabel pesosign = new JLabel("P");
		pesosign.setFont(new Font("Century Gothic", Font.BOLD, 30));
		pesosign.setBounds(1131, 531, 25, 36);
		contentPane.add(pesosign);
		
		lblNewLabel = new JLabel("P");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel.setBounds(249, 126, 11, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("P");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(249, 156, 11, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("P");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(249, 182, 11, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("P");
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(249, 208, 11, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("P");
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(249, 233, 11, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("P");
		lblNewLabel_5.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(249, 259, 11, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("P");
		lblNewLabel_6.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(249, 285, 11, 14);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("P");
		lblNewLabel_7.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(249, 325, 11, 14);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("P");
		lblNewLabel_8.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(249, 355, 11, 14);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("P");
		lblNewLabel_9.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_9.setBounds(249, 381, 11, 14);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("P");
		lblNewLabel_10.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_10.setBounds(249, 407, 11, 14);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("P");
		lblNewLabel_11.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_11.setBounds(249, 432, 11, 14);
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("P");
		lblNewLabel_12.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_12.setBounds(249, 458, 11, 14);
		contentPane.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("P");
		lblNewLabel_13.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_13.setBounds(249, 484, 11, 14);
		contentPane.add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("P");
		lblNewLabel_14.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_14.setBounds(249, 510, 11, 14);
		contentPane.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("P");
		lblNewLabel_15.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_15.setBounds(249, 550, 11, 14);
		contentPane.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("P");
		lblNewLabel_16.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_16.setBounds(249, 580, 11, 14);
		contentPane.add(lblNewLabel_16);
		
		lblNewLabel_17 = new JLabel("P");
		lblNewLabel_17.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_17.setBounds(249, 606, 11, 14);
		contentPane.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("P");
		lblNewLabel_18.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_18.setBounds(249, 646, 11, 14);
		contentPane.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("P");
		lblNewLabel_19.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_19.setBounds(249, 676, 11, 14);
		contentPane.add(lblNewLabel_19);
		
		lblNewLabel_20 = new JLabel("P");
		lblNewLabel_20.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_20.setBounds(566, 126, 11, 14);
		contentPane.add(lblNewLabel_20);
		
		lblNewLabel_21 = new JLabel("P");
		lblNewLabel_21.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_21.setBounds(566, 156, 11, 14);
		contentPane.add(lblNewLabel_21);
		
		lblNewLabel_22 = new JLabel("P");
		lblNewLabel_22.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_22.setBounds(566, 182, 11, 14);
		contentPane.add(lblNewLabel_22);
		
		lblNewLabel_23 = new JLabel("P");
		lblNewLabel_23.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_23.setBounds(566, 254, 11, 14);
		contentPane.add(lblNewLabel_23);
		
		lblNewLabel_24 = new JLabel("P");
		lblNewLabel_24.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_24.setBounds(566, 325, 11, 14);
		contentPane.add(lblNewLabel_24);
		
		lblNewLabel_25 = new JLabel("P");
		lblNewLabel_25.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_25.setBounds(566, 280, 11, 14);
		contentPane.add(lblNewLabel_25);
		
		lblNewLabel_26 = new JLabel("P");
		lblNewLabel_26.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_26.setBounds(566, 355, 11, 14);
		contentPane.add(lblNewLabel_26);
		
		lblNewLabel_27 = new JLabel("P");
		lblNewLabel_27.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_27.setBounds(566, 222, 11, 14);
		contentPane.add(lblNewLabel_27);
		
		lblNewLabel_28 = new JLabel("P");
		lblNewLabel_28.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_28.setBounds(566, 381, 11, 14);
		contentPane.add(lblNewLabel_28);
		
		lblNewLabel_29 = new JLabel("P");
		lblNewLabel_29.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_29.setBounds(566, 407, 11, 14);
		contentPane.add(lblNewLabel_29);
		
		lblNewLabel_30 = new JLabel("P");
		lblNewLabel_30.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_30.setBounds(566, 432, 11, 14);
		contentPane.add(lblNewLabel_30);
		
		lblNewLabel_31 = new JLabel("P");
		lblNewLabel_31.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_31.setBounds(566, 458, 11, 14);
		contentPane.add(lblNewLabel_31);
		
		lblNewLabel_32 = new JLabel("P");
		lblNewLabel_32.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_32.setBounds(566, 484, 11, 14);
		contentPane.add(lblNewLabel_32);
		
		lblNewLabel_33 = new JLabel("P");
		lblNewLabel_33.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_33.setBounds(566, 514, 11, 14);
		contentPane.add(lblNewLabel_33);
		
		lblNewLabel_34 = new JLabel("P");
		lblNewLabel_34.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_34.setBounds(566, 550, 11, 14);
		contentPane.add(lblNewLabel_34);
		
		lblNewLabel_35 = new JLabel("P");
		lblNewLabel_35.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_35.setBounds(566, 593, 11, 14);
		contentPane.add(lblNewLabel_35);
		
		lblNewLabel_36 = new JLabel("P");
		lblNewLabel_36.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_36.setBounds(566, 628, 11, 14);
		contentPane.add(lblNewLabel_36);
		
		lblNewLabel_37 = new JLabel("P");
		lblNewLabel_37.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_37.setBounds(566, 653, 11, 14);
		contentPane.add(lblNewLabel_37);
		
		lblNewLabel_38 = new JLabel("P");
		lblNewLabel_38.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_38.setBounds(884, 126, 11, 14);
		contentPane.add(lblNewLabel_38);
		
		lblNewLabel_39 = new JLabel("P");
		lblNewLabel_39.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_39.setBounds(884, 151, 11, 14);
		contentPane.add(lblNewLabel_39);
		
		lblNewLabel_40 = new JLabel("P");
		lblNewLabel_40.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_40.setBounds(884, 203, 11, 14);
		contentPane.add(lblNewLabel_40);
		
		lblNewLabel_41 = new JLabel("P");
		lblNewLabel_41.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_41.setBounds(884, 233, 11, 14);
		contentPane.add(lblNewLabel_41);
		
		lblNewLabel_42 = new JLabel("P");
		lblNewLabel_42.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_42.setBounds(884, 259, 11, 14);
		contentPane.add(lblNewLabel_42);
		
		lblNewLabel_43 = new JLabel("P");
		lblNewLabel_43.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_43.setBounds(884, 285, 11, 14);
		contentPane.add(lblNewLabel_43);
		
		lblNewLabel_44 = new JLabel("P");
		lblNewLabel_44.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_44.setBounds(884, 325, 11, 14);
		contentPane.add(lblNewLabel_44);
		
		lblNewLabel_45 = new JLabel("P");
		lblNewLabel_45.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_45.setBounds(884, 355, 11, 14);
		contentPane.add(lblNewLabel_45);
		
		lblNewLabel_46 = new JLabel("P");
		lblNewLabel_46.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_46.setBounds(884, 381, 11, 14);
		contentPane.add(lblNewLabel_46);
		
		lblNewLabel_47 = new JLabel("P");
		lblNewLabel_47.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_47.setBounds(884, 407, 11, 14);
		contentPane.add(lblNewLabel_47);
		
				// Item Listener
		ItemListener itemListener = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				ABreadtxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		ABreadchckbox.addItemListener(itemListener);

		ItemListener itemListener2 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				ASopastxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		ASopaschckbox.addItemListener(itemListener2);

		ItemListener itemListener3 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				JunkfoodsMtxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		JunkfoodsMchckbox.addItemListener(itemListener3);

		ItemListener itemListener4 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				JunkfoodsLtxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		JunkfoodsLchckbox.addItemListener(itemListener4);

		ItemListener itemListener5 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				CandiesandSweetstxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		CandiesandSweetschckbox.addItemListener(itemListener5);

		ItemListener itemListener6 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				ABsctstxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		ABsctschckbox.addItemListener(itemListener6);

		ItemListener itemListener7 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				AChitxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		AChichckbox.addItemListener(itemListener7);

		ItemListener itemListener8 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				SMB500txtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		SMB500chckbox.addItemListener(itemListener8);

		ItemListener itemListener9 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				SMB250txtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		SMB250chckbox.addItemListener(itemListener9);

		ItemListener itemListener10 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				SMB1ktxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		SMB1kchckbox.addItemListener(itemListener10);

		ItemListener itemListener11 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				CBeertxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		CBeerchckbox.addItemListener(itemListener11);

		ItemListener itemListener12 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				TLongnecktxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		TLongneckchckbox.addItemListener(itemListener12);

		ItemListener itemListener13 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				TFlattxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		TFlatchckbox.addItemListener(itemListener13);

		ItemListener itemListener14 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				EmperadorLNtxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		EmperadorLNchckbox.addItemListener(itemListener14);

		ItemListener itemListener15 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Kulafu250txtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Kulafu250chckbox.addItemListener(itemListener15);

		ItemListener itemListener16 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				ACantontxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		ACantonchckbox.addItemListener(itemListener16);

		ItemListener itemListener17 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				ANoodlestxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		ANoodleschckbox.addItemListener(itemListener17);

		ItemListener itemListener18 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				ACNoodlestxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		ACNoodleschckbox.addItemListener(itemListener18);

		ItemListener itemListener19 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				ACSardinestxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		ACSardineschckbox.addItemListener(itemListener19);

		ItemListener itemListener20 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				ACTunatxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		ACTunachckbox.addItemListener(itemListener20);

		ItemListener itemListener21 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				ABeefLtxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		ABeefLchckbox.addItemListener(itemListener21);

		ItemListener itemListener22 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				AMeatLtxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		AMeatLchckbox.addItemListener(itemListener22);

		ItemListener itemListener23 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				ACSaussagetxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		ACSaussagechckbox.addItemListener(itemListener23);

		ItemListener itemListener24 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Ganadortxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Ganadorchckbox.addItemListener(itemListener24);

		ItemListener itemListener25 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Maistxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Maischckbox.addItemListener(itemListener25);

		ItemListener itemListener26 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				BRicetxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		BRicechckbox.addItemListener(itemListener26);

		ItemListener itemListener27 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Tomatotxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Tomatochckbox.addItemListener(itemListener27);

		ItemListener itemListener28 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Potatotxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Potatochckbox.addItemListener(itemListener28);
		
		ItemListener itemListener29 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Oniontxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Onionchckbox.addItemListener(itemListener29);
		
		ItemListener itemListener30 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Oniontxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Onionchckbox.addItemListener(itemListener30);
		
		ItemListener itemListener31 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Garlictxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Garlicchckbox.addItemListener(itemListener31);
		
		ItemListener itemListener32 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Bananatxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Bananachckbox.addItemListener(itemListener32);
		
		ItemListener itemListener33 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Appletxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Applechckbox.addItemListener(itemListener33);
		
		ItemListener itemListener34 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Ponkantxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Ponkanchckbox.addItemListener(itemListener34);
		
		ItemListener itemListener35 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Butanetxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Butanechckbox.addItemListener(itemListener35);
		
		ItemListener itemListener36 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Ulingtxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Ulingchckbox.addItemListener(itemListener36);
		
		ItemListener itemListener37 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Asintxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Asinchckbox.addItemListener(itemListener37);
		
		ItemListener itemListener38 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Vetsintxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Vetsinchckbox.addItemListener(itemListener38);
		
		ItemListener itemListener39 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Spicetxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Spicechckbox.addItemListener(itemListener39);
		
		ItemListener itemListener40 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Vinegartxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Vinegarchckbox.addItemListener(itemListener40);
		
		ItemListener itemListener41 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				SSaucetxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		SSaucechckbox.addItemListener(itemListener41);
		
		ItemListener itemListener42 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Shampootxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Shampoochckbox.addItemListener(itemListener42);
		
		ItemListener itemListener43 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Soap250txtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Soap250chckbox.addItemListener(itemListener43);
		
		ItemListener itemListener44 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Soap500txtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		Soap500chckbox.addItemListener(itemListener44);
		
		ItemListener itemListener45 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				FacialWashtxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		FacialWashchckbox.addItemListener(itemListener45);
		
		ItemListener itemListener46 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				PowderedWashtxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		PowderedWashchckbox.addItemListener(itemListener46);
		
		ItemListener itemListener47 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				BarSoaptxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		BarSoapchckbox.addItemListener(itemListener47);
		
		ItemListener itemListener48 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				FConditionertxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		FConditionerchckbox.addItemListener(itemListener48);
		
		ItemListener itemListener49 = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				NetBrushtxtfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED);

			}
		};
		NetBrushchckbox.addItemListener(itemListener49);
	}
}

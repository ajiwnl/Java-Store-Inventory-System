package Inventory;


import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class PrdctList extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JButton btnRefresh;
	private static JPanel UpperPanel;
	private static JFrame frame;
	private static JPanel PMPanel;
	private static JLabel ProductMlbl;
	private static JLabel Storetitle;
	private static JLabel Icon;
	private static JLabel Snackerslbl; 
	private static JLabel Stockslbl_1;
	public static JLabel Breadin;
	private static JLabel BreadPM;
	private static JLabel SopasPM;
	public static JLabel Sopasin;
	private static JLabel JFMPM;
	public static JLabel JFMin;
	private static JLabel JFLPM;
	public static JLabel JFLin;
	private static JLabel CandiesandSweets;
	public static JLabel CandSin;
	private static JLabel BsctsPM;
	public static JLabel Bsctsin;
	private static JLabel ChiPM;
	public static JLabel Chiin;
	private static JLabel Liquorsslbl;
	private static JLabel Stockslbl_2;
	private static JLabel SMB500PM;
	private static JLabel SMB250PM; 
	private static JLabel SMB1kPM;
	private static JLabel CBeerPM; 
	private static JLabel TLongNPM; 
	private static JLabel TFlatPM;
	private static JLabel EmpePM;
	private static JLabel KulafuPM;
	public static JLabel SMB500in;
	public static JLabel SMB250in; 
	public static JLabel SMB1kin;
	public static JLabel CBeerin; 
	public static JLabel TLongNin; 
	public static JLabel TFlatin;
	public static JLabel Empein;
	public static JLabel Kulafuin;
	private static JLabel InstantNoodleslbl;
	private static JLabel Stockslbl_3;
	private static JLabel PCantonPM;
	private static JLabel NoodlesPM;
	private static JLabel CNoodlesPM;
	public static JLabel PCantonin;
	public static JLabel Noodlesin;
	public static JLabel CNoodlesin;
	private static JLabel CannedGoodslbl;
	private static JLabel Stockslbl_4;
	private static JLabel SardinesPM;
	private static JLabel TunaPM;
	public static JLabel Sardinesin;
	public static JLabel Tunain;
	private static JLabel CannedGoodslbl_4_1;
	private static JLabel Stockslbl_4_1;
	private static JLabel BeefLPM;
	private static JLabel MeatLPM;
	private static JLabel SausPM;
	public static JLabel BeefLin;
	public static JLabel MeatLin;
	public static JLabel Sausin;
	private static JLabel Ricelbl;
	private static JLabel Stockslbl_5;
	private static JLabel GanadorPM;
	private static JLabel MaisPM;
	private static JLabel BRicePM;
	public static JLabel Ganadorin;
	public static JLabel Maisin;
	public static JLabel BRicein;
	private static JLabel Kgslbl;
	private static JLabel Kgslbl_1;
	private static JLabel Kgslbl_2;
	private static JLabel VandFlbl;
	private static JLabel Stockslbl_6;
	private static JLabel TomatoPM;
	private static JLabel PotatoPM;
	private static JLabel OnionPM;
	private static JLabel GarlicPM;
	private static JLabel BananaPM;
	private static JLabel ApplePM;
	private static JLabel PonkanPM;
	public static JLabel Tomatoin;
	public static JLabel Potatoin;
	public static JLabel Onionin;
	public static JLabel Garlicin;
	public static JLabel Bananain;
	public static JLabel Applein;
	public static JLabel Ponkanin;
	private static JLabel Otherslbl;
	private static JLabel Stockslbl_7;
	private static JLabel ButanePM;
	private static JLabel UlingPM;
	public static JLabel Butanein;
	public static JLabel Ulingin;
	private static JLabel Spiceslbl;
	private static JLabel Stockslbl_8;
	private static JLabel AsinPM;
	private static JLabel VetsinPM;
	private static JLabel SpicePM;
	public static JLabel Asinin;
	public static JLabel Vetsinin;
	public static JLabel Spicein;
	private static JLabel Spiceslbl_1;
	private static JLabel Stockslbl_8_1;
	private static JLabel VinegarPM;
	private static JLabel SSaucePM;
	public static JLabel Vinegarin;
	public static JLabel SSaucein;
	private static JLabel BatheElbl;
	private static JLabel Stockslbl_9;
	private static JLabel ShampooPM;
	private static JLabel Soap250PM;
	private static JLabel Soap500PM;
	private static JLabel FWashPM;
	public static JLabel Shampooin;
	public static JLabel Soap250in;
	public static JLabel Soap500in;
	public static JLabel FWashin;
	private static JLabel Laundrylbl;
	private static JLabel Stockslbl_10;
	private static JLabel PWashPM;
	private static JLabel BSoapPM;
	private static JLabel FConditionerPM;
	private static JLabel NetbrushPM;
	public static JLabel PWashin;
	public static JLabel BSoapin;
	public static JLabel FConditionerin;
	public static JLabel Netbrushin;
	private JButton btnCashier;
	private JButton btnReturn;
	private JLabel lblPc;
	private JLabel lblPc_1;
	private JLabel lblPc_2;
	private JLabel lblPc_3;
	private JLabel lblPc_4;
	private JLabel lblPc_5;
	private JLabel lblPc_6;
	private JLabel lblPc_7;
	private JLabel lblPc_8;
	private JLabel lblPk;
	private JLabel lblPk_1;
	private JLabel lblPk_2;
	private JLabel lblPk_3;
	private JLabel lblPk_4;
	private JLabel lblPk_5;
	private JLabel lblPk_6;
	private JLabel lblPk_7;
	private JLabel lblPk_8;
	private JLabel lblPk_9;
	private JLabel lblBar;
	private JLabel lblPk_10;
	private JLabel lblPc_9;
	private JLabel lblBtl_2;
	private JLabel lblBtl_3;
	private JLabel lblBtl_4;
	private JLabel lblBtl_5;
	private JLabel lblBtl_6;
	private JLabel lblBtl_7;
	private JLabel lblBtl_8;
	private JLabel lblCan;
	private JLabel lblCan_1;
	private JLabel lblCan_2;
	private JLabel lblCan_3;
	private JLabel lblCan_4;
	private JLabel lblCan_5;
	private JLabel lblPk_13;
	private JLabel lblPk_14;
	private JLabel lblPk_15;
	private JLabel lblPk_16;
	private JLabel lblPk_17;
	private JLabel lblPk_18;
	private JLabel lblPk_19;
	private JLabel lblPk_20;
	private JLabel lblPk_21;
	private JLabel lblPk_22;
	private JLabel lblNewLabel_19;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new PrdctList();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setBounds(150, 20, 1010, 700);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrdctList() {
		setUndecorated(true);
		setResizable(false);
		setForeground(Color.GREEN);
		setBackground(Color.GREEN);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(150, 20, 1010, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		UpperPanel = new JPanel();
		UpperPanel.setBackground(Color.GREEN);
		UpperPanel.setBounds(0, 0, 1010, 96);
		contentPane.add(UpperPanel);
		UpperPanel.setLayout(null);
		
		Storetitle = new JLabel("NENE's RETAIL STORE");
		Storetitle.setBounds(10, 0, 695, 53);
		UpperPanel.add(Storetitle);
		Storetitle.setForeground(Color.WHITE);
		Storetitle.setFont(new Font("Century Gothic", Font.BOLD, 60));
		Storetitle.setBackground(Color.BLACK);
		
		ProductMlbl = new JLabel("PRODUCT MONITORING");
		ProductMlbl.setForeground(Color.WHITE);
		ProductMlbl.setFont(new Font("Century Gothic", Font.BOLD, 40));
		ProductMlbl.setBounds(10, 43, 678, 53);
		UpperPanel.add(ProductMlbl);
		
		Icon = new JLabel("");
		Icon.setBounds(870, 0, 140, 96);
		UpperPanel.add(Icon);
		
		ImageIcon mainframeimg07 = new ImageIcon ("images/cart.png");
		Icon.setIcon(mainframeimg07);
		
		PMPanel = new JPanel();
		PMPanel.setBackground(Color.LIGHT_GRAY);
		PMPanel.setBounds(0, 96, 1219, 604);
		contentPane.add(PMPanel);
		PMPanel.setLayout(null);
		
		Snackerslbl = new JLabel("Snackers");
		Snackerslbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Snackerslbl.setBounds(10, 11, 71, 14);
		PMPanel.add(Snackerslbl);
		
		Stockslbl_1 = new JLabel("Stocks");
		Stockslbl_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Stockslbl_1.setBounds(179, 11, 71, 14);
		PMPanel.add(Stockslbl_1);
		
		
		BreadPM = new JLabel("Bread");
		BreadPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BreadPM.setBackground(Color.LIGHT_GRAY);
		BreadPM.setBounds(10, 36, 71, 14);
		PMPanel.add(BreadPM);
		
		Breadin = new JLabel("100");
		Breadin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Breadin.setBounds(189, 36, 46, 14);
		PMPanel.add(Breadin);
		
		SopasPM = new JLabel("Sopas");
		SopasPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SopasPM.setBackground(Color.LIGHT_GRAY);
		SopasPM.setBounds(10, 64, 71, 14);
		PMPanel.add(SopasPM);
		
		Sopasin = new JLabel("100");
		Sopasin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Sopasin.setBounds(189, 64, 46, 14);
		PMPanel.add(Sopasin);
		
		JFMPM = new JLabel("Junkfoods (M)");
		JFMPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		JFMPM.setBackground(Color.LIGHT_GRAY);
		JFMPM.setBounds(10, 89, 81, 14);
		PMPanel.add(JFMPM);
		
		JFMin = new JLabel("100");
		JFMin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		JFMin.setBounds(189, 90, 46, 14);
		PMPanel.add(JFMin);
		
		JFLPM = new JLabel("Junkfoods (L)");
		JFLPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		JFLPM.setBackground(Color.LIGHT_GRAY);
		JFLPM.setBounds(10, 114, 81, 14);
		PMPanel.add(JFLPM);
		
		JFLin = new JLabel("100");
		JFLin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		JFLin.setBounds(189, 115, 46, 14);
		PMPanel.add(JFLin);
		
		CandiesandSweets = new JLabel("Candies and Sweets");
		CandiesandSweets.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		CandiesandSweets.setBackground(Color.LIGHT_GRAY);
		CandiesandSweets.setBounds(10, 139, 122, 14);
		PMPanel.add(CandiesandSweets);
		
		CandSin = new JLabel("100");
		CandSin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		CandSin.setBounds(189, 140, 46, 14);
		PMPanel.add(CandSin);
		
		BsctsPM = new JLabel("Biscuits");
		BsctsPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BsctsPM.setBackground(Color.LIGHT_GRAY);
		BsctsPM.setBounds(10, 164, 122, 14);
		PMPanel.add(BsctsPM);
		
		Bsctsin = new JLabel("100");
		Bsctsin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Bsctsin.setBounds(189, 165, 46, 14);
		PMPanel.add(Bsctsin);
		
		ChiPM = new JLabel("Chichiryas");
		ChiPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ChiPM.setBackground(Color.LIGHT_GRAY);
		ChiPM.setBounds(10, 189, 122, 14);
		PMPanel.add(ChiPM);
		
		Chiin = new JLabel("100");
		Chiin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Chiin.setBounds(189, 190, 46, 14);
		PMPanel.add(Chiin);
		
		Liquorsslbl = new JLabel("Liquors");
		Liquorsslbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Liquorsslbl.setBounds(10, 214, 71, 14);
		PMPanel.add(Liquorsslbl);
		
		Stockslbl_2 = new JLabel("Stocks");
		Stockslbl_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Stockslbl_2.setBounds(179, 215, 71, 14);
		PMPanel.add(Stockslbl_2);
		
		SMB500PM = new JLabel("SMB Product 500mL");
		SMB500PM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SMB500PM.setBackground(Color.LIGHT_GRAY);
		SMB500PM.setBounds(10, 239, 122, 14);
		PMPanel.add(SMB500PM);
		
		SMB250PM = new JLabel("SMB Product 250mL");
		SMB250PM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SMB250PM.setBackground(Color.LIGHT_GRAY);
		SMB250PM.setBounds(10, 264, 122, 14);
		PMPanel.add(SMB250PM);
		
		SMB1kPM = new JLabel("SMB Product 1000mL");
		SMB1kPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SMB1kPM.setBackground(Color.LIGHT_GRAY);
		SMB1kPM.setBounds(10, 289, 122, 14);
		PMPanel.add(SMB1kPM);
		
		CBeerPM = new JLabel("Canned Beer");
		CBeerPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		CBeerPM.setBackground(Color.LIGHT_GRAY);
		CBeerPM.setBounds(10, 314, 122, 14);
		PMPanel.add(CBeerPM);
		
		TLongNPM = new JLabel("Tanduay 5YRS/65 Longneck");
		TLongNPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		TLongNPM.setBackground(Color.LIGHT_GRAY);
		TLongNPM.setBounds(10, 339, 150, 14);
		PMPanel.add(TLongNPM);
		
		TFlatPM = new JLabel("Tanduay 5YRS/65 Flat");
		TFlatPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		TFlatPM.setBackground(Color.LIGHT_GRAY);
		TFlatPM.setBounds(10, 364, 122, 14);
		PMPanel.add(TFlatPM);
		
		EmpePM = new JLabel("Emperador Longneck");
		EmpePM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		EmpePM.setBackground(Color.LIGHT_GRAY);
		EmpePM.setBounds(10, 389, 122, 14);
		PMPanel.add(EmpePM);
		
		KulafuPM = new JLabel("Kulafu250");
		KulafuPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		KulafuPM.setBackground(Color.LIGHT_GRAY);
		KulafuPM.setBounds(10, 414, 122, 14);
		PMPanel.add(KulafuPM);
		
		SMB500in = new JLabel("100");
		SMB500in.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SMB500in.setBounds(189, 240, 46, 14);
		PMPanel.add(SMB500in);
		
		SMB250in = new JLabel("100");
		SMB250in.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SMB250in.setBounds(189, 265, 46, 14);
		PMPanel.add(SMB250in);
		
		SMB1kin = new JLabel("100");
		SMB1kin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SMB1kin.setBounds(189, 290, 46, 14);
		PMPanel.add(SMB1kin);
		
		CBeerin = new JLabel("100");
		CBeerin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		CBeerin.setBounds(189, 315, 46, 14);
		PMPanel.add(CBeerin);
		
		TLongNin = new JLabel("100");
		TLongNin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		TLongNin.setBounds(189, 340, 46, 14);
		PMPanel.add(TLongNin);
		
		TFlatin = new JLabel("100");
		TFlatin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		TFlatin.setBounds(189, 365, 46, 14);
		PMPanel.add(TFlatin);
		
		Empein = new JLabel("100");
		Empein.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Empein.setBounds(189, 390, 46, 14);
		PMPanel.add(Empein);
		
		Kulafuin = new JLabel("100");
		Kulafuin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Kulafuin.setBounds(189, 415, 46, 14);
		PMPanel.add(Kulafuin);
		
		InstantNoodleslbl = new JLabel("Instant Noodles");
		InstantNoodleslbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		InstantNoodleslbl.setBounds(10, 439, 122, 14);
		PMPanel.add(InstantNoodleslbl);
		
		Stockslbl_3 = new JLabel("Stocks");
		Stockslbl_3.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Stockslbl_3.setBounds(179, 440, 71, 14);
		PMPanel.add(Stockslbl_3);
		
		PCantonPM = new JLabel("LuckyMe Pancit Canton");
		PCantonPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		PCantonPM.setBackground(Color.LIGHT_GRAY);
		PCantonPM.setBounds(10, 464, 150, 14);
		PMPanel.add(PCantonPM);
		
		NoodlesPM = new JLabel("LuckyMe Noodles");
		NoodlesPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		NoodlesPM.setBackground(Color.LIGHT_GRAY);
		NoodlesPM.setBounds(10, 489, 150, 14);
		PMPanel.add(NoodlesPM);
		
		CNoodlesPM = new JLabel("Cup Noodles");
		CNoodlesPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		CNoodlesPM.setBackground(Color.LIGHT_GRAY);
		CNoodlesPM.setBounds(10, 514, 150, 14);
		PMPanel.add(CNoodlesPM);
		
		PCantonin = new JLabel("100");
		PCantonin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		PCantonin.setBounds(189, 465, 46, 14);
		PMPanel.add(PCantonin);
		
		Noodlesin = new JLabel("100");
		Noodlesin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Noodlesin.setBounds(189, 490, 46, 14);
		PMPanel.add(Noodlesin);
		
		CNoodlesin = new JLabel("100");
		CNoodlesin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		CNoodlesin.setBounds(189, 515, 46, 14);
		PMPanel.add(CNoodlesin);
	
		CannedGoodslbl = new JLabel("Canned Goods");
		CannedGoodslbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		CannedGoodslbl.setBounds(10, 539, 104, 14);
		PMPanel.add(CannedGoodslbl);
		
		Stockslbl_4 = new JLabel("Stocks");
		Stockslbl_4.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Stockslbl_4.setBounds(179, 540, 71, 14);
		PMPanel.add(Stockslbl_4);
		
		SardinesPM = new JLabel("Canned Sardines");
		SardinesPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SardinesPM.setBackground(Color.LIGHT_GRAY);
		SardinesPM.setBounds(10, 564, 150, 14);
		PMPanel.add(SardinesPM);
		
		TunaPM = new JLabel("Canned Tuna (M)");
		TunaPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		TunaPM.setBackground(Color.LIGHT_GRAY);
		TunaPM.setBounds(10, 589, 150, 14);
		PMPanel.add(TunaPM);
		
		Sardinesin = new JLabel("100");
		Sardinesin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Sardinesin.setBounds(189, 565, 46, 14);
		PMPanel.add(Sardinesin);
		
		Tunain = new JLabel("100");
		Tunain.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Tunain.setBounds(189, 590, 46, 14);
		PMPanel.add(Tunain);
		
		CannedGoodslbl_4_1 = new JLabel("Canned Goods");
		CannedGoodslbl_4_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		CannedGoodslbl_4_1.setBounds(341, 11, 104, 14);
		PMPanel.add(CannedGoodslbl_4_1);
		
		Stockslbl_4_1 = new JLabel("Stocks");
		Stockslbl_4_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Stockslbl_4_1.setBounds(512, 11, 71, 14);
		PMPanel.add(Stockslbl_4_1);
		
		BeefLPM = new JLabel("Canned Beefloaf (M)");
		BeefLPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BeefLPM.setBackground(Color.LIGHT_GRAY);
		BeefLPM.setBounds(341, 37, 150, 14);
		PMPanel.add(BeefLPM);
		
		MeatLPM = new JLabel("Canned Meatloaf(M)");
		MeatLPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		MeatLPM.setBackground(Color.LIGHT_GRAY);
		MeatLPM.setBounds(341, 65, 150, 14);
		PMPanel.add(MeatLPM);
		
		SausPM = new JLabel("Canned Tuna (M)");
		SausPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SausPM.setBackground(Color.LIGHT_GRAY);
		SausPM.setBounds(341, 90, 150, 14);
		PMPanel.add(SausPM);
		
		BeefLin = new JLabel("100");
		BeefLin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		BeefLin.setBounds(522, 36, 46, 14);
		PMPanel.add(BeefLin);
		
		MeatLin = new JLabel("100");
		MeatLin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		MeatLin.setBounds(522, 64, 46, 14);
		PMPanel.add(MeatLin);
		
		Sausin = new JLabel("100");
		Sausin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Sausin.setBounds(522, 89, 46, 14);
		PMPanel.add(Sausin);
		
		Ricelbl = new JLabel("Rice");
		Ricelbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Ricelbl.setBounds(341, 115, 104, 14);
		PMPanel.add(Ricelbl);
		
		Stockslbl_5 = new JLabel("Stocks");
		Stockslbl_5.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Stockslbl_5.setBounds(512, 115, 71, 14);
		PMPanel.add(Stockslbl_5);
		
		GanadorPM = new JLabel("Ganador");
		GanadorPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorPM.setBackground(Color.LIGHT_GRAY);
		GanadorPM.setBounds(341, 140, 150, 14);
		PMPanel.add(GanadorPM);
		
		MaisPM = new JLabel("Mais #16");
		MaisPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		MaisPM.setBackground(Color.LIGHT_GRAY);
		MaisPM.setBounds(341, 165, 150, 14);
		PMPanel.add(MaisPM);
		
		BRicePM = new JLabel("Broken Rice");
		BRicePM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BRicePM.setBackground(Color.LIGHT_GRAY);
		BRicePM.setBounds(341, 190, 150, 14);
		PMPanel.add(BRicePM);
		
		Ganadorin = new JLabel("100.00");
		Ganadorin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Ganadorin.setBounds(522, 139, 46, 14);
		PMPanel.add(Ganadorin);
		
		Maisin = new JLabel("100.00");
		Maisin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Maisin.setBounds(522, 164, 46, 14);
		PMPanel.add(Maisin);
		
		BRicein = new JLabel("100.00");
		BRicein.setFont(new Font("Century Gothic", Font.BOLD, 11));
		BRicein.setBounds(522, 189, 46, 14);
		PMPanel.add(BRicein);
		
		Kgslbl = new JLabel("kgs.");
		Kgslbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Kgslbl.setBounds(560, 139, 21, 14);
		PMPanel.add(Kgslbl);
		
		Kgslbl_1 = new JLabel("kgs.");
		Kgslbl_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Kgslbl_1.setBounds(560, 164, 21, 14);
		PMPanel.add(Kgslbl_1);
		
		Kgslbl_2 = new JLabel("kgs.");
		Kgslbl_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Kgslbl_2.setBounds(560, 189, 21, 14);
		PMPanel.add(Kgslbl_2);
		
		VandFlbl = new JLabel("Vegetables and Fruits");
		VandFlbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		VandFlbl.setBounds(341, 215, 139, 14);
		PMPanel.add(VandFlbl);
		
		Stockslbl_6 = new JLabel("Stocks");
		Stockslbl_6.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Stockslbl_6.setBounds(512, 215, 71, 14);
		PMPanel.add(Stockslbl_6);
		
		TomatoPM = new JLabel("Tomato");
		TomatoPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		TomatoPM.setBackground(Color.LIGHT_GRAY);
		TomatoPM.setBounds(341, 240, 150, 14);
		PMPanel.add(TomatoPM);
		
		PotatoPM = new JLabel("Potato");
		PotatoPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		PotatoPM.setBackground(Color.LIGHT_GRAY);
		PotatoPM.setBounds(341, 265, 150, 14);
		PMPanel.add(PotatoPM);
		
		OnionPM = new JLabel("Onion");
		OnionPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		OnionPM.setBackground(Color.LIGHT_GRAY);
		OnionPM.setBounds(341, 290, 150, 14);
		PMPanel.add(OnionPM);
		
		GarlicPM = new JLabel("Garlic");
		GarlicPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GarlicPM.setBackground(Color.LIGHT_GRAY);
		GarlicPM.setBounds(341, 315, 150, 14);
		PMPanel.add(GarlicPM);
		
		BananaPM = new JLabel("Banana");
		BananaPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BananaPM.setBackground(Color.LIGHT_GRAY);
		BananaPM.setBounds(341, 340, 150, 14);
		PMPanel.add(BananaPM);
		
		ApplePM = new JLabel("Apple");
		ApplePM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ApplePM.setBackground(Color.LIGHT_GRAY);
		ApplePM.setBounds(341, 365, 150, 14);
		PMPanel.add(ApplePM);
		
		PonkanPM = new JLabel("Ponkan");
		PonkanPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		PonkanPM.setBackground(Color.LIGHT_GRAY);
		PonkanPM.setBounds(341, 390, 150, 14);
		PMPanel.add(PonkanPM);
		
		Tomatoin = new JLabel("100");
		Tomatoin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Tomatoin.setBounds(522, 239, 46, 14);
		PMPanel.add(Tomatoin);
		
		Potatoin = new JLabel("100");
		Potatoin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Potatoin.setBounds(522, 265, 46, 14);
		PMPanel.add(Potatoin);
		
		Onionin = new JLabel("100");
		Onionin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Onionin.setBounds(522, 290, 46, 14);
		PMPanel.add(Onionin);
		
		Garlicin = new JLabel("100");
		Garlicin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Garlicin.setBounds(522, 315, 46, 14);
		PMPanel.add(Garlicin);
		
		Bananain = new JLabel("100");
		Bananain.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Bananain.setBounds(522, 340, 46, 14);
		PMPanel.add(Bananain);
		
		Applein = new JLabel("100");
		Applein.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Applein.setBounds(522, 365, 46, 14);
		PMPanel.add(Applein);
		
		Ponkanin = new JLabel("100");
		Ponkanin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Ponkanin.setBounds(522, 390, 46, 14);
		PMPanel.add(Ponkanin);
		
		Otherslbl = new JLabel("Others");
		Otherslbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Otherslbl.setBounds(341, 415, 139, 14);
		PMPanel.add(Otherslbl);
		
		Stockslbl_7 = new JLabel("Stocks");
		Stockslbl_7.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Stockslbl_7.setBounds(512, 415, 71, 14);
		PMPanel.add(Stockslbl_7);
		
		ButanePM = new JLabel("Butane");
		ButanePM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ButanePM.setBackground(Color.LIGHT_GRAY);
		ButanePM.setBounds(341, 440, 150, 14);
		PMPanel.add(ButanePM);
		
		UlingPM = new JLabel("Uling");
		UlingPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		UlingPM.setBackground(Color.LIGHT_GRAY);
		UlingPM.setBounds(341, 465, 150, 14);
		PMPanel.add(UlingPM);
		
		Butanein = new JLabel("100");
		Butanein.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Butanein.setBounds(522, 440, 46, 14);
		PMPanel.add(Butanein);
		
		Ulingin = new JLabel("100");
		Ulingin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Ulingin.setBounds(522, 465, 46, 14);
		PMPanel.add(Ulingin);
		
		Spiceslbl = new JLabel("Spices");
		Spiceslbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Spiceslbl.setBounds(341, 490, 139, 14);
		PMPanel.add(Spiceslbl);
		
		Stockslbl_8 = new JLabel("Stocks");
		Stockslbl_8.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Stockslbl_8.setBounds(512, 490, 71, 14);
		PMPanel.add(Stockslbl_8);
		
		AsinPM = new JLabel("Pack of Rack Salt");
		AsinPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		AsinPM.setBackground(Color.LIGHT_GRAY);
		AsinPM.setBounds(341, 515, 150, 14);
		PMPanel.add(AsinPM);
		
		VetsinPM = new JLabel("Vetsin");
		VetsinPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		VetsinPM.setBackground(Color.LIGHT_GRAY);
		VetsinPM.setBounds(341, 540, 150, 14);
		PMPanel.add(VetsinPM);
		
		SpicePM = new JLabel("Butane");
		SpicePM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SpicePM.setBackground(Color.LIGHT_GRAY);
		SpicePM.setBounds(341, 565, 150, 14);
		PMPanel.add(SpicePM);
		
		Asinin = new JLabel("100");
		Asinin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Asinin.setBounds(522, 515, 46, 14);
		PMPanel.add(Asinin);
		
		Vetsinin = new JLabel("100");
		Vetsinin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Vetsinin.setBounds(522, 540, 46, 14);
		PMPanel.add(Vetsinin);
		
		Spicein = new JLabel("100");
		Spicein.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Spicein.setBounds(522, 565, 46, 14);
		PMPanel.add(Spicein);
		
		Spiceslbl_1 = new JLabel("Spices");
		Spiceslbl_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Spiceslbl_1.setBounds(674, 12, 139, 14);
		PMPanel.add(Spiceslbl_1);
		
		Stockslbl_8_1 = new JLabel("Stocks");
		Stockslbl_8_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Stockslbl_8_1.setBounds(823, 12, 71, 14);
		PMPanel.add(Stockslbl_8_1);
		
		VinegarPM = new JLabel("Vinegar");
		VinegarPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		VinegarPM.setBackground(Color.LIGHT_GRAY);
		VinegarPM.setBounds(674, 37, 150, 14);
		PMPanel.add(VinegarPM);
		
		SSaucePM = new JLabel("Soy Sauce");
		SSaucePM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SSaucePM.setBackground(Color.LIGHT_GRAY);
		SSaucePM.setBounds(674, 65, 150, 14);
		PMPanel.add(SSaucePM);
		
		Vinegarin = new JLabel("100");
		Vinegarin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Vinegarin.setBounds(833, 37, 46, 14);
		PMPanel.add(Vinegarin);
		
		SSaucein = new JLabel("100");
		SSaucein.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SSaucein.setBounds(834, 65, 46, 14);
		PMPanel.add(SSaucein);
		
		BatheElbl = new JLabel("Bathe Essentials");
		BatheElbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		BatheElbl.setBounds(674, 90, 139, 14);
		PMPanel.add(BatheElbl);
		
		Stockslbl_9 = new JLabel("Stocks");
		Stockslbl_9.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Stockslbl_9.setBounds(823, 90, 71, 14);
		PMPanel.add(Stockslbl_9);
		
		ShampooPM = new JLabel("Sachet of Shampoo");
		ShampooPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ShampooPM.setBackground(Color.LIGHT_GRAY);
		ShampooPM.setBounds(674, 115, 150, 14);
		PMPanel.add(ShampooPM);
		
		Soap250PM = new JLabel("Soap 250 grams");
		Soap250PM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Soap250PM.setBackground(Color.LIGHT_GRAY);
		Soap250PM.setBounds(674, 140, 150, 14);
		PMPanel.add(Soap250PM);
		
		Soap500PM = new JLabel("Soap 500 grams");
		Soap500PM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Soap500PM.setBackground(Color.LIGHT_GRAY);
		Soap500PM.setBounds(674, 165, 150, 14);
		PMPanel.add(Soap500PM);
		
		FWashPM = new JLabel("Facial Wash 250 grams");
		FWashPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		FWashPM.setBackground(Color.LIGHT_GRAY);
		FWashPM.setBounds(674, 190, 150, 14);
		PMPanel.add(FWashPM);
		
		Shampooin = new JLabel("100");
		Shampooin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Shampooin.setBounds(833, 115, 46, 14);
		PMPanel.add(Shampooin);
		
		Soap250in = new JLabel("100");
		Soap250in.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Soap250in.setBounds(833, 140, 46, 14);
		PMPanel.add(Soap250in);
		
		Soap500in = new JLabel("100");
		Soap500in.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Soap500in.setBounds(833, 165, 46, 14);
		PMPanel.add(Soap500in);
		
		FWashin = new JLabel("100");
		FWashin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		FWashin.setBounds(833, 190, 46, 14);
		PMPanel.add(FWashin);
		
		Laundrylbl = new JLabel("Laundry Essentials");
		Laundrylbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Laundrylbl.setBounds(674, 215, 139, 14);
		PMPanel.add(Laundrylbl);
		
		Stockslbl_10 = new JLabel("Stocks");
		Stockslbl_10.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Stockslbl_10.setBounds(823, 215, 71, 14);
		PMPanel.add(Stockslbl_10);
		
		PWashPM = new JLabel("Powdered Wash");
		PWashPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		PWashPM.setBackground(Color.LIGHT_GRAY);
		PWashPM.setBounds(674, 240, 150, 14);
		PMPanel.add(PWashPM);
		
		BSoapPM = new JLabel("Bar Soap");
		BSoapPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BSoapPM.setBackground(Color.LIGHT_GRAY);
		BSoapPM.setBounds(674, 265, 150, 14);
		PMPanel.add(BSoapPM);
		
		FConditionerPM = new JLabel("Fabric Conditioner");
		FConditionerPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		FConditionerPM.setBackground(Color.LIGHT_GRAY);
		FConditionerPM.setBounds(674, 290, 150, 14);
		PMPanel.add(FConditionerPM);
		
		NetbrushPM = new JLabel("Netbrush");
		NetbrushPM.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		NetbrushPM.setBackground(Color.LIGHT_GRAY);
		NetbrushPM.setBounds(674, 315, 150, 14);
		PMPanel.add(NetbrushPM);
		
		PWashin = new JLabel("100");
		PWashin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		PWashin.setBounds(833, 240, 46, 14);
		PMPanel.add(PWashin);
		
		BSoapin = new JLabel("100");
		BSoapin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		BSoapin.setBounds(833, 265, 46, 14);
		PMPanel.add(BSoapin);
		
		FConditionerin = new JLabel("100");
		FConditionerin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		FConditionerin.setBounds(833, 290, 46, 14);
		PMPanel.add(FConditionerin);
		
		Netbrushin = new JLabel("100");
		Netbrushin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Netbrushin.setBounds(833, 315, 46, 14);
		PMPanel.add(Netbrushin);
		
		btnRefresh = new JButton("REFRESH");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
					//Snackers area getting the text/data of the current stock
					String breadin = PrdctList.Breadin.getText();
					String sopasin = PrdctList.Sopasin.getText();
					String jfmin = PrdctList.JFMin.getText();
					String jflin = PrdctList.JFLin.getText();
					String candsin = PrdctList.CandSin.getText();
					String bsctsin = PrdctList.Bsctsin.getText();
					String chiin = PrdctList.Chiin.getText();
					
					double breadinn = Double.parseDouble(breadin);
					double sopasinn = Double.parseDouble(sopasin);
					double jfminn = Double.parseDouble(jfmin);
					double jflinn = Double.parseDouble(jflin);
					double candsinn = Double.parseDouble(candsin);
					double bsctsinn = Double.parseDouble(bsctsin);
					double chiinn = Double.parseDouble(chiin);
					
					//Snackers area getting the added stocks from the other class to update
					String breadupt = PrdctUpdate.BreadUpt.getText(); 
					String sopasupt = PrdctUpdate.SopasUpt.getText();
					String jfmupt = PrdctUpdate.JFMUpt.getText(); 
					String jflupt = PrdctUpdate.JFLUpt.getText();
					String candsupt = PrdctUpdate.CandiesUpt.getText(); 
					String bsctsupt = PrdctUpdate.BsctsUpt.getText();
					String chiupt = PrdctUpdate.ChiUpt.getText();
				
					double breadnum = Double.parseDouble(breadupt);
					double sopasnum = Double.parseDouble(sopasupt);
					double jfmnum = Double.parseDouble(jfmupt);
					double jflnum = Double.parseDouble(jflupt);
					double candsnum = Double.parseDouble(candsupt);
					double bsctsnum = Double.parseDouble(bsctsupt);
					double chinum = Double.parseDouble(chiupt);
/************************************************************************************************/					
					//Liquors area getting the text/data of the current stock
					String smb500in = PrdctList.SMB500in.getText();
					String smb250in = PrdctList.SMB250in.getText();
					String smb1kin = PrdctList.SMB1kin.getText();
					String cbeerin = PrdctList.CBeerin.getText();
					String tlongnin = PrdctList.TLongNin.getText();
					String tflatin = PrdctList.TFlatin.getText();
					String empein = PrdctList.Empein.getText();
					String kulafuin = PrdctList.Kulafuin.getText();
					
					double smb500inn = Double.parseDouble(smb500in);
					double smb250inn = Double.parseDouble(smb250in);
					double smb1kinn = Double.parseDouble(smb1kin);
					double cbeerinn = Double.parseDouble(cbeerin);
					double tlongninn = Double.parseDouble(tlongnin);
					double tflatinn = Double.parseDouble(tflatin);
					double empeinn = Double.parseDouble(empein);
					double kulafuinn = Double.parseDouble(kulafuin);
					
					//Liquors area getting the added stocks from the other class to update
					String smb500upt = PrdctUpdate.SMB500Upt.getText();
					String smb250upt = PrdctUpdate.SMB250Upt.getText();
					String smb1kupt = PrdctUpdate.SMB1kUpt.getText();
					String cbeerupt = PrdctUpdate.CBeerUpt.getText();
					String tlongnupt = PrdctUpdate.TanLNUpt.getText();
					String tflatupt = PrdctUpdate.TanFLUpt.getText();
					String empeupt = PrdctUpdate.EmpeUpt.getText();
					String kulafuupt = PrdctUpdate.KulafuUpt.getText();
					
					double smb500num = Double.parseDouble(smb500upt);
					double smb250num = Double.parseDouble(smb250upt);
					double smb1knum = Double.parseDouble(smb1kupt);
					double cbeernum = Double.parseDouble(cbeerupt);
					double tlongnnum = Double.parseDouble(tlongnupt);
					double tflatnum = Double.parseDouble(tflatupt);
					double empenum = Double.parseDouble(empeupt);
					double kulafunum = Double.parseDouble(kulafuupt);
/************************************************************************************************/
					//Instant Noodles area getting the text/data of the current stock
					String pcantonin = PrdctList.PCantonin.getText();
					String noodlesin = PrdctList.Noodlesin.getText();
					String cnoodlesin = PrdctList.CNoodlesin.getText();
					
					double pcantoninn = Double.parseDouble(pcantonin);
					double noodlesinn = Double.parseDouble(noodlesin);
					double cnoodlesinn = Double.parseDouble(cnoodlesin);
					
					//Instant Noodles area getting the added stocks from the other class to update
					String pcantonupt = PrdctUpdate.PCantonUpt.getText();
					String noodlesupt = PrdctUpdate.NoodlesUpt.getText();
					String cnoodlesupt = PrdctUpdate.CNoodlesUpt.getText();
					
					double pcantonnum = Double.parseDouble(pcantonupt);
					double noodlesnum = Double.parseDouble(noodlesupt);
					double cnoodlesnum = Double.parseDouble(cnoodlesupt);
/************************************************************************************************/		
					//Canned Goods area getting the text/data of the current stock
					String sardinesin = PrdctList.Sardinesin.getText();
					String tunain = PrdctList.Tunain.getText();
					String beeflin = PrdctList.BeefLin.getText();
					String meatlin = PrdctList.MeatLin.getText();
					String sausin = PrdctList.Sausin.getText();
					
					double sardinesinn = Double.parseDouble(sardinesin);
					double tunainn = Double.parseDouble(tunain);
					double beeflinn = Double.parseDouble(beeflin);
					double meatlinn = Double.parseDouble(meatlin);
					double sausinn = Double.parseDouble(sausin);
					
					//Canned Goods area getting the added stocks from the other class to update
					String sardinesupt = PrdctUpdate.SardinesUpt.getText();
					String tunaupt = PrdctUpdate.TunaUpt.getText();
					String beeflupt = PrdctUpdate.BeefLUpt.getText();
					String meatlupt = PrdctUpdate.MeatLUpt.getText();
					String sausupt = PrdctUpdate.SausUpt.getText();
					
					double sardinesnum = Double.parseDouble(sardinesupt);
					double tunanum = Double.parseDouble(tunaupt);
					double beeflnum = Double.parseDouble(beeflupt);
					double meatlnum = Double.parseDouble(meatlupt);
					double sausnum = Double.parseDouble(sausupt);
/************************************************************************************************/
					//Rice area getting the text/data of the current stock
					String ganadorin = PrdctList.Ganadorin.getText();
					String maisin = PrdctList.Maisin.getText();
					String bricein = PrdctList.BRicein.getText();
					
					double ganadorinn = Double.parseDouble(ganadorin);
					double maisinn = Double.parseDouble(maisin);
					double briceinn = Double.parseDouble(bricein);
					
					//Rice area getting the added stocks from the other class to update
					String ganadorupt = PrdctUpdate.GanadorUpt.getText();
					String maisupt = PrdctUpdate.MaisUpt.getText();
					String briceupt = PrdctUpdate.BRiceUpt.getText();
					
					double ganadornum = Double.parseDouble(ganadorupt);
					double maisnum = Double.parseDouble(maisupt);
					double bricenum = Double.parseDouble(briceupt);
/************************************************************************************************/
					//Vegetables and Fruits area getting the text/data of the current stock
					String tomatoin = PrdctList.Tomatoin.getText();
					String potatoin = PrdctList.Potatoin.getText();
					String onionin = PrdctList.Onionin.getText();
					String garlicin = PrdctList.Garlicin.getText();
					String bananain = PrdctList.Bananain.getText();
					String applein = PrdctList.Applein.getText();
					String ponkanin = PrdctList.Ponkanin.getText();
					
					double tomatoinn = Double.parseDouble(tomatoin);
					double potatoinn = Double.parseDouble(potatoin);
					double onioninn = Double.parseDouble(onionin);
					double garlicinn = Double.parseDouble(garlicin);
					double bananainn = Double.parseDouble(bananain);
					double appleinn = Double.parseDouble(applein);
					double ponkaninn = Double.parseDouble(ponkanin);
					
					//Vegetables and Fruits area getting the added stocks from the other class to update
					String tomatoupt = PrdctUpdate.TomatoUpt.getText();
					String potatoupt = PrdctUpdate.PotatoUpt.getText();
					String onionupt = PrdctUpdate.OnionUpt.getText();
					String garlicupt = PrdctUpdate.GarlicUpt.getText();
					String bananaupt = PrdctUpdate.BananaUpt.getText();
					String appleupt = PrdctUpdate.AppleUpt.getText();
					String ponkanupt = PrdctUpdate.PonkanUpt.getText();
					
					double tomatonum = Double.parseDouble(tomatoupt);
					double potatonum = Double.parseDouble(potatoupt);
					double onionnum = Double.parseDouble(onionupt);
					double garlicnum = Double.parseDouble(garlicupt);
					double banananum = Double.parseDouble(bananaupt);
					double applenum = Double.parseDouble(appleupt);
					double ponkannum = Double.parseDouble(ponkanupt);
/************************************************************************************************/	
					//Others area getting the text/data of the current stock
					String butanein = PrdctList.Butanein.getText();
					String ulingin = PrdctList.Ulingin.getText();
					
					double butaneinn = Double.parseDouble(butanein);
					double ulinginn = Double.parseDouble(ulingin);
					
					//Others area getting the added stocks from the other class to update
					String butaneupt = PrdctUpdate.ButaneUpt.getText();
					String ulingupt = PrdctUpdate.UlingUpt.getText();
					
					double butanenum = Double.parseDouble(butaneupt);
					double ulingnum = Double.parseDouble(ulingupt);
/************************************************************************************************/		
					//Spices area getting the text/data of the current stock
					String asinin = PrdctList.Asinin.getText();
					String vetsinin = PrdctList.Vetsinin.getText();
					String spicein = PrdctList.Spicein.getText();
					String vinegarin = PrdctList.Vinegarin.getText();
					String ssaucein = PrdctList.SSaucein.getText();
					
					double asininn = Double.parseDouble(asinin);
					double vetsininn = Double.parseDouble(vetsinin);
					double spiceinn = Double.parseDouble(spicein);
					double vinegarinn = Double.parseDouble(vinegarin);
					double ssauceinn = Double.parseDouble(ssaucein);
					
					//Spices area getting the added stocks from the other class to update
					String asinupt = PrdctUpdate.AsinUpt.getText();
					String vetsinupt = PrdctUpdate.VetsinUpt.getText();
					String spiceupt = PrdctUpdate.SpiceUpt.getText();
					String vinegarupt = PrdctUpdate.VinegarUpt.getText();
					String ssauceupt = PrdctUpdate.SSauceUpt.getText();

					double asinnum = Double.parseDouble(asinupt);
					double vetsinnum = Double.parseDouble(vetsinupt);
					double spicenum = Double.parseDouble(spiceupt);
					double vinegarnum = Double.parseDouble(vinegarupt);
					double ssaucenum = Double.parseDouble(ssauceupt);
/************************************************************************************************/
					//Bathe Essentials area getting the text/data of the current stock
					String shampooin = PrdctList.Shampooin.getText();
					String soap250in = PrdctList.Soap250in.getText();
					String soap500in = PrdctList.Soap500in.getText();
					String fwashin = PrdctList.FWashin.getText();
					
					double shampooinn = Double.parseDouble(shampooin);
					double soap250inn = Double.parseDouble(soap250in);
					double soap500inn = Double.parseDouble(soap500in);
					double fwashinn = Double.parseDouble(fwashin);
					
					//Bathe Essentials area getting the added stocks from the other class to update
					String shampooupt = PrdctUpdate.ShamUpt.getText();
					String soap250upt = PrdctUpdate.Soap250Upt.getText();
					String soap500upt = PrdctUpdate.Soap500Upt.getText();
					String fwashupt = PrdctUpdate.FWashUpt.getText();
					
					double shampoonum = Double.parseDouble(shampooupt);
					double soap250num = Double.parseDouble(soap250upt);
					double soap500num = Double.parseDouble(soap500upt);
					double fwashnum = Double.parseDouble(fwashupt);
/************************************************************************************************/
					//Laundry Essentials area getting the text/data of the current stock
					String pwashin = PrdctList.PWashin.getText();
					String bsoapin = PrdctList.BSoapin.getText();
					String fconditionerin = PrdctList.FConditionerin.getText();
					String netbrushin = PrdctList.Netbrushin.getText();
					
					double pwashinn = Double.parseDouble(pwashin);
					double bsoapinn = Double.parseDouble(bsoapin);
					double fconditionerinn = Double.parseDouble(fconditionerin);
					double netbrushinn = Double.parseDouble(netbrushin);
					
					//Laundry Essentials area getting the added stocks from the other class to update
					String pwashupt = PrdctUpdate.PWashUpt.getText();
					String bsoapupt = PrdctUpdate.BSoapUpt.getText();
					String fconditionerupt = PrdctUpdate.FConditionerUpt.getText();
					String netbrushupt = PrdctUpdate.NetBrushUpt.getText();
					
					double pwashnum  = Double.parseDouble(pwashupt);
					double bsoapnum = Double.parseDouble(bsoapupt);
					double fconditionernum = Double.parseDouble(fconditionerupt);
					double netbrushnum = Double.parseDouble(netbrushupt);
/************************************************************************************************/
			 /*************************TO THE PRODUCT UPDATE USING THE IF STATEMENT****************************/
					if (breadinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Breadin.setText(""+String.format("%.0f",breadinn + breadnum));
						PrdctUpdate.BreadUpt.setText("0");
					}
					if (sopasinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Sopasin.setText(""+String.format("%.0f",sopasinn + sopasnum));
						PrdctUpdate.SopasUpt.setText("0");
					}
					if (jfminn <= Double.POSITIVE_INFINITY) {
						PrdctList.JFMin.setText(""+String.format("%.0f",jfminn + jfmnum));
						PrdctUpdate.JFMUpt.setText("0");
					}
					if (jflinn <= Double.POSITIVE_INFINITY) {
						PrdctList.JFLin.setText(""+String.format("%.0f",jflinn + jflnum));
						PrdctUpdate.JFLUpt.setText("0");
					}
					if (candsinn <= Double.POSITIVE_INFINITY) {
						PrdctList.CandSin.setText(""+String.format("%.0f",candsinn + candsnum));
						PrdctUpdate.CandiesUpt.setText("0");
					}
					if (bsctsinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Bsctsin.setText(""+String.format("%.0f",bsctsinn + bsctsnum));
						PrdctUpdate.BsctsUpt.setText("0");
					}
					if (chiinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Chiin.setText(""+String.format("%.0f",chiinn + chinum));
						PrdctUpdate.ChiUpt.setText("0");
					}
					if (jflinn <= Double.POSITIVE_INFINITY) {
						PrdctList.JFLin.setText(""+String.format("%.0f",jflinn + jflnum));
						PrdctUpdate.JFLUpt.setText("0");
					}
					if (smb500inn <= Double.POSITIVE_INFINITY) {
						PrdctList.SMB500in.setText(""+String.format("%.0f",smb500inn + smb500num));
						PrdctUpdate.SMB500Upt.setText("0");
					}
					if (smb250inn <= Double.POSITIVE_INFINITY) {
						PrdctList.SMB250in.setText(""+String.format("%.0f",smb250inn + smb250num));
						PrdctUpdate.SMB250Upt.setText("0");
					}
					if (smb1kinn <= Double.POSITIVE_INFINITY) {
						PrdctList.SMB1kin.setText(""+String.format("%.0f",smb1kinn + smb1knum));
						PrdctUpdate.SMB1kUpt.setText("0");
					}
					if (cbeerinn <= Double.POSITIVE_INFINITY) {
						PrdctList.CBeerin.setText(""+String.format("%.0f",cbeerinn + cbeernum));
						PrdctUpdate.CBeerUpt.setText("0");
					}
					if (tlongninn <= Double.POSITIVE_INFINITY) {
						PrdctList.TLongNin.setText(""+String.format("%.0f",tlongninn + tlongnnum));
						PrdctUpdate.TanLNUpt.setText("0");
					}
					if (tlongninn <= Double.POSITIVE_INFINITY) {
						PrdctList.TLongNin.setText(""+String.format("%.0f",tlongninn + tlongnnum));
						PrdctUpdate.TanLNUpt.setText("0");
					}
					if (tflatinn <= Double.POSITIVE_INFINITY) {
						PrdctList.TFlatin.setText(""+String.format("%.0f",tflatinn + tflatnum));
						PrdctUpdate.TanFLUpt.setText("0");
					}
					if (empeinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Empein.setText(""+String.format("%.0f",empeinn + empenum));
						PrdctUpdate.EmpeUpt.setText("0");
					}
					if (kulafuinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Kulafuin.setText(""+String.format("%.0f",kulafuinn + kulafunum));
						PrdctUpdate.KulafuUpt.setText("0");
					}
					if (pcantoninn <= Double.POSITIVE_INFINITY) {
						PrdctList.PCantonin.setText(""+String.format("%.0f",pcantoninn + pcantonnum));;
						PrdctUpdate.PCantonUpt.setText("0");
					}
					if (noodlesinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Noodlesin.setText(""+String.format("%.0f",noodlesinn + noodlesnum));
						PrdctUpdate.NoodlesUpt.setText("0");
					}
					if (cnoodlesinn <= Double.POSITIVE_INFINITY) {
						PrdctList.CNoodlesin.setText(""+String.format("%.0f",cnoodlesinn + cnoodlesnum));
						PrdctUpdate.CNoodlesUpt.setText("0");
					}
					if (sardinesinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Sardinesin.setText(""+String.format("%.0f",sardinesinn + sardinesnum));
						PrdctUpdate.SardinesUpt.setText("0");
					}
					if (tunainn <= Double.POSITIVE_INFINITY) {
						PrdctList.Tunain.setText(""+String.format("%.0f",tunainn + tunanum));
						PrdctUpdate.TunaUpt.setText("0");
					}
					if (beeflinn <= Double.POSITIVE_INFINITY) {
						PrdctList.BeefLin.setText(""+String.format("%.0f",beeflinn + beeflnum));
						PrdctUpdate.BeefLUpt.setText("0");
					}
					if (meatlinn <= Double.POSITIVE_INFINITY) {
						PrdctList.MeatLin.setText(""+String.format("%.0f",meatlinn + meatlnum));
						PrdctUpdate.MeatLUpt.setText("0");
					}
					if (sausinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Sausin.setText(""+String.format("%.0f",sausinn + sausnum));
						PrdctUpdate.SausUpt.setText("0");
					}
					if (ganadorinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Ganadorin.setText(""+String.format("%.2f",ganadorinn + ganadornum));
						PrdctUpdate.GanadorUpt.setText("0");
					}
					if (maisinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Maisin.setText(""+String.format("%.2f",maisinn + maisnum));
						PrdctUpdate.MaisUpt.setText("0");
					}
					if (briceinn <= Double.POSITIVE_INFINITY) {
						PrdctList.BRicein.setText(""+String.format("%.2f",briceinn + bricenum));
						PrdctUpdate.BRiceUpt.setText("0");
					}
					if (tomatoinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Tomatoin.setText(""+String.format("%.0f",tomatoinn + tomatonum));
						PrdctUpdate.TomatoUpt.setText("0");
					}
					if (potatoinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Potatoin.setText(""+String.format("%.0f",potatoinn + potatonum));
						PrdctUpdate.PotatoUpt.setText("0");
					}
					if (onioninn <= Double.POSITIVE_INFINITY) {
						PrdctList.Onionin.setText(""+String.format("%.0f",onioninn + onionnum));
						PrdctUpdate.OnionUpt.setText("0");
					}
					if (garlicinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Garlicin.setText(""+String.format("%.0f",garlicinn + garlicnum));
						PrdctUpdate.GarlicUpt.setText("0");
					}
					if (bananainn <= Double.POSITIVE_INFINITY) {
						PrdctList.Bananain.setText(""+String.format("%.0f",bananainn + banananum));
						PrdctUpdate.BananaUpt.setText("0");
					}
					if (appleinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Applein.setText(""+String.format("%.0f",appleinn + applenum));
						PrdctUpdate.AppleUpt.setText("0");
					}
					if (ponkaninn <= Double.POSITIVE_INFINITY) {
						PrdctList.Ponkanin.setText(""+String.format("%.0f",ponkaninn + ponkannum));
						PrdctUpdate.PonkanUpt.setText("0");
					}
					if (butaneinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Butanein.setText(""+String.format("%.0f",butaneinn + butanenum));
						PrdctUpdate.ButaneUpt.setText("0");
					}
					if (ulinginn <= Double.POSITIVE_INFINITY) {
						PrdctList.Ulingin.setText(""+String.format("%.0f",ulinginn + ulingnum));
						PrdctUpdate.UlingUpt.setText("0");
					}
					if (asininn <= Double.POSITIVE_INFINITY) {
						PrdctList.Asinin.setText(""+String.format("%.0f",asininn + asinnum));
						PrdctUpdate.AsinUpt.setText("0");
					}
					if (vetsininn <= Double.POSITIVE_INFINITY) {
						PrdctList.Vetsinin.setText(""+String.format("%.0f",vetsininn + vetsinnum));
						PrdctUpdate.AsinUpt.setText("0");
					}
					if (spiceinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Spicein.setText(""+String.format("%.0f",spiceinn + spicenum));
						PrdctUpdate.SpiceUpt.setText("0");
					}
					if (vinegarinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Vinegarin.setText(""+String.format("%.0f",vinegarinn + vinegarnum));
						PrdctUpdate.VinegarUpt.setText("0");
					}
					if (ssauceinn <= Double.POSITIVE_INFINITY) {
						PrdctList.SSaucein.setText(""+String.format("%.0f",ssauceinn + ssaucenum));
						PrdctUpdate.SSauceUpt.setText("0");
					}
					if (shampooinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Shampooin.setText(""+String.format("%.0f",shampooinn + shampoonum));
						PrdctUpdate.ShamUpt.setText("0");
					}
					if (soap250inn <= Double.POSITIVE_INFINITY) {
						PrdctList.Soap250in.setText(""+String.format("%.0f",soap250inn + soap250num));
						PrdctUpdate.Soap250Upt.setText("0");
					}
					if (soap500inn <= Double.POSITIVE_INFINITY) {
						PrdctList.Soap500in.setText(""+String.format("%.0f",soap500inn + soap500num));
						PrdctUpdate.Soap500Upt.setText("0");
					}
					if (fwashinn <= Double.POSITIVE_INFINITY) {
						PrdctList.FWashin.setText(""+String.format("%.0f",fwashinn + fwashnum));
						PrdctUpdate.FWashUpt.setText("0");
					}
					if (pwashinn <= Double.POSITIVE_INFINITY) {
						PrdctList.PWashin.setText(""+String.format("%.0f",pwashinn + pwashnum));
						PrdctUpdate.PWashUpt.setText("0");
					}
					if (bsoapinn <= Double.POSITIVE_INFINITY) {
						PrdctList.BSoapin.setText(""+String.format("%.0f",bsoapinn + bsoapnum));
						PrdctUpdate.BSoapUpt.setText("0");
					}
					if (fconditionerinn <= Double.POSITIVE_INFINITY) {
						PrdctList.FConditionerin.setText(""+String.format("%.0f",fconditionerinn + fconditionernum));
						PrdctUpdate.FConditionerUpt.setText("0");
					}
					if (netbrushinn <= Double.POSITIVE_INFINITY) {
						PrdctList.Netbrushin.setText(""+String.format("%.0f",netbrushinn + netbrushnum));
						PrdctUpdate.NetBrushUpt.setText("0");
					}
			}
		});
		btnRefresh.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnRefresh.setBackground(Color.CYAN);
		btnRefresh.setBounds(663, 414, 122, 35);
		PMPanel.add(btnRefresh);
		
		btnCashier = new JButton("CASHIER");
		btnCashier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrdctPOS Cashierin= new PrdctPOS();
				Cashierin.setVisible(true);
			}
		});
		btnCashier.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnCashier.setBackground(Color.MAGENTA);
		btnCashier.setBounds(814, 414, 122, 35);
		PMPanel.add(btnCashier);
		
		btnReturn = new JButton("RETURN");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				      dispose();
			}
		});
		btnReturn.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnReturn.setBackground(Color.RED);
		btnReturn.setBounds(738, 476, 122, 35);
		PMPanel.add(btnReturn);
		
		lblPc = new JLabel("pc.");
		lblPc.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPc.setBounds(560, 240, 21, 14);
		PMPanel.add(lblPc);
		
		lblPc_1 = new JLabel("pc.");
		lblPc_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPc_1.setBounds(560, 265, 21, 14);
		PMPanel.add(lblPc_1);
		
		lblPc_2 = new JLabel("pc.");
		lblPc_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPc_2.setBounds(560, 290, 21, 14);
		PMPanel.add(lblPc_2);
		
		lblPc_3 = new JLabel("pc.");
		lblPc_3.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPc_3.setBounds(560, 315, 21, 14);
		PMPanel.add(lblPc_3);
		
		lblPc_4 = new JLabel("pc.");
		lblPc_4.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPc_4.setBounds(560, 340, 21, 14);
		PMPanel.add(lblPc_4);
		
		lblPc_5 = new JLabel("pc.");
		lblPc_5.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPc_5.setBounds(560, 365, 21, 14);
		PMPanel.add(lblPc_5);
		
		lblPc_6 = new JLabel("pc.");
		lblPc_6.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPc_6.setBounds(560, 390, 21, 14);
		PMPanel.add(lblPc_6);
		
		lblPc_7 = new JLabel("pc.");
		lblPc_7.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPc_7.setBounds(560, 440, 21, 14);
		PMPanel.add(lblPc_7);
		
		lblPc_8 = new JLabel("pc.");
		lblPc_8.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPc_8.setBounds(560, 465, 21, 14);
		PMPanel.add(lblPc_8);
		
		lblPk = new JLabel("pk.");
		lblPk.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk.setBounds(560, 515, 21, 14);
		PMPanel.add(lblPk);
		
		lblPk_1 = new JLabel("pk.");
		lblPk_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_1.setBounds(560, 540, 21, 14);
		PMPanel.add(lblPk_1);
		
		lblPk_2 = new JLabel("pk.");
		lblPk_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_2.setBounds(560, 565, 21, 14);
		PMPanel.add(lblPk_2);
		
		lblPk_3 = new JLabel("pk.");
		lblPk_3.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_3.setBounds(873, 37, 21, 14);
		PMPanel.add(lblPk_3);
		
		lblPk_4 = new JLabel("pk.");
		lblPk_4.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_4.setBounds(873, 65, 21, 14);
		PMPanel.add(lblPk_4);
		
		lblPk_5 = new JLabel("pk.");
		lblPk_5.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_5.setBounds(873, 115, 21, 14);
		PMPanel.add(lblPk_5);
		
		lblPk_6 = new JLabel("pk.");
		lblPk_6.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_6.setBounds(873, 140, 21, 14);
		PMPanel.add(lblPk_6);
		
		lblPk_7 = new JLabel("pk.");
		lblPk_7.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_7.setBounds(873, 165, 21, 14);
		PMPanel.add(lblPk_7);
		
		lblPk_8 = new JLabel("pk.");
		lblPk_8.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_8.setBounds(873, 190, 21, 14);
		PMPanel.add(lblPk_8);
		
		lblPk_9 = new JLabel("pk.");
		lblPk_9.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_9.setBounds(873, 240, 21, 14);
		PMPanel.add(lblPk_9);
		
		lblBar = new JLabel("bar");
		lblBar.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblBar.setBounds(873, 265, 21, 14);
		PMPanel.add(lblBar);
		
		lblPk_10 = new JLabel("pk.");
		lblPk_10.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_10.setBounds(873, 290, 21, 14);
		PMPanel.add(lblPk_10);
		
		lblPc_9 = new JLabel("pc.");
		lblPc_9.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPc_9.setBounds(873, 315, 21, 14);
		PMPanel.add(lblPc_9);
		
		lblBtl_2 = new JLabel("btl.");
		lblBtl_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblBtl_2.setBounds(229, 240, 21, 14);
		PMPanel.add(lblBtl_2);
		
		lblBtl_3 = new JLabel("btl.");
		lblBtl_3.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblBtl_3.setBounds(229, 265, 21, 14);
		PMPanel.add(lblBtl_3);
		
		lblBtl_4 = new JLabel("btl.");
		lblBtl_4.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblBtl_4.setBounds(229, 290, 21, 14);
		PMPanel.add(lblBtl_4);
		
		lblBtl_5 = new JLabel("btl.");
		lblBtl_5.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblBtl_5.setBounds(229, 340, 21, 14);
		PMPanel.add(lblBtl_5);
		
		lblBtl_6 = new JLabel("btl.");
		lblBtl_6.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblBtl_6.setBounds(229, 365, 21, 14);
		PMPanel.add(lblBtl_6);
		
		lblBtl_7 = new JLabel("btl.");
		lblBtl_7.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblBtl_7.setBounds(229, 390, 21, 14);
		PMPanel.add(lblBtl_7);
		
		lblBtl_8 = new JLabel("btl.");
		lblBtl_8.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblBtl_8.setBounds(229, 415, 21, 14);
		PMPanel.add(lblBtl_8);
		
		lblCan = new JLabel("can");
		lblCan.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblCan.setBounds(229, 315, 21, 14);
		PMPanel.add(lblCan);
		
		lblCan_1 = new JLabel("can");
		lblCan_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblCan_1.setBounds(229, 565, 21, 14);
		PMPanel.add(lblCan_1);
		
		lblCan_2 = new JLabel("can");
		lblCan_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblCan_2.setBounds(229, 590, 21, 14);
		PMPanel.add(lblCan_2);
		
		lblCan_3 = new JLabel("can");
		lblCan_3.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblCan_3.setBounds(560, 37, 21, 14);
		PMPanel.add(lblCan_3);
		
		lblCan_4 = new JLabel("can");
		lblCan_4.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblCan_4.setBounds(560, 65, 21, 14);
		PMPanel.add(lblCan_4);
		
		lblCan_5 = new JLabel("can");
		lblCan_5.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblCan_5.setBounds(560, 90, 21, 14);
		PMPanel.add(lblCan_5);
		
		lblPk_13 = new JLabel("pk.");
		lblPk_13.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_13.setBounds(229, 465, 21, 14);
		PMPanel.add(lblPk_13);
		
		lblPk_14 = new JLabel("pk.");
		lblPk_14.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_14.setBounds(229, 490, 21, 14);
		PMPanel.add(lblPk_14);
		
		lblPk_15 = new JLabel("pk.");
		lblPk_15.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_15.setBounds(229, 515, 21, 14);
		PMPanel.add(lblPk_15);
		
		lblPk_16 = new JLabel("pk.");
		lblPk_16.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_16.setBounds(229, 65, 21, 14);
		PMPanel.add(lblPk_16);
		
		lblPk_17 = new JLabel("pk.");
		lblPk_17.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_17.setBounds(229, 89, 21, 14);
		PMPanel.add(lblPk_17);
		
		lblPk_18 = new JLabel("pk.");
		lblPk_18.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_18.setBounds(229, 115, 21, 14);
		PMPanel.add(lblPk_18);
		
		lblPk_19 = new JLabel("pk.");
		lblPk_19.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_19.setBounds(229, 165, 21, 14);
		PMPanel.add(lblPk_19);
		
		lblPk_20 = new JLabel("pk.");
		lblPk_20.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_20.setBounds(229, 190, 21, 14);
		PMPanel.add(lblPk_20);
		
		lblPk_21 = new JLabel("pc.");
		lblPk_21.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_21.setBounds(229, 140, 21, 14);
		PMPanel.add(lblPk_21);
		
		lblPk_22 = new JLabel("pc.");
		lblPk_22.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPk_22.setBounds(229, 37, 21, 14);
		PMPanel.add(lblPk_22);
		
		lblNewLabel_19 = new JLabel("P");
		lblNewLabel_19.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_19.setBounds(260, 590, 46, 14);
		PMPanel.add(lblNewLabel_19);
	}
}

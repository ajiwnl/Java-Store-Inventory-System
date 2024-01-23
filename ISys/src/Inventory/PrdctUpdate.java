package Inventory;

//***********Imports**********
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrdctUpdate extends JFrame {

	private static final long serialVersionUID = 1L;	
	private JPanel updatePane;
	private JLabel ProductUpdateSystemin;
	private JLabel ProductUpdateSystem;
	private JLabel Storetitle;
	private JPanel decorpane;
	private JLabel prdctupdateimg;
	private JLabel lblInstantNoodles;
	private JLabel lblQtyToBe_2;
	private JLabel lblNewLabel_1_4;
	private JLabel lblNewLabel_1_1_2;
	private JLabel lblNewLabel_1_2_6;
	private JLabel lblCannedGoods;
	private JLabel lblQtyToBe_3;
	private JLabel lblNewLabel_1_5;
	private JLabel lblNewLabel_1_1_3;
	private JLabel lblCannedGoods_1;
	private JLabel lblQtyToBe_4;
	private JLabel lblNewLabel_1_6;
	private JLabel lblNewLabel_1_1_4;
	private JLabel lblNewLabel_1_7;
	private JLabel lblCannedGoods_2;
	private JLabel lblQtyToBe_5;
	private JLabel lblNewLabel_1_8;
	private JLabel lblNewLabel_1_1_5;
	private JLabel lblNewLabel_1_9;
	private JLabel lblCannedGoods_3;
	private JLabel lblQtyToBe_6;
	private JLabel lblNewLabel_1_10;
	private JLabel lblNewLabel_1_1_6;
	private JLabel lblNewLabel_1_11;
	private JLabel lblNewLabel_1_1_7;
	private JLabel lblNewLabel_1_13;
	private JLabel lblNewLabel_1_14;
	private JLabel lblNewLabel_1_1_8;
	private JLabel lblCannedGoods_4;
	private JLabel lblQtyToBe_7;
	private JLabel lblNewLabel_1_15;
	private JLabel lblNewLabel_1_1_9;
	private JLabel lblCannedGoods_5;
	private JLabel lblQtyToBe_8;
	private JLabel lblNewLabel_1_16;
	private JLabel lblNewLabel_1_1_10;
	private JLabel lblCannedGoods_6;
	private JLabel lblQtyToBe_9;
	private JLabel lblNewLabel_1_17;
	private JLabel lblNewLabel_1_1_11;
	private JLabel lblNewLabel_1_18;
	private JLabel lblCannedGoods_7;
	private JLabel lblQtyToBe_10;
	private JLabel lblNewLabel_1_19;
	private JLabel lblNewLabel_1_1_12;
	private JLabel lblNewLabel_1_20;
	private JLabel lblNewLabel_1_21;
	private JLabel lblCannedGoods_8;
	private JLabel lblQtyToBe_11;
	private JLabel lblNewLabel_1_22;
	private JLabel lblNewLabel_1_1_13;
	private JLabel lblNewLabel_1_23;
	private JLabel lblNewLabel_1_24;
	private JButton UpdateBtn;
	private JButton btnHelp;
	private JButton btnReturn;
	private JLabel SN_003;
	private JLabel SN_004;
	private JLabel SN_005;
	private JLabel SN_006;
	private JLabel SN_007;
	private JLabel ProductCode_LQ;
	private JLabel LQ_001;
	private JLabel LQ_002;
	private JLabel LQ_003;
	private JLabel LQ_004;
	private JLabel LQ_005;
	private JLabel LQ_006;
	private JLabel LQ_007;
	private JLabel ProductCode_IN;
	private JLabel IN_001;
	private JLabel IN_002;
	private JLabel IN_003;
	private JLabel ProductCode_CG_01;
	private JLabel CG_001;
	private JLabel CG_002;
	private JLabel ProductcCode_CG_02;
	private JLabel CG_003;
	private JLabel CG_004;
	private JLabel CG_005;
	private JLabel LQ_008;
	private JLabel ProductcCode_RC;
	private JLabel RC_001;
	private JLabel RC_002;
	private JLabel RC_003;
	private JLabel ProductcCode_VF;
	private JLabel VF_001;
	private JLabel VF_002;
	private JLabel VF_003;
	private JLabel VF_004;
	private JLabel VF_005;
	private JLabel VF_006;
	private JLabel VF_007;
	private JLabel ProductcCode_OT;
	private JLabel OT_001;
	private JLabel OT_002;
	private JLabel ProductcCode_SP_001;
	private JLabel SP_001;
	private JLabel SP_002;
	private JLabel ProductcCode_SP;
	private JLabel SP_003;
	private JLabel SP_004;
	private JLabel SP_005;
	private JLabel ProductcCode_BE;
	private JLabel BE_001;
	private JLabel BE_002;
	private JLabel BE_003;
	private JLabel BE_004;
	private JLabel ProductcCode_LE;
	private JLabel LE_001;
	private JLabel LE_002;
	private JLabel LE__003;
	private JLabel LE_004;
	private JLabel ProductcCode_HG;
	private JLabel HG_001;
	private JLabel HG_002;
	private JLabel HG_003;
	private JLabel HG_004;
	private JLabel HG_005;
	private JLabel HG_006;
	private JPanel UptPanel;
	private JLabel ProductCodelbl;
	private JTextField Itemin;
	private JLabel Quantitylbl;
	private JTextField Qtyin;
	public static JLabel BreadUpt;
	public static JLabel SopasUpt;
	public static JLabel JFMUpt;
	public static JLabel JFLUpt;
	public static JLabel CandiesUpt;
	public static JLabel BsctsUpt;
	public static JLabel ChiUpt;
	public static JLabel SMB500Upt;
	public static JLabel SMB250Upt;
	public static JLabel SMB1kUpt;
	public static JLabel CBeerUpt;
	public static JLabel TanLNUpt;
	public static JLabel TanFLUpt;
	public static JLabel EmpeUpt;
	public static JLabel KulafuUpt;
	public static JLabel PCantonUpt;
	public static JLabel NoodlesUpt;
	public static JLabel CNoodlesUpt;
	public static JLabel SardinesUpt;
	public static JLabel TunaUpt;
	public static JLabel BeefLUpt;
	public static JLabel MeatLUpt;
	public static JLabel SausUpt;
	public static JLabel GanadorUpt;
	public static JLabel MaisUpt;
	public static JLabel BRiceUpt;
	public static JLabel TomatoUpt;
	public static JLabel PotatoUpt;
	public static JLabel OnionUpt;
	public static JLabel GarlicUpt;
	public static JLabel BananaUpt;
	public static JLabel AppleUpt;
	public static JLabel PonkanUpt;
	public static JLabel ButaneUpt;
	public static JLabel UlingUpt;
	public static JLabel AsinUpt;
	public static JLabel VetsinUpt;
	public static JLabel SpiceUpt;
	public static JLabel VinegarUpt;
	public static JLabel SSauceUpt;
	public static JLabel ShamUpt;
	public static JLabel Soap250Upt;
	public static JLabel Soap500Upt;
	public static JLabel FWashUpt;
	public static JLabel PWashUpt;
	public static JLabel BSoapUpt;
	public static JLabel FConditionerUpt;
	public static JLabel NetBrushUpt;
	private JLabel GanadorUpt_2;
	private JLabel GanadorUpt_3;
	private JLabel GanadorUpt_4;
	private JLabel GanadorUpt_5;
	private JLabel GanadorUpt_6;
	private JLabel GanadorUpt_7;
	private JLabel GanadorUpt_8;
	private JLabel GanadorUpt_9;
	private JLabel GanadorUpt_10;
	private JLabel GanadorUpt_11;
	private JLabel GanadorUpt_12;
	private JLabel GanadorUpt_13;
	private JLabel GanadorUpt_14;
	private JLabel GanadorUpt_15;
	private JLabel GanadorUpt_16;
	private JLabel GanadorUpt_17;
	private JLabel GanadorUpt_18;
	private JLabel GanadorUpt_19;
	private JLabel GanadorUpt_20;
	private JLabel GanadorUpt_21;
	private JLabel GanadorUpt_22;
	private JLabel GanadorUpt_23;
	private JLabel GanadorUpt_24;
	private JLabel GanadorUpt_25;
	private JLabel GanadorUpt_26;
	private JLabel GanadorUpt_27;
	private JLabel GanadorUpt_28;
	private JLabel GanadorUpt_29;
	private JLabel GanadorUpt_30;
	private JLabel GanadorUpt_37;
	private JLabel GanadorUpt_38;
	private JLabel GanadorUpt_39;
	private JLabel GanadorUpt_40;
	private JLabel GanadorUpt_41;
	private JLabel GanadorUpt_42;
	private JLabel GanadorUpt_43;
	private JLabel GanadorUpt_44;
	private JLabel GanadorUpt_45;
	private JLabel GanadorUpt_46;
	private JLabel GanadorUpt_47;
	private JLabel GanadorUpt_48;
	private JLabel GanadorUpt_49;
	private JLabel GanadorUpt_50;
	private JLabel GanadorUpt_51;
	private JLabel GanadorUpt_52;
	private JLabel GanadorUpt_53;
	private JLabel GanadorUpt_54;
	private JLabel GanadorUpt_55;
	private JLabel GanadorUpt_56;
	private JLabel GanadorUpt_57;
	private JLabel GanadorUpt_58;
	private JLabel GanadorUpt_59;

	// **********Application Launch**********
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrdctUpdate frame = new PrdctUpdate();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setBounds(10, 10, 1300, 700);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// **********Frame Layout**********

	public PrdctUpdate() {
		setUndecorated(true);
		setResizable(false);
		setForeground(Color.GREEN);
		setBackground(Color.GREEN);
		setTitle("Nene's Retail Store");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(10, 10, 1300, 700);
		updatePane = new JPanel();
		updatePane.setBackground(Color.LIGHT_GRAY);
		updatePane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(updatePane);
		updatePane.setLayout(null);

		decorpane = new JPanel();
		decorpane.setLayout(null);
		decorpane.setBackground(Color.GREEN);
		decorpane.setBounds(0, 0, 1350, 96);
		updatePane.add(decorpane);

		Storetitle = new JLabel("NENE's RETAIL STORE");
		Storetitle.setForeground(Color.WHITE);
		Storetitle.setFont(new Font("Century Gothic", Font.BOLD, 60));
		Storetitle.setBackground(Color.BLACK);
		Storetitle.setBounds(10, 0, 695, 53);
		decorpane.add(Storetitle);

		ProductUpdateSystem = new JLabel("PRODUCT UPDATE SYSTEM");
		ProductUpdateSystem.setForeground(Color.WHITE);
		ProductUpdateSystem.setFont(new Font("Century Gothic", Font.BOLD, 40));
		ProductUpdateSystem.setBounds(10, 43, 678, 53);
		decorpane.add(ProductUpdateSystem);

		prdctupdateimg = new JLabel("");
		prdctupdateimg.setBounds(1180, 0, 140, 96);
		decorpane.add(prdctupdateimg);

		ImageIcon mainframeimg08 = new ImageIcon("images/Update.png");
		prdctupdateimg.setIcon(mainframeimg08);

		JLabel lblQtyToBe = new JLabel("Qty to be added");
		lblQtyToBe.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblQtyToBe.setBounds(233, 107, 86, 14);
		updatePane.add(lblQtyToBe);

		// Snackers area
		JLabel SnackersLbl = new JLabel("Snackers");
		SnackersLbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SnackersLbl.setBounds(106, 107, 71, 14);
		updatePane.add(SnackersLbl);

		JLabel BreadLbl = new JLabel("Bread");
		BreadLbl.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BreadLbl.setBounds(106, 127, 71, 14);
		updatePane.add(BreadLbl);

		JLabel lblNewLabel_1_1 = new JLabel("Sopas");
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(106, 155, 71, 14);
		updatePane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Junkfoods (M)");
		lblNewLabel_1_2.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_2.setBounds(95, 180, 108, 14);
		updatePane.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_2_1 = new JLabel("Junkfoods (L)");
		lblNewLabel_1_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_2_1.setBounds(95, 205, 108, 14);
		updatePane.add(lblNewLabel_1_2_1);

		JLabel lblNewLabel_1_2_2 = new JLabel("Candies and Sweets");
		lblNewLabel_1_2_2.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_2_2.setBounds(72, 230, 123, 14);
		updatePane.add(lblNewLabel_1_2_2);

		JLabel lblNewLabel_1_2_3 = new JLabel("Biscuits");
		lblNewLabel_1_2_3.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_2_3.setBounds(106, 255, 108, 14);
		updatePane.add(lblNewLabel_1_2_3);

		JLabel lblNewLabel_1_2_4 = new JLabel("Chichiryas");
		lblNewLabel_1_2_4.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_2_4.setBounds(106, 282, 121, 14);
		updatePane.add(lblNewLabel_1_2_4);

		// Liquors area
		JLabel lblLiquors = new JLabel("Liquors");
		lblLiquors.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblLiquors.setBounds(106, 305, 71, 14);
		updatePane.add(lblLiquors);

		JLabel lblQtyToBe_1 = new JLabel("Qty to be added");
		lblQtyToBe_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblQtyToBe_1.setBounds(233, 305, 86, 14);
		updatePane.add(lblQtyToBe_1);

		JLabel lblNewLabel_1_3 = new JLabel("SMB Products 500mL");
		lblNewLabel_1_3.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_3.setBounds(91, 325, 123, 14);
		updatePane.add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_1_1 = new JLabel("SMB Products 250mL");
		lblNewLabel_1_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBounds(90, 353, 113, 14);
		updatePane.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_2_5 = new JLabel("SMB Products 1000mL");
		lblNewLabel_1_2_5.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_2_5.setBounds(91, 378, 117, 14);
		updatePane.add(lblNewLabel_1_2_5);

		JLabel lblNewLabel_1_2_1_1 = new JLabel("Canned Beer");
		lblNewLabel_1_2_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_2_1_1.setBounds(87, 403, 108, 14);
		updatePane.add(lblNewLabel_1_2_1_1);

		JLabel lblNewLabel_1_2_2_1 = new JLabel("Tanduay 5YRS/65 Longneck");
		lblNewLabel_1_2_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_2_2_1.setBounds(72, 428, 155, 14);
		updatePane.add(lblNewLabel_1_2_2_1);

		JLabel lblNewLabel_1_2_3_1 = new JLabel("Tanduay 5YRS/65 Flat");
		lblNewLabel_1_2_3_1.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_2_3_1.setBounds(72, 453, 138, 14);
		updatePane.add(lblNewLabel_1_2_3_1);

		JLabel lblNewLabel_1_2_4_1 = new JLabel("Emperador Longneck");
		lblNewLabel_1_2_4_1.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_2_4_1.setBounds(72, 478, 121, 14);
		updatePane.add(lblNewLabel_1_2_4_1);

		JLabel lblNewLabel_1_2_4_1_1 = new JLabel("Kulafu 250mL");
		lblNewLabel_1_2_4_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_2_4_1_1.setBounds(82, 503, 121, 14);
		updatePane.add(lblNewLabel_1_2_4_1_1);

		// Instant Noodles areas
		lblInstantNoodles = new JLabel("Instant Noodles");
		lblInstantNoodles.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblInstantNoodles.setBounds(106, 528, 86, 14);
		updatePane.add(lblInstantNoodles);

		lblQtyToBe_2 = new JLabel("Qty to be added");
		lblQtyToBe_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblQtyToBe_2.setBounds(233, 529, 86, 14);
		updatePane.add(lblQtyToBe_2);

		lblNewLabel_1_4 = new JLabel("LuckyMe Pancit Canton");
		lblNewLabel_1_4.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_4.setBounds(82, 548, 132, 14);
		updatePane.add(lblNewLabel_1_4);

		lblNewLabel_1_1_2 = new JLabel("LuckyMe Noodles");
		lblNewLabel_1_1_2.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_1_2.setBounds(82, 573, 133, 14);
		updatePane.add(lblNewLabel_1_1_2);

		lblNewLabel_1_2_6 = new JLabel("Cup Noodles");
		lblNewLabel_1_2_6.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_2_6.setBounds(81, 598, 129, 14);
		updatePane.add(lblNewLabel_1_2_6);

		// Canned Goods area
		lblCannedGoods = new JLabel("Canned Goods");
		lblCannedGoods.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblCannedGoods.setBounds(106, 627, 86, 14);
		updatePane.add(lblCannedGoods);

		lblQtyToBe_3 = new JLabel("Qty to be added");
		lblQtyToBe_3.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblQtyToBe_3.setBounds(233, 627, 86, 14);
		updatePane.add(lblQtyToBe_3);

		lblNewLabel_1_5 = new JLabel("Canned Sardines");
		lblNewLabel_1_5.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_5.setBounds(95, 646, 129, 14);
		updatePane.add(lblNewLabel_1_5);

		lblNewLabel_1_1_3 = new JLabel("Canned Tuna (M)");
		lblNewLabel_1_1_3.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_1_3.setBounds(95, 674, 133, 14);
		updatePane.add(lblNewLabel_1_1_3);

		// Canned Goods area -2
		lblCannedGoods_1 = new JLabel("Canned Goods");
		lblCannedGoods_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblCannedGoods_1.setBounds(425, 107, 86, 14);
		updatePane.add(lblCannedGoods_1);

		lblQtyToBe_4 = new JLabel("Qty to be added");
		lblQtyToBe_4.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblQtyToBe_4.setBounds(609, 107, 86, 14);
		updatePane.add(lblQtyToBe_4);

		lblNewLabel_1_6 = new JLabel("Canned Beefloaf (M)");
		lblNewLabel_1_6.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_6.setBounds(425, 127, 129, 14);
		updatePane.add(lblNewLabel_1_6);

		lblNewLabel_1_1_4 = new JLabel("Cannned Meatloaf (M)");
		lblNewLabel_1_1_4.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_1_4.setBounds(425, 155, 133, 14);
		updatePane.add(lblNewLabel_1_1_4);

		lblNewLabel_1_7 = new JLabel("Canned Saussage");
		lblNewLabel_1_7.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_7.setBounds(425, 180, 129, 14);
		updatePane.add(lblNewLabel_1_7);

		// Rice area
		lblCannedGoods_2 = new JLabel("Rice");
		lblCannedGoods_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblCannedGoods_2.setBounds(425, 205, 86, 14);
		updatePane.add(lblCannedGoods_2);

		lblQtyToBe_5 = new JLabel("Qty to be added");
		lblQtyToBe_5.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblQtyToBe_5.setBounds(609, 205, 86, 14);
		updatePane.add(lblQtyToBe_5);

		lblNewLabel_1_8 = new JLabel("Ganador");
		lblNewLabel_1_8.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_8.setBounds(425, 230, 129, 14);
		updatePane.add(lblNewLabel_1_8);

		lblNewLabel_1_1_5 = new JLabel("Mais #16");
		lblNewLabel_1_1_5.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_1_5.setBounds(425, 255, 133, 14);
		updatePane.add(lblNewLabel_1_1_5);

		lblNewLabel_1_9 = new JLabel("Broken Rice");
		lblNewLabel_1_9.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_9.setBounds(425, 282, 129, 14);
		updatePane.add(lblNewLabel_1_9);

		// Vegetables and Fruits area
		lblCannedGoods_3 = new JLabel("Vegetables and Fruits");
		lblCannedGoods_3.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblCannedGoods_3.setBounds(425, 305, 129, 14);
		updatePane.add(lblCannedGoods_3);

		lblQtyToBe_6 = new JLabel("Qty to be added");
		lblQtyToBe_6.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblQtyToBe_6.setBounds(609, 305, 86, 14);
		updatePane.add(lblQtyToBe_6);

		lblNewLabel_1_10 = new JLabel("Tomato");
		lblNewLabel_1_10.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_10.setBounds(466, 325, 129, 14);
		updatePane.add(lblNewLabel_1_10);

		lblNewLabel_1_1_6 = new JLabel("Potato");
		lblNewLabel_1_1_6.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_1_6.setBounds(466, 353, 133, 14);
		updatePane.add(lblNewLabel_1_1_6);

		lblNewLabel_1_11 = new JLabel("Onion");
		lblNewLabel_1_11.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_11.setBounds(466, 378, 129, 14);
		updatePane.add(lblNewLabel_1_11);

		lblNewLabel_1_1_7 = new JLabel("Garlic");
		lblNewLabel_1_1_7.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_1_7.setBounds(466, 403, 133, 14);
		updatePane.add(lblNewLabel_1_1_7);

		lblNewLabel_1_13 = new JLabel("Banana");
		lblNewLabel_1_13.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_13.setBounds(466, 428, 129, 14);
		updatePane.add(lblNewLabel_1_13);

		lblNewLabel_1_14 = new JLabel("Apple");
		lblNewLabel_1_14.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_14.setBounds(466, 453, 129, 14);
		updatePane.add(lblNewLabel_1_14);

		lblNewLabel_1_1_8 = new JLabel("Ponkan");
		lblNewLabel_1_1_8.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_1_8.setBounds(462, 478, 133, 14);
		updatePane.add(lblNewLabel_1_1_8);

		// Others area
		lblCannedGoods_4 = new JLabel("Others");
		lblCannedGoods_4.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblCannedGoods_4.setBounds(466, 503, 86, 14);
		updatePane.add(lblCannedGoods_4);

		lblQtyToBe_7 = new JLabel("Qty to be added");
		lblQtyToBe_7.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblQtyToBe_7.setBounds(609, 503, 86, 14);
		updatePane.add(lblQtyToBe_7);

		lblNewLabel_1_15 = new JLabel("Butane");
		lblNewLabel_1_15.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_15.setBounds(466, 528, 129, 14);
		updatePane.add(lblNewLabel_1_15);

		lblNewLabel_1_1_9 = new JLabel("Uling");
		lblNewLabel_1_1_9.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_1_9.setBounds(466, 548, 133, 14);
		updatePane.add(lblNewLabel_1_1_9);

		// Spices area
		lblCannedGoods_5 = new JLabel("Spices");
		lblCannedGoods_5.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblCannedGoods_5.setBounds(466, 573, 86, 14);
		updatePane.add(lblCannedGoods_5);

		lblQtyToBe_8 = new JLabel("Qty to be added");
		lblQtyToBe_8.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblQtyToBe_8.setBounds(609, 573, 86, 14);
		updatePane.add(lblQtyToBe_8);

		lblNewLabel_1_16 = new JLabel("Pack of Rack Salt");
		lblNewLabel_1_16.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_16.setBounds(466, 598, 129, 15);
		updatePane.add(lblNewLabel_1_16);

		lblNewLabel_1_1_10 = new JLabel("Vetsin");
		lblNewLabel_1_1_10.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_1_10.setBounds(466, 627, 133, 14);
		updatePane.add(lblNewLabel_1_1_10);

		// Spices area -2
		lblCannedGoods_6 = new JLabel("Spices");
		lblCannedGoods_6.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblCannedGoods_6.setBounds(809, 107, 86, 14);
		updatePane.add(lblCannedGoods_6);

		lblQtyToBe_9 = new JLabel("Qty to be added");
		lblQtyToBe_9.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblQtyToBe_9.setBounds(942, 107, 86, 14);
		updatePane.add(lblQtyToBe_9);

		lblNewLabel_1_17 = new JLabel("Class A Spice");
		lblNewLabel_1_17.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_17.setBounds(809, 127, 129, 14);
		updatePane.add(lblNewLabel_1_17);

		lblNewLabel_1_1_11 = new JLabel("Vinegar ");
		lblNewLabel_1_1_11.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_1_11.setBounds(809, 155, 133, 14);
		updatePane.add(lblNewLabel_1_1_11);

		lblNewLabel_1_18 = new JLabel("Soy Sauce");
		lblNewLabel_1_18.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_18.setBounds(809, 180, 129, 14);
		updatePane.add(lblNewLabel_1_18);

		// Bathe Essentials area
		lblCannedGoods_7 = new JLabel("Bathe Essentials");
		lblCannedGoods_7.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblCannedGoods_7.setBounds(809, 205, 86, 14);
		updatePane.add(lblCannedGoods_7);

		lblQtyToBe_10 = new JLabel("Qty to be added");
		lblQtyToBe_10.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblQtyToBe_10.setBounds(942, 205, 86, 14);
		updatePane.add(lblQtyToBe_10);

		lblNewLabel_1_19 = new JLabel("Sachet of Shampoo");
		lblNewLabel_1_19.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_19.setBounds(809, 230, 129, 14);
		updatePane.add(lblNewLabel_1_19);

		lblNewLabel_1_1_12 = new JLabel("Soap 250 grams");
		lblNewLabel_1_1_12.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_1_12.setBounds(809, 255, 133, 14);
		updatePane.add(lblNewLabel_1_1_12);

		lblNewLabel_1_20 = new JLabel("Soap 500 grams");
		lblNewLabel_1_20.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_20.setBounds(809, 282, 129, 14);
		updatePane.add(lblNewLabel_1_20);

		lblNewLabel_1_21 = new JLabel("Facial Wash 250 grams");
		lblNewLabel_1_21.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_21.setBounds(809, 305, 129, 14);
		updatePane.add(lblNewLabel_1_21);

		// Laundry Essentials Area
		lblCannedGoods_8 = new JLabel("Laundry Essentials");
		lblCannedGoods_8.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblCannedGoods_8.setBounds(809, 325, 110, 14);
		updatePane.add(lblCannedGoods_8);

		lblQtyToBe_11 = new JLabel("Qty to be added");
		lblQtyToBe_11.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblQtyToBe_11.setBounds(942, 325, 86, 14);
		updatePane.add(lblQtyToBe_11);

		lblNewLabel_1_22 = new JLabel("Powdered Wash");
		lblNewLabel_1_22.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_22.setBounds(809, 353, 129, 14);
		updatePane.add(lblNewLabel_1_22);

		lblNewLabel_1_1_13 = new JLabel("Bar Soap");
		lblNewLabel_1_1_13.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_1_13.setBounds(809, 378, 133, 14);
		updatePane.add(lblNewLabel_1_1_13);

		lblNewLabel_1_23 = new JLabel("Fabric Conditioner");
		lblNewLabel_1_23.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_23.setBounds(809, 403, 145, 14);
		updatePane.add(lblNewLabel_1_23);

		lblNewLabel_1_24 = new JLabel("Netbrush");
		lblNewLabel_1_24.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1_24.setBounds(809, 426, 129, 14);
		updatePane.add(lblNewLabel_1_24);

		// Product Codes
		JLabel Snackerslbl = new JLabel("Product Code");
		Snackerslbl.setFont(new Font("Century Gothic", Font.BOLD, 11));
		Snackerslbl.setBounds(10, 107, 86, 14);
		updatePane.add(Snackerslbl);

		JLabel SN_001 = new JLabel("SN-001");
		SN_001.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SN_001.setBounds(10, 127, 71, 14);
		updatePane.add(SN_001);

		JLabel SN_002 = new JLabel("SN-002");
		SN_002.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SN_002.setBounds(10, 155, 71, 14);
		updatePane.add(SN_002);

		SN_003 = new JLabel("SN-003");
		SN_003.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SN_003.setBounds(10, 180, 71, 14);
		updatePane.add(SN_003);

		SN_004 = new JLabel("SN-004");
		SN_004.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SN_004.setBounds(10, 205, 71, 14);
		updatePane.add(SN_004);

		SN_005 = new JLabel("SN-005");
		SN_005.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SN_005.setBounds(10, 230, 71, 14);
		updatePane.add(SN_005);

		SN_006 = new JLabel("SN-006");
		SN_006.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SN_006.setBounds(10, 255, 71, 14);
		updatePane.add(SN_006);

		SN_007 = new JLabel("SN-007");
		SN_007.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SN_007.setBounds(10, 281, 71, 14);
		updatePane.add(SN_007);

		ProductCode_LQ = new JLabel("Product Code");
		ProductCode_LQ.setFont(new Font("Century Gothic", Font.BOLD, 11));
		ProductCode_LQ.setBounds(10, 306, 86, 14);
		updatePane.add(ProductCode_LQ);

		LQ_001 = new JLabel("LQ-001");
		LQ_001.setFont(new Font("Century Gothic", Font.BOLD, 11));
		LQ_001.setBounds(10, 326, 71, 14);
		updatePane.add(LQ_001);

		LQ_002 = new JLabel("LQ-002");
		LQ_002.setFont(new Font("Century Gothic", Font.BOLD, 11));
		LQ_002.setBounds(10, 354, 71, 14);
		updatePane.add(LQ_002);

		LQ_003 = new JLabel("LQ-003");
		LQ_003.setFont(new Font("Century Gothic", Font.BOLD, 11));
		LQ_003.setBounds(10, 378, 71, 14);
		updatePane.add(LQ_003);

		LQ_004 = new JLabel("LQ-004");
		LQ_004.setFont(new Font("Century Gothic", Font.BOLD, 11));
		LQ_004.setBounds(10, 403, 71, 14);
		updatePane.add(LQ_004);

		LQ_005 = new JLabel("LQ-005");
		LQ_005.setFont(new Font("Century Gothic", Font.BOLD, 11));
		LQ_005.setBounds(10, 429, 71, 14);
		updatePane.add(LQ_005);

		LQ_006 = new JLabel("LQ-006");
		LQ_006.setFont(new Font("Century Gothic", Font.BOLD, 11));
		LQ_006.setBounds(10, 454, 71, 14);
		updatePane.add(LQ_006);

		LQ_007 = new JLabel("LQ-007");
		LQ_007.setFont(new Font("Century Gothic", Font.BOLD, 11));
		LQ_007.setBounds(10, 479, 71, 14);
		updatePane.add(LQ_007);

		LQ_008 = new JLabel("LQ-008");
		LQ_008.setFont(new Font("Century Gothic", Font.BOLD, 11));
		LQ_008.setBounds(10, 503, 71, 14);
		updatePane.add(LQ_008);

		ProductCode_IN = new JLabel("Product Code");
		ProductCode_IN.setFont(new Font("Century Gothic", Font.BOLD, 11));
		ProductCode_IN.setBounds(10, 528, 86, 14);
		updatePane.add(ProductCode_IN);

		IN_001 = new JLabel("IN-001");
		IN_001.setFont(new Font("Century Gothic", Font.BOLD, 11));
		IN_001.setBounds(10, 549, 71, 14);
		updatePane.add(IN_001);

		IN_002 = new JLabel("IN-002");
		IN_002.setFont(new Font("Century Gothic", Font.BOLD, 11));
		IN_002.setBounds(10, 574, 71, 14);
		updatePane.add(IN_002);

		IN_003 = new JLabel("IN-003");
		IN_003.setFont(new Font("Century Gothic", Font.BOLD, 11));
		IN_003.setBounds(10, 599, 71, 14);
		updatePane.add(IN_003);

		ProductCode_CG_01 = new JLabel("Product Code");
		ProductCode_CG_01.setFont(new Font("Century Gothic", Font.BOLD, 11));
		ProductCode_CG_01.setBounds(10, 628, 86, 14);
		updatePane.add(ProductCode_CG_01);

		CG_001 = new JLabel("CG-001");
		CG_001.setFont(new Font("Century Gothic", Font.BOLD, 11));
		CG_001.setBounds(10, 647, 71, 14);
		updatePane.add(CG_001);

		CG_002 = new JLabel("CG-002");
		CG_002.setFont(new Font("Century Gothic", Font.BOLD, 11));
		CG_002.setBounds(10, 675, 71, 14);
		updatePane.add(CG_002);

		ProductcCode_CG_02 = new JLabel("Product Code");
		ProductcCode_CG_02.setFont(new Font("Century Gothic", Font.BOLD, 11));
		ProductcCode_CG_02.setBounds(329, 107, 86, 14);
		updatePane.add(ProductcCode_CG_02);

		CG_003 = new JLabel("CG-003");
		CG_003.setFont(new Font("Century Gothic", Font.BOLD, 11));
		CG_003.setBounds(329, 127, 71, 14);
		updatePane.add(CG_003);

		CG_004 = new JLabel("CG-004");
		CG_004.setFont(new Font("Century Gothic", Font.BOLD, 11));
		CG_004.setBounds(329, 155, 71, 14);
		updatePane.add(CG_004);

		CG_005 = new JLabel("CG-005");
		CG_005.setFont(new Font("Century Gothic", Font.BOLD, 11));
		CG_005.setBounds(329, 180, 71, 14);
		updatePane.add(CG_005);

		ProductcCode_RC = new JLabel("Product Code");
		ProductcCode_RC.setFont(new Font("Century Gothic", Font.BOLD, 11));
		ProductcCode_RC.setBounds(329, 206, 86, 14);
		updatePane.add(ProductcCode_RC);

		RC_001 = new JLabel("RC-001");
		RC_001.setFont(new Font("Century Gothic", Font.BOLD, 11));
		RC_001.setBounds(329, 231, 71, 14);
		updatePane.add(RC_001);

		RC_002 = new JLabel("RC-002");
		RC_002.setFont(new Font("Century Gothic", Font.BOLD, 11));
		RC_002.setBounds(329, 256, 71, 14);
		updatePane.add(RC_002);

		RC_003 = new JLabel("RC-003");
		RC_003.setFont(new Font("Century Gothic", Font.BOLD, 11));
		RC_003.setBounds(329, 283, 71, 14);
		updatePane.add(RC_003);

		ProductcCode_VF = new JLabel("Product Code");
		ProductcCode_VF.setFont(new Font("Century Gothic", Font.BOLD, 11));
		ProductcCode_VF.setBounds(329, 306, 86, 14);
		updatePane.add(ProductcCode_VF);

		VF_001 = new JLabel("VF-001");
		VF_001.setFont(new Font("Century Gothic", Font.BOLD, 11));
		VF_001.setBounds(329, 326, 71, 14);
		updatePane.add(VF_001);

		VF_002 = new JLabel("VF-002");
		VF_002.setFont(new Font("Century Gothic", Font.BOLD, 11));
		VF_002.setBounds(329, 354, 71, 14);
		updatePane.add(VF_002);

		VF_003 = new JLabel("VF-003");
		VF_003.setFont(new Font("Century Gothic", Font.BOLD, 11));
		VF_003.setBounds(329, 379, 71, 14);
		updatePane.add(VF_003);

		VF_004 = new JLabel("VF-004");
		VF_004.setFont(new Font("Century Gothic", Font.BOLD, 11));
		VF_004.setBounds(329, 404, 71, 14);
		updatePane.add(VF_004);

		VF_005 = new JLabel("VF-005");
		VF_005.setFont(new Font("Century Gothic", Font.BOLD, 11));
		VF_005.setBounds(329, 429, 71, 14);
		updatePane.add(VF_005);

		VF_006 = new JLabel("VF-006");
		VF_006.setFont(new Font("Century Gothic", Font.BOLD, 11));
		VF_006.setBounds(329, 454, 71, 14);
		updatePane.add(VF_006);

		VF_007 = new JLabel("VF-007");
		VF_007.setFont(new Font("Century Gothic", Font.BOLD, 11));
		VF_007.setBounds(329, 479, 71, 14);
		updatePane.add(VF_007);

		ProductcCode_OT = new JLabel("Product Code");
		ProductcCode_OT.setFont(new Font("Century Gothic", Font.BOLD, 11));
		ProductcCode_OT.setBounds(329, 503, 86, 14);
		updatePane.add(ProductcCode_OT);

		OT_001 = new JLabel("OT-001");
		OT_001.setFont(new Font("Century Gothic", Font.BOLD, 11));
		OT_001.setBounds(329, 528, 71, 14);
		updatePane.add(OT_001);

		OT_002 = new JLabel("OT-002");
		OT_002.setFont(new Font("Century Gothic", Font.BOLD, 11));
		OT_002.setBounds(329, 548, 71, 14);
		updatePane.add(OT_002);

		ProductcCode_SP_001 = new JLabel("Product Code");
		ProductcCode_SP_001.setFont(new Font("Century Gothic", Font.BOLD, 11));
		ProductcCode_SP_001.setBounds(329, 573, 86, 14);
		updatePane.add(ProductcCode_SP_001);

		SP_001 = new JLabel("SP-001");
		SP_001.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SP_001.setBounds(329, 598, 71, 14);
		updatePane.add(SP_001);

		SP_002 = new JLabel("SP-002");
		SP_002.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SP_002.setBounds(329, 627, 71, 14);
		updatePane.add(SP_002);

		ProductcCode_SP = new JLabel("Product Code");
		ProductcCode_SP.setFont(new Font("Century Gothic", Font.BOLD, 11));
		ProductcCode_SP.setBounds(705, 107, 86, 14);
		updatePane.add(ProductcCode_SP);

		SP_003 = new JLabel("SP-003");
		SP_003.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SP_003.setBounds(705, 128, 71, 14);
		updatePane.add(SP_003);

		SP_004 = new JLabel("SP-004");
		SP_004.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SP_004.setBounds(705, 156, 71, 14);
		updatePane.add(SP_004);

		SP_005 = new JLabel("SP-005");
		SP_005.setFont(new Font("Century Gothic", Font.BOLD, 11));
		SP_005.setBounds(705, 181, 71, 14);
		updatePane.add(SP_005);

		ProductcCode_BE = new JLabel("Product Code");
		ProductcCode_BE.setFont(new Font("Century Gothic", Font.BOLD, 11));
		ProductcCode_BE.setBounds(705, 206, 86, 14);
		updatePane.add(ProductcCode_BE);

		BE_001 = new JLabel("BE-001");
		BE_001.setFont(new Font("Century Gothic", Font.BOLD, 11));
		BE_001.setBounds(705, 231, 71, 14);
		updatePane.add(BE_001);

		BE_002 = new JLabel("BE-002");
		BE_002.setFont(new Font("Century Gothic", Font.BOLD, 11));
		BE_002.setBounds(705, 256, 71, 14);
		updatePane.add(BE_002);

		BE_003 = new JLabel("BE-003");
		BE_003.setFont(new Font("Century Gothic", Font.BOLD, 11));
		BE_003.setBounds(705, 282, 71, 14);
		updatePane.add(BE_003);

		BE_004 = new JLabel("BE-004");
		BE_004.setFont(new Font("Century Gothic", Font.BOLD, 11));
		BE_004.setBounds(705, 306, 71, 14);
		updatePane.add(BE_004);

		ProductcCode_LE = new JLabel("Product Code");
		ProductcCode_LE.setFont(new Font("Century Gothic", Font.BOLD, 11));
		ProductcCode_LE.setBounds(705, 326, 86, 14);
		updatePane.add(ProductcCode_LE);

		LE_001 = new JLabel("LE-001");
		LE_001.setFont(new Font("Century Gothic", Font.BOLD, 11));
		LE_001.setBounds(705, 354, 71, 14);
		updatePane.add(LE_001);

		LE_002 = new JLabel("LE-002");
		LE_002.setFont(new Font("Century Gothic", Font.BOLD, 11));
		LE_002.setBounds(705, 379, 71, 14);
		updatePane.add(LE_002);

		LE__003 = new JLabel("LE-003");
		LE__003.setFont(new Font("Century Gothic", Font.BOLD, 11));
		LE__003.setBounds(705, 404, 71, 14);
		updatePane.add(LE__003);

		LE_004 = new JLabel("LE-004");
		LE_004.setFont(new Font("Century Gothic", Font.BOLD, 11));
		LE_004.setBounds(705, 429, 71, 14);
		updatePane.add(LE_004);

		ProductcCode_HG = new JLabel("Product Code");
		ProductcCode_HG.setFont(new Font("Century Gothic", Font.BOLD, 11));
		ProductcCode_HG.setBounds(705, 454, 86, 14);
		updatePane.add(ProductcCode_HG);

		HG_001 = new JLabel("HG-001");
		HG_001.setFont(new Font("Century Gothic", Font.BOLD, 11));
		HG_001.setBounds(705, 479, 71, 14);
		updatePane.add(HG_001);

		HG_002 = new JLabel("HG-002");
		HG_002.setFont(new Font("Century Gothic", Font.BOLD, 11));
		HG_002.setBounds(705, 504, 71, 14);
		updatePane.add(HG_002);

		HG_003 = new JLabel("HG-003");
		HG_003.setFont(new Font("Century Gothic", Font.BOLD, 11));
		HG_003.setBounds(705, 528, 71, 14);
		updatePane.add(HG_003);

		HG_004 = new JLabel("HG-004");
		HG_004.setFont(new Font("Century Gothic", Font.BOLD, 11));
		HG_004.setBounds(705, 573, 71, 14);
		updatePane.add(HG_004);

		HG_005 = new JLabel("HG-005");
		HG_005.setFont(new Font("Century Gothic", Font.BOLD, 11));
		HG_005.setBounds(705, 599, 71, 14);
		updatePane.add(HG_005);

		HG_006 = new JLabel("HG-006");
		HG_006.setFont(new Font("Century Gothic", Font.BOLD, 11));
		HG_006.setBounds(705, 628, 71, 14);
		updatePane.add(HG_006);

		// Update Labels
		BreadUpt = new JLabel("0");
		BreadUpt.setForeground(Color.BLACK);
		BreadUpt.setEnabled(false);
		BreadUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BreadUpt.setBounds(259, 127, 71, 14);
		updatePane.add(BreadUpt);

		SopasUpt = new JLabel("0");
		SopasUpt.setForeground(Color.BLACK);
		SopasUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SopasUpt.setEnabled(false);
		SopasUpt.setBounds(259, 156, 71, 14);
		updatePane.add(SopasUpt);

		JFMUpt = new JLabel("0");
		JFMUpt.setForeground(Color.BLACK);
		JFMUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		JFMUpt.setEnabled(false);
		JFMUpt.setBounds(259, 181, 71, 14);
		updatePane.add(JFMUpt);

		JFLUpt = new JLabel("0");
		JFLUpt.setForeground(Color.BLACK);
		JFLUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		JFLUpt.setEnabled(false);
		JFLUpt.setBounds(259, 206, 71, 14);
		updatePane.add(JFLUpt);

		CandiesUpt = new JLabel("0");
		CandiesUpt.setForeground(Color.BLACK);
		CandiesUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		CandiesUpt.setEnabled(false);
		CandiesUpt.setBounds(259, 231, 71, 14);
		updatePane.add(CandiesUpt);

		BsctsUpt = new JLabel("0");
		BsctsUpt.setForeground(Color.BLACK);
		BsctsUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BsctsUpt.setEnabled(false);
		BsctsUpt.setBounds(259, 256, 71, 14);
		updatePane.add(BsctsUpt);

		ChiUpt = new JLabel("0");
		ChiUpt.setForeground(Color.BLACK);
		ChiUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ChiUpt.setEnabled(false);
		ChiUpt.setBounds(259, 283, 71, 14);
		updatePane.add(ChiUpt);

		SMB500Upt = new JLabel("0");
		SMB500Upt.setForeground(Color.BLACK);
		SMB500Upt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SMB500Upt.setEnabled(false);
		SMB500Upt.setBounds(259, 326, 71, 14);
		updatePane.add(SMB500Upt);

		SMB250Upt = new JLabel("0");
		SMB250Upt.setForeground(Color.BLACK);
		SMB250Upt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SMB250Upt.setEnabled(false);
		SMB250Upt.setBounds(259, 354, 71, 14);
		updatePane.add(SMB250Upt);

		SMB1kUpt = new JLabel("0");
		SMB1kUpt.setForeground(Color.BLACK);
		SMB1kUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SMB1kUpt.setEnabled(false);
		SMB1kUpt.setBounds(259, 379, 39, 14);
		updatePane.add(SMB1kUpt);

		CBeerUpt = new JLabel("0");
		CBeerUpt.setForeground(Color.BLACK);
		CBeerUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		CBeerUpt.setEnabled(false);
		CBeerUpt.setBounds(259, 404, 39, 14);
		updatePane.add(CBeerUpt);

		TanLNUpt = new JLabel("0");
		TanLNUpt.setForeground(Color.BLACK);
		TanLNUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		TanLNUpt.setEnabled(false);
		TanLNUpt.setBounds(259, 429, 71, 14);
		updatePane.add(TanLNUpt);

		TanFLUpt = new JLabel("0");
		TanFLUpt.setForeground(Color.BLACK);
		TanFLUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		TanFLUpt.setEnabled(false);
		TanFLUpt.setBounds(259, 457, 71, 14);
		updatePane.add(TanFLUpt);

		EmpeUpt = new JLabel("0");
		EmpeUpt.setForeground(Color.BLACK);
		EmpeUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		EmpeUpt.setEnabled(false);
		EmpeUpt.setBounds(259, 479, 71, 14);
		updatePane.add(EmpeUpt);

		KulafuUpt = new JLabel("0");
		KulafuUpt.setForeground(Color.BLACK);
		KulafuUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		KulafuUpt.setEnabled(false);
		KulafuUpt.setBounds(259, 504, 71, 14);
		updatePane.add(KulafuUpt);

		PCantonUpt = new JLabel("0");
		PCantonUpt.setForeground(Color.BLACK);
		PCantonUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		PCantonUpt.setEnabled(false);
		PCantonUpt.setBounds(259, 549, 71, 14);
		updatePane.add(PCantonUpt);

		NoodlesUpt = new JLabel("0");
		NoodlesUpt.setForeground(Color.BLACK);
		NoodlesUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		NoodlesUpt.setEnabled(false);
		NoodlesUpt.setBounds(259, 574, 71, 14);
		updatePane.add(NoodlesUpt);

		CNoodlesUpt = new JLabel("0");
		CNoodlesUpt.setForeground(Color.BLACK);
		CNoodlesUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		CNoodlesUpt.setEnabled(false);
		CNoodlesUpt.setBounds(259, 599, 71, 14);
		updatePane.add(CNoodlesUpt);

		SardinesUpt = new JLabel("0");
		SardinesUpt.setForeground(Color.BLACK);
		SardinesUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SardinesUpt.setEnabled(false);
		SardinesUpt.setBounds(259, 647, 71, 14);
		updatePane.add(SardinesUpt);

		TunaUpt = new JLabel("0");
		TunaUpt.setForeground(Color.BLACK);
		TunaUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		TunaUpt.setEnabled(false);
		TunaUpt.setBounds(259, 675, 71, 14);
		updatePane.add(TunaUpt);

		BeefLUpt = new JLabel("0");
		BeefLUpt.setForeground(Color.BLACK);
		BeefLUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BeefLUpt.setEnabled(false);
		BeefLUpt.setBounds(636, 128, 71, 14);
		updatePane.add(BeefLUpt);

		MeatLUpt = new JLabel("0");
		MeatLUpt.setForeground(Color.BLACK);
		MeatLUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		MeatLUpt.setEnabled(false);
		MeatLUpt.setBounds(636, 156, 71, 14);
		updatePane.add(MeatLUpt);

		SausUpt = new JLabel("0");
		SausUpt.setForeground(Color.BLACK);
		SausUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SausUpt.setEnabled(false);
		SausUpt.setBounds(636, 181, 71, 14);
		updatePane.add(SausUpt);

		GanadorUpt = new JLabel("0");
		GanadorUpt.setForeground(Color.BLACK);
		GanadorUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt.setEnabled(false);
		GanadorUpt.setBounds(636, 231, 28, 14);
		updatePane.add(GanadorUpt);

		MaisUpt = new JLabel("0");
		MaisUpt.setForeground(Color.BLACK);
		MaisUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		MaisUpt.setEnabled(false);
		MaisUpt.setBounds(636, 256, 71, 14);
		updatePane.add(MaisUpt);

		BRiceUpt = new JLabel("0");
		BRiceUpt.setForeground(Color.BLACK);
		BRiceUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BRiceUpt.setEnabled(false);
		BRiceUpt.setBounds(636, 283, 71, 14);
		updatePane.add(BRiceUpt);

		TomatoUpt = new JLabel("0");
		TomatoUpt.setForeground(Color.BLACK);
		TomatoUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		TomatoUpt.setEnabled(false);
		TomatoUpt.setBounds(636, 326, 71, 14);
		updatePane.add(TomatoUpt);

		PotatoUpt = new JLabel("0");
		PotatoUpt.setForeground(Color.BLACK);
		PotatoUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		PotatoUpt.setEnabled(false);
		PotatoUpt.setBounds(636, 354, 71, 14);
		updatePane.add(PotatoUpt);

		OnionUpt = new JLabel("0");
		OnionUpt.setForeground(Color.BLACK);
		OnionUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		OnionUpt.setEnabled(false);
		OnionUpt.setBounds(636, 379, 71, 14);
		updatePane.add(OnionUpt);

		GarlicUpt = new JLabel("0");
		GarlicUpt.setForeground(Color.BLACK);
		GarlicUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GarlicUpt.setEnabled(false);
		GarlicUpt.setBounds(636, 404, 71, 14);
		updatePane.add(GarlicUpt);

		BananaUpt = new JLabel("0");
		BananaUpt.setForeground(Color.BLACK);
		BananaUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BananaUpt.setEnabled(false);
		BananaUpt.setBounds(636, 429, 71, 14);
		updatePane.add(BananaUpt);

		AppleUpt = new JLabel("0");
		AppleUpt.setForeground(Color.BLACK);
		AppleUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		AppleUpt.setEnabled(false);
		AppleUpt.setBounds(636, 454, 71, 14);
		updatePane.add(AppleUpt);

		PonkanUpt = new JLabel("0");
		PonkanUpt.setForeground(Color.BLACK);
		PonkanUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		PonkanUpt.setEnabled(false);
		PonkanUpt.setBounds(636, 479, 71, 14);
		updatePane.add(PonkanUpt);

		ButaneUpt = new JLabel("0");
		ButaneUpt.setForeground(Color.BLACK);
		ButaneUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ButaneUpt.setEnabled(false);
		ButaneUpt.setBounds(636, 529, 71, 14);
		updatePane.add(ButaneUpt);

		UlingUpt = new JLabel("0");
		UlingUpt.setForeground(Color.BLACK);
		UlingUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		UlingUpt.setEnabled(false);
		UlingUpt.setBounds(636, 549, 71, 14);
		updatePane.add(UlingUpt);

		AsinUpt = new JLabel("0");
		AsinUpt.setForeground(Color.BLACK);
		AsinUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		AsinUpt.setEnabled(false);
		AsinUpt.setBounds(636, 599, 28, 14);
		updatePane.add(AsinUpt);

		VetsinUpt = new JLabel("0");
		VetsinUpt.setForeground(Color.BLACK);
		VetsinUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		VetsinUpt.setEnabled(false);
		VetsinUpt.setBounds(636, 628, 28, 14);
		updatePane.add(VetsinUpt);

		SpiceUpt = new JLabel("0");
		SpiceUpt.setForeground(Color.BLACK);
		SpiceUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SpiceUpt.setEnabled(false);
		SpiceUpt.setBounds(975, 127, 28, 14);
		updatePane.add(SpiceUpt);

		VinegarUpt = new JLabel("0");
		VinegarUpt.setForeground(Color.BLACK);
		VinegarUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		VinegarUpt.setEnabled(false);
		VinegarUpt.setBounds(975, 155, 71, 14);
		updatePane.add(VinegarUpt);

		SSauceUpt = new JLabel("0");
		SSauceUpt.setForeground(Color.BLACK);
		SSauceUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		SSauceUpt.setEnabled(false);
		SSauceUpt.setBounds(975, 180, 71, 14);
		updatePane.add(SSauceUpt);

		ShamUpt = new JLabel("0");
		ShamUpt.setForeground(Color.BLACK);
		ShamUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		ShamUpt.setEnabled(false);
		ShamUpt.setBounds(975, 231, 28, 14);
		updatePane.add(ShamUpt);

		Soap250Upt = new JLabel("0");
		Soap250Upt.setForeground(Color.BLACK);
		Soap250Upt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Soap250Upt.setEnabled(false);
		Soap250Upt.setBounds(975, 256, 71, 14);
		updatePane.add(Soap250Upt);

		Soap500Upt = new JLabel("0");
		Soap500Upt.setForeground(Color.BLACK);
		Soap500Upt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		Soap500Upt.setEnabled(false);
		Soap500Upt.setBounds(975, 283, 71, 14);
		updatePane.add(Soap500Upt);

		FWashUpt = new JLabel("0");
		FWashUpt.setForeground(Color.BLACK);
		FWashUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		FWashUpt.setEnabled(false);
		FWashUpt.setBounds(975, 306, 28, 14);
		updatePane.add(FWashUpt);

		PWashUpt = new JLabel("0");
		PWashUpt.setForeground(Color.BLACK);
		PWashUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		PWashUpt.setEnabled(false);
		PWashUpt.setBounds(975, 354, 28, 14);
		updatePane.add(PWashUpt);

		BSoapUpt = new JLabel("0");
		BSoapUpt.setForeground(Color.BLACK);
		BSoapUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		BSoapUpt.setEnabled(false);
		BSoapUpt.setBounds(975, 379, 71, 14);
		updatePane.add(BSoapUpt);

		FConditionerUpt = new JLabel("0");
		FConditionerUpt.setForeground(Color.BLACK);
		FConditionerUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		FConditionerUpt.setEnabled(false);
		FConditionerUpt.setBounds(975, 404, 71, 14);
		updatePane.add(FConditionerUpt);

		NetBrushUpt = new JLabel("0");
		NetBrushUpt.setForeground(Color.BLACK);
		NetBrushUpt.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		NetBrushUpt.setEnabled(false);
		NetBrushUpt.setBounds(975, 429, 28, 14);
		updatePane.add(NetBrushUpt);

		// Buttons and stuffs
		btnHelp = new JButton("HELP?");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(updatePane, "Need Help? Keep in touch the developer through this contact informations: isys@gmail.com or call us at: 09562915566", "ISys: Powered by EclipseIDE",
						JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btnHelp.setBackground(Color.YELLOW);
		btnHelp.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnHelp.setBounds(1158, 503, 110, 36);
		updatePane.add(btnHelp);

		btnReturn = new JButton("RETURN");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnReturn.setBackground(Color.RED);
		btnReturn.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnReturn.setBounds(1038, 503, 110, 36);
		updatePane.add(btnReturn);

		ProductUpdateSystemin = new JLabel("PRODUCT UPDATE SYSTEM");
		ProductUpdateSystemin.setBackground(Color.WHITE);
		ProductUpdateSystemin.setForeground(Color.BLACK);
		ProductUpdateSystemin.setFont(new Font("Century Gothic", Font.BOLD, 20));
		ProductUpdateSystemin.setBounds(1038, 155, 407, 53);
		updatePane.add(ProductUpdateSystemin);

		UptPanel = new JPanel();
		UptPanel.setBackground(Color.GREEN);
		UptPanel.setBounds(1038, 205, 252, 255);
		updatePane.add(UptPanel);
		UptPanel.setLayout(null);

		ProductCodelbl = new JLabel("PRODUCT CODE");
		ProductCodelbl.setFont(new Font("Century Gothic", Font.BOLD, 16));
		ProductCodelbl.setBounds(66, 34, 159, 14);
		UptPanel.add(ProductCodelbl);

		Itemin = new JTextField();
		Itemin.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		Itemin.setBounds(76, 59, 107, 29);
		UptPanel.add(Itemin);
		Itemin.setColumns(10);

		Quantitylbl = new JLabel("QUANTITY");
		Quantitylbl.setFont(new Font("Century Gothic", Font.BOLD, 16));
		Quantitylbl.setBounds(86, 105, 159, 14);
		UptPanel.add(Quantitylbl);

		Qtyin = new JTextField();
		Qtyin.setColumns(10);
		Qtyin.setBounds(76, 130, 107, 29);
		UptPanel.add(Qtyin);

		UpdateBtn = new JButton("UPDATE");
		UpdateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String itemin = Itemin.getText();
				double qtyin = Double.parseDouble(Qtyin.getText());

				// Snackers area
				double breadqty = Double.parseDouble(BreadUpt.getText());
				double sopasqty = Double.parseDouble(SopasUpt.getText());
				double jfmqty = Double.parseDouble(JFMUpt.getText());
				double jflqty = Double.parseDouble(JFLUpt.getText());
				double candiesqty = Double.parseDouble(CandiesUpt.getText());
				double bsctsqty = Double.parseDouble(BsctsUpt.getText());
				double chiqty = Double.parseDouble(ChiUpt.getText());

				double breadin = qtyin + breadqty;
				double sopasin = qtyin + sopasqty;
				double jfmin = qtyin + jfmqty;
				double jflin = qtyin + jflqty;
				double candiesin = qtyin + candiesqty;
				double bsctsin = qtyin + bsctsqty;
				double chiin = qtyin + chiqty;

				// Liquors area
				double smb500qty = Double.parseDouble(SMB500Upt.getText());
				double smb250qty = Double.parseDouble(SMB250Upt.getText());
				double smb1kqty = Double.parseDouble(SMB1kUpt.getText());
				double cbeerqty = Double.parseDouble(CBeerUpt.getText());
				double tanlnqty = Double.parseDouble(TanLNUpt.getText());
				double tanflqty = Double.parseDouble(TanFLUpt.getText());
				double empeqty = Double.parseDouble(EmpeUpt.getText());
				double kulafuqty = Double.parseDouble(KulafuUpt.getText());

				double smb500in = qtyin + smb500qty;
				double smb250in = qtyin + smb250qty;
				double smb1kin = qtyin + smb1kqty;
				double cbeerin = qtyin + cbeerqty;
				double tanlnin = qtyin + tanlnqty;
				double tanflin = qtyin + tanflqty;
				double empein = qtyin + empeqty;
				double kulafuin = qtyin + kulafuqty;

				// Instant Noodles area
				double pcantonqty = Double.parseDouble(PCantonUpt.getText());
				double noodlesqty = Double.parseDouble(NoodlesUpt.getText());
				double cnoodlesqty = Double.parseDouble(CNoodlesUpt.getText());

				double pcantonin = qtyin + pcantonqty;
				double noodlesin = qtyin + noodlesqty;
				double cnoodlesin = qtyin + cnoodlesqty;

				// Canned Goods area
				double sardinesqty = Double.parseDouble(SardinesUpt.getText());
				double tunaqty = Double.parseDouble(TunaUpt.getText());
				double beeflqty = Double.parseDouble(BeefLUpt.getText());
				double meatlqty = Double.parseDouble(MeatLUpt.getText());
				double sausqty = Double.parseDouble(SausUpt.getText());

				double sardinesin = qtyin + sardinesqty;
				double tunain = qtyin + tunaqty;
				double beeflin = qtyin + beeflqty;
				double meatlin = qtyin + meatlqty;
				double sausin = qtyin + sausqty;

				// Rice area
				double ganadorqty = Double.parseDouble(GanadorUpt.getText());
				double maisqty = Double.parseDouble(MaisUpt.getText());
				double briceqty = Double.parseDouble(BRiceUpt.getText());

				double ganadorin = qtyin + ganadorqty;
				double maisin = qtyin + maisqty;
				double bricein = qtyin + briceqty;

				// Vegetables area
				double tomatoqty = Double.parseDouble(TomatoUpt.getText());
				double potatoqty = Double.parseDouble(PotatoUpt.getText());
				double onionqty = Double.parseDouble(OnionUpt.getText());
				double garlicqty = Double.parseDouble(GarlicUpt.getText());
				double bananaqty = Double.parseDouble(BananaUpt.getText());
				double appleqty = Double.parseDouble(AppleUpt.getText());
				double ponkanqty = Double.parseDouble(PonkanUpt.getText());

				double tomatoin = qtyin + tomatoqty;
				double potatoin = qtyin + potatoqty;
				double onionin = qtyin + onionqty;
				double garlicin = qtyin + garlicqty;
				double bananain = qtyin + bananaqty;
				double applein = qtyin + appleqty;
				double ponkanin = qtyin + ponkanqty;

				// Others area
				double butaneqty = Double.parseDouble(ButaneUpt.getText());
				double ulingqty = Double.parseDouble(UlingUpt.getText());

				double butanein = qtyin + butaneqty;
				double ulingin = qtyin + ulingqty;

				// Spices area
				double asinqty = Double.parseDouble(AsinUpt.getText());
				double vetsinqty = Double.parseDouble(VetsinUpt.getText());
				double spiceqty = Double.parseDouble(SpiceUpt.getText());
				double vinegarqty = Double.parseDouble(VinegarUpt.getText());
				double ssauceqty = Double.parseDouble(SSauceUpt.getText());

				double asinin = qtyin + asinqty;
				double vetsinin = qtyin + vetsinqty;
				double spicein = qtyin + spiceqty;
				double vinegarin = qtyin + vinegarqty;
				double ssaucein = qtyin + ssauceqty;

				// Bathe Essentials area
				double shamqty = Double.parseDouble(ShamUpt.getText());
				double soap250qty = Double.parseDouble(Soap250Upt.getText());
				double soap500qty = Double.parseDouble(Soap500Upt.getText());
				double fwashqty = Double.parseDouble(FWashUpt.getText());

				double shamin = qtyin + shamqty;
				double soap250in = qtyin + soap250qty;
				double soap500in = qtyin + soap500qty;
				double fwashin = qtyin + fwashqty;

				// Laundry Essentials area
				double pwashqty = Double.parseDouble(PWashUpt.getText());
				double bsoapqty = Double.parseDouble(BSoapUpt.getText());
				double fconditionerqty = Double.parseDouble(FConditionerUpt.getText());
				double netbrushqty = Double.parseDouble(NetBrushUpt.getText());

				double pwashin = qtyin + pwashqty;
				double bsoapin = qtyin + bsoapqty;
				double fconditionerin = qtyin + fconditionerqty;
				double netbrushin = qtyin + netbrushqty;
				
				if (itemin.equals("SN-001")) {
					BreadUpt.setText("" + String.format("%.0f", breadin));
					BreadUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("SN-002")) {
					SopasUpt.setText("" + String.format("%.0f", sopasin));
					SopasUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("SN-003")) {
					JFMUpt.setText("" + String.format("%.0f", jfmin));
					JFMUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("SN-004")) {
					JFLUpt.setText("" + String.format("%.0f", jflin));
					JFLUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("SN-005")) {
					CandiesUpt.setText("" + String.format("%.0f", candiesin));
					CandiesUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("SN-006")) {
					BsctsUpt.setText("" + String.format("%.0f", bsctsin));
					BsctsUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("SN-007")) {
					ChiUpt.setText("" + String.format("%.0f", chiin));
					ChiUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("LQ-001")) {
					SMB500Upt.setText("" + String.format("%.0f", smb500in));
					SMB500Upt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("LQ-002")) {
					SMB250Upt.setText("" + String.format("%.0f", smb250in));
					SMB250Upt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("LQ-003")) {
					SMB1kUpt.setText("" + String.format("%.0f", smb1kin));
					SMB1kUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("LQ-004")) {
					CBeerUpt.setText("" + String.format("%.0f", cbeerin));
					CBeerUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("LQ-005")) {
					TanLNUpt.setText("" + String.format("%.0f", tanlnin));
					TanLNUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("LQ-006")) {
					TanFLUpt.setText("" + String.format("%.0f", tanflin));
					TanFLUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("LQ-007")) {
					EmpeUpt.setText("" + String.format("%.0f", empein));
					EmpeUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("LQ-008")) {
					KulafuUpt.setText("" + String.format("%.0f", kulafuin));
					KulafuUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("IN-001")) {
					PCantonUpt.setText("" + String.format("%.0f", pcantonin));
					PCantonUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("IN-002")) {
					NoodlesUpt.setText("" + String.format("%.0f", noodlesin));
					NoodlesUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("IN-003")) {
					CNoodlesUpt.setText("" + String.format("%.0f", cnoodlesin));
					CNoodlesUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("CG-001")) {
					SardinesUpt.setText("" + String.format("%.0f", sardinesin));
					SardinesUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("CG-002")) {
					TunaUpt.setText("" + String.format("%.0f", tunain));
					TunaUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("CG-003")) {
					BeefLUpt.setText("" + String.format("%.0f", beeflin));
					BeefLUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("CG-004")) {
					MeatLUpt.setText("" + String.format("%.0f", meatlin));
					MeatLUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("CG-005")) {
					SausUpt.setText("" + String.format("%.0f", sausin));
					SausUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("RC-001")) {
					GanadorUpt.setText("" + String.format("%.2f", ganadorin));
					GanadorUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("RC-002")) {
					MaisUpt.setText("" + String.format("%.2f", maisin));
					MaisUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("RC-003")) {
					BRiceUpt.setText("" + String.format("%.2f", bricein));
					BRiceUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("VF-001")) {
					TomatoUpt.setText("" + String.format("%.0f", tomatoin));
					TomatoUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("VF-002")) {
					PotatoUpt.setText("" + String.format("%.0f", potatoin));
					PotatoUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("VF-003")) {
					OnionUpt.setText("" + String.format("%.0f", onionin));
					OnionUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("VF-004")) {
					GarlicUpt.setText("" + String.format("%.0f", garlicin));
					GarlicUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("VF-005")) {
					BananaUpt.setText("" + String.format("%.0f", bananain));
					BananaUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("VF-006")) {
					AppleUpt.setText("" + String.format("%.0f", applein));
					AppleUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("VF-007")) {
					PonkanUpt.setText("" + String.format("%.0f", ponkanin));
					PonkanUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("OT-001")) {
					ButaneUpt.setText("" + String.format("%.0f", butanein));
					ButaneUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("OT-002")) {
					UlingUpt.setText("" + String.format("%.0f", ulingin));
					UlingUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("SP-001")) {
					AsinUpt.setText("" + String.format("%.0f", asinin));
					AsinUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("SP-002")) {
					VetsinUpt.setText("" + String.format("%.0f", vetsinin));
					VetsinUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("SP-003")) {
					SpiceUpt.setText("" + String.format("%.0f", spicein));
					SpiceUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("SP-004")) {
					VinegarUpt.setText("" + String.format("%.0f", vinegarin));
					VinegarUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("SP-005")) {
					SSauceUpt.setText("" + String.format("%.0f", ssaucein));
					SSauceUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("BE-001")) {
					ShamUpt.setText("" + String.format("%.0f", shamin));
					ShamUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("BE-002")) {
					Soap250Upt.setText("" + String.format("%.0f", soap250in));
					Soap250Upt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("BE-003")) {
					Soap500Upt.setText("" + String.format("%.0f", soap500in));
					Soap500Upt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("BE-004")) {
					FWashUpt.setText("" + String.format("%.0f", fwashin));
					FWashUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("LE-001")) {
					PWashUpt.setText("" + String.format("%.0f", pwashin));
					PWashUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("LE-002")) {
					BSoapUpt.setText("" + String.format("%.0f", bsoapin));
					BSoapUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("LE-003")) {
					FConditionerUpt.setText("" + String.format("%.0f", fconditionerin));
					FConditionerUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.equals("LE-004")) {
					NetBrushUpt.setText("" + String.format("%.0f", netbrushin));
					NetBrushUpt.setEnabled(true);
					JOptionPane.showMessageDialog(updatePane, "Product added successfully!", "ISys: Powered by EclipseIDE",
							JOptionPane.INFORMATION_MESSAGE);
					Qtyin.setText("");
					Itemin.setText("");
				} else if (itemin.isBlank()) {
					JOptionPane.showMessageDialog(updatePane, "Pleas input the Product Code", "ISys: Powered by EclipseIDE",
							JOptionPane.ERROR_MESSAGE);
				} else if (!itemin.isBlank()) {
					JOptionPane.showMessageDialog(updatePane, "Please input the 'VALID' Product Code", "ISys: Powered by EclipseIDE",
							JOptionPane.ERROR_MESSAGE);
					Itemin.setText("");
				}
			}
		});
		UpdateBtn.setBounds(72, 191, 125, 35);
		UptPanel.add(UpdateBtn);
		UpdateBtn.setFont(new Font("Century Gothic", Font.BOLD, 20));
		UpdateBtn.setBackground(Color.CYAN);
		
		GanadorUpt_19 = new JLabel("pk.");
		GanadorUpt_19.setForeground(Color.BLACK);
		GanadorUpt_19.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_19.setBounds(-30, 48, 71, 14);
		UptPanel.add(GanadorUpt_19);
		
		GanadorUpt_21 = new JLabel("pk.");
		GanadorUpt_21.setForeground(Color.BLACK);
		GanadorUpt_21.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_21.setBounds(-30, 74, 71, 14);
		UptPanel.add(GanadorUpt_21);
		
		GanadorUpt_23 = new JLabel("pk.");
		GanadorUpt_23.setForeground(Color.BLACK);
		GanadorUpt_23.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_23.setBounds(-30, 105, 71, 14);
		UptPanel.add(GanadorUpt_23);
		
		GanadorUpt_24 = new JLabel("pk.");
		GanadorUpt_24.setForeground(Color.BLACK);
		GanadorUpt_24.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_24.setBounds(-30, 105, 71, 14);
		UptPanel.add(GanadorUpt_24);
		
		GanadorUpt_26 = new JLabel("pk.");
		GanadorUpt_26.setForeground(Color.BLACK);
		GanadorUpt_26.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_26.setBounds(-30, 145, 71, 14);
		UptPanel.add(GanadorUpt_26);
		
		JLabel GanadorUpt_1 = new JLabel("kgs.");
		GanadorUpt_1.setForeground(Color.BLACK);
		GanadorUpt_1.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_1.setBounds(674, 230, 71, 14);
		updatePane.add(GanadorUpt_1);
		
		GanadorUpt_2 = new JLabel("kgs.");
		GanadorUpt_2.setForeground(Color.BLACK);
		GanadorUpt_2.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_2.setBounds(674, 256, 71, 14);
		updatePane.add(GanadorUpt_2);
		
		GanadorUpt_3 = new JLabel("kgs.");
		GanadorUpt_3.setForeground(Color.BLACK);
		GanadorUpt_3.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_3.setBounds(674, 283, 71, 14);
		updatePane.add(GanadorUpt_3);
		
		GanadorUpt_4 = new JLabel("pc.");
		GanadorUpt_4.setForeground(Color.BLACK);
		GanadorUpt_4.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_4.setBounds(674, 326, 71, 14);
		updatePane.add(GanadorUpt_4);
		
		GanadorUpt_5 = new JLabel("pc.");
		GanadorUpt_5.setForeground(Color.BLACK);
		GanadorUpt_5.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_5.setBounds(674, 354, 71, 14);
		updatePane.add(GanadorUpt_5);
		
		GanadorUpt_6 = new JLabel("pc.");
		GanadorUpt_6.setForeground(Color.BLACK);
		GanadorUpt_6.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_6.setBounds(674, 379, 71, 14);
		updatePane.add(GanadorUpt_6);
		
		GanadorUpt_7 = new JLabel("pc.");
		GanadorUpt_7.setForeground(Color.BLACK);
		GanadorUpt_7.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_7.setBounds(674, 404, 71, 14);
		updatePane.add(GanadorUpt_7);
		
		GanadorUpt_8 = new JLabel("pc.");
		GanadorUpt_8.setForeground(Color.BLACK);
		GanadorUpt_8.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_8.setBounds(674, 429, 71, 14);
		updatePane.add(GanadorUpt_8);
		
		GanadorUpt_9 = new JLabel("pc.");
		GanadorUpt_9.setForeground(Color.BLACK);
		GanadorUpt_9.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_9.setBounds(674, 454, 71, 14);
		updatePane.add(GanadorUpt_9);
		
		GanadorUpt_10 = new JLabel("pc.");
		GanadorUpt_10.setForeground(Color.BLACK);
		GanadorUpt_10.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_10.setBounds(674, 479, 71, 14);
		updatePane.add(GanadorUpt_10);
		
		GanadorUpt_11 = new JLabel("pc.");
		GanadorUpt_11.setForeground(Color.BLACK);
		GanadorUpt_11.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_11.setBounds(674, 529, 71, 14);
		updatePane.add(GanadorUpt_11);
		
		GanadorUpt_12 = new JLabel("pc.");
		GanadorUpt_12.setForeground(Color.BLACK);
		GanadorUpt_12.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_12.setBounds(674, 549, 71, 14);
		updatePane.add(GanadorUpt_12);
		
		GanadorUpt_13 = new JLabel("pk.");
		GanadorUpt_13.setForeground(Color.BLACK);
		GanadorUpt_13.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_13.setBounds(674, 599, 71, 14);
		updatePane.add(GanadorUpt_13);
		
		GanadorUpt_14 = new JLabel("pk.");
		GanadorUpt_14.setForeground(Color.BLACK);
		GanadorUpt_14.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_14.setBounds(674, 628, 71, 14);
		updatePane.add(GanadorUpt_14);
		
		GanadorUpt_15 = new JLabel("pk.");
		GanadorUpt_15.setForeground(Color.BLACK);
		GanadorUpt_15.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_15.setBounds(1008, 128, 71, 14);
		updatePane.add(GanadorUpt_15);
		
		GanadorUpt_16 = new JLabel("pk.");
		GanadorUpt_16.setForeground(Color.BLACK);
		GanadorUpt_16.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_16.setBounds(1008, 156, 71, 14);
		updatePane.add(GanadorUpt_16);
		
		GanadorUpt_17 = new JLabel("pk.");
		GanadorUpt_17.setForeground(Color.BLACK);
		GanadorUpt_17.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_17.setBounds(1008, 181, 71, 14);
		updatePane.add(GanadorUpt_17);
		
		GanadorUpt_18 = new JLabel("pc.");
		GanadorUpt_18.setForeground(Color.BLACK);
		GanadorUpt_18.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_18.setBounds(1008, 231, 71, 14);
		updatePane.add(GanadorUpt_18);
		
		GanadorUpt_20 = new JLabel("pk.");
		GanadorUpt_20.setForeground(Color.BLACK);
		GanadorUpt_20.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_20.setBounds(1008, 256, 71, 14);
		updatePane.add(GanadorUpt_20);
		
		GanadorUpt_22 = new JLabel("pk.");
		GanadorUpt_22.setForeground(Color.BLACK);
		GanadorUpt_22.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_22.setBounds(1008, 283, 71, 14);
		updatePane.add(GanadorUpt_22);
		
		GanadorUpt_25 = new JLabel("pk.");
		GanadorUpt_25.setForeground(Color.BLACK);
		GanadorUpt_25.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_25.setBounds(1008, 306, 71, 14);
		updatePane.add(GanadorUpt_25);
		
		GanadorUpt_27 = new JLabel("pk.");
		GanadorUpt_27.setForeground(Color.BLACK);
		GanadorUpt_27.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_27.setBounds(1008, 354, 71, 14);
		updatePane.add(GanadorUpt_27);
		
		GanadorUpt_28 = new JLabel("bar");
		GanadorUpt_28.setForeground(Color.BLACK);
		GanadorUpt_28.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_28.setBounds(1008, 379, 71, 14);
		updatePane.add(GanadorUpt_28);
		
		GanadorUpt_29 = new JLabel("pk.");
		GanadorUpt_29.setForeground(Color.BLACK);
		GanadorUpt_29.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_29.setBounds(1008, 404, 71, 14);
		updatePane.add(GanadorUpt_29);
		
		GanadorUpt_30 = new JLabel("pc.");
		GanadorUpt_30.setForeground(Color.BLACK);
		GanadorUpt_30.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_30.setBounds(1008, 429, 71, 14);
		updatePane.add(GanadorUpt_30);
		
		GanadorUpt_37 = new JLabel("btl.");
		GanadorUpt_37.setForeground(Color.BLACK);
		GanadorUpt_37.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_37.setBounds(299, 326, 71, 14);
		updatePane.add(GanadorUpt_37);
		
		GanadorUpt_38 = new JLabel("btl.");
		GanadorUpt_38.setForeground(Color.BLACK);
		GanadorUpt_38.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_38.setBounds(299, 354, 71, 14);
		updatePane.add(GanadorUpt_38);
		
		GanadorUpt_39 = new JLabel("btl.");
		GanadorUpt_39.setForeground(Color.BLACK);
		GanadorUpt_39.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_39.setBounds(299, 379, 71, 14);
		updatePane.add(GanadorUpt_39);
		
		GanadorUpt_40 = new JLabel("btl.");
		GanadorUpt_40.setForeground(Color.BLACK);
		GanadorUpt_40.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_40.setBounds(299, 429, 71, 14);
		updatePane.add(GanadorUpt_40);
		
		GanadorUpt_41 = new JLabel("btl.");
		GanadorUpt_41.setForeground(Color.BLACK);
		GanadorUpt_41.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_41.setBounds(299, 454, 71, 14);
		updatePane.add(GanadorUpt_41);
		
		GanadorUpt_42 = new JLabel("btl.");
		GanadorUpt_42.setForeground(Color.BLACK);
		GanadorUpt_42.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_42.setBounds(299, 479, 71, 14);
		updatePane.add(GanadorUpt_42);
		
		GanadorUpt_43 = new JLabel("btl.");
		GanadorUpt_43.setForeground(Color.BLACK);
		GanadorUpt_43.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_43.setBounds(299, 504, 71, 14);
		updatePane.add(GanadorUpt_43);
		
		GanadorUpt_44 = new JLabel("can");
		GanadorUpt_44.setForeground(Color.BLACK);
		GanadorUpt_44.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_44.setBounds(299, 404, 71, 14);
		updatePane.add(GanadorUpt_44);
		
		GanadorUpt_45 = new JLabel("can");
		GanadorUpt_45.setForeground(Color.BLACK);
		GanadorUpt_45.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_45.setBounds(299, 647, 71, 14);
		updatePane.add(GanadorUpt_45);
		
		GanadorUpt_46 = new JLabel("can");
		GanadorUpt_46.setForeground(Color.BLACK);
		GanadorUpt_46.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_46.setBounds(299, 675, 71, 14);
		updatePane.add(GanadorUpt_46);
		
		GanadorUpt_47 = new JLabel("can");
		GanadorUpt_47.setForeground(Color.BLACK);
		GanadorUpt_47.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_47.setBounds(674, 128, 71, 14);
		updatePane.add(GanadorUpt_47);
		
		GanadorUpt_48 = new JLabel("can");
		GanadorUpt_48.setForeground(Color.BLACK);
		GanadorUpt_48.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_48.setBounds(674, 156, 71, 14);
		updatePane.add(GanadorUpt_48);
		
		GanadorUpt_49 = new JLabel("can");
		GanadorUpt_49.setForeground(Color.BLACK);
		GanadorUpt_49.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_49.setBounds(674, 181, 71, 14);
		updatePane.add(GanadorUpt_49);
		
		GanadorUpt_50 = new JLabel("pk.");
		GanadorUpt_50.setForeground(Color.BLACK);
		GanadorUpt_50.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_50.setBounds(299, 549, 71, 14);
		updatePane.add(GanadorUpt_50);
		
		GanadorUpt_51 = new JLabel("pk.");
		GanadorUpt_51.setForeground(Color.BLACK);
		GanadorUpt_51.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_51.setBounds(299, 574, 71, 14);
		updatePane.add(GanadorUpt_51);
		
		GanadorUpt_52 = new JLabel("pk.");
		GanadorUpt_52.setForeground(Color.BLACK);
		GanadorUpt_52.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_52.setBounds(299, 599, 71, 14);
		updatePane.add(GanadorUpt_52);
		
		GanadorUpt_53 = new JLabel("pk.");
		GanadorUpt_53.setForeground(Color.BLACK);
		GanadorUpt_53.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_53.setBounds(299, 156, 71, 14);
		updatePane.add(GanadorUpt_53);
		
		GanadorUpt_54 = new JLabel("pk.");
		GanadorUpt_54.setForeground(Color.BLACK);
		GanadorUpt_54.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_54.setBounds(299, 181, 71, 14);
		updatePane.add(GanadorUpt_54);
		
		GanadorUpt_55 = new JLabel("pk.");
		GanadorUpt_55.setForeground(Color.BLACK);
		GanadorUpt_55.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_55.setBounds(299, 206, 71, 14);
		updatePane.add(GanadorUpt_55);
		
		GanadorUpt_56 = new JLabel("pk.");
		GanadorUpt_56.setForeground(Color.BLACK);
		GanadorUpt_56.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_56.setBounds(299, 256, 71, 14);
		updatePane.add(GanadorUpt_56);
		
		GanadorUpt_57 = new JLabel("pk.");
		GanadorUpt_57.setForeground(Color.BLACK);
		GanadorUpt_57.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_57.setBounds(299, 283, 71, 14);
		updatePane.add(GanadorUpt_57);
		
		GanadorUpt_58 = new JLabel("pc.");
		GanadorUpt_58.setForeground(Color.BLACK);
		GanadorUpt_58.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_58.setBounds(299, 128, 71, 14);
		updatePane.add(GanadorUpt_58);
		
		GanadorUpt_59 = new JLabel("pc.");
		GanadorUpt_59.setForeground(Color.BLACK);
		GanadorUpt_59.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GanadorUpt_59.setBounds(299, 231, 71, 14);
		updatePane.add(GanadorUpt_59);

	}
}

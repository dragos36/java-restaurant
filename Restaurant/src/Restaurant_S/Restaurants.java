package Restaurant_S;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Restaurants {

	private JFrame frame;
	private JTextField jtxtChicBurger;
	private JTextField jtxtChicBurgerMeal;
	private JTextField jtxtBCBurger;
	private JTextField textField_3;
	private JTextField jtxtReceipts;
	private JTextField jtxtQty;
	private JTextField jtxtConvert;

	
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	
	double [] i = new double[5];
	
	double Nigerian_Naira = 302.96;
	double Us_Dollar = 1.52;
	double Kenyan_Shilling = 156.21;
	double Brasilian_Real = 5.86;
	double Canadian_Dollar = 2.03;
	double Indian_Rupee = 100.68;
	double Philippine_Pesso = 71.74;
	double Indonesian_Rupiah = 20746.75;
	protected JLabel jlblConvert;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurants window = new Restaurants();
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
	public Restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(32, 70, 719, 291);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setBounds(32, 37, 184, 29);
		lblChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(lblChickenBurger);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setBounds(32, 82, 218, 29);
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(lblChickenBurgerMeal);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setBounds(32, 124, 184, 29);
		lblCheeseBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(lblCheeseBurger);
		
		jtxtChicBurger = new JTextField();
		jtxtChicBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtChicBurger.setBounds(406, 45, 167, 22);
		jtxtChicBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(jtxtChicBurger);
		jtxtChicBurger.setColumns(10);
		
		jtxtChicBurgerMeal = new JTextField();
		jtxtChicBurgerMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtChicBurgerMeal.setBounds(406, 90, 167, 22);
		jtxtChicBurgerMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtChicBurgerMeal.setColumns(10);
		panel.add(jtxtChicBurgerMeal);
		
		jtxtBCBurger = new JTextField();
		jtxtBCBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtBCBurger.setBounds(406, 132, 167, 22);
		jtxtBCBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtBCBurger.setColumns(10);
		panel.add(jtxtBCBurger);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setBounds(32, 166, 121, 29);
		lblDrink.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(lblDrink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setBounds(406, 167, 112, 28);
		lblQty.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(lblQty);
		
		jtxtQty = new JTextField();
		jtxtQty.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtQty.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtQty.setBounds(406, 208, 167, 22);
		panel.add(jtxtQty);
		jtxtQty.setColumns(10);
		
		JComboBox jCmbDrink = new JComboBox();
		jCmbDrink.setBounds(32, 208, 218, 29);
		jCmbDrink.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Apple_Juice", "Tea", "Cola", "Coke", "Coffee", "Ice_Tea", "Ice_Coffee", "Orange"}));
		jCmbDrink.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(jCmbDrink);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(32, 166, 541, 12);
		panel.add(separator);
		
		JCheckBox jCDelivery = new JCheckBox("Home Delivery");
		jCDelivery.setBounds(32, 246, 218, 25);
		jCDelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(jCDelivery);
		
		JCheckBox jCTax = new JCheckBox("Tax");
		jCTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jCTax.setBounds(405, 239, 113, 29);
		panel.add(jCTax);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(763, 70, 281, 291);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox jcmbCurrency = new JComboBox();
		jcmbCurrency.setModel(new DefaultComboBoxModel(new String[] {"Choose One", "USA", "Nigeria", "Kenyan", "Canada", "Brasil", "Indonesia", "Philippine", "India"}));
		jcmbCurrency.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jcmbCurrency.setBounds(33, 24, 218, 29);
		panel_1.add(jcmbCurrency);
		
		jtxtConvert = new JTextField();
		jtxtConvert.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtConvert.setColumns(10);
		jtxtConvert.setBounds(33, 81, 218, 35);
		panel_1.add(jtxtConvert);
		
		JLabel jlblConvert = new JLabel("");
		jlblConvert.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblConvert.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblConvert.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblConvert.setBounds(33, 141, 218, 40);
		panel_1.add(jlblConvert);
		
		JButton jbtnConvert = new JButton("Convert");
		jbtnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double British_Pound = Double.parseDouble(jtxtConvert.getText());
				if (jcmbCurrency.getSelectedItem().equals("Nigeria")){
					String cConvert1 = String.format("N %.2f", British_Pound * Nigerian_Naira);
					jlblConvert.setText(cConvert1);
					
				}
				if (jcmbCurrency.getSelectedItem().equals("USA")){
					String cConvert1 = String.format("$ %.2f", British_Pound * Us_Dollar);
					jlblConvert.setText(cConvert1);
					
				}
				if (jcmbCurrency.getSelectedItem().equals("Kenyan")){
					String cConvert1 = String.format("KS %.2f", British_Pound * Kenyan_Shilling);
					jlblConvert.setText(cConvert1);
					
				}
				if (jcmbCurrency.getSelectedItem().equals("Canada")){
					String cConvert1 = String.format("C$ %.2f", British_Pound * Canadian_Dollar);
					jlblConvert.setText(cConvert1);
					
				}
				if (jcmbCurrency.getSelectedItem().equals("Brasil")){
					String cConvert1 = String.format("Bra %.2f", British_Pound * Brasilian_Real);
					jlblConvert.setText(cConvert1);
					
				}
				if (jcmbCurrency.getSelectedItem().equals("India")){
					String cConvert1 = String.format("INR %.2f", British_Pound * Indian_Rupee);
					jlblConvert.setText(cConvert1);
					
				}
				if (jcmbCurrency.getSelectedItem().equals("Philippine")){
					String cConvert1 = String.format("PHP %.2f", British_Pound * Philippine_Pesso);
					jlblConvert.setText(cConvert1);
					
				}
				if (jcmbCurrency.getSelectedItem().equals("Indonesia")){
					String cConvert1 = String.format("IDR %.2f", British_Pound * Indonesian_Rupiah);
					jlblConvert.setText(cConvert1);
					
				}
			}
		});
		jbtnConvert.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jbtnConvert.setBounds(12, 225, 132, 25);
		panel_1.add(jbtnConvert);
		
		JButton jbtnClose = new JButton("Close");
		jbtnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jlblConvert.setText(null);
				jtxtConvert.setText(null);
				jcmbCurrency.setSelectedItem("Choose One...");
			}
		});
		jbtnClose.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jbtnClose.setBounds(156, 225, 97, 25);
		panel_1.add(jbtnClose);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(32, 374, 719, 169);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfDrinks.setBounds(35, 23, 184, 29);
		panel_2.add(lblCostOfDrinks);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfMeal.setBounds(35, 65, 184, 29);
		panel_2.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfDelivery.setBounds(35, 107, 184, 29);
		panel_2.add(lblCostOfDelivery);
		
		JLabel jlblCostOfDrinks = new JLabel("");
		jlblCostOfDrinks.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfDrinks.setBounds(411, 23, 184, 29);
		jlblCostOfDrinks.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.add(jlblCostOfDrinks);
		
		JLabel jlblCostOfMeal = new JLabel("");
		jlblCostOfMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfMeal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostOfMeal.setBounds(411, 65, 184, 29);
		panel_2.add(jlblCostOfMeal);
		
		JLabel jlblCostOfDelivery = new JLabel("");
		jlblCostOfDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostOfDelivery.setBounds(411, 107, 184, 29);
		panel_2.add(jlblCostOfDelivery);
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(32, 549, 1306, 80);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton jBtnExit = new JButton("Exit");
		jBtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		jBtnExit.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jBtnExit.setBounds(894, 30, 97, 25);
		panel_3.add(jBtnExit);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(763, 374, 281, 169);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTax.setBounds(12, 13, 54, 29);
		panel_4.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblSubTotal.setBounds(12, 55, 110, 29);
		panel_4.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTotal.setBounds(12, 110, 184, 29);
		panel_4.add(lblTotal);
		
		JLabel jlblTax = new JLabel("");
		jlblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblTax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTax.setBounds(159, 13, 110, 29);
		panel_4.add(jlblTax);
		
		JLabel jlblsubTotal = new JLabel("");
		jlblsubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblsubTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblsubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblsubTotal.setBounds(159, 55, 110, 29);
		panel_4.add(jlblsubTotal);
		
		JLabel jlblTotal = new JLabel("");
		jlblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTotal.setBounds(159, 110, 110, 29);
		panel_4.add(jlblTotal);
		
		
		
		JButton jBtnReset = new JButton("Reset");
		jBtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jlblsubTotal.setText(null);
				jlblTotal.setText(null);
				jlblTax.setText(null);
				jlblConvert.setText(null);
				jlblCostOfDelivery.setText(null);
				jlblCostOfMeal.setText(null);
				jlblCostOfDrinks.setText(null);
				jtxtChicBurger.setText(null);
				jtxtChicBurgerMeal.setText(null);
				jtxtBCBurger.setText(null);
				jtxtConvert.setText(null);
				jCmbDrink.setSelectedItem("Select a drink");
				jcmbCurrency.setSelectedItem("Choose One...");
				
			}
		});
		jBtnReset.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jBtnReset.setBounds(696, 30, 97, 25);
		panel_3.add(jBtnReset);
		
		JButton jBtnReceipt = new JButton("Receipt");
		jBtnReceipt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double Qty1 = Double.parseDouble(jtxtChicBurger.getText());
				double Qty2 = Double.parseDouble(jtxtChicBurgerMeal.getText());
				double Qty3 = Double.parseDouble(jtxtBCBurger.getText());
				
				jtxtReceipts.append("\t\nRestaurant Management System:\n\n" + "Chicken Burger:\t\t" + Qty1 + "\nChicken Burger Meal:\t\t" + Qty2 + "\nBacon and Cheese Burger:\t\t" + Qty3 + "\n\nThanks for using Job Estimator");
			}
		});
		jBtnReceipt.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jBtnReceipt.setBounds(481, 30, 120, 25);
		panel_3.add(jBtnReceipt);
		
		JButton jBtnTotal = new JButton("Total");
		jBtnTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jBtnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ChicBurger = Double.parseDouble(jtxtChicBurger.getText());
				double iChicBurger = 2.39;
				double Burger;
				Burger  =(ChicBurger * iChicBurger);
				String pMeal = String.format("%.2f", Burger);
				jlblCostOfMeal.setText(pMeal);
				
				double ChicBurgerMeal = Double.parseDouble(jtxtChicBurgerMeal.getText());
				double iChicBurgerMeal = 4.39;
				double BurgerMeal;
				BurgerMeal = (ChicBurgerMeal * iChicBurgerMeal);
				String cbMeal = String.format("%.2f", BurgerMeal + Burger);
				
				double CheeseBurger = Double.parseDouble(jtxtBCBurger.getText());
				double CheeseBurgerPrice = 3.39;
				double CheeseBurgerMeal;
				CheeseBurgerMeal = (CheeseBurger * CheeseBurgerPrice);
				String cheese = String.format("%.2f", CheeseBurgerMeal + BurgerMeal + Burger);
				jlblCostOfMeal.setText(cheese);
				
				double iDelivery = 3.39;
				if(jCDelivery.isSelected()){
					String pDelivery = String.format("%.2f", iDelivery);
					jlblCostOfDelivery.setText(pDelivery);
				}
				else{
					jlblCostOfDelivery.setText("0");
				}
				
				double Drinks = Double.parseDouble(jtxtQty.getText());
				double Tea = 1.20 * Drinks;
				double Ice_Tea = 0.90 * Drinks;
				double Coffee = 2.50 * Drinks;
				double Ice_Coffee = 1.10 * Drinks;
				double Cola = 2.10 * Drinks;
				double Coke = 1.60 * Drinks;
				double Orange = 1.70 * Drinks;
				double Apple_Juice = 1.99 * Drinks;
				
				if(jCmbDrink.getSelectedItem().equals("Apple_Juice")){
					String cApple_Juice = String.format("%.2f", Apple_Juice);
					jlblCostOfDrinks.setText(cApple_Juice);
				}
				if(jCmbDrink.getSelectedItem().equals("Tea")){
					String cTea = String.format("%.2f", Tea);
					jlblCostOfDrinks.setText(cTea);
				}
				if(jCmbDrink.getSelectedItem().equals("Ice_Tea")){
					String cIce_Tea = String.format("%.2f", Ice_Tea);
					jlblCostOfDrinks.setText(cIce_Tea);
				}
				if(jCmbDrink.getSelectedItem().equals("Coke")){
					String cCoke = String.format("%.2f", Coke);
					jlblCostOfDrinks.setText(cCoke);
				}
				if(jCmbDrink.getSelectedItem().equals("Cola")){
					String cCola = String.format("%.2f", Cola);
					jlblCostOfDrinks.setText(cCola);
				}
				if(jCmbDrink.getSelectedItem().equals("Orange")){
					String cOrange = String.format("%.2f", Orange);
					jlblCostOfDrinks.setText(cOrange);
				}
				if(jCmbDrink.getSelectedItem().equals("Coffee")){
					String cCoffee = String.format("%.2f", Coffee);
					jlblCostOfDrinks.setText(cCoffee);
				}
				if(jCmbDrink.getSelectedItem().equals("Ice_Coffee")){
					String cIce_Coffee = String.format("%.2f", Ice_Coffee);
					jlblCostOfDrinks.setText(cIce_Coffee);
				}
				if(jCmbDrink.getSelectedItem().equals("Select a drink")){
					jlblCostOfDrinks.setText("0");
				}
				//----------Tax Rate---------
				double cTotal1 = Double.parseDouble(jlblCostOfDrinks.getText());
				double cTotal2 = Double.parseDouble(jlblCostOfMeal.getText());
				double cTotal3 = Double.parseDouble(jlblCostOfDelivery.getText());
				double AllTotal = (cTotal1 + cTotal2 + cTotal3)/100;
				if(jCTax.isSelected()){
					String iTotal = String.format("%.2f", AllTotal);
					jlblTax.setText(iTotal);
				}
				//-------Total------
				double cTotal4 = Double.parseDouble(jlblTax.getText());
				
				double subTotal = (cTotal1 + cTotal2 + cTotal3);
				String isubTotal = String.format("£ %.2f", subTotal);
				jlblsubTotal.setText(isubTotal);
				
				double allTotal = (cTotal1 + cTotal2 + cTotal3 + cTotal4);
				String iTotal = String.format("£ %.2f", allTotal);
				jlblTotal.setText(iTotal);
				
				
				String iTaxTotal = String.format("£ %.2f", cTotal4);
				jlblTax.setText(iTaxTotal);
				
				
			}
		});
		jBtnTotal.setBounds(305, 30, 97, 25);
		panel_3.add(jBtnTotal);
		
		
		
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_5.setBounds(1057, 68, 281, 475);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 63, 257, 399);
		panel_5.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		jtxtReceipts = new JTextField();
		jtxtReceipts.setBounds(0, 0, 252, 369);
		panel_6.add(jtxtReceipts);
		jtxtReceipts.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_3.setColumns(10);
		textField_3.setBounds(14, 13, 216, 39);
		panel_7.add(textField_3);
		
		JButton button = new JButton("<-");
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBounds(12, 62, 55, 55);
		panel_7.add(button);
		
		JButton button_1 = new JButton("C");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_1.setBounds(68, 62, 55, 55);
		panel_7.add(button_1);
		
		JButton button_2 = new JButton("%");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_2.setBounds(124, 62, 55, 55);
		panel_7.add(button_2);
		
		JButton button_3 = new JButton("+");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_3.setBounds(180, 62, 55, 55);
		panel_7.add(button_3);
		
		JButton button_4 = new JButton("-");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_4.setBounds(180, 118, 55, 55);
		panel_7.add(button_4);
		
		JButton button_5 = new JButton("9");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_5.setBounds(124, 118, 55, 55);
		panel_7.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_6.setBounds(68, 118, 55, 55);
		panel_7.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_7.setBounds(12, 118, 55, 55);
		panel_7.add(button_7);
		
		JButton button_8 = new JButton("4");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_8.setBounds(12, 174, 55, 55);
		panel_7.add(button_8);
		
		JButton button_9 = new JButton("5");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_9.setBounds(68, 174, 55, 55);
		panel_7.add(button_9);
		
		JButton button_10 = new JButton("6");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_10.setBounds(124, 174, 55, 55);
		panel_7.add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_11.setBounds(180, 174, 55, 55);
		panel_7.add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_12.setBounds(180, 230, 55, 55);
		panel_7.add(button_12);
		
		JButton button_13 = new JButton("3");
		button_13.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_13.setBounds(124, 230, 55, 55);
		panel_7.add(button_13);
		
		JButton button_14 = new JButton("2");
		button_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_14.setBounds(68, 230, 55, 55);
		panel_7.add(button_14);
		
		JButton button_15 = new JButton("1");
		button_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_15.setBounds(12, 230, 55, 55);
		panel_7.add(button_15);
		
		JButton button_16 = new JButton("0");
		button_16.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_16.setBounds(12, 286, 55, 55);
		panel_7.add(button_16);
		
		JButton button_17 = new JButton(".");
		button_17.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_17.setBounds(68, 286, 55, 55);
		panel_7.add(button_17);
		
		JButton button_18 = new JButton("\u00B1");
		button_18.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_18.setBounds(124, 286, 55, 55);
		panel_7.add(button_18);
		
		JButton button_19 = new JButton("=");
		button_19.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_19.setBounds(180, 286, 55, 55);
		panel_7.add(button_19);
		
		JLabel lblNewLabel = new JLabel("Loan Management Systems");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(309, 0, 710, 74);
		frame.getContentPane().add(lblNewLabel);
	}
}

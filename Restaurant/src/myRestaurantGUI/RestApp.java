/********************************************************************************
* 																				*
* Name: Sidney Oluoch 															*
* Course: INT 2220 														 		*
* Assignment: Final Project														*
* 																				*
********************************************************************************/
package myRestaurantGUI;

import java.awt.*;
import javax.swing.*;


import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.FontUIResource;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;


public class RestApp extends JFrame {
	private JPanel contentPane;
	private JTextField textFieldMeal1;
	private JTextField textFieldMeal2;
	private JTextField textFieldMeal3;
	private JTextField jtxtCBurger;
	private JTextField jtxtCMac;
	private JTextField jtxtCDrinks;
	private JTextField jtxtCSteak;
	private JTextField jtxtTotal;
	private JTextField jtxtTips;
	private JTextField jtxtTax;
	private JTextField jtxtDelivery;
	private JTextField textFieldFName;
	private JTextField textFieldStreet;
	private JTextField textFieldApt;
	private JTextField textFieldZip;
	private JTextField textFieldLName;
	private JTextField textFieldPhone;
	
	private JCheckBox chckbxCBurger;
	private JCheckBox chckbxMac;
	private JCheckBox chckbxSteak;
	private JCheckBox chckbxDelivery;
	private JCheckBox chckbxTax;
	
	private JComboBox comboBox;
	
	private JTextArea textArea;
	
	private JTextField jtxtSub;
	private JTextField jtxtInstructions;
	private JTextField jtxtDelivInfo;
	private JTextField jtxtReceipt;
	protected JTextArea textAreaDelivInfo;
	protected JTextArea textAreaRcpt;
	
	public static void main(String[] args) {
		RestApp lastFrame = new RestApp();
		lastFrame.setVisible(true);
	}

	
	public RestApp() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1800, 1200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(  
		          "Maiandra GD", Font.PLAIN, 30))); //changes size and font on OptionPane
		/*
		 * Panel Meal
		 * *************************************************************************************************************
		 */
		
		JPanel panelMeal = new JPanel();
		panelMeal.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panelMeal.setBounds(21, 100, 526, 580);
		contentPane.add(panelMeal);
		panelMeal.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 63, 484, 12);
		panelMeal.add(separator);
		
		JCheckBox chckbxCBurger = new JCheckBox("Chicken Burger");
		chckbxCBurger.setFont(new Font("Tahoma", Font.PLAIN, 30));
		chckbxCBurger.setBounds(21, 91, 241, 35);
		panelMeal.add(chckbxCBurger);
		
		textFieldMeal1 = new JTextField();
		textFieldMeal1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldMeal1.setBounds(319, 91, 186, 35);
		panelMeal.add(textFieldMeal1);
		textFieldMeal1.setColumns(10);
		
		JCheckBox chckbxMac = new JCheckBox("MacNCheese");
		chckbxMac.setFont(new Font("Tahoma", Font.PLAIN, 30));
		chckbxMac.setBounds(21, 161, 241, 35);
		panelMeal.add(chckbxMac);
		
		JCheckBox chckbxSteak = new JCheckBox("Steak");
		chckbxSteak.setFont(new Font("Tahoma", Font.PLAIN, 30));
		chckbxSteak.setBounds(21, 229, 241, 35);
		panelMeal.add(chckbxSteak);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Apple Juice", "Coca Cola", "Water", "Ice Tea"}));
		comboBox.setMaximumRowCount(4);
		comboBox.setBounds(319, 300, 186, 43);
		panelMeal.add(comboBox);
		
		textFieldMeal2 = new JTextField();
		textFieldMeal2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldMeal2.setColumns(10);
		textFieldMeal2.setBounds(319, 156, 186, 35);
		panelMeal.add(textFieldMeal2);
		
		textFieldMeal3 = new JTextField();
		textFieldMeal3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldMeal3.setColumns(10);
		textFieldMeal3.setBounds(319, 221, 186, 35);
		panelMeal.add(textFieldMeal3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(21, 395, 484, 12);
		panelMeal.add(separator_1);
		
		JCheckBox chckbxTax = new JCheckBox("Tax");
		chckbxTax.setFont(new Font("Tahoma", Font.PLAIN, 30));
		chckbxTax.setBounds(21, 504, 241, 35);
		panelMeal.add(chckbxTax);
		
		JCheckBox chckbxDelivery = new JCheckBox("Delivery");
		chckbxDelivery.addActionListener(new ActionListener() { //Enables the delivery info section
			public void actionPerformed(ActionEvent e) {
				if(chckbxDelivery.isSelected()){
					textFieldFName.setEnabled(true);
					textFieldStreet.setEnabled(true);
					textFieldApt.setEnabled(true);
					textFieldZip.setEnabled(true);
					textFieldLName.setEnabled(true);
					textFieldPhone.setEnabled(true);
					jtxtDelivInfo.setEnabled(true);
				}else{
					textFieldFName.setEnabled(false);
					textFieldStreet.setEnabled(false);
					textFieldApt.setEnabled(false);
					textFieldZip.setEnabled(false);
					textFieldLName.setEnabled(false);
					textFieldPhone.setEnabled(false);
					jtxtDelivInfo.setEnabled(false);
				}
			}
		});
		chckbxDelivery.setFont(new Font("Tahoma", Font.PLAIN, 30));
		chckbxDelivery.setBounds(319, 504, 186, 35);
		panelMeal.add(chckbxDelivery);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDrinks.setBounds(21, 300, 140, 43);
		panelMeal.add(lblDrinks);
		
		JLabel lblMeal = new JLabel("Menu");
		lblMeal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMeal.setBounds(57, 26, 85, 26);
		panelMeal.add(lblMeal);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblQty.setBounds(413, 17, 92, 44);
		panelMeal.add(lblQty);
		
		JComboBox comboBoxTip = new JComboBox();
		comboBoxTip.setModel(new DefaultComboBoxModel(new String[] {"Select tip %", "5%", "10%", "15%", "20%", "Cash Tip"}));
		comboBoxTip.setMaximumRowCount(4);
		comboBoxTip.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBoxTip.setBounds(319, 428, 186, 43);
		panelMeal.add(comboBoxTip);
		
		JLabel lblTip = new JLabel("Tip");
		lblTip.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTip.setBounds(21, 428, 72, 43);
		panelMeal.add(lblTip);
		
		/*
		 * Panel Buttons
		 * *****************************************************************************************************************
		 */
		
		JPanel panelButtons = new JPanel();
		panelButtons.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panelButtons.setBounds(21, 1010, 1732, 98);
		contentPane.add(panelButtons);
		panelButtons.setLayout(new GridLayout(1, 6, 10, 10));
		
		JButton btnCart = new JButton("Cart");
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double appleJuice = 1.79;
				double soda = 0.99;
				double water = 1.25;
				double tea = 2.15;
				double cBurger = 4.99;
				double cMac = 2.49;
				double cSteak = 7.29;

				/************Burger*************/
				if(chckbxCBurger.isSelected() && textFieldMeal1 != null){
					cBurger = cBurger *  Double.parseDouble(textFieldMeal1.getText());
					
					String Burger = String.format("%.2f", cBurger);
					jtxtCBurger.setText(Burger);
				}
				else{
					jtxtCBurger.setText("" + 0.00); //set value to 0 if checkbox is not selected
				}
				
				/************MacNCheese*************/

				if(chckbxMac.isSelected() && textFieldMeal2 != null){
					cMac = cMac *  Double.parseDouble(textFieldMeal2.getText());
					
					String Mac = String.format("%.2f", cMac);
					jtxtCMac.setText(Mac);
				}
				else{
					jtxtCMac.setText("" + 0.00); //set value to 0 if checkbox is not selected
				}
				
				/************Steak*************/

				if(chckbxSteak.isSelected() && textFieldMeal3 != null){
					cSteak = cSteak *  Double.parseDouble(textFieldMeal3.getText());
					
					String Steak = String.format("%.2f", cSteak);
					jtxtCSteak.setText(Steak);
				}
				else{
					jtxtCSteak.setText("" + 0.00); //set value to 0 if checkbox is not selected
				}
				
				/************Drinks*************/

				if(comboBox.getSelectedItem().equals("Apple Juice"))
				{
		    		String cAppleJuice = String.format("%.2f", appleJuice);
		    		jtxtCDrinks.setText(cAppleJuice);
				}	
				else if(comboBox.getSelectedItem().equals("Coca Cola"))
				{
					String cSoda = String.format("%.2f", soda);
					jtxtCDrinks.setText(cSoda);
				}
				else if(comboBox.getSelectedItem().equals("Water"))
				{
					String cWater = String.format("%.2f", water);
					jtxtCDrinks.setText(cWater);
				}
				else if(comboBox.getSelectedItem().equals("Ice Tea"))
				{
					String cTea = String.format("%.2f", tea);
					jtxtCDrinks.setText(cTea);
				}
				else if(comboBox.getSelectedItem().equals("Select a drink"))
				{
					jtxtCDrinks.setText("" + 0.00); 
				}	
			}
		});
		
		JButton button = new JButton("<< Back");
		button.addActionListener(new ActionListener() { //JOptionPane dialogue box
			public void actionPerformed(ActionEvent e) {
				JFrame backFrame = new JFrame("Back");
				if( JOptionPane.showConfirmDialog(backFrame, "Are you sure you want to go back?", "My Restaurant App",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
					
					RestChoice yourRestApp = new RestChoice();
					yourRestApp.setVisible(true);
					dispose();
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panelButtons.add(button);
		btnCart.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panelButtons.add(btnCart);
		
		JButton btnTotal = new JButton("CheckOut");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double delivery = 2.50;
				double tip = 0;
				double tax = 0;
				double subTotal = 0;
				double total = 0;
				
				/***********Delivery***********/
				
				if(chckbxDelivery.isSelected()){
					String deliv = String.format("%.2f", delivery);
					jtxtDelivery.setText(deliv);
				}
				else{
					jtxtDelivery.setText("" + 0.00);
				}
				
				/***********SubTotal***********/
				
				double burgerTotal = Double.parseDouble(jtxtCBurger.getText()); 
				double macTotal = Double.parseDouble(jtxtCMac.getText()); 
				double steakTotal = Double.parseDouble(jtxtCSteak.getText()); 
				double drinksTotal = Double.parseDouble(jtxtCBurger.getText()); 
				
				subTotal = burgerTotal + macTotal + steakTotal + drinksTotal;
				String cSub = String.format("%.2f", subTotal);
				jtxtSub.setText(cSub);
				
				/***********Tax***********/
				
				if(chckbxTax.isSelected()){
					tax = 0.14 * Double.parseDouble(jtxtSub.getText());
					String cTax = String.format("%.2f", tax);
					jtxtTax.setText(cTax);
				}
				else{
					jtxtTax.setText("Select Tax");
					jtxtTotal.setText("Select Tax");

				}

				/***********Tip***********/
				
				if(comboBoxTip.getSelectedItem().equals("5%")){
					tip = 0.05 * Double.parseDouble(jtxtSub.getText());
					String cTip = String.format("%.2f", tip);
					jtxtTips.setText(cTip);
				}
				if(comboBoxTip.getSelectedItem().equals("10%")){
					tip = 0.10 * Double.parseDouble(jtxtSub.getText());
					String cTip = String.format("%.2f", tip);
					jtxtTips.setText(cTip);
				}
				if(comboBoxTip.getSelectedItem().equals("15%")){
					tip = 0.15 * Double.parseDouble(jtxtSub.getText());
					String cTip = String.format("%.2f", tip);
					jtxtTips.setText(cTip);
				}
				if(comboBoxTip.getSelectedItem().equals("20%")){
					tip = 0.05 * Double.parseDouble(jtxtSub.getText());
					String cTip = String.format("%.2f", tip);
					jtxtTips.setText(cTip);
				}
				if(comboBoxTip.getSelectedItem().equals("Cash Tip")){
					tip = 0.0;
					jtxtTips.setText("CASH TIP");
				}
				if(comboBoxTip.getSelectedItem().equals("Select tip %")){
					tip = 0.0;
					jtxtTips.setText("" + 0.00);
				}
				
				/***********Total***********/
				if(!chckbxTax.isSelected()){
					jtxtTotal.setText("Select Tax!");
				}
				
				else if(jtxtSub != null && jtxtTips != null && jtxtTax != null){
					total = subTotal + tax + tip + delivery;
					String cTotal = String.format("%.2f", total);
					jtxtTotal.setText(cTotal);
				}
				else{
					jtxtTotal.setText("ERROR!");
				}
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panelButtons.add(btnTotal);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() { //print receipt
			public void actionPerformed(ActionEvent e) {
				int Qty1 = Integer.parseInt(textFieldMeal1.getText());
				int Qty2 = Integer.parseInt(textFieldMeal2.getText());
				int Qty3 = Integer.parseInt(textFieldMeal3.getText());
				
				jtxtReceipt.setText("\t My Restaurant App:\t\t"
				+ "----------------------------------\t"
				+ "Special Instructions: " + jtxtInstructions.getText() +"\t\t"		
				+ "----------------------------------\t"
				+ "Delivery Info:\t\t\t "
				+ "Full name: " + textFieldFName.getText() + " " + textFieldLName.getText() + "\t\t"
				+ "Street Address: " + textFieldStreet.getText() + "\t\t"
				+ "Apartment Number: " + textFieldApt.getText() + "\t\t\t"
				+ "Zip Code: " + textFieldZip.getText() + "\t\t\t"
				+ "Phone #: " + textFieldPhone.getText() + "\t\t\t"
				+ "Delivery Instructions: " + jtxtDelivInfo.getText() + "\t\t"
				+ "----------------------------------\t"	
				+ Qty1 + " Chicken Burger:\t" + jtxtCBurger.getText() + "\t\t"
				+ Qty2 + " MacNCheese:\t\t" + jtxtCMac.getText() + "\t\t"
				+ Qty3 + " Steak:\t\t" + jtxtCSteak.getText() + "\t\t"
				+ "1 " + comboBox.getSelectedItem() +":\t\t" + jtxtCDrinks.getText() + "\t\t"
				+ "----------------------------------\t"
				+ "SubTotal:\t\t" + jtxtSub.getText() + "\t\t"
				+ "Tax:\t\t\t" + jtxtTax.getText() + "\t\t"
				+ "Tip:\t\t\t" + jtxtTips.getText() + "\t\t"
				+ "Delivery:\t\t" + jtxtDelivery.getText() + "\t\t"
				+ "Total:\t\t\t" + jtxtTotal.getText() + "\t\t"
				+ "----------------------------------\t"
				+ "Thanks for using MyRestaurant App");
				
			}
		});
		btnReceipt.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panelButtons.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() { // Reset the textfields, checkboxes and combobox
			public void actionPerformed(ActionEvent arg0) {
				
				textFieldMeal1.setText(null);
				textFieldMeal2.setText(null);
				textFieldMeal3.setText(null);
				jtxtCBurger.setText(null);
				jtxtCMac.setText(null);
				jtxtCDrinks.setText(null);
				jtxtCSteak.setText(null);
				jtxtSub.setText(null);
				jtxtTotal.setText(null);
				jtxtTips.setText(null);
				jtxtTax.setText(null);
				jtxtDelivery.setText(null);
				textFieldFName.setText(null);
				textFieldStreet.setText(null);
				textFieldApt.setText(null);
				textFieldZip.setText(null);
				textFieldLName.setText(null);
				textFieldPhone.setText(null);
				jtxtInstructions.setText(null);
				jtxtReceipt.setText("");
				jtxtDelivInfo.setText(null);
				jtxtSub.setText(null);		
				comboBoxTip.setSelectedItem("Select tip %");
				comboBox.setSelectedItem("Select a drink");
				chckbxCBurger.setSelected(false);
				chckbxMac.setSelected(false);
				chckbxSteak.setSelected(false);
				chckbxTax.setSelected(false);
				chckbxDelivery.setSelected(false);
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panelButtons.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("Exit");
				frame.setMaximumSize(new Dimension(300, 100));
				if( JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "My Restaurant App",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panelButtons.add(btnExit);
		
		/*
		 * Panel Instructions
		 * ****************************************************************************************************************
		 */
		JPanel panelInstructions = new JPanel();
		panelInstructions.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panelInstructions.setBounds(21, 701, 526, 288);
		contentPane.add(panelInstructions);
		panelInstructions.setLayout(null);
		
		JTextPane txtpnSpecialInstructions = new JTextPane();
		txtpnSpecialInstructions.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtpnSpecialInstructions.setText("Special Instructions: e.g Side dressing...");
		txtpnSpecialInstructions.setBounds(21, 10, 484, 32);
		panelInstructions.add(txtpnSpecialInstructions);
		
		jtxtInstructions = new JTextField();
		jtxtInstructions.setFont(new Font("Tahoma", Font.PLAIN, 21));
		jtxtInstructions.setBounds(21, 88, 484, 136);
		panelInstructions.add(jtxtInstructions);
		jtxtInstructions.setColumns(10);
		
		JButton btnInstructDone = new JButton("Done"); //sends info on textField to textArea
		btnInstructDone.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnInstructDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnInstructDone.isSelected()){
					String spInstruct = jtxtInstructions.getText();
					jtxtReceipt.setText(spInstruct);
				}
				else{
					jtxtReceipt.setText("");
				}
			}
		});
		btnInstructDone.setBounds(228, 235, 94, 32);
		panelInstructions.add(btnInstructDone);
		
		JLabel lblEnterTextHere = new JLabel("Enter text here:");
		lblEnterTextHere.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblEnterTextHere.setBounds(21, 58, 183, 32);
		panelInstructions.add(lblEnterTextHere);
		
		/*
		 * Panel Cart / total
		 * *****************************************************************************************************************
		 */
		
		JPanel panelCart = new JPanel();
		panelCart.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panelCart.setBounds(568, 100, 526, 889);
		contentPane.add(panelCart);
		panelCart.setLayout(null);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(21, 63, 484, 12);
		panelCart.add(separator_2);
		
		jtxtCBurger = new JTextField();
		jtxtCBurger.setEditable(false);
		jtxtCBurger.setFont(new Font("Tahoma", Font.PLAIN, 30));
		jtxtCBurger.setBounds(319, 96, 186, 42);
		panelCart.add(jtxtCBurger);
		jtxtCBurger.setColumns(10);
		
		jtxtCMac = new JTextField();
		jtxtCMac.setEditable(false);
		jtxtCMac.setFont(new Font("Tahoma", Font.PLAIN, 30));
		jtxtCMac.setColumns(10);
		jtxtCMac.setBounds(319, 182, 186, 42);
		panelCart.add(jtxtCMac);
		
		jtxtCDrinks = new JTextField();
		jtxtCDrinks.setEditable(false);
		jtxtCDrinks.setFont(new Font("Tahoma", Font.PLAIN, 30));
		jtxtCDrinks.setColumns(10);
		jtxtCDrinks.setBounds(319, 359, 186, 42);
		panelCart.add(jtxtCDrinks);
		
		jtxtCSteak = new JTextField();
		jtxtCSteak.setEditable(false);
		jtxtCSteak.setFont(new Font("Tahoma", Font.PLAIN, 30));
		jtxtCSteak.setColumns(10);
		jtxtCSteak.setBounds(319, 271, 186, 42);
		panelCart.add(jtxtCSteak);
		
		JTextPane txtpnTotal = new JTextPane();
		txtpnTotal.setText("Total :");
		txtpnTotal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtpnTotal.setBounds(31, 813, 200, 42);
		panelCart.add(txtpnTotal);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setEditable(false);
		jtxtTotal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		jtxtTotal.setColumns(10);
		jtxtTotal.setBounds(319, 813, 186, 42);
		panelCart.add(jtxtTotal);
		
		JTextPane txtpnTips = new JTextPane();
		txtpnTips.setText("Tips :");
		txtpnTips.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtpnTips.setBounds(31, 734, 200, 42);
		panelCart.add(txtpnTips);
		
		jtxtTips = new JTextField();
		jtxtTips.setEditable(false);
		jtxtTips.setFont(new Font("Tahoma", Font.PLAIN, 30));
		jtxtTips.setColumns(10);
		jtxtTips.setBounds(319, 734, 186, 42);
		panelCart.add(jtxtTips);
		
		JTextPane txtpnTax = new JTextPane();
		txtpnTax.setText("Tax :");
		txtpnTax.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtpnTax.setBounds(31, 653, 200, 42);
		panelCart.add(txtpnTax);
		
		jtxtTax = new JTextField();
		jtxtTax.setEditable(false);
		jtxtTax.setFont(new Font("Tahoma", Font.PLAIN, 30));
		jtxtTax.setColumns(10);
		jtxtTax.setBounds(319, 653, 186, 42);
		panelCart.add(jtxtTax);
		
		JTextPane txtpnDelivery = new JTextPane();
		txtpnDelivery.setText("Delivery :");
		txtpnDelivery.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtpnDelivery.setBounds(31, 569, 200, 42);
		panelCart.add(txtpnDelivery);
		
		jtxtDelivery = new JTextField();
		jtxtDelivery.setEditable(false);
		jtxtDelivery.setFont(new Font("Tahoma", Font.PLAIN, 30));
		jtxtDelivery.setColumns(10);
		jtxtDelivery.setBounds(319, 569, 186, 42);
		panelCart.add(jtxtDelivery);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(21, 422, 484, 12);
		panelCart.add(separator_3);
		
		JTextPane textpnSubTotal = new JTextPane();
		textpnSubTotal.setText("SubTotal :");
		textpnSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textpnSubTotal.setBounds(31, 489, 200, 42);
		panelCart.add(textpnSubTotal);
		
		jtxtSub = new JTextField();
		jtxtSub.setEditable(false);
		jtxtSub.setFont(new Font("Tahoma", Font.PLAIN, 30));
		jtxtSub.setColumns(10);
		jtxtSub.setBounds(319, 489, 186, 42);
		panelCart.add(jtxtSub);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger :");
		lblChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblChickenBurger.setBounds(21, 96, 234, 42);
		panelCart.add(lblChickenBurger);
		
		JLabel lblMacncheese = new JLabel("MacNCheese :");
		lblMacncheese.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMacncheese.setBounds(21, 182, 244, 42);
		panelCart.add(lblMacncheese);
		
		JLabel lblSteak = new JLabel("Steak :");
		lblSteak.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblSteak.setBounds(21, 271, 244, 42);
		panelCart.add(lblSteak);
		
		JLabel lblDrinks_1 = new JLabel("Drinks :");
		lblDrinks_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDrinks_1.setBounds(21, 359, 244, 42);
		panelCart.add(lblDrinks_1);
		
		JLabel lblCart = new JLabel("Cart");
		lblCart.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCart.setBounds(217, 21, 92, 26);
		panelCart.add(lblCart);
		
		JLabel lblCheckout = new JLabel("Checkout");
		lblCheckout.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCheckout.setBounds(206, 442, 138, 32);
		panelCart.add(lblCheckout);
		
		/*
		 * Panel Receipt / DeliveryInfo
		 * *************************************************************************************************************
		 */
		
		JPanel panelReceipt = new JPanel();
		panelReceipt.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panelReceipt.setBounds(1115, 21, 638, 968);
		contentPane.add(panelReceipt);
		panelReceipt.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBounds(21, 21, 596, 926);
		panelReceipt.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Delivery Info", null, panel, null);
		panel.setLayout(null);
		
		JTextPane txtpnDeliverTo = new JTextPane();
		txtpnDeliverTo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtpnDeliverTo.setText("Deliver To :");
		txtpnDeliverTo.setBounds(21, 21, 144, 39);
		panel.add(txtpnDeliverTo);
		
		JTextPane txtpnFName = new JTextPane();
		txtpnFName.setText("First Name:");
		txtpnFName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtpnFName.setBounds(21, 114, 200, 42);
		panel.add(txtpnFName);
		
		textFieldFName = new JTextField();
		textFieldFName.setEnabled(false);
		textFieldFName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldFName.setColumns(10);
		textFieldFName.setBounds(271, 114, 299, 42);
		panel.add(textFieldFName);
		
		JTextPane txtpnStreet = new JTextPane();
		txtpnStreet.setText("Street #:");
		txtpnStreet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtpnStreet.setBounds(21, 289, 200, 42);
		panel.add(txtpnStreet);
		
		textFieldStreet = new JTextField();
		textFieldStreet.setEnabled(false);
		textFieldStreet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldStreet.setColumns(10);
		textFieldStreet.setBounds(271, 289, 299, 42);
		panel.add(textFieldStreet);
		
		JTextPane txtpnApartment = new JTextPane();
		txtpnApartment.setText("Apartment #:");
		txtpnApartment.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtpnApartment.setBounds(21, 378, 200, 42);
		panel.add(txtpnApartment);
		
		textFieldApt = new JTextField();
		textFieldApt.setEnabled(false);
		textFieldApt.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldApt.setColumns(10);
		textFieldApt.setBounds(271, 378, 299, 42);
		panel.add(textFieldApt);
		
		JTextPane txtpnZipCode = new JTextPane();
		txtpnZipCode.setText("Zip Code:");
		txtpnZipCode.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtpnZipCode.setBounds(21, 466, 200, 42);
		panel.add(txtpnZipCode);
		
		textFieldZip = new JTextField();
		textFieldZip.setEnabled(false);
		textFieldZip.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldZip.setColumns(10);
		textFieldZip.setBounds(271, 466, 299, 42);
		panel.add(textFieldZip);
		
		JTextPane txtpnLName = new JTextPane();
		txtpnLName.setText("Last Name:");
		txtpnLName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtpnLName.setBounds(21, 205, 200, 42);
		panel.add(txtpnLName);
		
		textFieldLName = new JTextField();
		textFieldLName.setEnabled(false);
		textFieldLName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldLName.setColumns(10);
		textFieldLName.setBounds(271, 205, 299, 42);
		panel.add(textFieldLName);
		
		JTextPane txtpnPhone = new JTextPane();
		txtpnPhone.setText("Phone #:");
		txtpnPhone.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtpnPhone.setBounds(21, 549, 200, 42);
		panel.add(txtpnPhone);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setEnabled(false);
		textFieldPhone.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(271, 549, 299, 42);
		panel.add(textFieldPhone);
		
		JTextPane txtpnDeliveryInstructionsCall = new JTextPane();
		txtpnDeliveryInstructionsCall.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtpnDeliveryInstructionsCall.setText("Delivery Instructions: Call, text, Ring door bell...");
		txtpnDeliveryInstructionsCall.setBounds(21, 639, 549, 32);
		panel.add(txtpnDeliveryInstructionsCall);
		
		jtxtDelivInfo = new JTextField();
		jtxtDelivInfo.setEnabled(false);
		jtxtDelivInfo.setFont(new Font("Tahoma", Font.PLAIN, 21));
		jtxtDelivInfo.setBounds(21, 724, 549, 104);
		panel.add(jtxtDelivInfo);
		jtxtDelivInfo.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit"); //sends info on textField to textArea
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnSubmit.isSelected()){
					String DelivInfo = jtxtDelivInfo.getText();
					jtxtReceipt.setText(DelivInfo);
				}
				else{
					jtxtReceipt.setText("");
				}
			}
		});
		btnSubmit.setBounds(238, 840, 141, 35);
		panel.add(btnSubmit);
		
		JLabel label = new JLabel("Enter text here:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label.setBounds(21, 692, 183, 32);
		panel.add(label);
		
		JPanel panelRcpt = new JPanel();
		tabbedPane.addTab("Receipt", null, panelRcpt, null);
		panelRcpt.setLayout(null);
		
		JTextArea textAreaRcpt = new JTextArea();
		textAreaRcpt.setEditable(false);
		textAreaRcpt.setLineWrap(true);
		textAreaRcpt.setWrapStyleWord(true);
		textAreaRcpt.setFont(new Font("Courier New", Font.PLAIN, 25));
		textAreaRcpt.setBounds(21, 21, 535, 784);
		panelRcpt.add(textAreaRcpt);
		
		JButton btnPrintReceipt = new JButton("Print Receipt");
		btnPrintReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Receipt = jtxtReceipt.getText();
				textAreaRcpt.append(Receipt + "\n");
			}
		});
		btnPrintReceipt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnPrintReceipt.setBounds(21, 826, 185, 60);
		panelRcpt.add(btnPrintReceipt);
		
		jtxtReceipt = new JTextField();
		jtxtReceipt.setBounds(21, 795, 535, 23);
		panelRcpt.add(jtxtReceipt);
		jtxtReceipt.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaRcpt.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnClear.setBounds(385, 826, 185, 60);
		panelRcpt.add(btnClear);
		
		/*
		 * Header TextPane 
		 * *****************************************************************************************************************
		 */
		
		JTextPane txtpnMyrestaurantApp = new JTextPane();
		txtpnMyrestaurantApp.setEditable(false);
		txtpnMyrestaurantApp.setBackground(Color.WHITE);
		txtpnMyrestaurantApp.setForeground(Color.RED);
		txtpnMyrestaurantApp.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 55));
		txtpnMyrestaurantApp.setText("\t\t\t*** Sid's CarryOut ***");
		txtpnMyrestaurantApp.setBounds(21, 21, 1073, 76);
		contentPane.add(txtpnMyrestaurantApp);
		
		/*
		 * Background image
		 * *****************************************************************************************************************
		 */
		
		JLabel lblImage_3 = new JLabel();
		lblImage_3.setIcon(new ImageIcon("C:\\Users\\xidst\\Desktop\\wood.jpg"));
		lblImage_3.setBounds(0, 0, 1774, 1129);
		contentPane.add(lblImage_3);
	}
}

package myRestaurantGUI;

import java.awt.*;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;

import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;

public class RestChoice extends JFrame{
	
	public static void main(String[] args) {

		RestChoice SecondFrame = new RestChoice();
		SecondFrame.setVisible(true);

	}

	public RestChoice() {
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 40));
		getContentPane().setLayout(null);
		
		JLabel lblSelectARestaurant = new JLabel("Select A Restaurant");
		lblSelectARestaurant.setForeground(Color.RED);
		lblSelectARestaurant.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectARestaurant.setFont(new Font("Maiandra GD", Font.PLAIN, 40));
		lblSelectARestaurant.setBounds(196, 87, 470, 70);
		getContentPane().add(lblSelectARestaurant);
		
		JLabel lblMyrestaurantApp = new JLabel("Welcome to MyRestaurant App");
		lblMyrestaurantApp.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyrestaurantApp.setForeground(Color.BLUE);
		lblMyrestaurantApp.setFont(new Font("Maiandra GD", Font.PLAIN, 50));
		lblMyrestaurantApp.setBounds(21, 0, 832, 83);
		getContentPane().add(lblMyrestaurantApp);
		
		JRadioButton rdbtnTonysGrill = new JRadioButton("Tony's Grill");
		rdbtnTonysGrill.setEnabled(false);
		rdbtnTonysGrill.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rdbtnTonysGrill.setBounds(329, 174, 179, 35);
		getContentPane().add(rdbtnTonysGrill);
		
		JRadioButton rdbtnBobsSteakhouse = new JRadioButton("Bobs SteakHouse");
		rdbtnBobsSteakhouse.setEnabled(false);
		rdbtnBobsSteakhouse.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rdbtnBobsSteakhouse.setBounds(329, 241, 234, 35);
		getContentPane().add(rdbtnBobsSteakhouse);
		
		JRadioButton rdbtnPepperTakeout = new JRadioButton("Pete's Takeout");
		rdbtnPepperTakeout.setEnabled(false);
		rdbtnPepperTakeout.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rdbtnPepperTakeout.setBounds(329, 304, 218, 35);
		getContentPane().add(rdbtnPepperTakeout);
		
		JRadioButton rdbtnSidsCarryout = new JRadioButton("Sid's CarryOut");
		rdbtnSidsCarryout.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rdbtnSidsCarryout.setBounds(329, 366, 203, 35);
		getContentPane().add(rdbtnSidsCarryout);
		
		JButton btnBack = new JButton("<< Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WelcomeGUI thisRestApp = new WelcomeGUI();
				thisRestApp.setVisible(true);
			}
		});
		btnBack.setBounds(21, 473, 141, 35);
		getContentPane().add(btnBack);
		
		JButton btnNext1 = new JButton("Next >>");
		btnNext1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNext1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSidsCarryout.isSelected()){
					dispose();
					RestApp myRestApp = new RestApp();
					myRestApp.setVisible(true);
				}		
			}
		});
		btnNext1.setBounds(712, 473, 141, 35);
		getContentPane().add(btnNext1);
		
		JLabel lblImage_2 = new JLabel();
		lblImage_2.setIcon(new ImageIcon("C:\\Users\\xidst\\Desktop\\food.jpg"));
		lblImage_2.setBounds(0, 0, 874, 529);
		getContentPane().add(lblImage_2);
		setBounds(100, 100, 900, 600);
		
	}

}
	

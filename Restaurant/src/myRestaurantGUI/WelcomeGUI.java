package myRestaurantGUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class WelcomeGUI extends JFrame {

	public static void main(String[] args) {
		WelcomeGUI newFrame = new WelcomeGUI();
		newFrame.setVisible(true);
	}


	public WelcomeGUI() {
	getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 40));
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	setBounds(100, 100, 900, 600);
	getContentPane().setLayout(null);
	
	JLabel lblSelectACuisine = new JLabel("Select A Cuisine");
	lblSelectACuisine.setForeground(Color.RED);
	lblSelectACuisine.setFont(new Font("Maiandra GD", Font.PLAIN, 40));
	lblSelectACuisine.setBounds(316, 133, 283, 36);
	getContentPane().add(lblSelectACuisine);
	
	JRadioButton rdbtnAmerican = new JRadioButton("American");
	rdbtnAmerican.setFont(new Font("Tahoma", Font.PLAIN, 30));
	rdbtnAmerican.setBounds(329, 203, 201, 35);
	getContentPane().add(rdbtnAmerican);
	
	JRadioButton rdbtnItalian = new JRadioButton("Italian");
	rdbtnItalian.setEnabled(false);
	rdbtnItalian.setFont(new Font("Tahoma", Font.PLAIN, 30));
	rdbtnItalian.setBounds(329, 264, 201, 35);
	getContentPane().add(rdbtnItalian);
	
	JRadioButton rdbtnChinese = new JRadioButton("Chinese");
	rdbtnChinese.setEnabled(false);
	rdbtnChinese.setFont(new Font("Tahoma", Font.PLAIN, 30));
	rdbtnChinese.setBounds(329, 323, 201, 35);
	getContentPane().add(rdbtnChinese);
	
	JRadioButton rdbtnIndian = new JRadioButton("Indian");
	rdbtnIndian.setEnabled(false);
	rdbtnIndian.setFont(new Font("Tahoma", Font.PLAIN, 30));
	rdbtnIndian.setBounds(329, 384, 201, 35);
	getContentPane().add(rdbtnIndian);
	
	JButton btnNext = new JButton("Next >>");
	btnNext.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

			if(rdbtnAmerican.isSelected()){
				dispose();
				RestChoice newRestApp = new RestChoice();
				newRestApp.setVisible(true);
			}

		}
	});
	btnNext.setFont(new Font("Tahoma", Font.PLAIN, 25));
	btnNext.setBounds(712, 473, 141, 35);
	getContentPane().add(btnNext);
	
	JButton button = new JButton("<< Back");
	button.setEnabled(false);
	button.setFont(new Font("Tahoma", Font.PLAIN, 25));
	button.setBounds(21, 473, 141, 35);
	getContentPane().add(button);
	
	JLabel lblWelcomeToMyrestaurant = new JLabel("Welcome to MyRestaurant App");
	lblWelcomeToMyrestaurant.setForeground(Color.BLUE);
	lblWelcomeToMyrestaurant.setHorizontalAlignment(SwingConstants.CENTER);
	lblWelcomeToMyrestaurant.setFont(new Font("Maiandra GD", Font.BOLD, 50));
	lblWelcomeToMyrestaurant.setBounds(21, 21, 832, 91);
	getContentPane().add(lblWelcomeToMyrestaurant);
	
	JLabel lblImage_1 = new JLabel();
	lblImage_1.setIcon(new ImageIcon("C:\\Users\\xidst\\Documents\\eclipse\\Assignmentsjava\\Restaurant\\src\\myRestaurantGUI\\food.jpg"));
	lblImage_1.setBounds(0, 0, 890, 530);
	getContentPane().add(lblImage_1);

	}

}
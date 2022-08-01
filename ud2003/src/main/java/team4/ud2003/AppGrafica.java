package team4.ud2003;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppGrafica {

	public JFrame frame;
	private int btn1=0;
	private int btn2=0;

	/**
	 * Create the application.
	 */
	public AppGrafica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel txtBtn = new JLabel("Boton 1: 0 veces, Boton 2: 0 veces");
		springLayout.putConstraint(SpringLayout.NORTH, txtBtn, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, txtBtn, 124, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(txtBtn);
		
		JButton btnNewButton = new JButton("Boton 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1++;
				txtBtn.setText("Boton 1: "+ btn1 +" veces, Boton 2: "+ btn2 +" veces");
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 37, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -253, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Boton 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2++;
				txtBtn.setText("Boton 1: "+ btn1 +" veces, Boton 2: "+ btn2 +" veces");
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 52, SpringLayout.EAST, btnNewButton);
		frame.getContentPane().add(btnNewButton_1);
	}

}

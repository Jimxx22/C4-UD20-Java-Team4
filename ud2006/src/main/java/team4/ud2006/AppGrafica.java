package team4.ud2006;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AppGrafica {

	protected JFrame frame;
	private JTextField txtFAltura;
	private JTextField txtFPeso;

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
		frame.setBounds(100, 100, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lbl1 = new JLabel("Altura (metros): ");
		
		txtFAltura = new JTextField();
		txtFAltura.setColumns(10);
		
		JLabel lbl2 = new JLabel("Peso (kg): ");
		
		txtFPeso = new JTextField();
		txtFPeso.setColumns(10);
		
		JLabel lblError1 = new JLabel("");
		lblError1.setForeground(Color.RED);
		
		JLabel lblError2 = new JLabel("");
		lblError2.setForeground(Color.RED);
		
		JLabel lblNewLabel_2 = new JLabel("IMC:");
		
		JLabel lblIMC = new JLabel("0");
		
		JLabel lblError3 = new JLabel("");
		lblError3.setForeground(Color.RED);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtFAltura.getText().equals("")) {
					lblError1.setText("El campo esta vacio. ");
				}else if(txtFPeso.getText().equals("")) {
					lblError2.setText("El campo esta vacio. ");
				}else {
					try {
						Double altura=Double.parseDouble(txtFAltura.getText());
						Double peso=Double.parseDouble(txtFPeso.getText());
						Double IMC=peso/Math.pow(altura, 2);
						lblIMC.setText(String.valueOf(IMC));
					}catch (NumberFormatException ex) {
						lblError3.setText("El campo no es un numero. ");
					}	
					
				}
								
				
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(64)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblError3)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblIMC))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lbl2)
									.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
									.addComponent(txtFPeso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lbl1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtFAltura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblError2)
								.addComponent(lblError1))))
					.addContainerGap(346, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl1)
						.addComponent(txtFAltura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblError1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl2)
						.addComponent(txtFPeso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblError2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblError3)
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(lblNewLabel_2)
						.addComponent(lblIMC))
					.addContainerGap(157, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}

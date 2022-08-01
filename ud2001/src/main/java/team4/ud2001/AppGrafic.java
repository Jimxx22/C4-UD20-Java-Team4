package team4.ud2001;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppGrafic {

	public JFrame frmTituloDeLa;

	/**
	 * Create the application.
	 */
	public AppGrafic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTituloDeLa = new JFrame();
		frmTituloDeLa.setTitle("TITULO DE LA VENTANA");
		frmTituloDeLa.setBounds(100, 100, 450, 300);
		frmTituloDeLa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Texto");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JButton btnMenos = new JButton("-");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp = lblNewLabel.getFont().getSize();
				temp-=1;
				lblNewLabel.setFont(new Font("Arial", Font.PLAIN, temp));
			}
		});
		
		JButton btnMas = new JButton("+");
		btnMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp = lblNewLabel.getFont().getSize();
				temp+=1;
				lblNewLabel.setFont(new Font("Arial", Font.PLAIN, temp));	
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(frmTituloDeLa.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(127)
							.addComponent(btnMenos)
							.addGap(60)
							.addComponent(btnMas))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(185)
							.addComponent(lblNewLabel)))
					.addContainerGap(169, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(41)
					.addComponent(lblNewLabel)
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnMenos)
						.addComponent(btnMas))
					.addContainerGap(151, Short.MAX_VALUE))
		);
		frmTituloDeLa.getContentPane().setLayout(groupLayout);
	}
}

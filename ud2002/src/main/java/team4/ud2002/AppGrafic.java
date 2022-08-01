package team4.ud2002;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppGrafic {

	protected JFrame frame;

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
		frame = new JFrame();
		frame.setBounds(100, 100, 398, 162);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Has pulsado:");
		
		JLabel texto = new JLabel("Nada");
		
		JButton btn1 = new JButton("Boton 1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText("Boton 1");
			}
		});
		
		JButton btn2 = new JButton("Boton 2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText("Boton 2");
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(texto, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btn1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btn2)
					.addContainerGap(71, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(54)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(texto)
						.addComponent(btn1)
						.addComponent(btn2))
					.addContainerGap(46, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}

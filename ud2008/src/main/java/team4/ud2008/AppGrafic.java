package team4.ud2008;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class AppGrafic {

	public JFrame frame;
	private JTextField num;
	private JTextField resultado;



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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Cantidad a convertir:");
		
		num = new JTextField();
		num.setColumns(10);
		
		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		
		JButton btnCalcular = new JButton("Euros a ptas");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double calc = 0;
				try {
					if (btnCalcular.getText().equals("Euros a ptas")) {
						calc =  Double.parseDouble(num.getText()) * 166.386;
					} else {
						calc = Double.parseDouble(num.getText()) / 166.386;
					}
					DecimalFormat df = new DecimalFormat("#.##");
					resultado.setText(df.format(calc));
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Escribe un número válido.");
					num.setText("");
				}
			}
		});
		
		JButton btnCambiar = new JButton("Cambiar");
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnCalcular.getText().equals("Euros a ptas")) {
					btnCalcular.setText("ptas a Euros");
				} else {
					btnCalcular.setText("Euros a ptas");
				}
				
			}
		});
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num.setText("");
				resultado.setText("");
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(45)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(num, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(resultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(92)
							.addComponent(btnCalcular)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCambiar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnBorrar, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(num, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1)
						.addComponent(resultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCalcular)
						.addComponent(btnCambiar)
						.addComponent(btnBorrar))
					.addContainerGap(189, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}

package team4.ud2005;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.ActionEvent;

public class AppGrafica {

	protected JFrame frame;
	
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
		JTextArea txtA = new JTextArea();
		
		JButton btnImprimir = new JButton("Limpiar");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtA.setText("");
			}
		});
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(176)
					.addComponent(btnImprimir)
					.addContainerGap(193, Short.MAX_VALUE))
				.addComponent(txtA, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnImprimir)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtA, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		
		frame.addMouseListener(new MouseAdapter() {
		
			@Override
			public void mouseClicked(MouseEvent e) {
				txtA.append("El raton a pulsado sober un componente\n");
				super.mouseClicked(e);
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				txtA.append("El raton a pulsado i arrastrado un componente\n");
				super.mouseDragged(e);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				txtA.append("El raton a entrado en un componente\n");
				super.mouseEntered(e);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				txtA.append("El raton a salido de un componente\n");
				super.mouseExited(e);
			}
			
			@Override
			public void mouseMoved(MouseEvent e) {
				txtA.append("El raton se ha movido en en un componente\n");
				super.mouseMoved(e);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				txtA.append("El raton a pulsado un componente\n");
				super.mousePressed(e);
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				txtA.append("El raton a soltado el boton en un componente\n");
				super.mouseReleased(e);
			}
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				txtA.append("La rueda del raton se ha movido\n");
				super.mouseWheelMoved(e);
			}
		
		});
	}
}

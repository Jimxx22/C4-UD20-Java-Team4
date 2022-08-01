package team4.ud2004;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class AppGrafic {

	public JFrame frmTituloDeLa;
	/**
	 * @wbp.nonvisual location=214,139
	 */

	public AppGrafic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTituloDeLa = new JFrame();
		frmTituloDeLa.setTitle("EX4");
		frmTituloDeLa.setBounds(100, 100, 450, 300);
		frmTituloDeLa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		JLabel lblNewLabel = new JLabel("EVENTOS");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
	
		JTextArea textArea = new JTextArea();

		GroupLayout groupLayout = new GroupLayout(frmTituloDeLa.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(185)
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(118)
							.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
					.addGap(132))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(41)
					.addComponent(lblNewLabel)
					.addGap(44)
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
					.addGap(91))
		);
		frmTituloDeLa.getContentPane().setLayout(groupLayout);
		textArea.append("\nWindow Opened");
		frmTituloDeLa.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				textArea.append("\nWindow Opened");
				super.windowOpened(e);
			}

			@Override
			public void windowClosed(WindowEvent e) {
				textArea.append("\nWindow Closed");
				super.windowClosed(e);
			}

			@Override
			public void windowIconified(WindowEvent e) {
				textArea.append("\nWindow Iconified");
				super.windowIconified(e);
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				textArea.append("\nWindow Deiconified");
				super.windowDeiconified(e);
			}

			@Override
			public void windowActivated(WindowEvent e) {
				textArea.append("\nWindow Activated");
				super.windowActivated(e);
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				textArea.append("\nWindow Deactivated");
				super.windowDeactivated(e);
			}

			@Override
			public void windowStateChanged(WindowEvent e) {
				textArea.append("\nWindow State Changed");
				super.windowStateChanged(e);
			}

			@Override
			public void windowGainedFocus(WindowEvent e) {
				textArea.append("\nWindow Gained Focus");
				super.windowGainedFocus(e);
			}

			@Override
			public void windowLostFocus(WindowEvent e) {
				textArea.append("\nWindow Lost Focus");
				super.windowLostFocus(e);
			}
	        
	    });
	}
}

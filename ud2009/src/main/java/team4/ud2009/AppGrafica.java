package team4.ud2004;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.JToggleButton;

public class AppGrafica {

	protected JFrame frame;
	private List<JToggleButton> cartas = new ArrayList<JToggleButton>();
	private Stack<Color> colors = new Stack<Color>();
	private Color COLOR_DEFAULT = new Color(238,238,238);

	/**
	 * Create the application.
	 */
	public AppGrafica() {
		setColors();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(4, 4, 0, 0));
		
		JToggleButton tglbtn11 = new JToggleButton("");
		cartas.add(tglbtn11);
		tglbtn11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
			}
		});
		frame.getContentPane().add(tglbtn11);
		
		JToggleButton tglbtn12 = new JToggleButton("");
		cartas.add(tglbtn12);
		tglbtn12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(tglbtn12);
		
		JToggleButton tglbtn13 = new JToggleButton("");
		cartas.add(tglbtn13);
		tglbtn13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(tglbtn13);
		
		JToggleButton tglbtn14 = new JToggleButton("");
		cartas.add(tglbtn14);
		tglbtn14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(tglbtn14);
		
		JToggleButton tglbtn21 = new JToggleButton("");
		cartas.add(tglbtn21);
		tglbtn21.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(tglbtn21);
		
		JToggleButton tglbtn22 = new JToggleButton("");
		cartas.add(tglbtn22);
		tglbtn22.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
			}
		});
		frame.getContentPane().add(tglbtn22);
		
		JToggleButton tglbtn23 = new JToggleButton("");
		cartas.add(tglbtn23);
		tglbtn23.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(tglbtn23);
		
		JToggleButton tglbtn24 = new JToggleButton("");
		cartas.add(tglbtn24);
		tglbtn24.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(tglbtn24);
		
		JToggleButton tglbtn31 = new JToggleButton("");
		cartas.add(tglbtn31);
		tglbtn31.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
			}
		});
		frame.getContentPane().add(tglbtn31);
		
		JToggleButton tglbtn32 = new JToggleButton("");
		cartas.add(tglbtn32);
		tglbtn32.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
			}
		});
		frame.getContentPane().add(tglbtn32);
		
		JToggleButton tglbtn33 = new JToggleButton("");
		cartas.add(tglbtn33);
		tglbtn33.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(tglbtn33);
		
		JToggleButton tglbtn34 = new JToggleButton("");
		cartas.add(tglbtn34);
		tglbtn34.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
			}
		});
		frame.getContentPane().add(tglbtn34);
		
		JToggleButton tglbtn41 = new JToggleButton("");
		cartas.add(tglbtn41);
		tglbtn41.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(tglbtn41);
		
		JToggleButton tglbtn42 = new JToggleButton("");
		cartas.add(tglbtn42);
		tglbtn42.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(tglbtn42);
		
		JToggleButton tglbtn43 = new JToggleButton("");
		cartas.add(tglbtn43);
		tglbtn43.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(tglbtn43);
		
		JToggleButton tglbtn44 = new JToggleButton("");
		cartas.add(tglbtn44);
		tglbtn44.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(tglbtn44);	
		
		asignarColores();
		
	}
	
	//Funcion asignar colores aleatorios
	private void asignarColores() {
		// Settear el color por defecto para que sea del tipo Color
		for(JToggleButton b : cartas)
			b.setBackground(COLOR_DEFAULT);
		
		boolean asignados = false;
		while(!asignados) {
			// Obtener button aleatorio
			int rand = (int)(Math.random() * (16 - 0)+0);
			JToggleButton b = cartas.get(rand);
			
			// Si no se le ha asignado color, asignarselo
			if(b.getBackground() == COLOR_DEFAULT)
				b.setBackground(colors.pop());
			
			// Ocultar color backgroud
			b.setSelected(true);
			
			// Si se han asignado todos los colores, salir del bucle
			if(colors.size() == 0)
				asignados = true;			
		}
	}
	
	
	//Funcion comparar colores
	public boolean compararColores(JToggleButton button, JToggleButton button2) {
		boolean result=false;
		if (button.getBackground() == button2.getBackground()) {
			result=true;
		}
		return result;
	}
	
	private void setColors() {
		colors.add(new Color(255,153,51));
		colors.add(new Color(100,56,0));
		colors.add(new Color(204,0,204));
		colors.add(new Color(0,0,255));
		colors.add(new Color(51,204,204));
		colors.add(new Color(51,204,51));
		colors.add(new Color(255,255,0));
		colors.add(new Color(255,0,0));
		colors.add(new Color(255,153,51));
		colors.add(new Color(100,56,0));
		colors.add(new Color(204,0,204));
		colors.add(new Color(0,0,255));
		colors.add(new Color(51,204,204));
		colors.add(new Color(51,204,51));
		colors.add(new Color(255,255,0));
		colors.add(new Color(255,0,0));
	}

}

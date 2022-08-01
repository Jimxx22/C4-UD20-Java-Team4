package team4.ud2009;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.JToggleButton;
import java.awt.Rectangle;
import javax.swing.border.LineBorder;

public class AppGrafica {

	protected JFrame frame;
	private List<JToggleButton> cartas = new ArrayList<JToggleButton>();
	private Stack<Color> colors = new Stack<Color>();
	private Color COLOR_DEFAULT = new Color(238,238,238);

	int fin=0;
	int torns=0;
	
	private JToggleButton tglbtn11;
	private JToggleButton tglbtn12;
	private JToggleButton tglbtn13;
	private JToggleButton tglbtn14;
	private JToggleButton tglbtn21;
	private JToggleButton tglbtn22;
	private JToggleButton tglbtn23;
	private JToggleButton tglbtn24;
	private JToggleButton tglbtn31;
	private JToggleButton tglbtn32;
	private JToggleButton tglbtn33;
	private JToggleButton tglbtn34;
	private JToggleButton tglbtn41;
	private JToggleButton tglbtn42;
	private JToggleButton tglbtn43;
	private JToggleButton tglbtn44;
	
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
		
		tglbtn11 = new JToggleButton("");
		tglbtn11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		tglbtn11.setBackground(Color.WHITE);
		
		cartas.add(tglbtn11);
		tglbtn11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				compararColores(tglbtn11);
		}});

			
		frame.getContentPane().add(tglbtn11);
		
		tglbtn12 = new JToggleButton("");
		tglbtn12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		tglbtn12.setBackground(Color.WHITE);
		cartas.add(tglbtn12);
		tglbtn12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compararColores(tglbtn12);
			}
		});
		frame.getContentPane().add(tglbtn12);
		
		tglbtn13 = new JToggleButton("");
		tglbtn13.setBorder(new LineBorder(Color.BLACK, 2));
		tglbtn13.setBackground(Color.WHITE);
		cartas.add(tglbtn13);
		tglbtn13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {			
				compararColores(tglbtn13);
			}
		});
		frame.getContentPane().add(tglbtn13);
		
		tglbtn14 = new JToggleButton("");
		tglbtn14.setBackground(Color.WHITE);
		tglbtn14.setBorder(new LineBorder(Color.BLACK, 2));
		cartas.add(tglbtn14);
		tglbtn14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compararColores(tglbtn14);
			}
		});
		frame.getContentPane().add(tglbtn14);
		
		tglbtn21 = new JToggleButton("");
		tglbtn21.setBackground(Color.WHITE);
		tglbtn21.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cartas.add(tglbtn21);
		tglbtn21.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compararColores(tglbtn21);
			}
		});
		frame.getContentPane().add(tglbtn21);
		
		tglbtn22 = new JToggleButton("");
		tglbtn22.setBackground(Color.WHITE);
		tglbtn22.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cartas.add(tglbtn22);
		tglbtn22.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compararColores(tglbtn22);	
			}
		});
		frame.getContentPane().add(tglbtn22);
		
		tglbtn23 = new JToggleButton("");
		tglbtn23.setBackground(Color.WHITE);
		tglbtn23.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cartas.add(tglbtn23);
		tglbtn23.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compararColores(tglbtn23);		
			}
		});
		frame.getContentPane().add(tglbtn23);
		
		tglbtn24 = new JToggleButton("");
		tglbtn24.setBackground(Color.WHITE);
		tglbtn24.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cartas.add(tglbtn24);
		tglbtn24.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compararColores(tglbtn24);	
			}
		});
		frame.getContentPane().add(tglbtn24);
		
		tglbtn31 = new JToggleButton("");
		tglbtn31.setBackground(Color.WHITE);
		tglbtn31.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cartas.add(tglbtn31);
		tglbtn31.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compararColores(tglbtn31);			
			}
		});
		frame.getContentPane().add(tglbtn31);
		
		tglbtn32 = new JToggleButton("");
		tglbtn32.setBackground(Color.WHITE);
		tglbtn32.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cartas.add(tglbtn32);
		tglbtn32.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compararColores(tglbtn32);
			}
		});
		
		frame.getContentPane().add(tglbtn32);
		
		tglbtn33 = new JToggleButton("");
		tglbtn33.setBackground(Color.WHITE);
		tglbtn33.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cartas.add(tglbtn33);
		tglbtn33.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compararColores(tglbtn33);	
			}
		});
		frame.getContentPane().add(tglbtn33);
		
		tglbtn34 = new JToggleButton("");
		tglbtn34.setBackground(Color.WHITE);
		tglbtn34.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cartas.add(tglbtn34);
		tglbtn34.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compararColores(tglbtn34);	
			}
		});
		frame.getContentPane().add(tglbtn34);
		
		tglbtn41 = new JToggleButton("");
		tglbtn41.setBackground(Color.WHITE);
		tglbtn41.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cartas.add(tglbtn41);
		tglbtn41.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compararColores(tglbtn41);	
			}
		});
		frame.getContentPane().add(tglbtn41);
		
		tglbtn42 = new JToggleButton("");
		tglbtn42.setBackground(Color.WHITE);
		tglbtn42.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cartas.add(tglbtn42);
		tglbtn42.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compararColores(tglbtn42);
			}
		});
		frame.getContentPane().add(tglbtn42);
		
		tglbtn43 = new JToggleButton("");
		tglbtn43.setBackground(Color.WHITE);
		tglbtn43.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cartas.add(tglbtn43);
		tglbtn43.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compararColores(tglbtn43);
			}
		});
		frame.getContentPane().add(tglbtn43);
		
		tglbtn44 = new JToggleButton("");
		tglbtn44.setBackground(Color.WHITE);
		tglbtn44.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cartas.add(tglbtn44);
		tglbtn44.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compararColores(tglbtn44);
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
			
	public void compararColores(JToggleButton buttonSelected) {
		for(JToggleButton b : cartas) {
			// primer cal mirar que el botó no és ell mateix, perquè recorrem la llista de tots els botons
			// isEnabled implica que encara no s'ha trobar la parella d'aquella carta
			// isSelected implica que està amagat (no es veu el color), cal mirar que NO isSelected
			if(b != buttonSelected && b.isEnabled() && !b.isSelected()) {
				int bCol = b.getBackground().getRGB();
				int buttSelCol = buttonSelected.getBackground().getRGB();
				if(bCol == buttSelCol) {
					System.out.println("Colors iguals");
					b.setEnabled(false);
					buttonSelected.setEnabled(false);
					torns++;
					fin++;
				} else {
					torns++;
					System.out.println("Colors diferents");
					new java.util.Timer().schedule( 
					        new java.util.TimerTask() {
					            @Override
					            public void run() {
					            	b.setSelected(true);
							buttonSelected.setSelected(true);
					            }
					        }, 1000 
					);
				}
			}
		}
		if(fin==8) {
			JOptionPane.showMessageDialog(null, "Has terminado con " +torns+" turnos");
		}
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

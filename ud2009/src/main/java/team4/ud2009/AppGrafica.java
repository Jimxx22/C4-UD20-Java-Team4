package team4.ud2009;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JToggleButton;
import java.awt.Rectangle;
import javax.swing.border.LineBorder;

public class AppGrafica {

	protected JFrame frame;
	private List<JToggleButton> cartas = new ArrayList<JToggleButton>();

	private JToggleButton tglbtnA;
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
	
	private int rgbBase;
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
		frame.setBounds(100, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(4, 4, 0, 0));
		
		tglbtn11 = new JToggleButton("");
		tglbtn11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		tglbtn11.setBackground(Color.WHITE);
		rgbBase=tglbtn11.getBackground().getRGB();
		
		cartas.add(tglbtn11);
		tglbtn11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				tglbtn11.setBackground(colores(1));
				
				if(tglbtnA==null) {
					tglbtnA=tglbtn11;
				}else {
					compararColores(tglbtnA,tglbtn11);
				}
				
				
				tglbtn11.setSelected(false);
		}});

		
		frame.getContentPane().add(tglbtn11);
		
		tglbtn12 = new JToggleButton("");
		tglbtn12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		tglbtn12.setBackground(Color.WHITE);
		cartas.add(tglbtn12);
		tglbtn12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				tglbtn12.setBackground(colores(1));
				if(tglbtnA==null) {
					tglbtnA=tglbtn12;
				}else {
					compararColores(tglbtnA,tglbtn12);
				}
				tglbtn12.setSelected(false);
				
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
				tglbtn13.setBackground(colores(2));
				
				if(tglbtnA==null) {
					tglbtnA=tglbtn13;
				}else {
					compararColores(tglbtnA,tglbtn13);
				}
				tglbtn13.setSelected(false);
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
				tglbtn14.setBackground(colores(2));
				if(tglbtnA==null) {
					tglbtnA=tglbtn14;
				}else {
					compararColores(tglbtnA,tglbtn14);
				}
				tglbtn14.setSelected(false);
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
				tglbtn21.setBackground(colores(3));
				
				if(tglbtnA==null) {
					tglbtnA=tglbtn21;
				}else {
					compararColores(tglbtnA,tglbtn21);
				}
				tglbtn21.setSelected(false);
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
				
				tglbtn22.setBackground(colores(3));
				if(tglbtnA==null) {
					tglbtnA=tglbtn22;
				}else {
					compararColores(tglbtnA,tglbtn22);
				}
				tglbtn22.setSelected(false);
				
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
				
				tglbtn23.setBackground(colores(4));
				if(tglbtnA==null) {
					tglbtnA=tglbtn23;
				}else {
					compararColores(tglbtnA,tglbtn23);
				}
				tglbtn23.setSelected(false);
				
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
				tglbtn24.setBackground(colores(4));
				if(tglbtnA==null) {
					tglbtnA=tglbtn24;
				}else {
					compararColores(tglbtnA,tglbtn24);
				}
				tglbtn24.setSelected(false);
				
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
				tglbtn31.setBackground(colores(5));
				if(tglbtnA==null) {
					tglbtnA=tglbtn31;
				}else {
					compararColores(tglbtnA,tglbtn31);
				}
				tglbtn31.setSelected(false);
				
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
				
				tglbtn32.setBackground(colores(5));
				if(tglbtnA==null) {
					tglbtnA=tglbtn32;
				}else {
					compararColores(tglbtnA,tglbtn32);
				}
				tglbtn32.setSelected(false);
				
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
				
				tglbtn33.setBackground(colores(6));
				if(tglbtnA==null) {
					tglbtnA=tglbtn33;
				}else {
					compararColores(tglbtnA,tglbtn33);
				}
				tglbtn33.setSelected(false);
				
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
				
				tglbtn34.setBackground(colores(6));
				if(tglbtnA==null) {
					tglbtnA=tglbtn34;
				}else {
					compararColores(tglbtnA,tglbtn34);
				}
				tglbtn34.setSelected(false);
				
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

				tglbtn41.setBackground(colores(7));
				if(tglbtnA==null) {
					tglbtnA=tglbtn41;
				}else {
					compararColores(tglbtnA,tglbtn41);
				}
				tglbtn41.setSelected(false);
				
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

				tglbtn42.setBackground(colores(7));
				if(tglbtnA==null) {
					tglbtnA=tglbtn42;
				}else {
					compararColores(tglbtnA,tglbtn42);
				}
				tglbtn42.setSelected(false);
				
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
				
				tglbtn43.setBackground(colores(8));
				if(tglbtnA==null) {
					tglbtnA=tglbtn43;
				}else {
					compararColores(tglbtnA,tglbtn43);
				}
				tglbtn43.setSelected(false);
				
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
				
				tglbtn44.setBackground(colores(8));
				if(tglbtnA==null) {
					tglbtnA=tglbtn44;
				}else {
					compararColores(tglbtnA,tglbtn44);
				}
				tglbtn44.setSelected(false);
				
			}
		});
		frame.getContentPane().add(tglbtn44);	
		
	}
	
	//Funcion asignar colores aleatorios
	
	private void asignarColores() {
		for(JToggleButton j : cartas) {
			int rand = (int)(Math.random() * (8 - 1)+1);
			j.setBackground(colores(rand));
		}
		
	}
	
	
	//Funcion comparar colores
	public void compararColores(JToggleButton button, JToggleButton button2) {
		if (button.getBackground().getRGB()==button2.getBackground().getRGB() && button.getBackground()!=button2.getBackground()) {
			button.setEnabled(false);
			button2.setEnabled(false);		
		}else {
			button.setBackground(new Color(rgbBase));;
			button2.setBackground(new Color(rgbBase));;	
		}
		tglbtnA=null;
	}
	
	
	
	//Funcion switch colores 
	
	public Color colores(int n) {
		
		Color color;
		
		switch (n) {
		case 1:
			//Rojo
			color=new Color(255,0,0);
			break;
		case 2:
			//Amarillo
			color=new Color(255,255,0);
			break;
		case 3:
			//Verde
			color=new Color(51,204,51);
			break;
		case 4:
			//Azul claro
			color=new Color(51,204,204);
			break;
		case 5:
			//Azul oscuro
			color=new Color(0,0,255);
			break;
		case 6:
			//Morado
			color=new Color(204,0,204);
			break;
		case 7:
			//Negro
			color=new Color(0,0,0);
			break;
		case 8:
			//Naranja
			color=new Color(255,153,51);
			break;

		default:
			color=new Color(255,255,255);
			break;
		}
		
		return color;
	}
	
}

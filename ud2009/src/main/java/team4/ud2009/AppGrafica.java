package team4.ud2009;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

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
		frame.setBounds(100, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(4, 4, 0, 0));
		
		JToggleButton tglbtn11 = new JToggleButton("");
		
		tglbtn11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//tglbtn11
				
			}
		});
		
		frame.getContentPane().add(tglbtn11);
		
		JToggleButton tglbtn12 = new JToggleButton("");
		tglbtn12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				
				
				
			}
		});
		frame.getContentPane().add(tglbtn12);
		
		JToggleButton tglbtn13 = new JToggleButton("");
		tglbtn13.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("aa");
				
			}
		});
		frame.getContentPane().add(tglbtn13);
		
		JToggleButton tglbtn14 = new JToggleButton("");
		tglbtn14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("aa");
				
			}
		});
		frame.getContentPane().add(tglbtn14);
		
		JToggleButton tglbtn21 = new JToggleButton("");
		tglbtn21.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("aa");
				
			}
		});
		frame.getContentPane().add(tglbtn21);
		
		JToggleButton tglbtn22 = new JToggleButton("");
		tglbtn22.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("aa");
				
			}
		});
		frame.getContentPane().add(tglbtn22);
		
		JToggleButton tglbtn23 = new JToggleButton("");
		tglbtn23.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("aa");
				
			}
		});
		frame.getContentPane().add(tglbtn23);
		
		JToggleButton tglbtn24 = new JToggleButton("");
		tglbtn24.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("aa");
				
			}
		});
		frame.getContentPane().add(tglbtn24);
		
		JToggleButton tglbtn31 = new JToggleButton("");
		tglbtn31.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("aa");
				
			}
		});
		frame.getContentPane().add(tglbtn31);
		
		JToggleButton tglbtn32 = new JToggleButton("");
		tglbtn32.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("aa");
				
			}
		});
		frame.getContentPane().add(tglbtn32);
		
		JToggleButton tglbtn33 = new JToggleButton("");
		tglbtn33.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("aa");
				
			}
		});
		frame.getContentPane().add(tglbtn33);
		
		JToggleButton tglbtn34 = new JToggleButton("");
		tglbtn34.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("aa");
				
			}
		});
		frame.getContentPane().add(tglbtn34);
		
		JToggleButton tglbtn41 = new JToggleButton("");
		tglbtn41.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("aa");
				
			}
		});
		frame.getContentPane().add(tglbtn41);
		
		JToggleButton tglbtn42 = new JToggleButton("");
		tglbtn42.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("aa");
				
			}
		});
		frame.getContentPane().add(tglbtn42);
		
		JToggleButton tglbtn43 = new JToggleButton("");
		tglbtn43.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("aa");
				
			}
		});
		frame.getContentPane().add(tglbtn43);
		
		JToggleButton tglbtn44 = new JToggleButton("");
		tglbtn44.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("aa");
				
			}
		});
		frame.getContentPane().add(tglbtn44);	
		
	}
	
	//Funcion asignar colores aleatorios
	
	
	
	
	//Funcion comparar colores
	
	
	
	
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
			color=new Color(0);
			break;
		}
		
		return color;
	}
	
	

}

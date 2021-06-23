package SWING;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora {

	public static void main(String[]args) {
		marcocalc mimarco=new marcocalc();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		
		
				
	}
	
}
class marcocalc extends JFrame{
	public marcocalc() {
		setTitle("Calculadora");
		setBounds(750,300,200,300);
		laminacalc mialamina=new laminacalc();
		add(mialamina);
		}
}
class laminacalc extends JPanel{
	public laminacalc() {
		principio=true;
		setLayout(new BorderLayout());
		pantalla=new JButton("0");
		pantalla.setEnabled(false);
		add(pantalla, BorderLayout.NORTH);
		milamina2=new JPanel();
		milamina2.setLayout(new GridLayout(4,4));
		//JButton boton1=new JButton("1");
		//milamina2.add(boton1);
		ActionListener insertar=new inserta();
		ActionListener operar=new operaciones();
		
		ponerboton("7", insertar);
		ponerboton("8",  insertar);
		ponerboton("9", insertar);
		ponerboton("+", operar);
		ponerboton("4", insertar);
		ponerboton("5", insertar);
		ponerboton("6", insertar);
		ponerboton("-", operar);
		ponerboton("1", insertar);
		ponerboton("2", insertar);
		ponerboton("3", insertar);
		ponerboton("X", operar);
		ponerboton("0", insertar);
		ponerboton(".", insertar);
		ponerboton("=", operar);
		ponerboton("/", operar);
		add(milamina2, BorderLayout.CENTER);
		ultimax="=";
	}
	private void ponerboton(String rotulo, ActionListener oyente) {
		
		JButton boton=new JButton(rotulo);
		boton.addActionListener(oyente);
		milamina2.add(boton);
		
	}
	private class inserta implements ActionListener{

		public void actionPerformed(ActionEvent e) {
		String entrada=e.getActionCommand();
		if (principio) {pantalla.setText("");
		principio=false;
		}
		pantalla.setText(pantalla.getText() + entrada);
			
		}
		
	}
	
	private class operaciones implements ActionListener{
		public void actionPerformed(ActionEvent e) {
		String operata=e.getActionCommand();
		calcular(Double.parseDouble(pantalla.getText()));
		ultimax=operata;
		principio=true;	
		
		}
		public void calcular(double x) {
			if(ultimax.equals("+")) {
				resultado+=x;}
			else if(ultimax.equals("-")) {
				resultado-=x;
				
			} else if(ultimax.equals("X")) {
				resultado*=x;
			}else if(ultimax.equals("/")) {
				resultado/=x;
			}else if(ultimax.equals("=")) {
				resultado=x;
			}
			pantalla.setText("" + resultado);
		}
	}
	private JPanel milamina2;
	private JButton pantalla;
	private boolean principio;
	private double resultado;
	private String ultimax;
}

	

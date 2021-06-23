package SWING;

import javax.swing.*;

public class MENU {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			framemenu mimarco=new framemenu();
			mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	}
	class framemenu extends JFrame{
		public framemenu() {
			setBounds(550,400,600,350);
			setVisible(true);
			add(new laminamenu());
		}
	}
	class laminamenu extends JPanel{
		public laminamenu() {
			JMenuBar mibarra=new JMenuBar();
			JMenu archivo=new JMenu("Archivo");
			JMenu edicion=new JMenu("Edición");
			JMenu herramientas=new JMenu("Herramientas");
			JMenu opciones=new JMenu("Opciones");
			JMenuItem guardar=new JMenuItem("Guardar");
			JMenuItem guardarcomo=new JMenuItem("Guardar como...");
			JMenuItem cortar=new JMenuItem("Cortar");
			JMenuItem copiar=new JMenuItem("Copiar");
			JMenuItem pegar=new JMenuItem("Pegar");
			JMenuItem generales=new JMenuItem("Generales");
			JMenuItem opcion1=new JMenuItem("Opcion 1");
			JMenuItem opcion2=new JMenuItem("Opcion 2");
			JMenuItem Opcion3=new JMenuItem("Opcion 3");
			opciones.add(opcion1);
			opciones.add(opcion2);
			archivo.add(guardar);
			archivo.add(guardarcomo);
			edicion.add(copiar);
			edicion.add(cortar);
			edicion.add(pegar);
			edicion.addSeparator();
			edicion.add(opciones);
			herramientas.add(generales);
			
			
			mibarra.add(archivo);
			mibarra.add(edicion);
			mibarra.add(herramientas);
			
			add(mibarra);
		}
	}

package Figuras;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Mensaje {
	
	
	int opcion;
	
	public int menu() {
		
		Icon imagen= new ImageIcon(getClass().getResource("/Recursos/logo.png"));
		JOptionPane.showMessageDialog(null, "1.Cuadrado\n2.Rectangulo\n3.Rombo\n4.Trapecio\n5.Salir\n\nPulsa OK para continuar","Figuras Geometricas",JOptionPane.QUESTION_MESSAGE,imagen);
		opcion=Integer.parseInt(JOptionPane.showInputDialog("Opcion a seleccionar"));
		
		return opcion;
	}
	
	public int cuadrado() {
		
		Icon imagen1= new ImageIcon(getClass().getResource("/Recursos/cubo.png"));
		JOptionPane.showMessageDialog(null, "1.Mostrar Area\n2.Mostrar Perimetro\n3.Mostrar Vertices\n4.Regresar","CUADRADO",JOptionPane.QUESTION_MESSAGE,imagen1);
		opcion=Integer.parseInt(JOptionPane.showInputDialog("Opcion a seleccionar"));
		
		return opcion;
	}
	
	public int rectangulo() {
		
		Icon imagen2= new ImageIcon(getClass().getResource("/Recursos/rectangulo.png"));
		JOptionPane.showMessageDialog(null, "1.Mostrar Area\n2.Mostrar Perimetro\n3.Mostrar Vertices\n4.Regresar","RECTANGULO",JOptionPane.QUESTION_MESSAGE,imagen2);
		opcion=Integer.parseInt(JOptionPane.showInputDialog("Opcion a seleccionar"));
		
		return opcion;
	}
	
	public int rombo() {
		
		Icon imagen3= new ImageIcon(getClass().getResource("/Recursos/rombo.png"));
		JOptionPane.showMessageDialog(null, "1.Mostrar Area\n2.Mostrar Perimetro\n3.Mostrar Vertices\n4.Regresar","ROMBO",JOptionPane.QUESTION_MESSAGE,imagen3);
		opcion=Integer.parseInt(JOptionPane.showInputDialog("Opcion a seleccionar"));
		
		return opcion;
	}
	
	public int trapecio() {
		
		Icon imagen4= new ImageIcon(getClass().getResource("/Recursos/trapecio.png"));
		JOptionPane.showMessageDialog(null, "1.Mostrar Area\n2.Mostrar Perimetro\n3.Mostrar Vertices\n4.Regresar","TRAPECIO",JOptionPane.QUESTION_MESSAGE,imagen4);
		opcion=Integer.parseInt(JOptionPane.showInputDialog("Opcion a seleccionar"));
		
		return opcion;
	}

}

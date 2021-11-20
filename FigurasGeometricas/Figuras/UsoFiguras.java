package Figuras;

import java.awt.Toolkit;

import javax.swing.*;


public class UsoFiguras {
	
	

	public static void main(String[] args) {
		
		 int opcion=0,opcion1=0;
		
		do {
			
			Mensaje mensajes= new Mensaje();
			opcion=mensajes.menu();
			
			switch(opcion) {
			
			case 1:
				
				int x0=0,y0=0,l0=0;
				x0=Integer.parseInt(JOptionPane.showInputDialog("Cuadrado","Valor en x1"));
				y0=Integer.parseInt(JOptionPane.showInputDialog("Cuadrado","valor en y1"));
				l0=Integer.parseInt(JOptionPane.showInputDialog("Cuadrado","valor de un lado"));
				Cuadrado cuadrado1= new Cuadrado(x0,y0,l0);
	
				do {
			
					opcion1=mensajes.cuadrado();
					
					switch(opcion1) {
					
					case 1:
						
						JOptionPane.showMessageDialog(null, "El area del Cuadrado es de "+ cuadrado1.area());
						
						break;
					case 2:	
						
						JOptionPane.showMessageDialog(null, "El perimetro del Cuadrado es de "+ cuadrado1.perimetro());
						
						break;
					case 3:
					
						Punto p1=cuadrado1.getp1();
						Punto p2=cuadrado1.getp2();
						Punto p3=cuadrado1.getp3();
						Punto p4=cuadrado1.getp4();
						
						JOptionPane.showMessageDialog(null, "Los vertices del Cuadrado son: \n"+"Punto 1  ("+p1.x+" , "+p1.y+")\nPunto 2  ("+p2.x+" , "+p2.y+")\nPunto 3  ("+
								p3.x+" , "+p3.y+")\nPunto 4  ("+p4.x+" , "+p4.y+")");
						
						break;
					
					}
					
				}while(opcion1!=4);
				
				break;
			case 2:
				
				int x00=0,y00=0,b00=0,a00;
				x00=Integer.parseInt(JOptionPane.showInputDialog("Rectangulo","Valor en x1"));
				y00=Integer.parseInt(JOptionPane.showInputDialog("Rectangulo","valor en y1"));
				b00=Integer.parseInt(JOptionPane.showInputDialog("Rectangulo","valor de Base"));
				a00=Integer.parseInt(JOptionPane.showInputDialog("Rectangulo","valor de Altura"));
				Rectangulo rectangulo1= new Rectangulo(x00,y00,b00,a00);
				
				do {
					
					opcion1=mensajes.rectangulo();
						
					switch(opcion1) {
					
					case 1:
						
						JOptionPane.showMessageDialog(null, "El area del Rectangulo es de "+ rectangulo1.area());
						
						break;
					case 2:	
						
						JOptionPane.showMessageDialog(null, "El perimetro del Rectangulo es de "+rectangulo1.perimetro());
						
						break;
					case 3:
		
						Punto p1=rectangulo1.getp1();
						Punto p2=rectangulo1.getp2();
						Punto p3=rectangulo1.getp3();
						Punto p4=rectangulo1.getp4();
						
						JOptionPane.showMessageDialog(null, "Los vertices del Rectangulo son: \n"+"Punto 1  ("+p1.x+" , "+p1.y+")\nPunto 2  ("+p2.x+" , "+p2.y+")\nPunto 3  ("+
								p3.x+" , "+p3.y+")\nPunto 4  ("+p4.x+" , "+p4.y+")");
						
						break;
					
					}
					
				}while(opcion1!=4);
				
				break;
			case 3:
				
				int x000=0,y000=0,d000=0,D000;
				x000=Integer.parseInt(JOptionPane.showInputDialog("Rombo","Valor en x1"));
				y000=Integer.parseInt(JOptionPane.showInputDialog("Rombo","valor en y1"));
				D000=Integer.parseInt(JOptionPane.showInputDialog("Rombo","valor de distancia Mayor"));
				d000=Integer.parseInt(JOptionPane.showInputDialog("Rombo","valor de distancia menor"));
				Rombo rombo1= new Rombo(x000,y000,D000,d000);//recibe x1,y1,distanciaMayor,distanciaMenor
				
				do {
					
					opcion1=mensajes.rombo();
					
					switch(opcion1) {
					
					case 1:
						
						JOptionPane.showMessageDialog(null, "El area del Rombo es de "+ rombo1.area());
						
						break;
					case 2:	
						
						JOptionPane.showMessageDialog(null, "El perimetro del Rombo es de "+rombo1.perimetro());
						
						break;
					case 3:
	
						Punto p1=rombo1.getp1();
						Punto p2=rombo1.getp2();
						Punto p3=rombo1.getp3();
						Punto p4=rombo1.getp4();
						
						JOptionPane.showMessageDialog(null, "Los vertices del Rombo son: \n"+"Punto 1  ("+p1.x+" , "+p1.y+")\nPunto 2  ("+p2.x+" , "+p2.y+")\nPunto 3  ("+
								p3.x+" , "+p3.y+")\nPunto 4  ("+p4.x+" , "+p4.y+")");
						
						break;
					
					}
					
				}while(opcion1!=4);
				
				break;
			case 4:	
				
				int x0000=0,y0000=0,bM0000=0,bm0000,a0000;
				x0000=Integer.parseInt(JOptionPane.showInputDialog("Trapecio","Valor en x1"));
				y0000=Integer.parseInt(JOptionPane.showInputDialog("Trapecio","valor en y1"));
				bM0000=Integer.parseInt(JOptionPane.showInputDialog("Trapecio","valor de Base Mayor"));
				bm0000=Integer.parseInt(JOptionPane.showInputDialog("Trapecio","valor de Base menor"));
				a0000=Integer.parseInt(JOptionPane.showInputDialog("Trapecio4","valor de la Altura"));
				Trapecio trapecio1= new Trapecio(x0000,y0000,bM0000,bm0000,a0000);//recibe x1,y1,base_mayor,base_menor,altura
					
				do {
					
					opcion1=mensajes.trapecio();
					
					switch(opcion1) {
					
					case 1:
						
						JOptionPane.showMessageDialog(null, "El area del Trapecio es de "+ trapecio1.area());
						
						break;
					case 2:	
						
						JOptionPane.showMessageDialog(null, "El perimetro del Trapecio es de "+trapecio1.perimetro());
						
						break;
					case 3:
												
						Punto p1=trapecio1.getp1();
						Punto p2=trapecio1.getp2();
						Punto p3=trapecio1.getp3();
						Punto p4=trapecio1.getp4();
						
						JOptionPane.showMessageDialog(null, "Los vertices del Trapecio son: \n"+"Punto 1  ("+p1.x+" , "+p1.y+")\nPunto 2  ("+p2.x+" , "+p2.y+")\nPunto 3  ("+
								p3.x+" , "+p3.y+")\nPunto 4  ("+p4.x+" , "+p4.y+")");
						
						break;
					}
					
				}while(opcion1!=4);
			
				break;
			}
			
		}while(opcion!=5);
		
	}
}

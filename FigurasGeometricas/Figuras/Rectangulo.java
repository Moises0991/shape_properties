package Figuras;

public class Rectangulo extends Cuadrilateros{

	private double base, altura;
	
	public Rectangulo(double x,double y, double base,double altura) {
		
		super(x,y);
		
		this.base=base;
		this.altura=altura;
		
		calcula_vertices();
	}
	
	public double area() {
		
		return base*altura;
	}
	
	public void calcula_vertices() {
		
		l1.puntoFinal.x = l1.puntoInicial.x +base;
		l1.puntoFinal.y = l1.puntoInicial.y ;
		
		l2.puntoInicial = l1.puntoFinal; 
		
		l2.puntoFinal.x = l2.puntoInicial.x ;
		l2.puntoFinal.y = l2.puntoInicial.y+altura;
		
		l3.puntoInicial = l2.puntoFinal; 
		
		l3.puntoFinal.x = l1.puntoInicial.x ;
		l3.puntoFinal.y = l3.puntoInicial.y ;
		
		l4.puntoInicial = l3.puntoFinal; 
		l4.puntoFinal =l1.puntoInicial;
		
		p1 = l1.puntoInicial;
		p2 = l2.puntoInicial;
		p3 = l3.puntoInicial;
		p4 = l4.puntoInicial;
	}
	
	
	
}

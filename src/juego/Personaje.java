package juego;
import entorno.Entorno;
import entorno.Herramientas;
import java.awt.Image;

public class Personaje {

	double x, y, escala,velocidad;
	Image img;
	Entorno e;
	int vida,direccion,colision;
	
	public Personaje(double x, double y, Entorno e) {
		
		this.x=x;
		this.y=y;
		this.e=e;
			
		this.escala=0.25;
		
		this.img=Herramientas.cargarImagen("moto2.png");
		this.direccion=0;
	}
	
	public void dibujar() {
		e.dibujarImagen(img, x, y,this.direccion*Math.PI/2,this.escala);
	}
		
	public void mover(double dx, double dy) {
		this.x+=dx;
		this.y+=dy;
		
		
		
		
	}

	
}

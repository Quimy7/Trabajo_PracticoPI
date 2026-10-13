package juego;

import java.awt.Image;

import entorno.Entorno;
import entorno.Herramientas;

public class Manzana {
	
	double x, y, escala;
	Image img;
	Entorno e;
	Casa[] casas;


	public Manzana(double x, double y, double escala, Entorno e) {
		
		this.x = x;
		this.y = y;
		this.e = e;
		this.escala =0.25;
		this.img=Herramientas.cargarImagen("Imagen1.png");
		
		/*boolean[]aux= {false,false,false,false};
		aux[(int)(Math.random()*4)]=true;
		this.casas= new Casa[4];
		this.casas[0]=new Casa(x-25, y-25,e,aux[0]);
		this.casas[1]=new Casa(x+25, y-25,e,aux[1]);
		this.casas[2]=new Casa(x-25, y+25,e,aux[2]);
		this.casas[3]=new Casa(x+25, y+25,e,aux[3]);
		*/
	}

	public void dibujar() {
		e.dibujarImagen(this.img, this.x, this.y,0, this.escala);
	}
}

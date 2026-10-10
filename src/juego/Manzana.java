package juego;
import java.awt.Image;
import entorno.Entorno;
import entorno.Herramientas;
public class Manzana {
	private double x;
	private double y;
	private Image imagen;

	public Manzana(double x, double y) {
		this.x = x;
		this.y = y;
		this.imagen = Herramientas.cargarImagen("Manzana.png");
	}

	public void dibujar(Entorno entorno) {
		entorno.dibujarImagen(imagen, x, y, 0);
	}


}

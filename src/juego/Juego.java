package juego;


import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego
{
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	private Manzana[] cuadra;
	private Personaje rappi;
	// Variables y métodos propios de cada grupo
	// ...
	
	Juego()
	{
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Proyecto para TP", 800, 600);
		
		int[] corX= {250,375,500,620};
		int[] corY= {160,305,450,600};
		this.cuadra=new Manzana[corX.length*corY.length];
		int k=0;
		for(int i=0; i<corX.length;i++) {
			for(int j=0; j<corY.length;j++) {
				cuadra[k++]=new Manzana(corX[i],corY[j],j, entorno);
			}
			
		}
		this.rappi=new Personaje(300,300,entorno);

		// Inicializar lo que haga falta para el juego
		// ...

		// Inicia el juego!
		this.entorno.iniciar();
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y 
	 * por lo tanto es el método más importante de esta clase. Aquí se debe 
	 * actualizar el estado interno del juego para simular el paso del tiempo 
	 * (ver el enunciado del TP para mayor detalle).
	 */
	public void tick()
	{
		//areglo de manzanas
	for (Manzana m:this.cuadra) {
			m.dibujar();
		}
		rappi.dibujar();
		
		//moviminento
		if(entorno.estaPresionada(entorno.TECLA_ABAJO)) {
			rappi.mover(0, 1);
			rappi.direccion=2;
			
		}
		if(entorno.estaPresionada(entorno.TECLA_ARRIBA)) {
			rappi.mover(0, -1);
			rappi.direccion=0;
		}
		if(entorno.estaPresionada(entorno.TECLA_DERECHA)) {
			rappi.mover(1, 0);
			rappi.direccion=1;
		}
		if(entorno.estaPresionada(entorno.TECLA_IZQUIERDA)) {
			rappi.mover(-1, 0);
			rappi.direccion=3;
		}
		
	
	}
	

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Juego juego = new Juego();
	}
}

package com.ipartek.ejercicios.asbtracta;

/**
 * Como es final la clase, termina la posiblidad de herencia
 * @author ur00
 *
 */
public final class LineaColor extends Linea {

	String color;
	
	@Override
	void dibujar() {		
		// super.dibujar();
		System.out.println("Dibujo Linea de color es " + color);
	}
	
}

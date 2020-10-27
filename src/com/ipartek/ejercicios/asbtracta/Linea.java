package com.ipartek.ejercicios.asbtracta;

public class Linea extends ObjetoGrafico {

	int longitud;
		
	/**
	 * Implementamos el metodo que el padre a declarado abstract
	 */
	@Override
	void dibujar() {
		System.out.println("dibujamos un alinea de longitud " + longitud);		
	}

	
	
}

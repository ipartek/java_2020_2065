package com.ipartek.ejercicios.asbtracta;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		// No se pueden instanciar objetos de una clase abstract
		// ObjetoGrafico og = new ObjetoGrafico();
		
		Linea l1 = new Linea();
		LineaColor lc1 = new LineaColor();
		
		// No se pueden instanciar objetos de una clase abstract
		//Rectangulo r = new Rectangulo();
		RectanguloColor rc = new RectanguloColor();
		
		// todos usan el metodo implementado en ObjetoGrafico
		l1.mover(0,100);
		lc1.mover(45,88);
		rc.mover(78,100);		
		
		// cada uno tiene si propio metodo implementado
		l1.dibujar();
		lc1.dibujar();
		rc.dibujar();
		
		
		
	}

}

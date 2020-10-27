package com.ipartek.ejercicios.asbtracta;

/**
 * Como no implementa el metodo dibujar del padre se tiene que declarar abstract.<br>
 * Puede tener atributos y nuevos metodos implementados.<br>
 * Si una clase es abstract no se pueden crear instancias de esa clase.
 * @author ur00
 *
 */
public abstract class Rectangulo extends ObjetoGrafico {

	int lado;
	int altura;
	
	
	int calcularArea() {
		return  x * y * lado * altura;
	}
	
	
}

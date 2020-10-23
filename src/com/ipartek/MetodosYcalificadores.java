package com.ipartek;

import java.util.Scanner;

/**
 * Metodos o funciones son muy usadasa en java.<br>
 * Podemos tner, metodos de clase, metodo de objetos o instancia, incluso metodo propios dentro de una clase.<br><br>
 * 
 * Los metodos se declara de la siguiente manera:<br>
 * 
 * <pre><code>
 * CALIFICADORES DE ACCESO -  RETORNO - NOMBRE ( PARAMETROS ) EXCEPCIONES { 
 * 
 *    // Codigo fuente
 *    // return es lo que retorna y es obligatorio, a menos que la funcion no retorne nada <b>void</b>
 * }
 * </code></pre>
 *
 * 
 * 
 * @author ur00
 *
 */
public class MetodosYcalificadores {
	
	//SOBRECARGA: es cuando un metodo se llama igual, pero tiene diferentes parametros, muy usado en los Construcotres
	
	static void saludar() {
		System.out.println("Hola");
	}
	
	static void saludar( String nombre ) {
		System.out.println("Hola " + nombre);
	}
	
	/**
	 * Imprimir por pantalla el nombre tantas veces como numRepeticiones
	 * @param nombre String nombre a imprimir
	 * @param numRepeticiones int 
	 * @throws Exception si numRepeticiones >= 3
	 */
	static void saludar( String nombre, int numRepeticiones ) throws Exception {
		
		if ( numRepeticiones >= 3 ) {
			throw new Exception("** No seas pesado");
		}
		
		for (int i = 0; i < numRepeticiones; i++) {
			System.out.println("Hola " + nombre);	
		}
		
	}
	
	static String dimeTuNombre() {
		String resultado = "";   // 1º definir el resultado a retornar en una variable		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre:");
		resultado = sc.nextLine();
		sc.close();
		return resultado; // solo puede haber uno y al final
	}
	
	/**
	 * tipico metodo main para ejecutar codigo en java
	 * @param args
	 */
	public static void main(String[] args) {
		
		saludar();
		saludar("Ander");
		saludar(null);
		
		String nombre = dimeTuNombre();		
		saludar(nombre);
		
		try {
			saludar(nombre, 4);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	

}

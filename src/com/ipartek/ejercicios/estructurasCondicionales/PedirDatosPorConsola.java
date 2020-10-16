package com.ipartek.ejercicios.estructurasCondicionales;

import java.util.Scanner;

/**
 * Ejercicio clasico para lleer por consola con java.util.Scanner <br>
 * Pediremos la edad hasta que lo meta bien, la cual debe estar comprendida entre 0 y 150 años
 * 
 * @author Ander Uraga
 * @version 1.0
 *
 */
public class PedirDatosPorConsola {
	
	static final int EDAD_MINIMA = 16;
	static final int EDAD_MAXIMA = 150;
	static final int MAXIMO_ERRORES = 3;
	
	public static void main(String[] args) {
	
		
		System.out.println("Ongi Etorri");
		Scanner sc = new Scanner(System.in);
		int edad;
		int contador = 0;
		
		do {
			
			//gestionar contador
			if ( contador >= MAXIMO_ERRORES ) {
				System.out.printf("POR FAVOR lee bien: Escribe tu edad de %s a %s maximo:", EDAD_MINIMA, EDAD_MAXIMA);				
			}else {
				System.out.printf("Escribe tu edad de %s a %s maximo:", EDAD_MINIMA, EDAD_MAXIMA);	
			}	
			//pedir dato por consola
			edad = Integer.parseInt( sc.nextLine() );
			contador++;
			
		} while ( !(edad >= EDAD_MINIMA && edad <= EDAD_MAXIMA ) );
		
		System.out.println("Gracias tu edad es " + edad);		
		sc.close();
		
	}//main

}

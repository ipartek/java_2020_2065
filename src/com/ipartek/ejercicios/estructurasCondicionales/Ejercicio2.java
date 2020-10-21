package com.ipartek.ejercicios.estructurasCondicionales;

import java.util.Scanner;

/**
 * Realiza un programa que pida un numero por consola. En caso de que el numero
 * sea mayor que 50, o menor que 0, indicar que el numero introducido no es
 * valido
 * 
 * @author Marcelo kleibson
 * @version 1.0
 *
 */
public class Ejercicio2 {
		
	public static void main(String[] args) {

	
		int iNum1 = 0;	
		
		
		Scanner sc = new Scanner(System.in);
		
		// Procedemos a capturar los valores.
		System.out.print("Ingrese un numero entre 0 y 50: ");
		
		
		iNum1 = Integer.parseInt(sc.nextLine());

		if (iNum1 > 50 || iNum1 < 0) {
			System.out.println("el numero introducido no es valido! el numero es: " + iNum1);
		}
		
		sc.close();
		

	}//main

}

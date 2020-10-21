package com.ipartek.ejercicios.estructurasCondicionales;

import com.ipartek.apps.AppPerrera;

/**
 * 
 * Realizar un programa que realice la siguiente funcionalidad.<br> 
 * Se crearan 5 variables enteras con los nombres <b>a, b, c, d y e</b> con los valores <b>6,8, 0,8 y 9.</b> <br>
 * <ul>
 * <li>Comparar las variables a y c, indicar por consola cual es mayor</li>
 * <li>Indicar cual de las variables es la que tiene menor valor y la de mayor
 * valor</li>
 * <li>Compara las variables b y d y comprueba si son iguales</li>
 * <li>Comprobar si se puede realizar la división de a/c si no se puede realizar
 * indicarlo, en caso contrario realizar la división</li>
 * </ul>
 * 
 * 
 * @author iker tijero
 *
 */
public class Ejercicio1 {
	
	

	public static void main(String[] args) {
		
	
		int a = 6;
		int b = 8;
		int c = 0;
		int d = 8;
		int e = 9;

		int max = 0;
		int min = 10;

		int[] arrNumeros = { a, b, c, d, e };

		// caul es el mayor a o c
		if (a > c) {
			System.out.println("el numero " + a + " es mayor a " + c);

		} else {
			System.out.println("el numero " + c + " es mayor a " + a);
		}

		// numero mas alto
		for (int i = 0; i < arrNumeros.length; i++) {
			if (max < arrNumeros[i]) {
				max = arrNumeros[i];
			}
		}
		System.out.println(max);

		// numero mas bajo
		for (int i = 0; i < arrNumeros.length; i++) {
			if (min > arrNumeros[i]) {
				min = arrNumeros[i];
			}
		}
		System.out.println(min);

		// comprobar si b y d son iguales
		if (b == d) {
			System.out.println("Los numeros son iguales");
		} else {
			System.out.println("Los numeros no son iguales");
		}
		
		

	}//main
}

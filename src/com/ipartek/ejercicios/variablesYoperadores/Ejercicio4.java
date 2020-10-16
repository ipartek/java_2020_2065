package com.ipartek.ejercicios.variablesYoperadores;

/**
 * Realizar un programa que realice la siguiente operación: crear tres variables
 * de tipo Byte, llamadas num1, num2, resultado. Asignar los valores 255 y 223.
 * Sumarlas y guardarlo en resultado. Comprueba si el resultado da 478. Si no lo
 * da, buscar una solución al problema para solucionarlo
 * 
 * @author Iratxe Reguera
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		byte num1 = -1;
		int num1entero = (num1 & 0xFF); // 255
		// System.out.println(num1entero);

		byte num2 = -33;
		int num2entero = (num2 & 0xFF); // 223
		// System.out.println(num2entero);

		int resultado = num1entero + num2entero;

		System.out.println("El resultado es " + resultado);

		/*
		 * iratxe System.out.println(Byte.MAX_VALUE);
		 * System.out.println(Byte.MIN_VALUE);
		 * 
		 * byte num1 = (byte) 255; byte num2 = (byte) 223; byte result = (byte) (num1 +
		 * num2);
		 * 
		 * if (result == 478) {
		 * 
		 * System.out.println("El resultado es 478. Esta OK" + result);
		 * 
		 * } else {
		 * 
		 * System.out.println("ERROR. El resultado no es 478 es " + result); }
		 * 
		 */

	}

}
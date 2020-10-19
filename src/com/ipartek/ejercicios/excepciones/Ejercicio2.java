package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

/**
 * Realice un programa que nos solicite por teclado dos números, y leerlos
 * usando la clase Scanner mediante la función nextLine(). <br>
 * Transformar ambos strings a números enteros usando la siguiente sentencia
 * Integer.parseInt(numeroLeido).<br>
 * Agrupar el código entre un bloque try catch y procesar para que no se
 * produzca una interrupción y finalización del programa si alguno de los
 * números leídos no puede convertirse, retomando el control en el punto del
 * fallo, hasta que se solucione
 *
 * @author ur00
 * @version 1.0
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		boolean isError = true;

		// 1º numero, Bucle para repetir hasta que no haya error
		do {

			System.out.println("Dime el 1º numero entero:");
			try {
				a = Integer.parseInt(sc.nextLine());
				isError = false;
			} catch (Exception e) {
				System.out.println("**error, necesito un numero valido");
			}

		} while (isError);

		// 2º numero, Bucle para repetir hasta que no haya error
		isError = true;
		do {

			System.out.println("Dime el 2º numero entero:");
			try {
				b = Integer.parseInt(sc.nextLine());
				isError = false;
			} catch (Exception e) {
				System.out.println("**error, necesito un numero valido");
			}

		} while (isError);

		

		System.out.println("Resultado a/b=" + (a / b));

		sc.close();
	}

}

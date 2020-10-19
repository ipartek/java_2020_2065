package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

import com.ipartek.Utilidades;

/**
 * Realice un programa que nos solicite los numeros del dni y nos calcule la letra. <br>
 * Usar el metodo de la Clase Utilidades. <br>
 * Tenemos que capturar la excepcion que nos lanza la función <b>calcularLetraDni</b>.
 * 
 * @author ur00
 * @version 1.0
 *
 */
public class EjercicioThrows {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime los 8 numeros de tu dni:");
		String dniNumeros = sc.nextLine();
		
		try {
			String dniCompleto = Utilidades.calcularLetraDni(dniNumeros);
			System.out.println("Tu DNI copleto es: " + dniCompleto);
			
		}catch (Exception e) {
			System.out.println(" Lo sentimos pero tu dni no es valido " + dniNumeros);
		}	
		

		sc.close();
	}

}

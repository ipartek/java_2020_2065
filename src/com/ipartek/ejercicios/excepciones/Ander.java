package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

public class Ander {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Dime un numero:");
		
		try {	
			int numero =  Integer.parseInt( sc.nextLine() );
			
			// si la linea de arriba lanza excepcion, estas de abajo unca se ejecutaran
			System.out.println("Tu numero es: " + numero);
			
		} catch (Exception e) {
			// si quereis ver la traza de la Excepcion, usar e.printStackTrace()
			e.printStackTrace();
			System.out.println("Lo siento pero no es un numero valido");
			
		}finally {// no es obligatorio
			sc.close();	
			System.out.println("cerramos escaner, agur");
		}
		
		
	}//main

}

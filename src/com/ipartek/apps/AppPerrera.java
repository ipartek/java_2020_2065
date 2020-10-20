package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Perro;

public class AppPerrera {

	// variables globales para esta Clase
	static Scanner sc = null;
	static ArrayList<Perro> lista = new ArrayList<Perro>();
	static String opcion = "";   // opcion seleccionada en el menu por el usuario
	
	public static void main(String[] args) {
		
		
		System.out.println("***********  APP  PERRERA   **************");
		sc = new Scanner(System.in);

		incializarDatos();
		
		pintarMenu();
		
		//TODO cambiar "1","2","3" etc  por constantes
		switch (opcion) {
		case "1":
			listar();
			break;
		case "2":
			// TODO resto de opciones
			System.out.println("Sin Terminar");
			break;	

		default:
			break;
		}
		 
		
		System.out.println("***********  ADIOS, nos vemos pronto   **************");
		sc.close();
		
	}// main


	private static void listar() {
		
		for (Perro perro : lista) {
			//TODO dar formato para mostrar solo nombre y raza
			System.out.println(perro);
		}
		
	}


	/**
	 * Inicializar el ArrayList para simular que existen perros.<br>
	 * En un futuro nos conectaremos a una bbdd
	 */
	private static void incializarDatos() {
		
		lista.add( new Perro("Bubba") );
		lista.add( new Perro("Laika") );
		lista.add( new Perro("Rintintin") );
		lista.add( new Perro("goffy") );
		
	}


	/**
	 * Se encraga de pintar las pociones del menu.<br>
	 * Fijaros que no aparece {@code @return} porque no retorna nada {@code void}
	 * 
	 */
	private static void pintarMenu() {
	
		System.out.println("************************************");
		System.out.println(" 1.- Listar todos los perros");
		System.out.println(" 2.- Crear un perro");
		System.out.println(" 3.- Dar de baja un Perro");
		System.out.println(" etc etc ...");
		System.out.println(" ");
		System.out.println(" S - Salir");
		System.out.println("************************************");
		
		System.out.println("\n Selecciona una opcion del menu:");
		//TODO gestionar errores
		opcion = sc.nextLine();
		
		
	}

}// AppPerrera

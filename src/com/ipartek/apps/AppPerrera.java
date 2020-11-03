package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.modelo.PerroDAOSqlite;
import com.ipartek.modelo.PerroDao;
import com.ipartek.pojo.Perro;

public class AppPerrera {

	// variables globales para esta Clase
	static private Scanner sc = null;
	
	
	// cuando usamos un patron singleton, el constructor es privado
	// static private PerroDao modelo = new PerroDAOSqlite();
	// deberemos usar el metodo getInstance();
	static private PerroDao modelo = PerroDAOSqlite.getInstance();
	
	static private String opcion = ""; // opcion seleccionada en el menu por el usuario

	// opciones del menu
	static final private String OP_LISTAR = "1";
	static final private String OP_CREAR = "2";
	static final private String OP_ELIMINAR = "3";
	static final private String OP_SALIR = "s";

	public static void main(String[] args) {

		System.out.println("***********  APP  PERRERA   **************");
		sc = new Scanner(System.in);
		boolean salir = false;

		do {

			pintarMenu();

			switch (opcion) {
			case OP_LISTAR:
				listar();
				break;
			case OP_CREAR:
				crear();
				break;

			case OP_ELIMINAR:
				eliminar();
				break;
	
				
			case OP_SALIR:
				salir = true;
				System.out.println("***********  ADIOS, nos vemos pronto   **************");
				break;

			default:
				System.out.println(" ** por favor selecciona una opción valida ** ");
				break;
			}

		} while (!salir);

		sc.close();

	}// main

	private static void eliminar() {
		
		boolean flag = true;
		int id = 0;
		Perro pEliminar = null;
		
		// buscar perro por id
		do {
			System.out.println("Dime el ID del perro para eliminar:");
			id = Integer.parseInt(sc.nextLine());
			
			pEliminar = modelo.recuperar(id);
			if ( pEliminar == null ) {
				System.out.println("*Lo sentimos pero no existe ese perro");
			}else {
				flag = false;
			}
				
		} while (flag);
		
		
		flag = true;
		// pedir confirmacion de nombre para eliminar
		do {
			System.out.printf("Por favor escribe [%s] para eliminar o \"s\" para [S]alir\n", pEliminar.getNombre() );			
			String nombre = sc.nextLine();
			
			if ( OP_SALIR.equalsIgnoreCase(nombre)) {
				break;                                       // salimos del bucle
				
			}else {                                          // comprobar nombre 
			
				if ( pEliminar.getNombre().equalsIgnoreCase(nombre)) {
					
					try {
						modelo.eliminar(id);
						flag = false;
						System.out.println("Hemos dado de baja al perro");
						
					}catch (Exception e) {
						e.printStackTrace();
					}	
					
				}else {
					System.out.println("**No coincide el nombre**");
				}
			}	
			
		} while (flag);
		
		
	}

	private static void crear() {

		// pedido datos por consola
		System.out.println("Dime el nombre:");
		String nombre = sc.nextLine();

		System.out.println("raza (si no la sabes es 'cruce'):");
		String raza = sc.nextLine();  // controlamos en el setter que si es vacia nos ponga 'cruce'
		

		boolean isError = true;
		float peso = 0;
		do {
			try {
				System.out.println("Peso en Kg:");
				peso = Float.parseFloat(sc.nextLine());
				isError = false;
			} catch (Exception e) {
				System.out.println("No es un peso adecuado, por favor escribe un numero y usa puntos en vez de comas");
			}
		} while (isError);

		System.out.println("¿ Esta vacunado ?  [Si/No]");
		boolean isVacunado = ("s".equalsIgnoreCase(sc.nextLine())) ? true : false;

		System.out.println("Cuentame su historia (no es obligatorio):");
		String historia = sc.nextLine();

		// crear un Perro y setear valores
		Perro pNuevo = new Perro(nombre, raza, peso);
		pNuevo.setVacunado(isVacunado);
		pNuevo.setHistoria(historia);

		// llamar al modelo para guardar en la bbdd
		isError = true;
		do {

			try {
				modelo.crear(pNuevo);
				System.out.println("Perro guardado");
				System.out.println(pNuevo);
				isError = false;

			} catch (Exception e) {
				System.out.println("** No se ha podido guardar el perro, el nombre ya existe, por favor dime otro");
				nombre = sc.nextLine();
				pNuevo.setNombre(nombre);
				// e.printStackTrace();
			}
		} while (isError);

	}

	private static void listar() {

		ArrayList<Perro> perros = modelo.listar();
		for (Perro perro : perros) {
			System.out.println(String.format("%3s %-15s %-15s  %4s Kg  %13s %s", perro.getId(), perro.getNombre(), perro.getRaza(),
					perro.getPeso(), (perro.isVacunado()) ? "vacunado" : "*Sin Vacunar*", perro.getHistoria()));
		}

	}

	/**
	 * Se encraga de pintar las pociones del menu.<br>
	 * Fijaros que no aparece {@code @return} porque no retorna nada {@code void}
	 * 
	 */
	private static void pintarMenu() {

		System.out.println("************************************");
		System.out.println(" " + OP_LISTAR + ".- Listar todos los perros");
		System.out.println(" " + OP_CREAR + ".- Crear un perro");
		System.out.println(" " + OP_ELIMINAR + ".- Dar de baja un Perro");
		System.out.println(" etc etc ...");
		System.out.println(" ");
		System.out.println(" " + OP_SALIR + " - Salir");
		System.out.println("************************************");

		System.out.println("\n Selecciona una opcion del menu:");
		// TODO gestionar errores
		opcion = sc.nextLine();

	}

}// AppPerrera

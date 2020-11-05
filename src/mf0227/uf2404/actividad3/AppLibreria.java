package mf0227.uf2404.actividad3;

import java.util.Scanner;

/**
 * Clase principal para ejecutar el Main y usar nuestra App. <br>
 * Extediende de la clase abstracta AppGestion. <br>
 * Se encarga de pedir datos por consola al usuario y llamara al MODELO( dao ) para gestionar los Libros.
 * 
 * @author Ander Uraga Real
 *
 */
public class AppLibreria extends AppGestion {

	
	private static LibroDao dao = ImplLibroDao.getInstance();
	private static String opcion = "";
	private static AppLibreria app = new AppLibreria();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Empezamos App");
		
		try{		
		
			do {
				pintarMenu("Libro");
				System.out.println("Selecciona una opcion:");
				opcion = sc.nextLine();
				
				switch (opcion) {
				case OP_LISTAR:
					app.listar();
					break;
					
				case OP_CREAR:
					app.crear();
					break;
					
				case OP_ELIMINAR:
					app.eliminar();
					break;
					
				case OP_MODIFICAR:
					app.modifcar();
					break;	

				default:
					System.out.println("* Opción no permitida");
					break;
				}
				
			}while ( !OP_SALIR.equalsIgnoreCase(opcion) );	
				
		}catch (Exception e) {   // como Scanner sc implementa AutoClosable se cierra en este punto
			
			System.out.println("Lo sentimos pero hemos teneido un ERROR.");
			e.printStackTrace();
			
		}finally {
			sc.close();
		}
		
		System.out.println("Adios, vuelve pronto.....");

	}// main

	@Override
	final protected void modifcar() {
		System.out.println("TODO Modificar");
		
	}

	@Override
	final protected void eliminar() {
		
		// pedir el id del libro
		System.out.println("Dime el ID del libro a eliminar");
		int id = Integer.parseInt(sc.nextLine());
				
		// llamar la modelo
		if ( dao.delete(id) ) {
			System.out.println("Libro Eliminado");
		}else {
			System.out.println("* No se puede eliminar Libro con ID " + id);
		}
		
	}

	@Override
	final protected void listar() {
		
		for (Libro l: dao.getAll()) {
			System.out.printf("[%s] %-35s %4s paginas \n", l.getId(), l.getNombre(), l.getPaginas());
		}
		
	}

	@Override
	final protected void crear() {
		
		//pedir datos por consola 
		System.out.println("---- Crear Nuevo Libro ------ ");
		
		System.out.println("Nombre:");
		String nombre = sc.nextLine();
		
		System.out.println("Numero de Paginas:");
		int paginas = Integer.parseInt(sc.nextLine());
		
		// crear objeto Libro, el ID no se pide porque se genera al guardar en el modelo
		Libro l = new Libro( 0 , nombre, paginas);		
		
		// llamar al modelo
		if ( dao.insert(l) ) {
			System.out.println("Libro creado con Exito, su nuevo id es  " + l.getId());
		}else {
			System.out.println("** No se pudo crear Libro, el nombre ya existe " + l.getNombre());
		}
		
		
	}// crear

}

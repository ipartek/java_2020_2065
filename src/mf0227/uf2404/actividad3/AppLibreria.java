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
	
	public static void main(String[] args) {
		System.out.println("Empezamos App");
		
		try( Scanner sc = new Scanner(System.in) ){
		
		
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
		}
		System.out.println("Adios, vuelve pronto.....");

	}

	@Override
	protected void modifcar() {
		System.out.println("TODO Modificar");
		
	}

	@Override
	protected void eliminar() {
		System.out.println("TODO Eliminar");
		
	}

	@Override
	protected void listar() {
		
		for (Libro l: dao.getAll()) {
			System.out.printf("[%s] %-35s %4s paginas \n", l.getId(), l.getNombre(), l.getPaginas());
		}
		
	}

	@Override
	protected void crear() {
		System.out.println("TODO crear");
		
	}

}

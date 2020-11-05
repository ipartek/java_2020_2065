package mf0227.uf2404.actividad3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class ImplLibroDao implements LibroDao {

	private static HashMap<Integer, Libro> hmLibros;
	private static ImplLibroDao INSTANCE = null;
	private static int indice = 0;
	
	
	private ImplLibroDao() {
		super();
		hmLibros = new HashMap<Integer, Libro>();
		hmLibros.put(1, new Libro(1,"Obanboak", 678) );
		hmLibros.put(2, new Libro(2,"Gizona berea bakardadean", 234) );
		hmLibros.put(3, new Libro(3,"Behi euskaldun baten memoriak", 541) );
		indice = 4;
	}
	
	public static synchronized ImplLibroDao getInstance() {
		if ( INSTANCE == null ) {
			INSTANCE = new ImplLibroDao();
		}
		return INSTANCE;
	}


	@Override
	public List<Libro> getAll() {	
		ArrayList<Libro> libros = new ArrayList<Libro>(hmLibros.values()); 
		
		// ordenacion por defecto que hemos definido en el Libro implements Comparable
		//Collections.sort(libros);
		
		// ordenacion por paginas que hemos creado una nueva Clase que implements Comparator<Libro>
		libros.sort(new LibroComparatorPaginas());
		
		return libros;
	}

	@Override
	public Libro getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insert(Libro l) {
		// TODO Auto-generated method stub
		return false;
	}

}

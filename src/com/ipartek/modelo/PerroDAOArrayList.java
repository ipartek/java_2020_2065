package com.ipartek.modelo;

import java.util.ArrayList;

import com.ipartek.pojo.Perro;

public class PerroDAOArrayList implements PerroDao {

	private ArrayList<Perro> lista = new ArrayList<Perro>();
	private int indice = 0;
	private static PerroDAOArrayList INSTANCE = null;
	
	
	
	private PerroDAOArrayList() {
		super();
		lista.add(new Perro(1, "Bubba"));
		lista.add(new Perro(2, "Laika"));
		lista.add(new Perro(3, "Rintintin"));
		lista.add(new Perro(4, "goffy"));
		indice = 5;
	
	}
	
	public static synchronized PerroDAOArrayList getInstance() {
		
		if ( INSTANCE == null ) {
			INSTANCE = new PerroDAOArrayList();
		}
		
		return INSTANCE;
	}
	

	@Override
	public ArrayList<Perro> listar() {		
		return lista;
	}

	@Override
	public Perro recuperar(int id) {
		Perro p = null;
		for (Perro perro : lista) {
			if( id == perro.getId()) {
				p = perro;
				break;
			}
		}
		return p;
	}

	@Override
	public Perro crear(Perro p) throws Exception {
		
		p.setId(indice);
		lista.add(p);
		indice++;
		
		return p;
	}

	@Override
	public Perro modificar(Perro p) throws Exception {

		
		int id = p.getId();
		
		Perro pBuscar = recuperar(id);
		if ( pBuscar == null ) {
			throw new Exception("No existe perro con id=" + id);
		}
		
		String nombre = p.getNombre();
		for (Perro perro : lista) {			
			if ( nombre.equals(perro.getNombre()) && 
				 id != perro.getId() 
		     ) {
				throw new Exception("El nombre ya existe" + nombre);
			}
		}
		
		eliminar(id);
		lista.add(p);
		
		return p;
	}

	@Override
	public boolean eliminar(int id) throws Exception {
		// TODO hacer un for y buscar por id y eliminar de la posicion encontrada
		return false;
	}

}

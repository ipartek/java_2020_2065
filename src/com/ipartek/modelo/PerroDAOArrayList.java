package com.ipartek.modelo;

import java.util.ArrayList;

import com.ipartek.pojo.Perro;

public class PerroDAOArrayList implements PerroDao {

	private ArrayList<Perro> lista = new ArrayList<Perro>();
	
	@Override
	public ArrayList<Perro> listar() {
		
		if ( lista != null && lista.isEmpty() ) {
			
			lista.add(new Perro("Bubba"));
			lista.add(new Perro("Laika"));
			lista.add(new Perro("Rintintin"));
			lista.add(new Perro("goffy"));
		}
		
		return lista;
	}

	@Override
	public Perro recuperar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perro crear(Perro p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perro modificar(Perro p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(int id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}

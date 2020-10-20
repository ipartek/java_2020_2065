package com.ipartek.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Ejercicio para aprender los metodos básicos de java.util.ArrayList
 * @author ur00
 *
 */
public class EjercicioPaises {

	public static void main(String[] args) {
		
		// Son dinamicos y pueden crecer, a diferencia de String[] que son estaticos
		ArrayList<String> paises = new ArrayList<String>();
		
		// insertar
		paises.add("Brasil");
		paises.add("España");
		paises.add("Andorra");
		paises.add("Barakaldo");
		paises.add("Repelega");
		paises.add("Guinea Bisau");
		paises.add("Barakaldo");
		paises.add("Barakaldo");
		paises.add("Barakaldo");
		
		// insertar en una posicion
		paises.add(1, "Francia");
		
		// reemplazar
		paises.set(1, "EH");
		
		// eliminar por indice
		paises.remove(1);
		
		// eliminar por Objeto
		paises.remove("Barakaldo");
		
		// recuperar un pais		
		String s = paises.get(0); 

		// recuperar longtiud
		paises.size();
		
		// obtener la posicion de un objeto dentro del array
		int posicion = paises.indexOf("Repelega");
		
		
		// recorrer para mostrar con Iterator
		for (Iterator<String> iterator = paises.iterator(); iterator.hasNext();) {
			
			String pais = iterator.next();
			System.out.println(pais);
			
		}
		
	}

}

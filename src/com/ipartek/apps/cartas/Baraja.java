package com.ipartek.apps.cartas;

import java.util.ArrayList;

public abstract class Baraja {
	
	private ArrayList<Carta> mazo;
	
	public Baraja() {
		super();
		this.mazo = new ArrayList<Carta>();
	}

	public ArrayList<Carta> getMazo() {
		return mazo;
	}

	public void setMazo(ArrayList<Carta> mazo) {
		this.mazo = mazo;
	}

	/**
	 * Crear todas las cartes necesarias de la Baraja Hija
	 */
	abstract void crear();
	
	/**
	 * Muestra por consola todas las cartas del mazo
	 */
	void mostrar() {
		
		String paloNombre = "";
		for( Carta c : getMazo() ) {
			
			if ( !paloNombre.equals(c.getPalo().getNombre())) {
				paloNombre = c.getPalo().getNombre();
				System.out.println("------------------------------------------------");
				System.out.println(paloNombre);
				System.out.println("------------------------------------------------");
			}else {
				System.out.printf("%s %n", c.getNumero().getNombre());
			}
		}
		System.out.println("------------------------------------------------");
		System.out.printf(" Total %s Cartas en le mazo \n" , getMazo().size());
		System.out.println("------------------------------------------------");
		
	}
	
	void ordenarPalo(){
		//TODO con sysos
	}
	
	void ordenarNumero(){
		//TODO con sysos
	}
	
	void barajar() {
		//TODO con sysos
	}
	
	
}

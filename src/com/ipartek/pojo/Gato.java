package com.ipartek.pojo;

public class Gato extends Mamifero {

	public Gato(String nombre) {
		super(nombre);
	}

	// sobreescribimos al padre que es Mamifero
	// hemos puesto un atributo a 'protected' y para el otro usamos el getters
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + getPatas() + "]";
	}
	
}

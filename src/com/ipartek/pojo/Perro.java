package com.ipartek.pojo;

public class Perro {

	// Atributos, deben ser siempre privados
	// la forma de manipular estos atributos es a traves de los getteres y settres
	///////////////////////////////////////
	private String nombre;
	private String raza;
	private float peso;
	private boolean isVacunado;
	private String historia;
	
	// Constructores
	///////////////////////////////////////
	public Perro() {
		super();
		this.nombre = "Sin nombre";
		this.raza = "Cruce";
		this.peso = 0f;
		this.isVacunado = false;
		this.historia = "Erase una vez....";
	}
	
	// otro constructor sobrecargado
	
	public Perro(String nombre) {
		this(); // llama al constructor por defecto, pulsar Control + click
		this.nombre = nombre;
	}
	
	public Perro(String nombre, String raza, float peso) {
		this();  // Cuidado no poner super
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
	}
	
	
	//Getters y setters
	///////////////////////////////////////
	



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		if ( peso < 0 ) {
			this.peso = 0;
		}else {
			this.peso = peso;
		}	
	}

	public boolean isVacunado() {
		return isVacunado;
	}

	public void setVacunado(boolean isVacunado) {
		this.isVacunado = isVacunado;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", isVacunado=" + isVacunado
				+ ", historia=" + historia + "]";
	}
	
}

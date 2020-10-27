package com.ipartek.pojo;


public class Perro extends Mamifero {
	
	// Atributos, deben ser siempre privados
	// la forma de manipular estos atributos es a traves de los getteres y settres
	///////////////////////////////////////
	private int id;	
	private String raza;
	private float peso;
	private boolean isVacunado;
	private String historia;
	
	// Constructores
	///////////////////////////////////////
	public Perro() {
		super("Sin nombre");	
		this.id = 0;
		this.raza = "Cruce";
		this.peso = 0f;
		this.isVacunado = false;
		this.historia = "Erase una vez....";
	}
	
	// otro constructor sobrecargado
	
	public Perro(String nombre) {
		super(nombre);
		this.id = 0;
		this.raza = "Cruce";
		this.peso = 0f;
		this.isVacunado = false;
		this.historia = "Erase una vez....";		
	}
	
	public Perro(String nombre, String raza, float peso) {
		this(nombre);
		this.raza = raza;
		this.peso = peso;
	}
	
	
	//Getters y setters
	///////////////////////////////////////

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Perro [id=" + id + ", raza=" + raza + ", peso=" + peso + ", isVacunado=" + isVacunado + ", historia="
				+ historia + ", getNombre()=" + getNombre() + ", getPatas()=" + getPatas() + "]";
	}

	
	
	// Otros metodos
	
}

package com.ipartek.pojo;

public class Persona {
	
	// constantes
	public static final int EDAD_MIN = 0;
	public static final int EDAD_MAX = 120;
	
	// atributos
	private String nombre;
	private int edad;
	
	// constructor por defecto
	public Persona() {
		super();
		this.nombre = "";
		this.edad = EDAD_MIN;
	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception {
		
		if ( edad < EDAD_MIN || edad > EDAD_MAX ) {
			throw new Exception(  String.format("***Error: El rango de edad debe ser %s %s", EDAD_MIN, EDAD_MAX) );
		}		
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

}

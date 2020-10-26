package com.ipartek.pojo;

/**
 * Una serie de TV consta de los siguientes atributos:
 * 
 * <ul>
 * <li>Nombre</li>
 * <li>numTemporadas</li>
 * <li>duracion (minutos)</li>
 * <li>plataforma(netflix,plex,hbo,moviestar,...)</li> 
 * </ul>
 * 
 * El constructor debere pasarse siempre el nombre de forma obligatoria..
 * El resto de campos se iniciaalzan a 0 y la plataforma especificar "internet"
 * 
 * @author ur00
 *
 */
public class Serie {

	private String nombre;
	private int numTemporadas;
	private int duracion; //min
	private String plataforma;
	
	public Serie(String nombre) {
		super();  // llamamos al constructor del padore que es java.lnag.Object		
		this.nombre = nombre;
		this.numTemporadas = 0;
		this.duracion = 0;
		this.plataforma = "internet";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	@Override
	public String toString() {
		return "Serie [nombre=" + nombre + ", numTemporadas=" + numTemporadas + ", duracion=" + duracion
				+ ", plataforma=" + plataforma + "]";
	}
		
}

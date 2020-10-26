package com.ipartek.pojo;

public class GatoDomestico extends Gato {

	private boolean vacunado;
	private boolean castrado;
		
	public GatoDomestico(String nombre) {
		super(nombre);	
		this.castrado = false;
		this.vacunado = true;
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

	@Override
	public String toString() {
		return super.toString() + " GatoDomestico [vacunado=" + vacunado + ", castrado=" + castrado + "]";
	}
	
	
	

}

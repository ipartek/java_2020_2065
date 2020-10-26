package com.ipartek.pojo;

public class TelevisionPlana extends Television {

	private String tipoPantalla;

	public TelevisionPlana() {
		super();
		this.tipoPantalla = "tft";
	}

	public String getTipoPantalla() {
		return tipoPantalla;
	}

	public void setTipoPantalla(String tipoPantalla) {
		this.tipoPantalla = tipoPantalla;
	}

	@Override
	public String toString() {
		return "TelevisionPlana [tipoPantalla=" + tipoPantalla + ", getPulgadas()=" + getPulgadas() + ", getNombre()="
				+ getNombre() + ", getPrecio()=" + getPrecio() + "]";
	}
	
}

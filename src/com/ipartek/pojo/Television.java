package com.ipartek.pojo;

public class Television extends Electrodomestico {

	private int pulgadas;

	public Television() {
		super();		
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	@Override
	public String toString() {
		return "Television [pulgadas=" + pulgadas + ", getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio()
				+ "]";
	}
	
	
}

package com.ipartek.apps.cartas1;

public class Carta {

	private int valor;
	private String palo;

	public Carta() {
		super();
	}

	public Carta(int valor, String palo) {
		this();
		this.valor = valor;
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", palo=" + palo + "]";
	}
	
}

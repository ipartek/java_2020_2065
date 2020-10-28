package com.ipartek.ejercicios.interfaces.app;

public class Patinete implements IVehiculo {

	// Atributos, deben ser siempre privados
	private int velocidadActual;
	private boolean estaArrancado;

	// Constructor
	public Patinete() {
		super();
		this.velocidadActual = 0;
		this.estaArrancado = false;
	}

	public Patinete(int velocidadActual, boolean estaArrancado) {
		super();
		this.velocidadActual = velocidadActual;
		this.estaArrancado = estaArrancado;
	}

	// Getters y Setters
	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public boolean isEstaArrancado() {
		return estaArrancado;
	}

	public void setEstaArrancado(boolean estaArrancado) {
		this.estaArrancado = estaArrancado;
	}

	// toString()
	@Override
	public String toString() {
		return "Patinete [velocidadActual=" + velocidadActual + ", estaArrancado=" + estaArrancado + "]";
	}

	@Override
	public void arrancar() {		
		if ( !this.estaArrancado ) {
			this.estaArrancado = true;
		}
	}

	@Override
	public void acelerar(int incrementoVel) {

		if (  this.isEstaArrancado() ) {
			int nuevaVelocidad = this.getVelocidadActual() + incrementoVel;
			if ( nuevaVelocidad < VEL_MAX_PATINETE) {				
				this.setVelocidadActual(nuevaVelocidad);
			}else {
				this.setVelocidadActual(VEL_MAX_PATINETE);
			}
		}

	}

	@Override
	public void frenar(int decrementoVel) {
		
		this.velocidadActual -= decrementoVel;
	}

	@Override
	public void apagar() throws Exception {

		if ( this.estaArrancado && this.velocidadActual > 0 ) {
			throw new Exception("No se puede apagar estando acelerado " + this.velocidadActual + " km/h");
		}else {
			this.estaArrancado = false;
		}		
	}


}

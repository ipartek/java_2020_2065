package com.ipartek.apps.cartas;

import java.util.ArrayList;

public class BarajaPoker extends Baraja {

	static final int PALOS_NUMEROS[] = {1,2,3,4}; 
	static final String PALOS_NOMBRES[] = {"picas","corazones","treboles","diamantes"};
	static final int NUMEROS_CARTAS[] = {1,2,3,4,5,6,7,8,9,10,
															11, // jota
															12, // caballo
															13  // rey
															}; 
	
	
	@Override
	void crear() {
		
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		
		for (int i = 0; i < PALOS_NOMBRES.length; i++) {
			
			Palo p = new Palo(  PALOS_NUMEROS[i] , PALOS_NOMBRES[i]);
			
			for (int j = 0; j < NUMEROS_CARTAS.length; j++) {
				
				mazo.add( new Carta( p, NUMEROS_CARTAS[j] ) );
			}
			
			
		}
		
		setMazo(mazo);
		
		
	}

}

package com.ipartek.apps.cartas;

import java.util.ArrayList;

public class BarajaPoker extends Baraja {

	
	static final String PALOS_NOMBRES[] = {"picas","corazones","treboles","diamantes"};
	static final String CARTAS_NOMBRES[] = {"as","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","sota","caballo","rey"}; 
	
	
	@Override
	void crear() {
		
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		
		for (int i = 0; i < PALOS_NOMBRES.length; i++) {
			
			Palo p = new Palo(  (i+1) , PALOS_NOMBRES[i]);
			
			for (int j = 0; j < CARTAS_NOMBRES.length; j++) {
				
				Numero n = new Numero( (j+1), CARTAS_NOMBRES[j]);
				mazo.add( new Carta( p, n ) );
			}
		}
		
		setMazo(mazo);
		
		
	}


	
	
	
	

}

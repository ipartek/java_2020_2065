package com.ipartek.apps.cartas;

import java.util.ArrayList;

public class BarajaNaipes extends Baraja {

	static final String PALOS_NOMBRES[] = {"bastos","copas","oros","espadas"};
	static final String CARTAS_NOMBRES[] = {"as","dos","tres","cuatro","cinco","seis","siete","sota","caballo","rey"}; 
	
	
	@Override
	void crear() {
		
		ArrayList<Carta> mazo = getMazo();
		
		for (int i = 0; i < PALOS_NOMBRES.length; i++) {
			
			Palo p = new Palo( (i+1) , PALOS_NOMBRES[i]);
			
			for (int j = 0; j < CARTAS_NOMBRES.length; j++) {
				
				Numero n = new Numero( (j+1), CARTAS_NOMBRES[j]);
				Carta c = new Carta(p, n);
				mazo.add(c);
			}
			
		}
		
		setMazo(mazo);
		
	}

}

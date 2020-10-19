package com.ipartek;

public class Utilidades {
	
	 static final char LETRAS_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
			    'H', 'L', 'C', 'K', 'E' };
	
	/**
	 * Calcula la letra del DNI
	 * @param numeros String son los 8 numeros del DNI
	 * @return dni completo con los numeros + letra
	 * @throws Exception si no pasamos como parametros 8 numeros
	 */
	static public String calcularLetraDni ( String numeros ) throws Exception {
		
		char letra;
		
		if ( numeros == null ) {
			throw new Exception("No puede ser null");
		}
		
		if ( numeros.length() != 8 ) {
			throw new Exception("Los numeros de un dni son 8");
		}
		
		try {
			int posicion =  Integer.parseInt(numeros) % 23;
			letra = LETRAS_DNI[posicion];
			
		}catch (Exception e) {
			throw new Exception("No es un numero correcto " + numeros);
		}	
		
		return numeros + letra;
	}

}

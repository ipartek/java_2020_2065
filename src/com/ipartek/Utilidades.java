package com.ipartek;

import java.util.Scanner;

import com.ipartek.pojo.Serie;

public class Utilidades implements IFunciones{
	
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

	@Override
	public String pedirNombre() throws Exception {
		String resul = "";
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Dime tu nombre:");
		resul = sc.nextLine();
		sc.close();
		
		if ( resul.length() <= 1 ) {
			throw new Exception("El nombre es muy corto");
		}
		
		for (int i = 0; i < resul.length(); i++) {
			char letra = resul.charAt(i);
			boolean isNumber = Character.isDigit(letra);
			if ( isNumber ) {
				throw new Exception("El nombre no puede contener numeros");
			}
		}
		
		return resul;
	}

	@Override
	public void imprimirNumeroLoteria(int tipoLoteria) throws Exception {
		
		switch (tipoLoteria) {
		case LOTERIA_BONOLOTO:
			System.out.println("01 04 05 16 23 43 15 00");
			break;
		case LOTERIA_EUROMILLON:
			System.out.println("6 - 15 - 37 - 42 Estrellas: 3 - 4");
			break;	
		case LOTERIA_QUINIELA:
			System.out.println("2 - 2 - X - 1 - 1 - 2 - 1 - X - 1 - 1 - 2 - 2 Pleno al 15: X");
			break;		

		default:
			throw new Exception("No existe ese tipo de loteria");			
		}
		
		
	}

	@Override
	public float calcularVueltas(float dineroEntregado, float precioProducto) throws Exception {
		if ( dineroEntregado < precioProducto) {
			throw new Exception("Dinero insuficiente");	
		}
		return  dineroEntregado - precioProducto;
	}

	@Override
	public Serie pedirDatosPorConsola() {
		Serie serie = new Serie("");		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nombre:");
		serie.setNombre( sc.nextLine() );
		
		System.out.println("Duración en minutos:");
		serie.setDuracion( Integer.parseInt(sc.nextLine()) );
		
		System.out.println("Número de temporadas:");
		serie.setNumTemporadas( Integer.parseInt(sc.nextLine()) );
		
		System.out.println("Plataforma en la que esta disponble:");
		serie.setPlataforma( sc.nextLine() );
				
		sc.close();		
		return serie;
	}

}

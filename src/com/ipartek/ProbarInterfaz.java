package com.ipartek;

import com.ipartek.pojo.Serie;

public class ProbarInterfaz  {

	public static void main(String[] args) throws Exception  {
			
		
		Utilidades util = new Utilidades();
		
		// descomentar par probar los metodos
		// TODO mirar porque falla sacnner al probar los dos metodos seguidos
		/*  
		try {
			String nombre = util.pedirNombre();
			System.out.println("Tu nombre es " + nombre);
			
		}catch (Exception e) {
			System.out.println( e.getMessage() );
		}	
		*/
		
		Serie s = util.pedirDatosPorConsola();
		System.out.println("Tu serie es: " + s);
		
		// pedirNombre();
		System.out.println("El programa terminar");
		
		
		
		
	}

	

}

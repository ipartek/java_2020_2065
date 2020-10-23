package com.ipartek;

import com.ipartek.pojo.Serie;

public class ProbarInterfaz  {

	public static void main(String[] args) throws Exception  {
			
		
		Utilidades util = new Utilidades();
		try {
			String nombre = util.pedirNombre();
			System.out.println("Tu nombre es " + nombre);
			
		}catch (Exception e) {
			System.out.println( e.getMessage() );
		}	
		
		// pedirNombre();
		System.out.println("El programa terminar");
		
	}

	

}

package com.ipartek.pojo.ejercicios;

import com.ipartek.pojo.Perro;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		Perro snoppy = new Perro();
		
		
		//snoppy.nombre = "Snoppy";
		snoppy.setNombre("Snoppy");
		//snoppy.peso = -12;
		snoppy.setPeso(12);

		System.out.println( snoppy.getNombre() + " " + snoppy.getPeso() + " kg");
		
	}

}

package com.ipartek.pojo.ejercicios;

import com.ipartek.pojo.Perro;

/**
 * La historia de los 8 perros mas famosos.<br>
 * Crear 8 perros con su constructor por defecto y setear el nombre e historia.<br>
 * Mostrar por pantalla sus nombres e historias;
 * 
 * 
 * @see https://blog.patasbox.com/los-8-perros-mas-fomos-de-la-historia/
 * @author ur00
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		Perro snoppy = new Perro();
		//snoppy.nombre = "Snoppy";
		snoppy.setNombre("Snoppy");
		//snoppy.peso = -12;
		snoppy.setPeso(12);
		
		Perro p2 = new Perro();
		p2.setNombre("Laika");
		p2.setPeso(-56);

		System.out.println( snoppy.getNombre() + " " + snoppy.getPeso() + " kg");
		System.out.println( p2.getNombre() + " " + p2.getPeso() + " kg");
		
	}

}

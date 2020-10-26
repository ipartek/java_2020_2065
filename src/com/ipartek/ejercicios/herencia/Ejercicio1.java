package com.ipartek.ejercicios.herencia;

import com.ipartek.pojo.Estudiante;
import com.ipartek.pojo.Persona;
import com.ipartek.pojo.Profesor;

public class Ejercicio1 {

	public static void main(String[] args) throws Exception {
		
		
		Persona p = new Persona();
		p.setEdad(35);
		p.setNombre("Juan");
		// p.setNotaMedia(8.5f);
		
		Estudiante estu = new Estudiante();		
		estu.setEdad(18);
		estu.setNombre("Pepe");
		estu.setNotaMedia(8.5f);
		
		
		//crear la profesor Bacterio
		Profesor profe = new Profesor();
		profe.setNombre("Dr Bacterio");
		profe.setEdad(88);
		profe.setAsignatura("Quimica avanzada");

	}

}

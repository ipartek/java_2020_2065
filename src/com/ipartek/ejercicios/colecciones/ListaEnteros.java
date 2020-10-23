package com.ipartek.ejercicios.colecciones;

import java.util.ArrayList;

public class ListaEnteros {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(11);
		numeros.add(123);
		numeros.add(34556);
		
		for (Integer num : numeros) {
			System.out.println(num);
		}
		
		

	}

}

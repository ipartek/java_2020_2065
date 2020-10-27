package com.ipartek.ejercicios.herencia;

import java.util.ArrayList;

import com.ipartek.pojo.Electrodomestico;
import com.ipartek.pojo.Television;
import com.ipartek.pojo.TelevisionPlana;

/**
 * Creamos 3 objetos Electrodomestico, Television y TelevisionPlana. <br>
 * Una vez creados guardarlos en un {@code ArrayList<Electrodomestico>} el cual debeis recorrer con un foreach para: <br>
 * mostrar uno a uno todos los atributos de cada instancia dentro del Array usando los getters. <br>
 * usar <b>instanceof</b> para determinar cada objeto a que tipo de clase pertenece. * 
 * 
 * @author ur00
 *
 */
public class EjecicioElectrodomesticos {

	public static void main(String[] args) {
		
		
		ArrayList<Electrodomestico> lista = new ArrayList<>();
		
		Electrodomestico elec1 = new Electrodomestico();
		elec1.setNombre("Lavadora BALAY");
		elec1.setPrecio(300);		
		lista.add(elec1);
		
		Television tele = new Television();
		tele.setNombre("Telefunken");
		tele.setPrecio(400);
		tele.setPulgadas(30);
		lista.add(tele);
		
		TelevisionPlana tele2 = new TelevisionPlana();
		tele2.setNombre("LG enorme");
		tele2.setPrecio(600);
		tele2.setPulgadas(100);
		tele2.setTipoPantalla("XL");
		lista.add(tele2);
		
		
		// ArrayList<TelevisionPlana> listaTVPlanas = new ArrayList<>();
		// listaTVPlanas.add(elec1);
		
		
		for ( Electrodomestico elec : lista) {
			
			// En vez de usar syso, castear y mostrar datos con getters
			// System.out.println(elec.toString());
			
			// CUIDADO con la Exception, hay que preguntar siempre con instanceof, descomentar la linea de abajo y probar
			// TelevisionPlana ttt = (TelevisionPlana)elec1;
										
			System.out.printf("Nombre: %s \n", elec.getNombre());
			System.out.printf("Precio: %s \n", elec.getPrecio());				
			
						
			if ( elec instanceof Television ) {				
				Television tv = (Television)elec;
				System.out.printf("Pulgadas: %s \n", tv.getPulgadas());				
			}
			
			if ( elec instanceof TelevisionPlana ) {					
				TelevisionPlana tvp = (TelevisionPlana)elec;
				System.out.printf("Tipo pantalla %s \n" ,tvp.getTipoPantalla() );				
			}
			
			System.out.println("------------------------------------------------------");
			
			
		}// for
		System.out.println("Salimos");
		
	}
	
}

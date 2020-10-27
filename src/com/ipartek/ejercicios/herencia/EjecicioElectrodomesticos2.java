package com.ipartek.ejercicios.herencia;

import java.util.ArrayList;

import com.ipartek.pojo.Electrodomestico;
import com.ipartek.pojo.Television;
import com.ipartek.pojo.TelevisionPlana;

/**
 * Realizar el mismo ejercicio que en EjecicioElectrodomesticos, pero esta vez
 * hay que crear nuevos constructores para poder crear instancias con todos los
 * atributos.<br>
 * por ejemplo: <br>
 * 
 * <pre>
 *   
 *      TelevisionPlana tv = new TelevisionPlana("tele", 300, .., ..  );
 * </pre>
 * 
 * @see EjecicioElectrodomesticos
 * @author ur00
 *
 */
public class EjecicioElectrodomesticos2 {

	public static void main(String[] args) {

		ArrayList<Electrodomestico> lista = new ArrayList<>();
		lista.add(new Electrodomestico("Lavadora BALAY", 300));
		lista.add(new Television("Telefunken", 400, 30));
		lista.add(new TelevisionPlana("LG enorme", 600, 100, "XL"));

		for (Electrodomestico electrodomestico : lista) {
			System.out.println(electrodomestico);
		}

	}

}

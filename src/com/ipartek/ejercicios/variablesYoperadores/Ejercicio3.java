package com.ipartek.ejercicios.variablesYoperadores;

/**
 * 
 * Realizar un programa que tenga 2 variables enteras, dividendo y divisor. <br>
 * Meterle valores enteros y positivos. <br>
 * Realizar la operación división y mostrar el resultado en pantalla Repetir el mismo código con estas variaciones:
 * entero y real, real y entero, real y real.<br>
 * Por ultimo, intentar dividir en los
 * cuatro casos anteriores entre 0 y mostrar el resultado en pantalla
 *
 * 
 * 
 * @author Alberto
 * @version 1.0
 *
 */
public class Ejercicio3 {

	
	public static void main(String[] args) {

		  int int1 = 19;
		  int int2 = 6;

		  float fl1 = 6.5f;
		  float fl2 = (float) 9.4;
		  float resultado1;
		  float resultado2;
		  float resultado0;
		  float resultado3;
		  float resultado4;

		  resultado1 = int1 / int2;
		  resultado2 = int1 / fl1;
		  resultado3 = fl2 / int2;
		  resultado4 = fl1 / fl2;
		  
		  //System.out.println(  10.10f / 0  );
		  //System.out.println(  10 / 0  );
		  
		  // descomentar estas lineas para ver la exception
		  // System.out.println("Esto si lo vamos a leer, pero como la linea de abajo lanza Exception, se terminara la ejecucion del programa");
		  // resultado0 = int1 / 0;

		  System.out.println("Resultado de la división entre enteros: " + resultado1);
		  System.out.println("Resultado de la división entero / real: " + resultado2);
		  System.out.println("Resultado de la división real / entero: " + resultado3);
		  System.out.println("Resultado de la división entre reales: " + resultado4);
		  // System.out.println("Resultado de la división entre 0: " + resultado0);
		 }

}

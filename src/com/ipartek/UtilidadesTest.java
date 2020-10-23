package com.ipartek;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilidadesTest {

	@Test 
	void testCalcularVueltas() throws Exception{
		
		Utilidades util = new Utilidades();
		 
		assertEquals(50, util.calcularVueltas(100, 50));
		assertEquals(0, util.calcularVueltas(100, 100));
		
		try {
			util.calcularVueltas(50, 150);
			fail("deberia haber lanzado Exception");
		}catch (Exception e) {
			assertTrue(true);
		}	
		
	}
	
	@Test
	void testImprimirNumeroLoteria() {
		
		
		Utilidades util = new Utilidades();
		try {
			util.imprimirNumeroLoteria( 1 );
			util.imprimirNumeroLoteria( 2 );
			util.imprimirNumeroLoteria( 3 );
			assertTrue(true);
		} catch (Exception e) {
			fail("No deberia haber lanzado exception");
		}
		
		try {
			util.imprimirNumeroLoteria( 4 ); //exception
			fail("Deberia haber lanzado exception");
		}catch (Exception e) {
			assertTrue(true);
		}	
		
		
	}

}

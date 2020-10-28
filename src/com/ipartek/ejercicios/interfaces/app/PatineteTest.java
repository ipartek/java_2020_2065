package com.ipartek.ejercicios.interfaces.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PatineteTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testArrancar() {
		
		Patinete p = new Patinete();
		assertFalse(p.isEstaArrancado(), "deberia estar parado" );
		
		p.setEstaArrancado(true);
		assertTrue( p.isEstaArrancado(), "deberia poder arrancarse" );
		
	}

	@Test
	void testAcelerar() {
		
		Patinete p = new Patinete();		
		p.acelerar(20);
		assertFalse(p.isEstaArrancado(), "deberia estar parado" );
		assertEquals(0, p.getVelocidadActual(), "no deberia haber incrementado la velocidad" );
		
		p.setEstaArrancado(true);
		p.acelerar(20);
		assertEquals(20, p.getVelocidadActual(), "deberia haber incrementado la velocidad" );
		
		p.acelerar(IVehiculo.VEL_MAX_PATINETE);
		assertEquals(IVehiculo.VEL_MAX_PATINETE, p.getVelocidadActual(), "deberia estar a tope" );
				
		p.acelerar( 500 );
		assertEquals(IVehiculo.VEL_MAX_PATINETE, p.getVelocidadActual(), "deberia estar a tope" );
		
	}

	@Test
	void testFrenar() {
		fail("Not yet implemented");
	}

	@Test
	void testApagar() {
		
		// creamos patinete		
		// arrancar y acelarar
		Patinete p = new Patinete();	
		p.setEstaArrancado(true);
		p.acelerar(20);
		
		// probar arrancar estando en marcha
		try {
			p.apagar();
			fail("deberia haber lanzado Exception");
		}catch (Exception e) {
			assertTrue(true);
		}			
		
		// decelerar hasta cero
		p.frenar(20);
		
		// probar de nuevo a parar
		try {
			p.apagar();
			assertEquals(0, p.getVelocidadActual());
			assertFalse( p.isEstaArrancado() );			
		}catch (Exception e) {
			fail("deberia haber lanzado Exception");			
		}	
		
	}

}

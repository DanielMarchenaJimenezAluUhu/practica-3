package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Cuenta;

class TestCuenta {
	
	private static Cuenta cuenta;
	
	private static Cuenta cuenta1;
	private static Cuenta cuenta2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta(0);
		
		cuenta1 = new Cuenta("12345", 50);
		cuenta2 = new Cuenta("67890", 0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingreso(200);
		assertEquals(200, cuenta.getSaldo());
	}

	@Test
	void testRetirar() {
		cuenta.reintegro(200);
		assertEquals(-200, cuenta.getSaldo());
	}

	@Test
	void test0014() {
		cuenta1.reintegro(200);
		cuenta2.reintegro(350);
		cuenta1.ingreso(100);
		cuenta2.reintegro(200);
		cuenta2.reintegro(150);
		cuenta1.reintegro(200);
		cuenta2.ingreso(50);
		cuenta2.reintegro(100);
		
		assertEquals(-250, cuenta1.getSaldo());
		assertEquals(-450, cuenta2.getSaldo());
	}
}

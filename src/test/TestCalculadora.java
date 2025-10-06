package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Calculadora;

class TestCalculadora {

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
	void testSuma() {
		assertEquals(6, Calculadora.suma(3, 3));
	}

	@Test
	void testResta() {
		assertEquals(6, Calculadora.resta(9, 3));
	}

	@Test
	void testMultiplica() {
		assertEquals(6, Calculadora.multiplica(2, 3));
	}

	@Test
	void testDivide() {
		assertEquals(6, Calculadora.divide(18, 3));
	}

}

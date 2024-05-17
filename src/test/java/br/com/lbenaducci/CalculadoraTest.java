package br.com.lbenaducci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraTest {
	private Calculadora calculadora;

	@BeforeEach
	void setUp() {
		calculadora = new Calculadora();
	}

	@Test
	void somar() {
		long resultado = calculadora.somar(1, 2);
		assertEquals(3, resultado);

		long resultado2 = calculadora.somar(2, 3);
		assertEquals(5, resultado2);
	}

	@Test
	void subtrair() {
		long resultado = calculadora.subtrair(2, 1);
		assertEquals(1, resultado);

		long resultado2 = calculadora.subtrair(5, 2);
		assertEquals(3, resultado2);

		long resultado3 = calculadora.subtrair(0, 1);
		assertEquals(-1, resultado3);
	}

	@Test
	void multiplicar() {
		long resultado = calculadora.multiplicar(2, 3);
		assertEquals(6, resultado);

		long resultado2 = calculadora.multiplicar(5, 2);
		assertEquals(10, resultado2);

		long resultado3 = calculadora.multiplicar(0, 1);
		assertEquals(0, resultado3);

		long resultado4 = calculadora.multiplicar(2, -4);
		assertEquals(-8, resultado4);
	}

	@Test
	void dividir() {
		double resultado = calculadora.dividir(2, 2);
		assertEquals(1.0, resultado);

		double resultado2 = calculadora.dividir(3, 2);
		assertEquals(1.5, resultado2);

		double resultado3 = calculadora.dividir(0, 1);
		assertEquals(0.0, resultado3);

		double resultado4 = calculadora.dividir(2, -2);
		assertEquals(-1.0, resultado4);

		assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(2, 0));
	}

	@Test
	void media() {
		double resultado = calculadora.media(1, 2, 3);
		assertEquals(2.0, resultado);

		double resultado2 = calculadora.media(1, 2, 3, 4, 5);
		assertEquals(3.0, resultado2);

		double resultado3 = calculadora.media(3, 1, 9, 1, 6, 1);
		assertEquals(3.5, resultado3);
	}

	@Test
	void max() {
		int resultado = calculadora.max(1, -2, 3);
		assertEquals(3, resultado);

		int resultado2 = calculadora.max(1, 2, -3, 4, 5);
		assertEquals(5, resultado2);

		int resultado3 = calculadora.max(3, 1, 9, 1, -6, 1);
		assertEquals(9, resultado3);
	}

	@Test
	void min() {
		int resultado = calculadora.min(1, -2, 3);
		assertEquals(-2, resultado);

		int resultado2 = calculadora.min(1, 2, -3, 4, 5);
		assertEquals(-3, resultado2);

		int resultado3 = calculadora.min(3, 1, 9, 1, -6, 1);
		assertEquals(-6, resultado3);
	}
}

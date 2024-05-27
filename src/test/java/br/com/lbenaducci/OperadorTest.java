package br.com.lbenaducci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OperadorTest {
	@Test
	void somaTest() {
		Operador operador = Operador.SOMA;
		assertEquals(3.0, operador.calc(1.0, 2.0));
		assertEquals(5.0, operador.calc(2.5, 2.5));
	}

	@Test
	void subtracaoTest() {
		Operador operador = Operador.SUBTRACAO;
		assertEquals(1.0, operador.calc(2.0, 1.0));
		assertEquals(3.0, operador.calc(5.5, 2.5));
		assertEquals(-1.0, operador.calc(0.0, 1.0));
	}

	@Test
	void multiplicacaoTest() {
		Operador operador = Operador.MULTIPLICACAO;
		assertEquals(6.0, operador.calc(2.0, 3.0));
		assertEquals(10.0, operador.calc(5.0, 2.0));
		assertEquals(0.0, operador.calc(0.0, 1.0));
		assertEquals(-9.0, operador.calc(2.0, -4.5));
	}

	@Test
	void divisaoTest() {
		Operador operador = Operador.DIVISAO;
		assertEquals(1.0, operador.calc(2.0, 2.0));
		assertEquals(1.5, operador.calc(3.0, 2.0));
		assertEquals(0.0, operador.calc(0.0, 1.0));
		assertEquals(-1.0, operador.calc(2.0, -2.0));
		assertThrows(IllegalArgumentException.class, () -> operador.calc(2.0, 0.0));
	}
}
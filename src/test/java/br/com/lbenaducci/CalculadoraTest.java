package br.com.lbenaducci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
	@Test
	void ConstrutorTest() {
		Calculadora calculadora = assertDoesNotThrow(() -> new Calculadora(new Soma(() -> 2.0, () -> 3.0)));
		assertNotNull(calculadora);

		assertThrows(NullPointerException.class, () -> new Calculadora(null));
	}

	@Test
	void isEqualToTest() {
		Calculadora calculadora = new Calculadora(new Soma(() -> 2.0, () -> 3.0));
		assertEquals(5.0, calculadora.isEqualTo());
	}

	@Test
	void somarTest() {
		Calculadora calculadora = new Calculadora(new Soma(() -> 2.0, () -> 3.0));
		assertEquals(7.0, calculadora.somar(2.0).isEqualTo());
		assertEquals(8.0, calculadora.somar(3.0).isEqualTo());

		Operacao operacao = new Soma(() -> 1.0, () -> 4.0);
		assertEquals(10.0, calculadora.somar(operacao).isEqualTo());
	}

	@Test
	void subtrairTest() {
		Calculadora calculadora = new Calculadora(new Subtracao(() -> 2.0, () -> 3.0));
		assertEquals(-3.0, calculadora.subtrair(2.0).isEqualTo());
		assertEquals(-4.0, calculadora.subtrair(3.0).isEqualTo());

		Operacao operacao = new Subtracao(() -> 1.0, () -> 4.0);
		assertEquals(2.0, calculadora.subtrair(operacao).isEqualTo());
	}

	@Test
	void multiplicarTest() {
		Calculadora calculadora = new Calculadora(new Multiplicacao(() -> 2.0, () -> 3.0));
		assertEquals(12.0, calculadora.multiplicar(2.0).isEqualTo());
		assertEquals(18.0, calculadora.multiplicar(3.0).isEqualTo());

		Operacao operacao = new Multiplicacao(() -> 1.0, () -> 4.0);
		assertEquals(24.0, calculadora.multiplicar(operacao).isEqualTo());
	}

	@Test
	void dividirTest() {
		Calculadora calculadora = new Calculadora(new Divisao(() -> 4.0, () -> 2.0));
		assertEquals(1.0, calculadora.dividir(2.0).isEqualTo());
		assertEquals(0.5, calculadora.dividir(4.0).isEqualTo());

		Operacao operacao = new Divisao(() -> 1.0, () -> 4.0);
		assertEquals(8.0, calculadora.dividir(operacao).isEqualTo());

		Calculadora dividir = calculadora.dividir(0.0);
		assertThrows(IllegalArgumentException.class, dividir::isEqualTo);
	}
}
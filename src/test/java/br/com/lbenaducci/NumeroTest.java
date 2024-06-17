package br.com.lbenaducci;

import br.com.lbenaducci.Classes.Fator;
import br.com.lbenaducci.Classes.Numero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumeroTest {
	@Test
	void construtorTest() {
		Numero numero = assertDoesNotThrow(() -> new Numero(2.0));
		assertNotNull(numero);
		assertInstanceOf(Fator.class, numero);
		assertInstanceOf(Record.class, numero);
	}

	@Test
	void isEqualsTest() {
		Numero numero = new Numero(2.0);
		assertEquals(2.0, numero.isEqualTo());

		Numero numero2 = new Numero(-2.0);
		assertEquals(-2.0, numero2.isEqualTo());

		Numero numero3 = new Numero(3.21);
		assertEquals(3.21, numero3.isEqualTo());
	}
}
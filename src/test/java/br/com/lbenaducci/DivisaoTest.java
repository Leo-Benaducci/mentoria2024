package br.com.lbenaducci;

import br.com.lbenaducci.Classes.Divisao;
import br.com.lbenaducci.Classes.Fator;
import br.com.lbenaducci.Classes.Operacao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisaoTest {
	@Test
	void construtorTest() {
		Operacao operacao = assertDoesNotThrow(() -> new Divisao(() -> 2.0, () -> 3.0));
		assertNotNull(operacao);
		assertInstanceOf(Operacao.class, operacao);
		assertInstanceOf(Fator.class, operacao);

		assertThrows(NullPointerException.class, () -> new Divisao(null, () -> 3.0));
		assertThrows(NullPointerException.class, () -> new Divisao(() -> 2.0, null));
	}

	@Test
	void isEqualToTest() {
		Operacao operacao = new Divisao(() -> 3.0, () -> 2.0);
		assertEquals(1.5, operacao.isEqualTo());

		Divisao divisao = new Divisao(() -> 2.0, () -> 0.0);
		assertThrows(IllegalArgumentException.class, divisao::isEqualTo);
	}
}
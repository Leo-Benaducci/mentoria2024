package br.com.lbenaducci;

import br.com.lbenaducci.Classes.Fator;
import br.com.lbenaducci.Classes.Operacao;
import br.com.lbenaducci.Classes.Subtracao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtracaoTest {
	@Test
	void construtorTest() {
		Operacao operacao = assertDoesNotThrow(() -> new Subtracao(() -> 2.0, () -> 3.0));
		assertNotNull(operacao);
		assertInstanceOf(Operacao.class, operacao);
		assertInstanceOf(Fator.class, operacao);

		assertThrows(NullPointerException.class, () -> new Subtracao(null, () -> 3.0));
		assertThrows(NullPointerException.class, () -> new Subtracao(() -> 2.0, null));
	}

	@Test
	void isEqualToTest() {
		Operacao operacao = new Subtracao(() -> 3.0, () -> 2.0);
		assertEquals(1.0, operacao.isEqualTo());
	}
}
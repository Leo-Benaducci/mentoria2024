package br.com.lbenaducci;

import br.com.lbenaducci.Classes.Fator;
import br.com.lbenaducci.Classes.Operacao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacaoTest {
	@Test
	void construtorTest() {
		Operacao operacao = assertDoesNotThrow(() -> new Operacao(() -> 2.0, () -> 3.0) {
		});
		assertNotNull(operacao);
		assertInstanceOf(Fator.class, operacao);

		assertThrows(NullPointerException.class, () -> new Operacao(null, () -> 3.0) {
		});
		assertThrows(NullPointerException.class, () -> new Operacao(() -> 2.0, null) {
		});
	}

	@Test
	void isEqualToTest() {
		Operacao operacao = new Operacao(() -> 2.0, () -> 3.0) {
		};
		assertEquals(5.0, operacao.isEqualTo());
	}
}
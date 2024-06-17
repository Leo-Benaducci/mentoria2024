package br.com.lbenaducci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//class MultiplicacaoTest {
//
//	@Test
//	void construtorTest() {
//		Operacao operacao = assertDoesNotThrow(() -> new Multiplicacao(() -> 2.0, () -> 3.0));
//		assertNotNull(operacao);
//		assertInstanceOf(Operacao.class, operacao);
//		assertInstanceOf(Fator.class, operacao);
//
//		assertThrows(NullPointerException.class, () -> new Multiplicacao(null, () -> 3.0));
//		assertThrows(NullPointerException.class, () -> new Multiplicacao(() -> 2.0, null));
//	}
//
//	@Test
//	void isEqualToTest() {
//		Operacao operacao = new Multiplicacao(() -> 3.0, () -> 2.0);
//		assertEquals(6.0, operacao.isEqualTo());
//		Operacao operacao2 = new Multiplicacao(() -> -2.0, () -> 5.0);
//		assertEquals(-10.0, operacao2.isEqualTo());
//	}
//}
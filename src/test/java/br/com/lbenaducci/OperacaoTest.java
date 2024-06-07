package br.com.lbenaducci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacaoTest {

	@Test
	void construtorTest() {
		Operacao operacao = assertDoesNotThrow(() -> new Operacao(() -> 2.0, () -> 3.0) {
			@Override
			protected double getOperador() {
				return Operador.SOMA;
			}
		});
		assertNotNull(operacao);
		assertInstanceOf(Fator.class, operacao);

//		assertThrows(NullPointerException.class, () -> new Operacao(null, () -> 3.0) {
//			@Override
//			protected double getOperador() {
//				return Operador.SOMA;
//			}
//		});
//		assertThrows(NullPointerException.class, () -> new Operacao(() -> 2.0, null) {
//			@Override
//			protected double getOperador() {
//				return Operador.SOMA;
//			}
//		});
//	}
//
//	@Test
//	void isEqualToTest() {
//		Operacao operacao = new Operacao(() -> 2.0, () -> 3.0) {
//			@Override
//			protected Operador getOperador() {
//				return Operador.SOMA;
//			}
//		};
//		assertEquals(5.0, operacao.isEqualTo());
//	}
}
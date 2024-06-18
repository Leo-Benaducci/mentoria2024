package br.com.lbenaducci;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartaoTest {
	@Test
	void construtorTest() {
		Cartao cartao = assertDoesNotThrow(() -> new Cartao());
		assertInstanceOf(Pagamento.class, cartao);
	}

	@Test
	void pagarTest() {
		Cartao cartao = new Cartao();
		Pedido pedido = getPedido();
		assertEquals("Pagamento de R$21.0 realizado no cartão", cartao.pagar(pedido));
	}

	private Pedido getPedido() {
		List<Item> itens = new ArrayList<>();
		itens.add(new Prato("Teste", 10.5, Categoria.ENTRADA, "Item de teste"));
		itens.add(new Bebida("Teste", 10.5));
		return new Pedido(1, itens);
	}
}
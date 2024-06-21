package br.com.lbenaducci;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DinheiroTest {
	@Test
	void construtorTest() {
		Dinheiro dinheiro = assertDoesNotThrow(() -> new Dinheiro());
		assertInstanceOf(Pagamento.class, dinheiro);
	}

	@Test
	void pagarTest() {
		Dinheiro dinheiro = new Dinheiro();
		Pedido pedido = getPedido();
		assertEquals("Pagamento de R$21.0 realizado no dinheiro", dinheiro.pagar(pedido));
	}

	private Pedido getPedido() {
		List<Item> itens = new ArrayList<>();
		itens.add(new Prato("Teste", 10.5, Categoria.ENTRADA, "Item de teste"));
		itens.add(new Bebida("Teste", 10.5));
		return new Pedido(1, itens);
	}
}
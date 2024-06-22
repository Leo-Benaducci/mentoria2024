package br.com.lbenaducci;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//class RestauranteTest {
//	@Test
//	void construtorTest() {
//		List<Item> cardapio = getItens();
//		List<Pagamento> formasPagamento = getFormasPagamento();
//
//		Restaurante restaurante = assertDoesNotThrow(() -> new Restaurante(cardapio, formasPagamento));
//		assertEquals(cardapio, restaurante.getCardapio());
//		assertEquals(formasPagamento, restaurante.getFormasPagamento());
//		assertNotNull(restaurante.getPedidos());
//		assertTrue(restaurante.getPedidos().isEmpty());
//	}
//
//	@Test
//	void registrarTest() {
//		List<Item> cardapio = getItens();
//		List<Pagamento> formasPagamento = getFormasPagamento();
//		Restaurante restaurante = new Restaurante(cardapio, formasPagamento);
//		List<Item> itens = List.of(cardapio.getFirst());
//
//		assertDoesNotThrow(() -> restaurante.registrar(1, itens));
//		assertFalse(restaurante.getPedidos().isEmpty());
//		assertEquals(1, restaurante.getPedidos().getFirst().mesa());
//		assertEquals(itens, restaurante.getPedidos().getFirst().itens());
//	}
//
//	@Test
//	void pagarTest() {
//		List<Item> cardapio = getItens();
//		List<Pagamento> formasPagamento = getFormasPagamento();
//		Restaurante restaurante = new Restaurante(cardapio, formasPagamento);
//		List<Item> itens = List.of(cardapio.getFirst());
//		restaurante.registrar(1, itens);
//		restaurante.registrar(2, itens);
//
//		assertDoesNotThrow(() -> restaurante.pagar(1, formasPagamento.getFirst()));
//		assertEquals(1, restaurante.getPedidos().size());
//		assertEquals(2, restaurante.getPedidos().getFirst().mesa());
//		assertEquals(itens, restaurante.getPedidos().getFirst().itens());
//	}
//
//	private List<Item> getItens() {
//		List<Item> itens = new ArrayList<>();
//		itens.add(new Prato("Teste", 10.5, Categoria.ENTRADA, "Item de teste"));
//		itens.add(new Bebida("Teste", 10.5));
//		return itens;
//	}
//
//	private List<Pagamento> getFormasPagamento() {
//		List<Pagamento> formasPagamento = new ArrayList<>();
//		formasPagamento.add(new Cartao());
//		formasPagamento.add(new Pix());
//		formasPagamento.add(new Dinheiro());
//		return formasPagamento;
//	}
//}
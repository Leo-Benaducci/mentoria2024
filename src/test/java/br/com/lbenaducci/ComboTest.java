package br.com.lbenaducci;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComboTest {
    @Test
    void construtorTest() {
        List<Item> itens = getItens();
        Combo combo = assertDoesNotThrow(() -> new Combo("Teste", 15.5, itens));
        assertInstanceOf(Item.class, combo);
        assertEquals("Teste", combo.getNome());
        assertEquals(15.5, combo.getPreco());
        assertEquals(Categoria.COMBO, combo.getCategoria());
        assertEquals(itens, combo.getItens());
    }

    private List<Item> getItens() {
        List<Item> itens = new ArrayList<>();
        itens.add(new Prato("Teste", 10.5, Categoria.ENTRADA, "Item de teste"));
        itens.add(new Bebida("Teste", 10.5));
        return itens;
    }
}
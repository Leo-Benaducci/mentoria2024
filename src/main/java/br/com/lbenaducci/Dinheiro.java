package br.com.lbenaducci;

import java.util.Locale;

public class Dinheiro implements Pagamento {

    // Sabe me explicar o que é o "%.1f" no format que usou?
    // Cara, era só concatenar o texto com o valor, eu fiz pra ser da forma mais fácil possível.
    @Override
    public String pagar(Pedido pedido) {
        double valor = pedido.valorTotal();
        return String.format(Locale.US, "Pagamento de R$%.1f realizado no dinheiro", valor);
    }
}


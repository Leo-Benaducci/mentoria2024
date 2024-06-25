package br.com.lbenaducci;

import java.util.Locale;

public class Pix implements Pagamento {


    @Override
    public String pagar(Pedido pedido) {
        double valor = pedido.valorTotal();
        return String.format(Locale.US, "Pagamento de R$%.1f realizado no Pix", valor);
    }
}

